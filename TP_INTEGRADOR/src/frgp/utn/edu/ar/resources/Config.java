package frgp.utn.edu.ar.resources;

import java.sql.Date;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import frgp.utn.edu.ar.daoImpl.ClienteDaoImpl;
import frgp.utn.edu.ar.daoImpl.Conexion;
import frgp.utn.edu.ar.daoImpl.UsuarioDaoImpl;
import frgp.utn.edu.ar.entidad.Cliente;
import frgp.utn.edu.ar.entidad.Usuario;
import frgp.utn.edu.ar.negocioImpl.ClienteNegImpl;
import frgp.utn.edu.ar.negocioImpl.UsuarioNegImpl;

@Configuration
public class Config {
	
	@Bean
	@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Usuario beanUsuario() {
		
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
		System.out.println("que puto que sos pasi");
		return usuario3;
	}
	
	@Bean
	@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public ClienteNegImpl beanClienteNeg() {
		return new ClienteNegImpl();
	}
	
	@Bean
	@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public UsuarioNegImpl beanUsuarioNeg() {
		return new UsuarioNegImpl();
	}
	
	@Bean
    @Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
	public Conexion beanConexion() {
		return new Conexion();
	}
	
	@Bean
	@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public ClienteDaoImpl beanClienteDao() {
		return new ClienteDaoImpl();
	}
	
	@Bean
	@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public UsuarioDaoImpl beanUsuarioDao() {
		return new UsuarioDaoImpl();
	}
	
}
	
