package frgp.utn.edu.ar.entidad;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class Movimiento implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int NroMovimiento;
	@Column(name="fecha")
	private Date fecha;
	@Column(name="detalle")
	private String detalle;
	@Column(name="importe")
	private float importe;
	@OneToMany(cascade={CascadeType.ALL})
	@JoinColumn(name="tipo")
	private TipoMovimiento tipoDeMovimiento;
	
	public Movimiento() {}

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
	
}
