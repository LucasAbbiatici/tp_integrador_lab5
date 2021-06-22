package frgp.utn.edu.ar.entidad;

import java.sql.Date;

public class Movimiento {

	private int NroMovimiento;
	private Date fecha;
	private String detalle;
	private float importe;
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
