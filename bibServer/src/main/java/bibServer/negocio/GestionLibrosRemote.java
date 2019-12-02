package bibServer.negocio;

import java.util.List;

import javax.ejb.Remote;

import bibServer.modelo.Libro;

@Remote	
public interface GestionLibrosRemote {
	
	public void guardarLibro(String codigo, String nombre, String autor, String editorial, int copias);
	
	public List<Libro> getLibros();

}
