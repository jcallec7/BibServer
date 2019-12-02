package bibServer.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public abstract class Persona {

	@Id
	@Column(name="bib_per_id")
	private int id;
	
	@Column(name="bib_per_nombre")
	private String nombre;
	
	@Column(name="bib_per_apellido")
	private String apellido;
	
	@Column(name="bib_per_genero")
	private String genero;
	
	@Column(name="bib_per_fechaNac")
	private String fechaNac;
	
	//@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	//@JoinColumn(name = "per_cedula")
	//private List<String> telefonos;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero + ", Año Nacimiento=" + fechaNac + "]";
	}
	
}
