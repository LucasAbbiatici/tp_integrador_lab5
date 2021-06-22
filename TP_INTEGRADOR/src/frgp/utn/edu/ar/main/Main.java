package frgp.utn.edu.ar.main;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import frgp.utn.edu.ar.entidad.Cliente;
import frgp.utn.edu.ar.entidad.Movimiento;
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
		
		//---------------------------------------------------------------
		
		//Date 4
		String str4 = "1992-05-19";
		Date date4 = Date.valueOf(str4);
		
		//Cliente 4
		Cliente cliente4 = new Cliente();
		cliente4.setDni("36031562");
		cliente4.setNombre("Claudio");
		cliente4.setApellido("Benitez");
		cliente4.setSexo("Masculino");
		cliente4.setNacionalidad("Argentina");
		cliente4.setFechaNacimiento(date4);
		cliente4.setDireccion("San Martin 443");
		cliente4.setProvincia("Buenos aires");
		cliente4.setLocalidad("Moreno");
		
		//Usuario 4
		Usuario usuario4 = new Usuario(cliente4);		
		cliente4.setUser(usuario4);
		
		session.save(usuario4);
		session.save(cliente4);
		
		//---------------------------------------------------------------
		
		//Date 5
		String str5= "1988-11-30";
		Date date5 = Date.valueOf(str5);
		
		//Cliente 5
		Cliente cliente5 = new Cliente();
		cliente5.setDni("23054133");
		cliente5.setNombre("Hernan");
		cliente5.setApellido("Fernandez");
		cliente5.setSexo("Masculino");
		cliente5.setNacionalidad("Argentina");
		cliente5.setFechaNacimiento(date5);
		cliente5.setDireccion("Belgrano 6243");
		cliente5.setProvincia("Buenos aires");
		cliente5.setLocalidad("Avellaneda");
		
		//Usuario 5
		Usuario usuario5 = new Usuario(cliente5);		
		cliente5.setUser(usuario5);
		
		session.save(usuario5);
		session.save(cliente5);
		
		//---------------------------------------------------------------
		
		//Date 6
		String str6 = "1983-12-09";
		Date date6 = Date.valueOf(str6);
		
		//Cliente 6
		Cliente cliente6 = new Cliente();
		cliente6.setDni("20432411");
		cliente6.setNombre("Maria");
		cliente6.setApellido("Maidana");
		cliente6.setSexo("Femenino");
		cliente6.setNacionalidad("Argentina");
		cliente6.setFechaNacimiento(date6);
		cliente6.setDireccion("Humberto 2431");
		cliente6.setProvincia("Buenos aires");
		cliente6.setLocalidad("Lujan");
		
		//Usuario 6
		Usuario usuario6 = new Usuario(cliente6);		
		cliente6.setUser(usuario6);
		
		session.save(usuario6);
		session.save(cliente6);
		
		//---------------------------------------------------------------
		
		//Date 7
		String str7 = "1996-08-30";
		Date date7 = Date.valueOf(str7);
		
		//Cliente 7
		Cliente cliente7 = new Cliente();
		cliente7.setDni("38033179");
		cliente7.setNombre("Marta");
		cliente7.setApellido("Colque");
		cliente7.setSexo("Femenino");
		cliente7.setNacionalidad("Argentina");
		cliente7.setFechaNacimiento(date7);
		cliente7.setDireccion("San Martin 2243");
		cliente7.setProvincia("Cordoba");
		cliente7.setLocalidad("Carlos Paz");
		
		//Usuario 7
		Usuario usuario7 = new Usuario(cliente7);		
		cliente7.setUser(usuario7);
		
		session.save(usuario7);
		session.save(cliente7);
		
		//---------------------------------------------------------------
		
		//Date 8
		String str8 = "2001-06-23";
		Date date8 = Date.valueOf(str8);
		
		//Cliente 8
		Cliente cliente8 = new Cliente();
		cliente8.setDni("43687811");
		cliente8.setNombre("Tomas");
		cliente8.setApellido("Chialva");
		cliente8.setSexo("Masculino");
		cliente8.setNacionalidad("Argentina");
		cliente8.setFechaNacimiento(date8);
		cliente8.setDireccion("Av Cordoba 3011");
		cliente8.setProvincia("San Luis");
		cliente8.setLocalidad("Villa Mercedes");
		
		//Usuario 8
		Usuario usuario8 = new Usuario(cliente8);		
		cliente8.setUser(usuario8);
		
		session.save(usuario8);
		session.save(cliente8);
		
		//---------------------------------------------------------------
		
		//Date 9
		String str9 = "1999-10-09";
		Date date9 = Date.valueOf(str9);
		
		//Cliente 9
		Cliente cliente9 = new Cliente();
		cliente9.setDni("41886423");
		cliente9.setNombre("Vanesa");
		cliente9.setApellido("Torres");
		cliente9.setSexo("Femenino");
		cliente9.setNacionalidad("Argentina");
		cliente9.setFechaNacimiento(date9);
		cliente9.setDireccion("Cerviño 4449");
		cliente9.setProvincia("Cordoba");
		cliente9.setLocalidad("Villa Totoral");
		
		//Usuario 9
		Usuario usuario9 = new Usuario(cliente9);		
		cliente9.setUser(usuario9);
		
		session.save(usuario9);
		session.save(cliente9);
		
		//---------------------------------------------------------------
		
		//Date 10
		String str10 = "1969-07-31";
		Date date10 = Date.valueOf(str10);
		
		//Cliente 10
		Cliente cliente10 = new Cliente();
		cliente10.setDni("20064133");
		cliente10.setNombre("Roberto");
		cliente10.setApellido("Lombardo");
		cliente10.setSexo("Masculino");
		cliente10.setNacionalidad("Argentina");
		cliente10.setFechaNacimiento(date10);
		cliente10.setDireccion("Catamarca 1541");
		cliente10.setProvincia("Buenos aires");
		cliente10.setLocalidad("Pilar");
		
		//Usuario 10
		Usuario usuario10 = new Usuario(cliente10);		
		cliente10.setUser(usuario10);
		
		session.save(usuario10);
		session.save(cliente10);
		
		//---------------------------------------------------------------


		//----------------- TIPO DE CUENTA Y TIPO DE MOVIMIENTO ------------------------
		
		TipoCuenta pesos = new TipoCuenta();
		pesos.setDescripcion("Caja de ahorro en pesos");
		session.save(pesos);
		
		TipoCuenta dolares = new TipoCuenta();
		dolares.setDescripcion("Caja de ahorro en dolares");
		session.save(dolares);
		
		TipoMovimiento Negativo = new TipoMovimiento();
		Negativo.setDescripcion("Negativo");
		session.save(Negativo);
		
		TipoMovimiento Positivo = new TipoMovimiento();
		Positivo.setDescripcion("Positivo");
		session.save(Positivo);
		
		//-----------------  MOVIMIENTOS ------------------------
		
		
		Movimiento movimiento = new Movimiento();
		
		//Movimiento 1
		
		String strMov = "2021-06-03";
		Date dateMov = Date.valueOf(strMov);
		movimiento.setDetalle("PAGO HABERES");
		movimiento.setImporte(65000);
		movimiento.setFecha(dateMov);
		movimiento.setTipoDeMovimiento(Positivo);
		
		
		
		//---------------------------------------------------------------
		session.getTransaction().commit();
		session.close();
		
		sessionFactory.close();
		
	}
}
