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
@Table(name="movimientos")
public class Movimiento implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int NroMovimiento;
	@Column(name="fecha")
	private Date fecha;
	@Column(name="detalle")
	private String detalle;
	@Column(name="importe")
	private float importe;
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="tipo")
	private TipoMovimiento tipoDeMovimiento;
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="cuenta_mov")
	private Cuenta cuenta;
	@Column(name="estado")
	private Boolean estado;
	
	public Movimiento() {
		this.estado = true;
	}
	
	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}



	public int getNroMovimiento() {
		return NroMovimiento;
	}

	public void setNroMovimiento(int nroMovimiento) {
		NroMovimiento = nroMovimiento;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	public TipoMovimiento getTipoDeMovimiento() {
		return tipoDeMovimiento;
	}

	public void setTipoDeMovimiento(TipoMovimiento tipoDeMovimiento) {
		this.tipoDeMovimiento = tipoDeMovimiento;
	}

	@Override
	public String toString() {
		return "Movimiento [NroMovimiento=" + NroMovimiento + ", fecha=" + fecha + ", detalle=" + detalle + ", importe="
				+ importe + ", tipoDeMovimiento=" + tipoDeMovimiento + "]";
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	
}
