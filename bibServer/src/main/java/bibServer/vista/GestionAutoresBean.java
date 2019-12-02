package bibServer.vista;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import bibServer.modelo.Autor;
import bibServer.negocio.GestionAutoresLocal;

@ManagedBean
public class GestionAutoresBean {

	
	@Inject
	private GestionAutoresLocal ga;
	
	/*Beans properties*/
	//private int id;
	private String nombre;
	private String apellido;
	private String genero;
	private String fechaNac;
	private String nacionalidad;
	
	
	private List<Autor> autores;



	public GestionAutoresLocal getGa() {
		return ga;
	}

	public void setGa(GestionAutoresLocal ga) {
		this.ga = ga;
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

	public List<Autor> getLibros() {
		return autores;
	}

	public void setLibros(List<Autor> libros) {
		this.autores = autores;
	}

	public String guardarAutor() {
		
		ga.guardarAutor(nombre, apellido, genero, fechaNac, nacionalidad);
		autores = ga.getAutores();
		
		return "listadoAutores";
	}
	
}

