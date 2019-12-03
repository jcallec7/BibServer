package bibServer.negocio;

import java.util.List;

import javax.ejb.Remote;

import bibServer.modelo.Autor;
import bibServer.modelo.Libro;

@Remote	
public interface GestionLibrosRemote {
	
	public void guardarLibro(String codigo, String nombre, List<Autor> autores, String editorial, int copias);
	
	public List<Libro> getLibros();

}
