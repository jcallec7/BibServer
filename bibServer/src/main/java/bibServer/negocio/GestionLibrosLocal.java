package bibServer.negocio;

import java.util.List;

import javax.ejb.Local;

import bibServer.modelo.Autor;
import bibServer.modelo.Libro;

@Local
public interface GestionLibrosLocal {
	
	public void guardarLibro(String codigo, String nombre, List<Autor> autores, String editorial, int copias);
	
	public List<Libro> getLibros();
	
	public List<Libro> getLibrosPorNombre(String filtro);
	
}
	
