package frgp.utn.edu.ar.main;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import frgp.utn.edu.ar.entidad.Cliente;
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
		cliente.setDni("38674701");
		cliente.setNombre("Brian");
		cliente.setApellido("Bravo");
		cliente.setSexo("Masculino");
		cliente.setNacionalidad("Argentina");
		cliente.setFechaNacimiento(date2);
		cliente.setDireccion("Los Platanos 300");
		cliente.setProvincia("Buenos aires");
		cliente.setLocalidad("Escobar");
		
		//Usuario 2
		Usuario usuario2 = new Usuario(cliente2);		
		cliente.setUser(usuario2);
		
		session.save(usuario2);
		session.save(cliente2);
		
		//---------------------------------------------------------------
		
		//Date 3
		String str3 = "1999-02-24";
		Date date3 = Date.valueOf(str3);
				
		//Cliente 3
		Cliente cliente3 = new Cliente();
		cliente.setDni("41715987");
		cliente.setNombre("Lucas");
		cliente.setApellido("Abbiatici");
		cliente.setSexo("Masculino");
		cliente.setNacionalidad("Argentina");
		cliente.setFechaNacimiento(date3);
		cliente.setDireccion("Guayaquil 201");
		cliente.setProvincia("Buenos aires");
		cliente.setLocalidad("Grand Bourg");
						
		//Usuario 3
		Usuario usuario3 = new Usuario(cliente3);		
		cliente.setUser(usuario3);
		
		session.save(usuario3);
		session.save(cliente3);
		
		//---------------------------------------------------------------
		
		//Date 4
		String str4 = "1999-02-24";
		Date date4 = Date.valueOf(str4);
				
		//Cliente 4
		Cliente cliente4 = new Cliente();
		cliente.setDni("41715987");
		cliente.setNombre("Lucas");
		cliente.setApellido("Abbiatici");
		cliente.setSexo("Masculino");
		cliente.setNacionalidad("Argentina");
		cliente.setFechaNacimiento(date4);
		cliente.setDireccion("Guayaquil 201");
		cliente.setProvincia("Buenos aires");
		cliente.setLocalidad("Grand Bourg");
		cliente.setUser(usuario3);
						
		//Usuario 4
		Usuario usuario4 = new Usuario(cliente4);		
		cliente.setUser(usuario4);
		
		session.save(usuario4);
		session.save(cliente4);
		
		//---------------------------------------------------------------
		
		session.getTransaction().commit();
		session.close();
		
		sessionFactory.close();
		
	}
}
