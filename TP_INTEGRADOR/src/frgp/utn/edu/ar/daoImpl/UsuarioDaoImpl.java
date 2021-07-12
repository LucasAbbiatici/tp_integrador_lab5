package frgp.utn.edu.ar.daoImpl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import frgp.utn.edu.ar.dao.UsuarioDao;
import frgp.utn.edu.ar.entidad.Usuario;

@Repository("daoUsuario")
public class UsuarioDaoImpl implements UsuarioDao {

	@Autowired
	private Conexion conexion;
	@Autowired
	private Usuario usu;

	@Override
	public Usuario validarUsuario(Usuario usuario) {
		Session session = conexion.abrirConexion();

		try {
			Query query = session
					.createQuery("SELECT u FROM Usuario u WHERE u.user = :username AND u.pass = :password");
			query.setParameter("username", usuario.getUser());
			query.setParameter("password", usuario.getPass());

			usu = (Usuario) query.list().get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}

		session.close();
		return usu;
	}

	@Override
	public boolean insert(Usuario usuario) {
		Session session = conexion.abrirConexion();
		Transaction transaction = session.beginTransaction();

		try {
			session.saveOrUpdate(usuario);
			transaction.commit();
			session.close();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			session.close();
			return false;
		}
	}

	@Override
	public Usuario obtenerUsuarioXid(int _id) {
		Session session = conexion.abrirConexion();
		
		try {
			Query query = session.createQuery("SELECT u FROM Usuario u WHERE u.id = :idUser");
			query.setParameter("idUser", _id);

			usu = (Usuario) query.list().get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}

		session.close();
		return usu;
	}

	@Override
	public boolean delete(int _id) {
		Session session = conexion.abrirConexion();
		Transaction transaction = session.beginTransaction();
		try {
			Query query = session
					.createQuery("UPDATE Usuario u SET u.estado = 0 WHERE u.id =:idUsuario and u.estado = 1");
			query.setParameter("idUsuario", _id);

			if (query.executeUpdate() > 0) {
				transaction.commit();
				session.close();
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

		session.close();
		return false;
	}

}
