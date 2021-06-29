package frgp.utn.edu.ar.daoImpl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import frgp.utn.edu.ar.dao.UsuarioDao;
import frgp.utn.edu.ar.entidad.Usuario;

public class UsuarioDaoImpl implements UsuarioDao{

	@Autowired
	private Conexion conexion;
	
	@Override
	public Usuario validarUsuario(Usuario usuario) {
		Session session = conexion.abrirConexion();
		
		Usuario usu = new Usuario();
		
		try {
		Query query = session.createQuery("SELECT u FROM Usuario u WHERE u.user = :username AND u.pass = :password");
		query.setParameter("username", usuario.getUser());
		query.setParameter("password", usuario.getPass());

		usu = (Usuario)query.list().get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return usu;
	}

	@Override
	public boolean insert(Usuario usuario) {
		Session session = conexion.abrirConexion();
		Transaction transaction = session.beginTransaction();
			
		try {
			session.saveOrUpdate(usuario);
			transaction.commit();
			return true;
			
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
	}

	@Override
	public Usuario obtenerUsuarioXid(int _id) {
		Session session = conexion.abrirConexion();
		
		Usuario usu = new Usuario();
		
		try {
		Query query = session.createQuery("SELECT u FROM Usuario u WHERE u.id = :idUser");
		query.setParameter("idUser", _id);
		
		usu = (Usuario)query.list().get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return usu;
	}
	
}
