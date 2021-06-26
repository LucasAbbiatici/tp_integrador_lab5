package frgp.utn.edu.ar.negocioImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frgp.utn.edu.ar.daoImpl.UsuarioDaoImpl;
import frgp.utn.edu.ar.entidad.Usuario;

@Service("UsuarioNegImpl")
public class UsuarioNegImpl {

	@Autowired
	private UsuarioDaoImpl dao;
	
	public Usuario validarUsuario(Usuario usuario) {
		return dao.validarUsuario(usuario);
	}
	
}
