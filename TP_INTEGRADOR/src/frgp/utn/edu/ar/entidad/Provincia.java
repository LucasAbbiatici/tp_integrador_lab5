package frgp.utn.edu.ar.entidad;

import javax.persistence.Embeddable;

@Embeddable
public class Provincia {
	
	private String nombre;
	
	public Provincia() {}

	public Provincia(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Provincias [nombre=" + nombre + "]";
	}
	
	
	
}
