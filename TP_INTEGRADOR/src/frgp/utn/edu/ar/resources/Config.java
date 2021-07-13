package frgp.utn.edu.ar.resources;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import frgp.utn.edu.ar.daoImpl.ClienteDaoImpl;
import frgp.utn.edu.ar.daoImpl.Conexion;
import frgp.utn.edu.ar.daoImpl.CuentaDaoImpl;
import frgp.utn.edu.ar.daoImpl.MovimientoDaoImpl;
import frgp.utn.edu.ar.daoImpl.TipoCuentaDaoImpl;
import frgp.utn.edu.ar.daoImpl.UsuarioDaoImpl;
import frgp.utn.edu.ar.entidad.Cliente;
import frgp.utn.edu.ar.entidad.Cuenta;
import frgp.utn.edu.ar.entidad.Localidad;
import frgp.utn.edu.ar.entidad.Movimiento;
import frgp.utn.edu.ar.entidad.Provincia;
import frgp.utn.edu.ar.entidad.TipoCuenta;
import frgp.utn.edu.ar.entidad.TipoMovimiento;
import frgp.utn.edu.ar.entidad.Usuario;
import frgp.utn.edu.ar.negocioImpl.ClienteNegImpl;
import frgp.utn.edu.ar.negocioImpl.CuentaNegImpl;
import frgp.utn.edu.ar.negocioImpl.MovimientoNegImpl;
import frgp.utn.edu.ar.negocioImpl.TipoCuentaNegImpl;
import frgp.utn.edu.ar.negocioImpl.UsuarioNegImpl;

@Configuration
public class Config {

	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public Provincia beanProvincia() {
		return new Provincia();
	}

	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public Localidad beanLocalidad() {
		return new Localidad();
	}
	
	@Bean
	public TipoMovimiento beanMovPositivo() {
		TipoMovimiento tipoMov = new TipoMovimiento();
		tipoMov.setId(2);
		tipoMov.setDescripcion("Positivo");
		return tipoMov;
	}
	
	@Bean
	public TipoMovimiento beanMovNegativo() {
		TipoMovimiento tipoMov = new TipoMovimiento();
		tipoMov.setId(1);
		tipoMov.setDescripcion("Negativo");
		return tipoMov;
	}
}
