package frgp.utn.edu.ar.entidad;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cuentas")
public class Cuenta implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int NroCuenta;
	@Column(name="cbu")
	private int CBU;
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="cliente")
	private Cliente cliente;
	@Column(name="fechacreacion")
	private Date fechaCreacion;
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="tipo")
	private TipoCuenta tipoDeCuenta;
	@Column(name="nombre")
	private String nombre;
	@Column(name="saldo")
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
