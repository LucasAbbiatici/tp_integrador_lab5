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
import frgp.utn.edu.ar.entidad.TipoCuenta;
import frgp.utn.edu.ar.entidad.Usuario;
import frgp.utn.edu.ar.negocioImpl.ClienteNegImpl;
import frgp.utn.edu.ar.negocioImpl.CuentaNegImpl;
import frgp.utn.edu.ar.negocioImpl.MovimientoNegImpl;
import frgp.utn.edu.ar.negocioImpl.TipoCuentaNegImpl;
import frgp.utn.edu.ar.negocioImpl.UsuarioNegImpl;

@Configuration
public class Config {
	
	
	@Bean
	@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Usuario beanUsuario() {
		return new Usuario();
	}
	
	@Bean
	@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Usuario beanUsuarioLogeado() {
		return new Usuario();
	}
	
	@Bean
	@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Cuenta beanCuenta() {
		return new Cuenta();
	}
	
	@Bean
	@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public TipoCuenta beanTipoCuenta() {
		return new TipoCuenta();
	}
	
	@Bean
	@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Cliente beanCliente() {
		return new Cliente();
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
	
	@Bean
	@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public CuentaNegImpl beanCuentaNeg() {
		return new CuentaNegImpl();
	}
	
	@Bean
	@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public CuentaDaoImpl beanCuentaDao() {
		return new CuentaDaoImpl();
	}
	
	@Bean
	@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public TipoCuentaDaoImpl beanTipoCuentaDao() {
		return new TipoCuentaDaoImpl();
	}
	
	@Bean
	@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public TipoCuentaNegImpl beanTipoCuentaNeg() {
		return new TipoCuentaNegImpl();
	}
	
	@Bean
	@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Cuenta beanCuenta2() {
		return new Cuenta();
	}
	
	@Bean
	@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public MovimientoNegImpl beanMovimientoNeg() {
		return new MovimientoNegImpl();
	}
	
	@Bean
	@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public MovimientoDaoImpl beanMovimientoDao() {
		return new MovimientoDaoImpl();
	}
	
}
	
