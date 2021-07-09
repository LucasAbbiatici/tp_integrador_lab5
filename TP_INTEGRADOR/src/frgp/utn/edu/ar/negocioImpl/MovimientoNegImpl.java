package frgp.utn.edu.ar.negocioImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import frgp.utn.edu.ar.daoImpl.MovimientoDaoImpl;
import frgp.utn.edu.ar.entidad.Movimiento;
import frgp.utn.edu.ar.negocio.MovimientoNeg;

public class MovimientoNegImpl implements MovimientoNeg{

	@Autowired
	private MovimientoDaoImpl dao;
	
	@Override
	public List<Movimiento> movimientosXcuenta(int _idCuenta) {
		return dao.movimientosXcuenta(_idCuenta);
	}


	@Override
	public boolean insert(Movimiento m) {
		return dao.insert(m);
	}

}
