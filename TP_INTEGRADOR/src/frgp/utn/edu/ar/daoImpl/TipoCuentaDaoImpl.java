package frgp.utn.edu.ar.daoImpl;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import frgp.utn.edu.ar.dao.TipoCuentaDao;
import frgp.utn.edu.ar.entidad.Cliente;
import frgp.utn.edu.ar.entidad.Cuenta;
import frgp.utn.edu.ar.entidad.TipoCuenta;

@Repository("daoTipoCuenta")
public class TipoCuentaDaoImpl implements TipoCuentaDao {

	@Autowired
	private Conexion conexion;
	@Autowired
	private TipoCuenta tc;

	@Override
	public List<TipoCuenta> readAll() {
		Session session = conexion.abrirConexion();

		final List<TipoCuenta> tipoCuenta = new LinkedList<>();

		try {
			Query query = session.createQuery("SELECT tc FROM TipoCuenta tc");

			for (final Object o : query.list()) {
				tipoCuenta.add((TipoCuenta) o);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		session.close();
		return tipoCuenta;

	}

	@Override
	public TipoCuenta obtenerTipoCuenta(int _id) {
		Session session = conexion.abrirConexion();

		try {

			Query query = session.createQuery("FROM TipoCuenta tc WHERE tc.id =:idTipoCuenta");
			query.setParameter("idTipoCuenta", _id);

			tc = (TipoCuenta) query.list().get(0);

			session.close();
			return tc;

		} catch (Exception e) {
			e.printStackTrace();
		}

		session.close();
		return tc;
	}

}
