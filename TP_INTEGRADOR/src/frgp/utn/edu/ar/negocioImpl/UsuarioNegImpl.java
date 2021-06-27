package frgp.utn.edu.ar.negocioImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frgp.utn.edu.ar.daoImpl.UsuarioDaoImpl;
import frgp.utn.edu.ar.entidad.Usuario;
import frgp.utn.edu.ar.negocio.UsuarioNeg;

public class UsuarioNegImpl implements UsuarioNeg{

	@Autowired
	private UsuarioDaoImpl dao;
	
	@Override
	public Usuario validarUsuario(Usuario usuario) {
		return dao.validarUsuario(usuario);
	}

	@Override
	public boolean insert(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
