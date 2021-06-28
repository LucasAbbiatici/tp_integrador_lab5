package frgp.utn.edu.ar.dao;

import java.util.List;

import frgp.utn.edu.ar.entidad.TipoCuenta;

public interface TipoCuentaDao {
	public List<TipoCuenta> readAll();
	public TipoCuenta obtenerTipoCuenta(int _id);
}
