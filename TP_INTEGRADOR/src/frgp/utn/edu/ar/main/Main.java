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
		
		Usuario usuario = new Usuario();
		usuario.setUser("fede123");
		usuario.setPass("123456");
		
		session.save(usuario);
		
		String str = "1999-02-24";
		Date date = Date.valueOf(str);
		
		Cliente cliente = new Cliente();
		cliente.setDni(44999555);
		cliente.setNombre("Federico");
		cliente.setApellido("Aragon");
		cliente.setSexo("poco-nada");
		cliente.setNacionalidad("Boliviana");
		cliente.setFechaNacimiento(date);
		cliente.setDireccion("Ayacucho 2011");
		cliente.setProvincia("Buenos aires");
		cliente.setLocalidad("Don Torcuato");
		cliente.setUser(usuario);
		
		session.save(cliente);
		
		session.getTransaction().commit();
		session.close();
		
		sessionFactory.close();
	}
}
