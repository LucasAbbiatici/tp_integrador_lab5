package frgp.utn.edu.ar.daoImpl;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import frgp.utn.edu.ar.dao.CuentaDao;
import frgp.utn.edu.ar.entidad.Cuenta;

public class CuentaDaoImpl implements CuentaDao {

	@Autowired
	Conexion conexion;

	@Override
	public boolean insert(Cuenta cue) {
		// TODO Auto-generated method stub
		return false;
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
		Session session = conexion.abrirConexion();
		
		final List<Cuenta> cuentas = new LinkedList<>();
			
		try {
			Query query = session.createQuery("FROM Cuenta c WHERE c.estado = 1");
			
			for(final Object o : query.list()) {
				cuentas.add((Cuenta)o);
	         }
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return  cuentas;
	}

	@Override
	public Cuenta obtenerCuenta() {
		// TODO Auto-generated method stub
		return null;
	}

}
