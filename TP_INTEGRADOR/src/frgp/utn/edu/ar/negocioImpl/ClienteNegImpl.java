package frgp.utn.edu.ar.negocioImpl;


import java.util.List;

import frgp.utn.edu.ar.daoImpl.ClienteDaoImpl;
import frgp.utn.edu.ar.entidad.Cliente;
import frgp.utn.edu.ar.negocio.ClienteNeg;

public class ClienteNegImpl implements ClienteNeg {

	ClienteDaoImpl dao = new ClienteDaoImpl();
	
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

		return dao.readAll();
	}

	@Override
	public Cliente obtenerCliente() {
		// TODO Auto-generated method stub
		return null;
	}

}
