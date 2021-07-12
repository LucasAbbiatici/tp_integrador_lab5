package frgp.utn.edu.ar.entidad;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Entity
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Table(name = "clientes")
public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "DNI", unique = true)
	private String dni;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "sexo")
	private String sexo;
	@Column(name = "nacionaliad")
	private String nacionalidad;
	@Column(name = "fechanacimineto")
	private Date fechaNacimiento;
	@Column(name = "direccion")
	private String direccion;

	@Embedded
	@AttributeOverride(name = "nombre", column = @Column(name = "Localidad"))
	private Localidad localidad;

	@Embedded
	@AttributeOverride(name = "nombre", column = @Column(name = "Provincia"))
	private Provincia provincia;

	@OneToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "usuario")
	private Usuario user;
	@Column(name = "estado")
	private Boolean estado;

	public Cliente() {
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo
				+ ", nacionalidad=" + nacionalidad + ", fechaNacimiento=" + fechaNacimiento + ", direccion=" + direccion
				+ ", provincia=" + provincia + ", user=" + user + "]";
	}

}
