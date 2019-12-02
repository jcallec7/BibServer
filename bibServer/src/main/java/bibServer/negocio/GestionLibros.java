package bibServer.negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import bibServer.datos.LibroDAO;
import bibServer.modelo.Libro;
import java.util.ArrayList;

@Stateless
public class GestionLibros implements GestionLibrosRemote, GestionLibrosLocal {
	
	@Inject
	private LibroDAO dao;

	private List<Libro> libros = new ArrayList<Libro>();
	
	public void guardarLibro(String codigo, String nombre, String autor, String editorial, int copias){
		Libro l = new Libro();  
		l.setBib_lib_id(codigo);  
		l.setBib_lib_nombre(nombre);
		l.setBib_lib_autor(autor);
		l.setBib_lib_editorial(editorial);
		l.setBib_lib_copias(copias);
		System.out.println(l);
		dao.insert(l);
	}
	
	
	
	public List<Libro> getLibros(){
		System.out.println(libros);
		return dao.getLibros();
	}
	
	public List<Libro> getLibrosPorNombre(String filtro){
		
		return dao.getLibrosXNombre(filtro);
	}
}
