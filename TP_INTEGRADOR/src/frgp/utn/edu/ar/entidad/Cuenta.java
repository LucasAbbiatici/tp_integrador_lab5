package frgp.utn.edu.ar.entidad;

import java.io.Serializable;
import java.sql.Date;
import java.util.Random;

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

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Entity
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Table(name = "cuentas")
public class Cuenta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "cbu", unique = true)
	private String CBU;
	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "cliente")
	private Cliente cliente;
	@Column(name = "fechacreacion")
	private Date fechaCreacion;
	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "tipo")
	private TipoCuenta tipoDeCuenta;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "saldo")
	private float saldo;
	@Column(name = "estado")
	private Boolean estado;

	public Cuenta() {

		// verificar que cbu no exista
		this.CBU = NumericString();
		this.estado = true;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCBU() {
		return CBU;
	}

	public void setCBU(String cBU) {
		this.CBU = cBU;
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
		return "Cuenta [NroCuenta=" + id + ", CBU=" + CBU + ", cliente=" + cliente + ", fechaCreacion=" + fechaCreacion
				+ ", tipoDeCuenta=" + tipoDeCuenta + ", nombre=" + nombre + ", saldo=" + saldo + "]";
	}

	public static String NumericString() {
		String AB = "0123456789";
		Random rnd = new Random();
		String banco = "34782533";
		final int len = 14;
		StringBuilder sb = new StringBuilder(len);
		sb.append(banco);
		for (int i = 0; i < len; i++) {
			sb.append(AB.charAt(rnd.nextInt(AB.length())));
		}
		return sb.toString();
	}

}
