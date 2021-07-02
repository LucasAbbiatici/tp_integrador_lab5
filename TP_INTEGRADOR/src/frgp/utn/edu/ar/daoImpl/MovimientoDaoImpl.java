package frgp.utn.edu.ar.daoImpl;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import frgp.utn.edu.ar.dao.MovimientoDao;
import frgp.utn.edu.ar.entidad.Movimiento;

public class MovimientoDaoImpl implements MovimientoDao{

	@Autowired
	private Conexion conexion;
	
	@Override
	public List<Movimiento> movimientosXcuenta(int _idCuenta) {
		Session session = conexion.abrirConexion();
		
		final List<Movimiento> movimientos = new LinkedList<>();
			
		try {
			Query query = session.createQuery("SELECT m FROM Movimiento m JOIN m.cuenta cuenta WHERE cuenta.id = :idCuenta AND m.estado = 1 ");
			query.setParameter("idCuenta", _idCuenta);
			
			for(final Object o : query.list()) {
				movimientos.add((Movimiento)o);
	         }
			
		} catch (Exception e) {
				e.printStackTrace();
		}
			
			return  movimientos;
	}
	
}
