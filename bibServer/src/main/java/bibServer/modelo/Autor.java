package bibServer.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Autor {

	@Id
	@Column(name="bib_aut_id")
	private int id;
	
	@Column(name="bib_aut_nombre")
	private String nombre;
	
	@Column(name="bib_aut_apellido")
	private String apellido;
	
	@Column(name="bib_aut_genero")
	private String genero;
	
	@Column(name="bib_aut_fechaNac")
	private String fechaNac;
	
	@Column(name="bib_aut_nacionalidad")
	private String nacionalidad;

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

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	@Override
	public String toString() {
		return "Autor [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero
				+ ", fechaNac=" + fechaNac + ", nacionalidad=" + nacionalidad + "]";
	}
	
	
}
