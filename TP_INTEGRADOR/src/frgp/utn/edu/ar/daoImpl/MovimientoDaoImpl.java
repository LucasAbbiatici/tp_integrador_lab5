package frgp.utn.edu.ar.daoImpl;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import frgp.utn.edu.ar.dao.MovimientoDao;
import frgp.utn.edu.ar.entidad.Movimiento;
import frgp.utn.edu.ar.entidad.TipoMovimiento;

@Repository("daoMovimiento")
public class MovimientoDaoImpl implements MovimientoDao {

	@Autowired
	private Conexion conexion;

	@Override
	public List<Movimiento> movimientosXcuenta(int _idCuenta) {
		Session session = conexion.abrirConexion();

		final List<Movimiento> movimientos = new LinkedList<>();

		try {
			Query query = session.createQuery(
					"SELECT m FROM Movimiento m JOIN m.cuenta cuenta WHERE cuenta.id = :idCuenta AND m.estado = 1 ");
			query.setParameter("idCuenta", _idCuenta);

			for (final Object o : query.list()) {
				movimientos.add((Movimiento) o);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		session.close();
		return movimientos;
	}

	@Override
	public boolean insert(Movimiento m) {

		Session session = conexion.abrirConexion();
		Transaction transaction = session.beginTransaction();

		try {
			session.save(m);
			transaction.commit();
			session.close();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			session.close();
			return false;
		}

	}

}
