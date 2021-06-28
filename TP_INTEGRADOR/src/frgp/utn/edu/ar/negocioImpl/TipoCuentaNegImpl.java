package frgp.utn.edu.ar.negocioImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import frgp.utn.edu.ar.dao.TipoCuentaDao;
import frgp.utn.edu.ar.entidad.TipoCuenta;
import frgp.utn.edu.ar.negocio.TipoCuentaNeg;

public class TipoCuentaNegImpl implements TipoCuentaNeg {
	
	@Autowired
	TipoCuentaDao dao;
	
	@Override
	public List<TipoCuenta> readAll() {
		return dao.readAll();
	}

	@Override
	public TipoCuenta obtenerTipoCuenta(int _id) {
		return dao.obtenerTipoCuenta(_id);
	}

}
