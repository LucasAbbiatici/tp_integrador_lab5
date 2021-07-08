package frgp.utn.edu.ar.controller;


import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import frgp.utn.edu.ar.entidad.Cliente;
import frgp.utn.edu.ar.entidad.Cuenta;
import frgp.utn.edu.ar.entidad.Movimiento;
import frgp.utn.edu.ar.entidad.TipoCuenta;
import frgp.utn.edu.ar.entidad.Usuario;
import frgp.utn.edu.ar.negocioImpl.ClienteNegImpl;
import frgp.utn.edu.ar.negocioImpl.CuentaNegImpl;
import frgp.utn.edu.ar.negocioImpl.MovimientoNegImpl;
import frgp.utn.edu.ar.negocioImpl.TipoCuentaNegImpl;
import frgp.utn.edu.ar.negocioImpl.UsuarioNegImpl;


@Controller
public class PaginaController {
	
	@Autowired
	private ClienteNegImpl clienteNeg;
	@Autowired
	private UsuarioNegImpl usuarioNeg;
	@Autowired
	@Qualifier("beanUsuario")
	private Usuario usuario2;
	@Autowired
	@Qualifier("beanUsuarioLogeado")
	private Usuario usuario;
	@Autowired
	private CuentaNegImpl cuentaNegImpl;
	@Autowired
	private TipoCuentaNegImpl tipoCuentaNeg;
	@Autowired
	@Qualifier("beanCuenta")
	private Cuenta cuenta; 
	@Autowired
	private TipoCuenta tc;
	@Autowired
	@Qualifier("beanCliente")
	private Cliente cliente;
	@Autowired
	@Qualifier("beanCuenta2")
	private Cuenta cue;
	@Autowired
	private MovimientoNegImpl movimientoNeg;
	@Autowired 
	@Qualifier("beanCliente2")
	private Cliente cli;
	
	@RequestMapping("/index.html")
	public ModelAndView eventoRedireccionarIndex() {
		return new ModelAndView("index");
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView eventoRedireccionarUsuario(String txtUsuario, String txtPassword,HttpServletRequest request) {
		ModelAndView MV = new ModelAndView();
		
		usuario.setUser(txtUsuario);
		usuario.setPass(txtPassword);
		
		usuario = usuarioNeg.validarUsuario(usuario);
		
		
		
		if(usuario.getId() == 0)
		{
			MV.addObject("estadoUsuario", "El usuario y/o contraseña son incorrectos");
			MV.setViewName("index");
		} 
		else 
		{
			if(!usuario.getEstado())
			{
				MV.addObject("estadoUsuario", "El usuario ha sido borrado");
				MV.setViewName("index");
			}
			else
			{
				request.getSession().setAttribute("usuario", usuario);
				
				MV.addObject("usuario", usuario);
				//Si no es admin entra por aca.
				if(usuario.getAdmin() == false) {
					List<Cuenta> cuentas = cuentaNegImpl.obtenerCuentasCliente(clienteNeg.obtenerClientePorUsuario(usuario.getId())/*trae el id del cliente*/);
					MV.addObject("listaCuentasCliente",cuentas);
					MV.setViewName("mainCliente");
					
				} 
				//Si es admin, entra por aca.
				else {
					List<Cliente> clientes = clienteNeg.readAll();
					MV.addObject("listaClientes",clientes);
					MV.setViewName("mainBanco");
				}
			}
		}
		return MV;
	}
	

	@RequestMapping("/transferencias")
	public ModelAndView eventoRedireccionarTransferencias() {
		ModelAndView MV = new ModelAndView();
		
		
		List<Cuenta> cuentas = cuentaNegImpl.obtenerCuentasCliente(clienteNeg.obtenerClientePorUsuario(usuario.getId()));
		
		MV.addObject("listaCuentasCliente",cuentas);
		
	
		MV.setViewName("transferenciaCliente");
		return MV;
	}
	
	@RequestMapping("/listaClientes")
	public ModelAndView eventoRedireccionarListarClientes() {
		ModelAndView MV = new ModelAndView();
		
		List<Cliente> clientes = clienteNeg.readAll();
		MV.addObject("listaClientes",clientes);
		MV.setViewName("mainBanco");
		
		return MV;
	}
	
	@RequestMapping("/listaCuentas")
	public ModelAndView eventoListarCuentas() {
		ModelAndView MV = new ModelAndView();
		
		List<Cuenta> listaCuentas = cuentaNegImpl.readAll();
		
		MV.addObject("listaCuentas",listaCuentas);
		
		MV.setViewName("bancoCuentas");
		
		return MV;
	}
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView eliminarSession(HttpServletRequest request) {
		request.getSession().removeAttribute("usuario");		
		return new ModelAndView("index");
	}
	
	@RequestMapping(value = { "/delete-user-{ssoId}" }, method = RequestMethod.GET)
    public ModelAndView deleteUser(@PathVariable int ssoId) {

		ModelAndView MV = new ModelAndView();
		
		
		if(clienteNeg.delete(ssoId) && usuarioNeg.delete(clienteNeg.obtenerCliente(ssoId).getUser().getId()) && cuentaNegImpl.borrarCuentasCliente(ssoId)) {
			MV.addObject("mensaje","El cliente se pudo eliminar correctamente");
			MV.addObject("color", "color: green; margin-top: 20px;");
			MV.addObject("listaClientes",this.clienteNeg.readAll());
			MV.setViewName("mainBanco");
		}else {
			MV.addObject("mensaje","No se pudo eliminar correctamente el cliente");
			MV.addObject("color", "color: red; margin-top: 20px;");
			MV.addObject("listaClientes",this.clienteNeg.readAll());
			MV.setViewName("mainBanco"); 
		}
		

		return MV;
    }
	
	@RequestMapping(value = { "/delete-cuenta-{ssoId}" }, method = RequestMethod.GET)
    public ModelAndView deleteCuenta(@PathVariable int ssoId) {

		ModelAndView MV = new ModelAndView();
		if(cuentaNegImpl.delete(ssoId)) {
			MV.addObject("mensaje","La cuenta se pudo eliminar correctamente");
			MV.addObject("color", "color: green; margin-top: 20px;");
			MV.addObject("listaCuentas",this.cuentaNegImpl.readAll());
			MV.setViewName("bancoCuentas");
		}else {
			MV.addObject("mensaje","No se pudo eliminar correctamente la cuenta");
			MV.addObject("color", "color: red; margin-top: 20px;");
			MV.addObject("listaCuentas",this.cuentaNegImpl.readAll());
			MV.setViewName("bancoCuentas"); 
		}
		return MV;
    }
	
	@RequestMapping("/redireccionarAgregarCuenta")
	public ModelAndView redireccionarAgregarCuenta() {
		ModelAndView MV = new ModelAndView();
		
		List<TipoCuenta> tipoCue = tipoCuentaNeg.readAll();
		List<Cliente> listaClientes = clienteNeg.readAll();
		
		MV.addObject("listaTipoCue",tipoCue);
		MV.addObject("listaClientes",listaClientes);
		MV.setViewName("bancoAgregarCuenta");
		
		return MV;
	}
	
	@RequestMapping (value ="/agregarCuenta",method = RequestMethod.POST)
	public ModelAndView  agregarCuenta(String txtNombre,int selectTipoCuenta, int selectClientes) {
		ModelAndView MV = new ModelAndView();
		
		long millis = System.currentTimeMillis();  
        Date date = new Date(millis);  
		
		tc = tipoCuentaNeg.obtenerTipoCuenta(selectTipoCuenta);
		
		cliente = clienteNeg.obtenerCliente(selectClientes);
		
		cuenta.setNombre(txtNombre);
		cuenta.setCliente(cliente);
		cuenta.setTipoDeCuenta(tc);
		cuenta.setFechaCreacion(date);
		
		List<TipoCuenta> tipoCue = tipoCuentaNeg.readAll();
		List<Cliente> listaClientes = clienteNeg.readAll();
		
		if(!cuentaNegImpl.verificarCantCuentas(selectClientes)) {
			
			MV.addObject("mensaje", "El cliente seleccionado ya posee 4 cuentas");
			MV.addObject("color", "color: red; margin-top: 20px; text-align: center;");
			MV.addObject("listaTipoCue",tipoCue);
			MV.addObject("listaClientes",listaClientes);
			MV.setViewName("bancoAgregarCuenta");
			
		} else {
			
			if(cuentaNegImpl.insert(cuenta)) {
				MV.addObject("mensaje", "La cuenta fue ingresada correctamente");
				MV.addObject("color", "color: green; margin-top: 20px; text-align: center;");
				MV.addObject("listaTipoCue",tipoCue);
				MV.addObject("listaClientes",listaClientes);
				MV.setViewName("bancoAgregarCuenta");
				
			} else {
				
				MV.addObject("mensaje", "No se pudo agregar la cuenta");
				MV.addObject("color", "color: red; margin-top: 20px; text-align: center;");
				MV.addObject("listaTipoCue",tipoCue);
				MV.addObject("listaClientes",listaClientes);
				MV.setViewName("bancoAgregarCuenta");
		
			}
		}
		
		return MV;
	}
	
	@RequestMapping("/redireccionarAgregarCliente")
	public ModelAndView redireccionAgregarCliente() {
		return new ModelAndView("bancoAgregarCliente");
	}
	
	@RequestMapping(value = "/agregarCliente", method = RequestMethod.POST)
	public ModelAndView agregarCliente(String txtDni, String txtNombre, String txtApellido, String selectSexo, Date date_fechaNacimiento, String txtNacionalidad, String txtDireccion, String provincias, String localidades) {
		ModelAndView MV = new ModelAndView();
		
		
		if(!clienteNeg.verificarExistenciaDni(txtDni))
		{
			cliente.setDni(txtDni);
			cliente.setNombre(txtNombre);
			cliente.setApellido(txtApellido);
			cliente.setSexo(selectSexo);
			cliente.setFechaNacimiento(date_fechaNacimiento);
			cliente.setNacionalidad(txtNacionalidad);
			cliente.setDireccion(txtDireccion);
			cliente.setProvincia(provincias);
			cliente.setLocalidad(localidades);
			
			usuario2.setUser(cliente.getDni());
			usuario2.setPass(usuario.crearContrasenia(10));
			usuario2.setAdmin(false);
			
			cliente.setUser(usuario2);
			
			if(usuarioNeg.insert(usuario2)) {
				
				if(clienteNeg.insert(cliente)) {
					
					MV.addObject("mensaje", "El cliente fue ingresado correctamente");
					MV.addObject("color", "color: green; margin-top: 20px; text-align: center;");
					
				} else {
					
					MV.addObject("mensaje", "No se pudo agregar el cliente");
					MV.addObject("color", "color: red; margin-top: 20px; text-align: center;");
					
				}
				
			} else {
				
				MV.addObject("mensaje", "No se pudo agregar el cliente");
				MV.addObject("color", "color: red; margin-top: 20px; text-align: center;");
				
			}
			
		}
		else
		{
			MV.addObject("mensaje", "Dni ya utilizado");
			MV.addObject("color", "color: red; margin-top: 20px; text-align: center;");
		}

		MV.setViewName("bancoAgregarCliente");
		return MV;	
	}
	
	@RequestMapping(value="/redirec-updCuenta-{ssoId}",method=RequestMethod.GET)
	public ModelAndView redireccionModificarCuenta(@PathVariable int ssoId) {
		ModelAndView MV = new ModelAndView();
		
		cuenta = cuentaNegImpl.obtenerCuenta(ssoId);
		
		List<TipoCuenta> tipoCue = tipoCuentaNeg.readAll();
		List<Cliente> listaClientes = clienteNeg.readAll();
		
		MV.addObject("cuenta",cuenta);
		MV.addObject("listaTipoCue",tipoCue);
		MV.addObject("listaClientes",listaClientes);
		MV.setViewName("bancoModificarCuenta");
		
		return MV;
		
	}
	
	@RequestMapping("/modificarCuenta")
	public ModelAndView modificarCuenta(int txtId,String txtNombre,int selectTipoCuenta,int selectClientes) {
		ModelAndView MV = new ModelAndView();
		
		List<TipoCuenta> tipoCue = tipoCuentaNeg.readAll();
		List<Cliente> listaClientes = clienteNeg.readAll();
		
		cue = cuentaNegImpl.obtenerCuenta(txtId);//cuenta vieja
		
		tc = tipoCuentaNeg.obtenerTipoCuenta(selectTipoCuenta);
		cliente = clienteNeg.obtenerCliente(selectClientes);
		cuenta = cuentaNegImpl.obtenerCuenta(txtId);
		cuenta.setNombre(txtNombre);
		cuenta.setTipoDeCuenta(tc);
		cuenta.setCliente(cliente);
		
		if(!cuentaNegImpl.verificarCantCuentas(selectClientes)) {
			
			MV.addObject("mensaje", "El cliente seleccionado ya posee 4 cuentas");
			MV.addObject("color", "color: red; margin-top: 20px; text-align: center;");
			MV.addObject("cuenta",cue);
			MV.addObject("listaTipoCue",tipoCue);
			MV.addObject("listaClientes",listaClientes);
			MV.setViewName("bancoModificarCuenta");
			
		}
		else {
			
			if(cuentaNegImpl.insert(cuenta)) {
				MV.addObject("mensaje", "La cuenta fue actualizada correctamente");
				MV.addObject("color", "color: green; margin-top: 20px; text-align: center;");
				MV.addObject("cuenta",cuenta);
				MV.addObject("listaTipoCue",tipoCue);
				MV.addObject("listaClientes",listaClientes);
				MV.setViewName("bancoModificarCuenta");
			}
			else {
				MV.addObject("mensaje", "No se pudo actualizar la cuenta");
				MV.addObject("color", "color: red; margin-top: 20px; text-align: center;");
				MV.addObject("cuenta",cue);
				MV.addObject("listaTipoCue",tipoCue);
				MV.addObject("listaClientes",listaClientes);
				MV.setViewName("bancoModificarCuenta");
			}
		}
		
			MV.setViewName("bancoModificarCuenta");
		
		return MV;
	}
	
	
	@RequestMapping(value="/redirec-updateCliente-{ssoId}",method=RequestMethod.GET)
	public ModelAndView redireccionupdateCliente(@PathVariable int ssoId) {
		ModelAndView MV = new ModelAndView();
		
		cliente = clienteNeg.obtenerCliente(ssoId);
		
		MV.addObject("cliente",cliente);
		MV.setViewName("bancoModificarCliente");
		
		return MV;
		
	}
	
	@RequestMapping("/modificarCliente")
	public ModelAndView modificarCliente(int txtId, String txtDni, String txtNombre, String txtApellido, String selectSexo, Date date_fechaNacimiento, String txtNacionalidad, String txtDireccion, String provincias, String localidades) {
		ModelAndView MV = new ModelAndView();
		
		cli = clienteNeg.obtenerCliente(txtId);
		
		if(!clienteNeg.verificarExistenciaDni(txtDni)) {
			
			cliente.setDni(txtDni);
			cliente.setNombre(txtNombre);
			cliente.setApellido(txtApellido);
			cliente.setSexo(selectSexo);
			cliente.setFechaNacimiento(date_fechaNacimiento);
			cliente.setNacionalidad(txtNacionalidad);
			cliente.setDireccion(txtDireccion);
			cliente.setProvincia(provincias);
			cliente.setLocalidad(localidades);
			
			usuario2 = usuarioNeg.obtenerUsuarioXid(txtId);
			usuario2.setUser(txtDni);
				
			if(usuarioNeg.insert(usuario2)) {
				
				cliente.setUser(usuario2);
				
				if(clienteNeg.insert(cliente)) {
					
					MV.addObject("mensaje", "El cliente fue modificado correctamente");
					MV.addObject("color", "color: green; margin-top: 20px; text-align: center;");
					MV.addObject("cliente",cliente);
					
					} else {
						
						MV.addObject("mensaje", "No se pudo modificar el cliente");
						MV.addObject("color", "color: red; margin-top: 20px; text-align: center;");
						MV.addObject("cliente",cli);
					}
				
				} else {
					
					MV.addObject("mensaje", "No se pudo modificar el usuario del cliente");
					MV.addObject("color", "color: red; margin-top: 20px; text-align: center;");
					MV.addObject("cliente",cli);
					
					}
		}
		
		else  {
			if(txtDni.equals(cli.getDni())) {
				cliente.setDni(txtDni);
				cliente.setNombre(txtNombre);
				cliente.setApellido(txtApellido);
				cliente.setSexo(selectSexo);
				cliente.setFechaNacimiento(date_fechaNacimiento);
				cliente.setNacionalidad(txtNacionalidad);
				cliente.setDireccion(txtDireccion);
				cliente.setProvincia(provincias);
				cliente.setLocalidad(localidades);
				
				usuario2 = usuarioNeg.obtenerUsuarioXid(txtId);
				usuario2.setUser(txtDni);
					
				if(usuarioNeg.insert(usuario2)) {
					
					cliente.setUser(usuario2);
					
					if(clienteNeg.insert(cliente)) {
						
						MV.addObject("mensaje", "El cliente fue modificado correctamente");
						MV.addObject("color", "color: green; margin-top: 20px; text-align: center;");
						MV.addObject("cliente",cliente);
						
						} else {
							
							MV.addObject("mensaje", "No se pudo modificar el cliente");
							MV.addObject("color", "color: red; margin-top: 20px; text-align: center;");
							MV.addObject("cliente",cli);
						}
					
					} else {
						
						MV.addObject("mensaje", "No se pudo modificar el usuario del cliente");
						MV.addObject("color", "color: red; margin-top: 20px; text-align: center;");
						MV.addObject("cliente",cli);
						
						}
			}
			else {
				MV.addObject("mensaje", "Dni ya utilizado");
				MV.addObject("color", "color: red; margin-top: 20px; text-align: center;");
				MV.addObject("cliente",cli);
			}
		}
		
		MV.setViewName("bancoModificarCliente");
		return MV;	
	}
	
	@RequestMapping(value="/movimientos-cuenta-{ssoId}",method=RequestMethod.GET)
	public ModelAndView redireccionMovimientosCuenta(@PathVariable int ssoId) {
		ModelAndView MV = new ModelAndView();
		
		List<Movimiento> listaMovimientos = movimientoNeg.movimientosXcuenta(ssoId);
		
		
		MV.addObject("listaMovimientos", listaMovimientos);
		MV.setViewName("movimientosCliente");
		
		return MV;
		
	}
	
	@RequestMapping("/redireccionarListaCuentas")
	public ModelAndView redireccionarCuentasCliente() {
		ModelAndView MV = new ModelAndView();
		
		List<Cuenta> cuentas = cuentaNegImpl.obtenerCuentasCliente(clienteNeg.obtenerClientePorUsuario(usuario.getId()));
		MV.addObject("listaCuentasCliente",cuentas);
		MV.setViewName("mainCliente");
		
		return MV;
	}
	
}




