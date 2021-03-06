package frgp.utn.edu.ar.daoImpl;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import frgp.utn.edu.ar.dao.CuentaDao;
import frgp.utn.edu.ar.entidad.Cuenta;
import frgp.utn.edu.ar.entidad.Movimiento;

@Repository("daoCuenta")
public class CuentaDaoImpl implements CuentaDao {

	@Autowired
	private Conexion conexion;

	@Override
	public boolean insert(Cuenta cue) {
		Session session = conexion.abrirConexion();
		Transaction transaction = session.beginTransaction();

		try {
			session.saveOrUpdate(cue);
			transaction.commit();
			session.close();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			session.close();
			return false;
		}

	}

	@Override
	public boolean delete(int _id) {
		Session session = conexion.abrirConexion();
		Transaction transaction = session.beginTransaction();
		try {
			Query query = session
					.createQuery("UPDATE Cuenta c SET c.estado = 0 WHERE c.id =:idCuenta and c.estado = 1");
			query.setParameter("idCuenta", _id);

			if (query.executeUpdate() > 0) {
				transaction.commit();
				session.close();
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

		session.close();
		return false;
	}

	@Override
	public List<Cuenta> readAll() {
		Session session = conexion.abrirConexion();

		final List<Cuenta> cuentas = new LinkedList<>();

		try {
			Query query = session.createQuery("FROM Cuenta c WHERE c.estado = 1");

			for (final Object o : query.list()) {
				cuentas.add((Cuenta) o);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		session.close();
		return cuentas;
	}

	@Override
	public Cuenta obtenerCuenta(int _id) {
		Session session = conexion.abrirConexion();
		Cuenta cue = new Cuenta();

		try {
			Query query = session.createQuery("SELECT c FROM Cuenta c WHERE c.id=:idCuenta");
			query.setParameter("idCuenta", _id);

			cue = (Cuenta) query.list().get(0);

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		session.close();
		return cue;
	}

	@Override
	public List<Cuenta> obtenerCuentasCliente(int _idCliente) {
		Session session = conexion.abrirConexion();

		final List<Cuenta> cuentas = new LinkedList<>();

		try {
			Query query = session.createQuery(
					"select c FROM Cuenta c join c.cliente cliente WHERE cliente.id = :idCliente AND c.estado = 1");
			query.setParameter("idCliente", _idCliente);
			for (final Object o : query.list()) {
				cuentas.add((Cuenta) o);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		session.close();
		return cuentas;
	}

	@Override
	public boolean verificarCantCuentas(int _idCliente) {
		Session session = conexion.abrirConexion();

		try {
			Query query = session.createQuery("SELECT COUNT(*) FROM Cuenta c"
					+ " join c.cliente cliente  WHERE cliente.id = :idCliente AND c.estado=1");
			query.setParameter("idCliente", _idCliente);

			// Cualquiera de los dos devuelve el valor de COUNT
			// long var = (long)query.list().get(0);
			// long var2 = (long)query.uniqueResult();

			if ((long) query.list().get(0) >= 4) {
				session.close();
				return false;
			} else {
				session.close();
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
			session.close();
			return true;
		}
	}

	@Override
	public boolean borrarCuentasCliente(int _idCliente) {
		Session session = conexion.abrirConexion();
		Transaction transaction = session.beginTransaction();
		try {
			Query query = session
					.createQuery("UPDATE Cuenta c SET c.estado = 0 WHERE c.cliente.id =:idCliente and c.estado = 1");
			query.setParameter("idCliente", _idCliente);

			if (query.executeUpdate() > 0) {
				transaction.commit();
				session.close();
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

		session.close();
		return false;
	}

	@Override
	public boolean actualizarSaldo(Movimiento mov) {

		Session session = conexion.abrirConexion();
		Transaction transaction = session.beginTransaction();
		Query query;
		float saldoCuenta = mov.getCuenta().getSaldo();

		try {

			if (mov.getTipoDeMovimiento().getId() == 1) {
				saldoCuenta -= mov.getImporte();
				query = session
						.createQuery("UPDATE Cuenta c SET c.saldo =:importe WHERE c.id =:idCuenta and c.estado = 1");
			} else {
				saldoCuenta += mov.getImporte();
				query = session
						.createQuery("UPDATE Cuenta c SET c.saldo =:importe WHERE c.id =:idCuenta and c.estado = 1");
			}
			query.setParameter("importe", saldoCuenta);
			query.setParameter("idCuenta", mov.getCuenta().getId());

			if (query.executeUpdate() > 0) {
				transaction.commit();
				session.close();
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

		session.close();
		return false;
	}

	@Override
	public Cuenta obtenerCuentaXCBU(String CBU) {
		Session session = conexion.abrirConexion();
		Cuenta cue = new Cuenta();

		try {
			Query query = session.createQuery("select c FROM Cuenta c WHERE c.CBU=:CBUCue");
			query.setParameter("CBUCue", CBU);

			cue = (Cuenta) query.list().get(0);

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		session.close();
		return cue;
	}

}
