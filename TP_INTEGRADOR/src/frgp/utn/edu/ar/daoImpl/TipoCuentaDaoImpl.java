package frgp.utn.edu.ar.daoImpl;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import frgp.utn.edu.ar.dao.TipoCuentaDao;
import frgp.utn.edu.ar.entidad.Cuenta;
import frgp.utn.edu.ar.entidad.TipoCuenta;

public class TipoCuentaDaoImpl implements TipoCuentaDao {

	@Autowired
	Conexion conexion;
	
	@Override
	public List<TipoCuenta> readAll() {
		Session session = conexion.abrirConexion();
		
		final List<TipoCuenta> tipoCuenta = new LinkedList<>();
			
		try {
			Query query = session.createQuery("SELECT tc FROM TipoCuenta tc");
			
			for(final Object o : query.list()) {
				tipoCuenta.add((TipoCuenta)o);
	         }
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return  tipoCuenta;
	
	}

}
