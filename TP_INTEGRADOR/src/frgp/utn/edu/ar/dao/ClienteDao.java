package frgp.utn.edu.ar.dao;


import java.util.List;

import frgp.utn.edu.ar.entidad.Cliente;

public interface ClienteDao {

	public boolean insert(Cliente cli);
	public boolean delete(int _id);
	public boolean update(Cliente cli);	
	public List<Cliente> readAll();
	public Cliente obtenerCliente();
	
	
}
