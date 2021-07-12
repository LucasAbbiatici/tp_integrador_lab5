package frgp.utn.edu.ar.negocioImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import frgp.utn.edu.ar.dao.MovimientoDao;
import frgp.utn.edu.ar.entidad.Movimiento;
import frgp.utn.edu.ar.negocio.MovimientoNeg;

@Service("negMovimiento")
public class MovimientoNegImpl implements MovimientoNeg {

	@Autowired
	@Qualifier("daoMovimiento")
	private MovimientoDao dao;

	@Override
	public List<Movimiento> movimientosXcuenta(int _idCuenta) {
		return dao.movimientosXcuenta(_idCuenta);
	}

	@Override
	public boolean insert(Movimiento m) {
		return dao.insert(m);
	}

}
