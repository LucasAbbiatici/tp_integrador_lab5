package Entidades;

import javax.persistence.Embeddable;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Embeddable
public class Provincia {

	private String nombre;

	public Provincia() {
	}

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
