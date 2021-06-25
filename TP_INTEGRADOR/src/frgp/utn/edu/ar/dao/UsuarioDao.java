package frgp.utn.edu.ar.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import frgp.utn.edu.ar.entidad.Usuario;

@Repository("UsuarioDao")
public class UsuarioDao {

	@Autowired
	private Conexion conexion;
	
	public Usuario validarUsuario(Usuario usuario) {
		Session session = conexion.abrirConexion();
		
		Usuario usu = new Usuario();
		
		try {
		Query query = session.createQuery("SELECT u FROM Usuario u WHERE u.user = :username AND u.pass = :password");
		query.setParameter("username", usuario.getUser());
		query.setParameter("password", usuario.getPass());

		System.out.println(query.list().get(0));
		usu = (Usuario)query.list().get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}

		conexion.cerrarSession();
		
		System.out.println(usu.toString());
		return usu;
	}
	
}
