package frgp.utn.edu.ar.entidad;

import java.io.Serializable;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="username")
	private String user;
	@Column(name="password")
	private String pass;
	@Column(name="admin")
	private Boolean admin;
	@Column(name="estado")
	private Boolean estado;
	
	public Usuario() {
		this.estado = true;
	}
	
	public Usuario(Cliente cli) 
	{
		this.user = cli.getDni();
		this.pass = crearContrasenia(10);
		this.admin = false;
		this.estado = true;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Boolean getAdmin() {
		return admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", user=" + user + ", pass=" + pass + ", admin=" + admin + "]";
	}

	public String crearContrasenia(int len) {
	    String AB = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    Random rnd = new Random();

	    StringBuilder sb = new StringBuilder(len);
	    for (int i = 0; i < len; i++) {
	        sb.append(AB.charAt(rnd.nextInt(AB.length())));
	    }
	    return sb.toString();
	}
	
	
}
