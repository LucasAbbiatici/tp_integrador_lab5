package frgp.utn.edu.ar.dao;

import java.util.List;

import frgp.utn.edu.ar.entidad.Movimiento;

public interface MovimientoDao {

	public List<Movimiento> movimientosXcuenta(int _idCuenta);
	
}
