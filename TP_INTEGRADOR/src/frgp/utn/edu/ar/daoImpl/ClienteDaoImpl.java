package frgp.utn.edu.ar.daoImpl;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import frgp.utn.edu.ar.dao.ClienteDao;
import frgp.utn.edu.ar.entidad.Cliente;

public class ClienteDaoImpl implements ClienteDao {
/*
	private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	*/
	@Autowired
	private Conexion conexion;
	
	@Autowired
	private Cliente cliente;
	
	@Override
	public boolean insert(Cliente cli) {
		Session session = conexion.abrirConexion();
		Transaction transaction = session.beginTransaction();
		
			
		try {
			session.saveOrUpdate(cli);;
			transaction.commit();
			return true;
			
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
	
	}

	@Override
	public boolean delete(int _id) {
		Session session = conexion.abrirConexion();
		Transaction transaction = session.beginTransaction();
		try {
			Query query = session.createQuery("UPDATE Cliente c SET c.estado = 0 WHERE c.id =:idCliente and c.estado = 1");
			query.setParameter("idCliente", _id);
			
			if( query.executeUpdate() > 0) {
				transaction.commit();
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		
		return false;
	}

	@Override
	public List<Cliente> readAll() {
		Session session = conexion.abrirConexion();
			
		final List<Cliente> clientes = new LinkedList<>();
			
		try {
			Query query = session.createQuery("FROM Cliente c WHERE c.estado = 1 ");
			
			for(final Object o : query.list()) {
	        	 clientes.add((Cliente)o);
	         }
			
		} catch (Exception e) {
				e.printStackTrace();
		}
			
			return  clientes;
	}

	@Override
	public Cliente obtenerCliente(int _id) {
		
		Session session = conexion.abrirConexion();
		
		try {
			
			Query query = session.createQuery("FROM Cliente c WHERE c.id =:idCliente");
			query.setParameter("idCliente", _id);
			
			cliente = (Cliente)query.list().get(0);
			
			return cliente;
			
		} catch (Exception e) {
				e.printStackTrace();
		}
			
			return cliente;
		
	}

	@Override
	public int obtenerClientePorUsuario(int _idUser) {
		
		int idCliente = 0;
		
		Session session = conexion.abrirConexion();
		
		try {
			
			Query query = session.createQuery("select c.id FROM Cliente c join c.user u WHERE u.id = :idUsuario AND c.estado = 1");
			
			query.setParameter("idUsuario", _idUser);
			
			idCliente = (int)query.list().get(0);
			
			return idCliente;
			
		} catch (Exception e) {
				e.printStackTrace();
		}
			
			return idCliente;
		
	}
}
