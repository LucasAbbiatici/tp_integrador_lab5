package frgp.utn.edu.ar.main;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import frgp.utn.edu.ar.entidad.Cliente;
import frgp.utn.edu.ar.entidad.TipoCuenta;
import frgp.utn.edu.ar.entidad.TipoMovimiento;
import frgp.utn.edu.ar.entidad.Usuario;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory;
		
		Configuration configuration = new Configuration();
		configuration.configure();
		
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		//---------------------------------------------------------------

		//ADMIN
		Usuario admin = new Usuario();
		admin.setUser("admin");
		admin.setPass("admin");
		admin.setAdmin(true);
		
		session.save(admin);

		//---------------------------------------------------------------
				
		//Date 1
		String str = "1999-11-03";
		Date date = Date.valueOf(str);
		
		//Cliente 1
		Cliente cliente = new Cliente();
		cliente.setDni("44999555");
		cliente.setNombre("Federico");
		cliente.setApellido("Aragon");
		cliente.setSexo("Masculino");
		cliente.setNacionalidad("Argentina");
		cliente.setFechaNacimiento(date);
		cliente.setDireccion("Ayacucho 2011");
		cliente.setProvincia("Buenos aires");
		cliente.setLocalidad("Don Torcuato");
		
		//Usuario 1
		Usuario usuario = new Usuario(cliente);		
		cliente.setUser(usuario);
		
		session.save(usuario);
		session.save(cliente);

		//---------------------------------------------------------------
		
		//Date 2
		String str2 = "1995-01-11";
		Date date2 = Date.valueOf(str2);
		
		//Cliente 2
		Cliente cliente2 = new Cliente();
		cliente2.setDni("38674701");
		cliente2.setNombre("Brian");
		cliente2.setApellido("Bravo");
		cliente2.setSexo("Masculino");
		cliente2.setNacionalidad("Argentina");
		cliente2.setFechaNacimiento(date2);
		cliente2.setDireccion("Los Platanos 300");
		cliente2.setProvincia("Buenos aires");
		cliente2.setLocalidad("Escobar");
		
		//Usuario 2
		Usuario usuario2 = new Usuario(cliente2);		
		cliente2.setUser(usuario2);
		
		session.save(usuario2);
		session.save(cliente2);
		
		//---------------------------------------------------------------
		
		//Date 3
		String str3 = "1999-02-24";
		Date date3 = Date.valueOf(str3);
				
		//Cliente 3
		Cliente cliente3 = new Cliente();
		cliente3.setDni("41715987");
		cliente3.setNombre("Lucas");
		cliente3.setApellido("Abbiatici");
		cliente3.setSexo("Masculino");
		cliente3.setNacionalidad("Argentina");
		cliente3.setFechaNacimiento(date3);
		cliente3.setDireccion("Guayaquil 201");
		cliente3.setProvincia("Buenos aires");
		cliente3.setLocalidad("Grand Bourg");
						
		//Usuario 3
		Usuario usuario3 = new Usuario(cliente3);		
		cliente3.setUser(usuario3);
		
		session.save(usuario3);
		session.save(cliente3);
		
		//----------------- TIPO DE CUENTA Y TIPO DE MOVIMIENTO ------------------------
		
		TipoCuenta tipoCuenta = new TipoCuenta();
		tipoCuenta.setDescripcion("Caja de ahorro en pesos");
		session.save(tipoCuenta);
		
		TipoCuenta tipoCuenta2 = new TipoCuenta();
		tipoCuenta2.setDescripcion("Caja de ahorro en dolares");
		session.save(tipoCuenta2);
		
		TipoMovimiento tipoMovimiento = new TipoMovimiento();
		tipoMovimiento.setDescripcion("Negativo");
		session.save(tipoMovimiento);
		
		TipoMovimiento tipoMovimiento2 = new TipoMovimiento();
		tipoMovimiento2.setDescripcion("Positivo");
		session.save(tipoMovimiento2);
		
		//----------------- TIPO DE CUENTA Y TIPO DE MOVIMIENTO ------------------------
		
		
		session.getTransaction().commit();
		session.close();
		
		sessionFactory.close();
		
	}
}
