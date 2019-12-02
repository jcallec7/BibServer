package bibServer.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Autor extends Persona {

	@Column(name="aut_nacionalidad")
	private String nacionalidad;

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	@Override
	public String toString() {
		return "Autor [nacionalidad=" + nacionalidad + ", getNacionalidad()=" + getNacionalidad() + ", getId()="
				+ getId() + ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido() + ", getGenero()="
				+ getGenero() + ", getFechaNac()=" + getFechaNac() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
