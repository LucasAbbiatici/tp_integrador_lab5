package frgp.utn.edu.ar.resources;

import java.sql.Date;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import frgp.utn.edu.ar.entidad.Cliente;
import frgp.utn.edu.ar.entidad.Usuario;

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
		
		return usuario3;
	}
	
}
