package frgp.utn.edu.ar.negocioImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import frgp.utn.edu.ar.daoImpl.ClienteDaoImpl;
import frgp.utn.edu.ar.entidad.Cliente;
import frgp.utn.edu.ar.negocio.ClienteNeg;

public class ClienteNegImpl implements ClienteNeg {

	@Autowired
	private ClienteDaoImpl dao;
	
	@Override
	public boolean insert(Cliente cli) {
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

		return dao.readAll();
	}

	@Override
	public Cliente obtenerCliente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int _id) {
		return dao.delete(_id);
	}

}
