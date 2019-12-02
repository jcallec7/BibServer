package bibServer.negocio;

import java.util.List;

import javax.ejb.Local;

import bibServer.modelo.Autor;

@Local
public interface GestionAutoresLocal {
	
	public void guardarAutor(String nombre, String apellido, String genero, String fechaNac, String nacionalidad);
	
	public List<Autor> getAutores();
	
	public List<Autor> getAutoresPorNombre(String filtro);
	
}
	
