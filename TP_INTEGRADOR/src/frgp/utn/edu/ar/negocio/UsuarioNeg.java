package frgp.utn.edu.ar.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frgp.utn.edu.ar.dao.UsuarioDao;
import frgp.utn.edu.ar.entidad.Usuario;

@Service("UsuarioNeg")
public class UsuarioNeg {

	@Autowired
	private UsuarioDao dao;
	
	public Usuario validarUsuario(Usuario usuario) {
		return dao.validarUsuario(usuario);
	}
	
}
