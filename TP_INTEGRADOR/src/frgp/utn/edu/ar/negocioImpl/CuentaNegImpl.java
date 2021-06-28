package frgp.utn.edu.ar.negocioImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import frgp.utn.edu.ar.daoImpl.CuentaDaoImpl;
import frgp.utn.edu.ar.entidad.Cuenta;
import frgp.utn.edu.ar.negocio.CuentaNeg;

public class CuentaNegImpl implements CuentaNeg {

	@Autowired
	private CuentaDaoImpl dao;
	
	@Override
	public boolean insert(Cuenta cue) {
		return dao.insert(cue);
	}

	@Override
	public boolean delete(int _id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Cuenta cue) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Cuenta> readAll() {
		
		return dao.readAll();
	}

	@Override
	public Cuenta obtenerCuenta() {
		// TODO Auto-generated method stub
		return null;
	}

}
