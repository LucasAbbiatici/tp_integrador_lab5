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
		return dao.insert(cli);
	}

	@Override
	public List<Cliente> readAll() {

		return dao.readAll();
	}

	@Override
	public Cliente obtenerCliente(int _id) {
		return dao.obtenerCliente(_id);
	}

	@Override
	public boolean delete(int _id) {
		return dao.delete(_id);
	}

	@Override
	public int obtenerClientePorUsuario(int _id) {
		return dao.obtenerClientePorUsuario(_id);
	}

	@Override
	public boolean verificarExistenciaDni(String _dni) {
		return dao.verificarExistenciaDni(_dni);
	}

}
