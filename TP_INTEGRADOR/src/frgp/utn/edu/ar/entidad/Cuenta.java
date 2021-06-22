package frgp.utn.edu.ar.entidad;

import java.sql.Date;

public class Cuenta {

	private int NroCuenta;
	private int CBU;
	private Cliente cliente;
	private Date fechaCreacion;
	private TipoCuenta tipoDeCuenta;
	private String nombre;
	private float saldo;
	
	public Cuenta() {}

	public int getNroCuenta() {
		return NroCuenta;
	}

	public void setNroCuenta(int nroCuenta) {
		NroCuenta = nroCuenta;
	}

	public int getCBU() {
		return CBU;
	}

	public void setCBU(int cBU) {
		CBU = cBU;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public TipoCuenta getTipoDeCuenta() {
		return tipoDeCuenta;
	}

	public void setTipoDeCuenta(TipoCuenta tipoDeCuenta) {
		this.tipoDeCuenta = tipoDeCuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [NroCuenta=" + NroCuenta + ", CBU=" + CBU + ", cliente=" + cliente + ", fechaCreacion="
				+ fechaCreacion + ", tipoDeCuenta=" + tipoDeCuenta + ", nombre=" + nombre + ", saldo=" + saldo + "]";
	}
	
}
