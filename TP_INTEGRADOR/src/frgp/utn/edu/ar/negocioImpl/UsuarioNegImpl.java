package frgp.utn.edu.ar.negocioImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import frgp.utn.edu.ar.dao.UsuarioDao;
import frgp.utn.edu.ar.entidad.Usuario;
import frgp.utn.edu.ar.negocio.UsuarioNeg;

@Service("negUsuario")
public class UsuarioNegImpl implements UsuarioNeg {

	@Autowired
	@Qualifier("daoUsuario")
	private UsuarioDao dao;

	@Override
	public Usuario validarUsuario(Usuario usuario) {
		return dao.validarUsuario(usuario);
	}

	@Override
	public boolean insert(Usuario usuario) {
		return dao.insert(usuario);
	}

	@Override
	public Usuario obtenerUsuarioXid(int _id) {
		return dao.obtenerUsuarioXid(_id);
	}

	@Override
	public boolean delete(int _id) {
		return dao.delete(_id);
	}

}
