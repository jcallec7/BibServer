package bibServer.vista;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import bibServer.modelo.Libro;
import bibServer.negocio.GestionLibrosLocal;

@ManagedBean
public class GestionLibrosBean {

	
	@Inject
	private GestionLibrosLocal gl;
	
	/*Beans properties*/
	private String codigo;
	private String nombre;
	private String autor;
	private String editorial;
	private int copias;
	
	private List<Libro> libros;
	
	
	
	public GestionLibrosLocal getGl() {
		return gl;
	}



	public void setGl(GestionLibrosLocal gl) {
		this.gl = gl;
	}



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public String getEditorial() {
		return editorial;
	}



	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}



	public int getCopias() {
		return copias;
	}



	public void setCopias(int copias) {
		this.copias = copias;
	}



	public List<Libro> getLibros() {
		return libros;
	}



	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}



	public String guardarLibro() {
		
		gl.guardarLibro(codigo, nombre, autor, editorial, copias);
		libros = gl.getLibros();
		
		return "listadoLibros";
	}
	
}

