package frgp.utn.edu.ar.dao;

import frgp.utn.edu.ar.entidad.Usuario;

public interface UsuarioDao {
	public Usuario validarUsuario(Usuario usuario);
	public boolean insert(Usuario usuario);
	public Usuario obtenerUsuarioXid(String _id);
}
