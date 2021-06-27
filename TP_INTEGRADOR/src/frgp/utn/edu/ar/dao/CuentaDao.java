package frgp.utn.edu.ar.dao;

import java.util.List;

import frgp.utn.edu.ar.entidad.Cuenta;

public interface CuentaDao {
	public boolean insert(Cuenta cue);
	public boolean delete(int _id);
	public boolean update(Cuenta cue);	
	public List<Cuenta> readAll();
	public Cuenta obtenerCuenta();
}
