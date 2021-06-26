package frgp.utn.edu.ar.main;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import frgp.utn.edu.ar.dao.Conexion;
import frgp.utn.edu.ar.entidad.Cliente;
import frgp.utn.edu.ar.entidad.Cuenta;
import frgp.utn.edu.ar.entidad.Movimiento;
import frgp.utn.edu.ar.entidad.TipoCuenta;
import frgp.utn.edu.ar.entidad.TipoMovimiento;
import frgp.utn.edu.ar.entidad.Usuario;
import frgp.utn.edu.ar.resources.Config;

public class Main {

		
	public static void main(String[] args) {
			
		SessionFactory sessionFactory;
		
		Configuration configuration = new Configuration();
		configuration.configure();
		
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		/*
		Conexion conexion = new Conexion();
		Session session = conexion.abrirConexion();
		session.beginTransaction();
		*/
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
		
		//-----------------  CUENTAS ------------------------
		//Cuenta 1
		Cuenta cuenta = new Cuenta();
		String strc = "2021-06-22";
		Date dateCuenta = Date.valueOf(strc);
		
		cuenta.setCliente(cliente);
		cuenta.setFechaCreacion(dateCuenta);
		cuenta.setNombre("alias."+cliente.getApellido()+"."+cuenta.getNroCuenta());
		cuenta.setSaldo(100000);
		cuenta.setTipoDeCuenta(pesos);
		session.save(cuenta);
		
		//---------------------------------------------------------------
		
		//Cuenta 2
		
		Cuenta cuenta2 = new Cuenta();
		String strc2 = "2017-11-22";
		Date dateCuenta2 = Date.valueOf(strc2);
		
		cuenta2.setCliente(cliente2);
		cuenta2.setFechaCreacion(dateCuenta2);
		cuenta2.setNombre("alias."+cliente2.getApellido()+"."+cuenta2.getNroCuenta());
		cuenta2.setTipoDeCuenta(pesos);
		session.save(cuenta2);
		
		//---------------------------------------------------------------

		//Cuenta 3
		
		Cuenta cuenta3 = new Cuenta();
		String strc3 = "2014-12-12";
		Date dateCuenta3 = Date.valueOf(strc3);
		
		cuenta3.setCliente(cliente3);
		cuenta3.setFechaCreacion(dateCuenta3);
		cuenta3.setNombre("alias."+cliente3.getApellido()+"."+cuenta3.getNroCuenta());
		cuenta3.setTipoDeCuenta(pesos);
		session.save(cuenta3);
		
		//---------------------------------------------------------------

		//Cuenta 4
		
		Cuenta cuenta4 = new Cuenta();
		String strc4 = "2011-08-22";
		Date dateCuenta4 = Date.valueOf(strc4);
		
		cuenta4.setCliente(cliente);
		cuenta4.setFechaCreacion(dateCuenta4);
		cuenta4.setNombre("alias."+cliente.getApellido()+"."+cuenta4.getNroCuenta());
		cuenta4.setTipoDeCuenta(dolares);
		cuenta4.setSaldo(62);
		session.save(cuenta4);
		
		//---------------------------------------------------------------
		
		//Cuenta 5
		
		Cuenta cuenta5 = new Cuenta();
		String strc5 = "1999-11-10";
		Date dateCuenta5 = Date.valueOf(strc5);
		
		cuenta5.setCliente(cliente5);
		cuenta5.setFechaCreacion(dateCuenta5);
		cuenta5.setNombre("alias."+cliente5.getApellido()+"."+cuenta5.getNroCuenta());
		cuenta5.setTipoDeCuenta(pesos);
		session.save(cuenta5);
		
		//---------------------------------------------------------------
		
		//Cuenta 6
		
		Cuenta cuenta6 = new Cuenta();
		String strc6 = "1995-11-21";
		Date dateCuenta6 = Date.valueOf(strc6);
		
		cuenta6.setCliente(cliente10);
		cuenta6.setFechaCreacion(dateCuenta6);
		cuenta6.setNombre("alias."+cliente10.getApellido()+"."+cuenta6.getNroCuenta());
		cuenta6.setTipoDeCuenta(dolares);
		cuenta6.setSaldo(62);
		session.save(cuenta6);
		
		//---------------------------------------------------------------
		
		//Cuenta 7
		
		Cuenta cuenta7 = new Cuenta();
		String strc7 = "2017-07-22";
		Date dateCuenta7 = Date.valueOf(strc7);
		
		cuenta7.setCliente(cliente);
		cuenta7.setFechaCreacion(dateCuenta);
		cuenta7.setNombre("alias."+cliente.getApellido()+"."+cuenta7.getNroCuenta());
		cuenta7.setTipoDeCuenta(pesos);
		cuenta7.setSaldo(100000);
		session.save(cuenta7);

		//---------------------------------------------------------------

		//Cuenta 8
		
		Cuenta cuenta8 = new Cuenta();
		String strc8 = "2001-12-11";
		Date dateCuenta8 = Date.valueOf(strc8);
		
		cuenta8.setCliente(cliente8);
		cuenta8.setFechaCreacion(dateCuenta8);
		cuenta8.setNombre("alias."+cliente8.getApellido()+"."+cuenta8.getNroCuenta());
		cuenta8.setTipoDeCuenta(dolares);
		cuenta8.setSaldo(62);
		session.save(cuenta8);
     
		//---------------------------------------------------------------

		//Cuenta 9
		
		Cuenta cuenta9 = new Cuenta();
		String strc9 = "2020-06-11";
		Date dateCuenta9 = Date.valueOf(strc9);
		
		cuenta9.setCliente(cliente8);
		cuenta9.setFechaCreacion(dateCuenta9);
		cuenta9.setNombre("alias."+cliente8.getApellido()+"."+cuenta9.getNroCuenta());
		cuenta9.setTipoDeCuenta(pesos);
		cuenta9.setSaldo(50000);
		session.save(cuenta9);
		
		//---------------------------------------------------------------
		
	    //Cuenta 10
		
		Cuenta cuenta10 = new Cuenta();
		String strc10 = "1995-10-10";
		Date dateCuenta10 = Date.valueOf(strc10);
		
		cuenta10.setCliente(cliente5);
		cuenta10.setFechaCreacion(dateCuenta10);
		cuenta10.setNombre("alias."+cliente5.getApellido()+"."+cuenta10.getNroCuenta());
		cuenta10.setTipoDeCuenta(dolares);
		cuenta10.setSaldo(62);
		session.save(cuenta10);
		
		//---------------------------------------------------------------

		//-----------------  MOVIMIENTOS ------------------------
		
		
		//Movimiento 1
		
		Movimiento movimiento = new Movimiento();
		String strMov = "2021-06-03";
		Date dateMov = Date.valueOf(strMov);
		movimiento.setDetalle("PAGO HABERES");
		movimiento.setImporte(65000);
		movimiento.setFecha(dateMov);
		movimiento.setTipoDeMovimiento(Positivo);
		movimiento.setCuenta(cuenta);
		session.save(movimiento);
		
		//---------------------------------------------------------------
		
		//Movimiento 2
		
		Movimiento movimiento2 = new Movimiento();
		String strMov2 = "2020-01-13";
		Date dateMov2 = Date.valueOf(strMov2);
		movimiento2.setDetalle("COMPRA ELECTRONICA");
		movimiento2.setImporte(3000);
		movimiento2.setFecha(dateMov2);
		movimiento2.setTipoDeMovimiento(Negativo);
		movimiento2.setCuenta(cuenta);
		session.save(movimiento2);
		
		//---------------------------------------------------------------
		
		
		//Movimiento 3
		
		Movimiento movimiento3 = new Movimiento();
		String strMov3 = "2020-01-13";
		Date dateMov3 = Date.valueOf(strMov3);
		movimiento3.setDetalle("DEBITO TARJT");
		movimiento3.setImporte(5000);
		movimiento3.setFecha(dateMov3);
		movimiento3.setTipoDeMovimiento(Negativo);
		movimiento3.setCuenta(cuenta2);
		session.save(movimiento3);
		
		//---------------------------------------------------------------
		
		//Movimiento 4

		Movimiento movimiento4 = new Movimiento();
		String strMov4 = "2020-01-13";
		Date dateMov4 = Date.valueOf(strMov4);
		movimiento4.setDetalle("TRANSFERENCIA");
		movimiento4.setImporte(15000);
		movimiento4.setFecha(dateMov4);
		movimiento4.setTipoDeMovimiento(Positivo);
		movimiento4.setCuenta(cuenta3);
		session.save(movimiento4);
		
		//---------------------------------------------------------------
		
		//Movimiento 5

		Movimiento movimiento5 = new Movimiento();
		String strMov5 = "2021-03-15";
		Date dateMov5 = Date.valueOf(strMov5);
		movimiento5.setDetalle("PAGO HABERES");
		movimiento5.setImporte(150000);
		movimiento5.setFecha(dateMov5);
		movimiento5.setTipoDeMovimiento(Positivo);
		movimiento5.setCuenta(cuenta4);
		session.save(movimiento5);
		
		//---------------------------------------------------------------
		
     	//Movimiento 6
		
		Movimiento movimiento6 = new Movimiento();
		String strMov6 = "2020-01-13";
		Date dateMov6 = Date.valueOf(strMov6);
		movimiento6.setDetalle("DEBITO TARJT");
		movimiento6.setImporte(5000);
		movimiento6.setFecha(dateMov6);
		movimiento6.setTipoDeMovimiento(Negativo);
		movimiento6.setCuenta(cuenta);
		session.save(movimiento6);
		
		//---------------------------------------------------------------
		
		//Movimiento 7
		
		Movimiento movimiento7 = new Movimiento();
		String strMov7 = "2020-01-15";
		Date dateMov7 = Date.valueOf(strMov7);
		movimiento7.setDetalle("TRANSFERENCIA");
		movimiento7.setImporte(5000);
		movimiento7.setFecha(dateMov7);
		movimiento7.setTipoDeMovimiento(Negativo);
		movimiento7.setCuenta(cuenta);
		session.save(movimiento7);
		
		//---------------------------------------------------------------
		
		//Movimiento 8
		
		Movimiento movimiento8 = new Movimiento();
		String strMov8 = "2011-11-14";
		Date dateMov8 = Date.valueOf(strMov8);
		movimiento8.setDetalle("DEPOSITO EFECTIVO");
		movimiento8.setImporte(5000);
		movimiento8.setFecha(dateMov8);
		movimiento8.setTipoDeMovimiento(Positivo);
		movimiento8.setCuenta(cuenta6);
		session.save(movimiento8);
		
		//---------------------------------------------------------------
		
		//Movimiento 9
		
		Movimiento movimiento9 = new Movimiento();
		String strMov9 = "2018-05-30";
		Date dateMov9 = Date.valueOf(strMov9);
		movimiento9.setDetalle("PAGO TARJETA CREDITO");
		movimiento9.setImporte(5000);
		movimiento9.setFecha(dateMov9);
		movimiento9.setTipoDeMovimiento(Negativo);
		movimiento9.setCuenta(cuenta6);
		session.save(movimiento9);
		
		//---------------------------------------------------------------
		
		//Movimiento 10
		
		Movimiento movimiento10 = new Movimiento();
		String strMov10 = "2018-01-23";
		Date dateMov10 = Date.valueOf(strMov10);
		movimiento10.setDetalle("PAGO TARJETA CREDITO");
		movimiento10.setImporte(15000);
		movimiento10.setFecha(dateMov10);
		movimiento10.setTipoDeMovimiento(Negativo);
		movimiento10.setCuenta(cuenta);
		session.save(movimiento10);
		
		//---------------------------------------------------------------


		//---------------------------------------------------------------
		session.getTransaction().commit();
		session.close();
		
		sessionFactory.close();
		
	}
}
