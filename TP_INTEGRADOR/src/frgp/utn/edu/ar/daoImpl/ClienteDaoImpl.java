package frgp.utn.edu.ar.daoImpl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import frgp.utn.edu.ar.dao.ClienteDao;
import frgp.utn.edu.ar.entidad.Cliente;
import frgp.utn.edu.ar.entidad.Usuario;

public class ClienteDaoImpl implements ClienteDao {

	@Autowired
	private Conexion conexion;
	
	
	@Override
	public boolean insert(Cliente cli) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Cliente cli) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Cliente cli) {
		// TODO Auto-generated method stub
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
	public Cliente obtenerCliente() {
		// TODO Auto-generated method stub
		return null;
	}

}
