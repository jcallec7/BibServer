package bibServer.negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import bibServer.datos.LibroDAO;
import bibServer.modelo.Autor;
import bibServer.modelo.Libro;
import java.util.ArrayList;

@Stateless
public class GestionLibros implements GestionLibrosRemote, GestionLibrosLocal {
	
	@Inject
	private LibroDAO dao;

	private List<Libro> libros = new ArrayList<Libro>();
	//private List<Autor> autores = new ArrayList<Autor>();
	
	public void guardarLibro(String codigo, String nombre, List<Autor> autores, String editorial, int copias){
		Libro l = new Libro();  
		l.setBib_lib_id(codigo);  
		l.setBib_lib_nombre(nombre);
		l.setLib_autores(autores);
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
