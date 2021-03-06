package frgp.utn.edu.ar.negocioImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import frgp.utn.edu.ar.dao.CuentaDao;
import frgp.utn.edu.ar.entidad.Cuenta;
import frgp.utn.edu.ar.entidad.Movimiento;
import frgp.utn.edu.ar.negocio.CuentaNeg;

@Service("negCuenta")
public class CuentaNegImpl implements CuentaNeg {

	@Autowired
	@Qualifier("daoCuenta")
	private CuentaDao dao;

	@Override
	public boolean insert(Cuenta cue) {

		if (cue.getTipoDeCuenta().getId() == 1) {
			cue.setSaldo(10000);
		} else {
			cue.setSaldo(62);
		}

		return dao.insert(cue);
	}

	@Override
	public boolean delete(int _id) {
		return dao.delete(_id);
	}

	@Override
	public List<Cuenta> readAll() {

		return dao.readAll();
	}

	@Override
	public Cuenta obtenerCuenta(int _id) {
		return dao.obtenerCuenta(_id);
	}

	@Override
	public boolean verificarCantCuentas(int _idCliente) {
		return dao.verificarCantCuentas(_idCliente);
	}

	@Override
	public List<Cuenta> obtenerCuentasCliente(int _idCliente) {
		return dao.obtenerCuentasCliente(_idCliente);
	}

	@Override
	public boolean borrarCuentasCliente(int _idCliente) {
		return dao.borrarCuentasCliente(_idCliente);
	}

	@Override
	public boolean actualizarSaldo(Movimiento mov) {
		return dao.actualizarSaldo(mov);

	}

	@Override
	public Cuenta obtenerCuentaXCBU(String CBU) {
		return dao.obtenerCuentaXCBU(CBU);
	}

}
