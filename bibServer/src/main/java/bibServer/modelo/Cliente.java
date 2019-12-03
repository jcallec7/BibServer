package bibServer.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {

	@Id
	@Column(name="bib_cli_id")
	private int id;
	
	@Column(name="bib_cli_nombre")
	private String nombre;
	
	@Column(name="bib_cli_apellido")
	private String apellido;
	
	@Column(name="bib_cli_genero")
	private String genero;
	
	@Column(name="bib_cli_correo")
	private String correo;
	
	@Column(name="bib_cli_direccion")
	private String direccion;
	
	@Column(name="bib_cli_fechaNac")
	private String fechaNac;	

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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero
				+ ", correo=" + correo + ", direccion=" + direccion + ", fechaNac=" + fechaNac + "]";
	}
	
	
}
