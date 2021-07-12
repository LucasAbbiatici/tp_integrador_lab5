package frgp.utn.edu.ar.negocioImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import frgp.utn.edu.ar.dao.TipoCuentaDao;
import frgp.utn.edu.ar.entidad.TipoCuenta;
import frgp.utn.edu.ar.negocio.TipoCuentaNeg;

@Service("negTipoCuenta")
public class TipoCuentaNegImpl implements TipoCuentaNeg {

	@Autowired
	@Qualifier("daoTipoCuenta")
	private TipoCuentaDao dao;

	@Override
	public List<TipoCuenta> readAll() {
		return dao.readAll();
	}

	@Override
	public TipoCuenta obtenerTipoCuenta(int _id) {
		return dao.obtenerTipoCuenta(_id);
	}

}
