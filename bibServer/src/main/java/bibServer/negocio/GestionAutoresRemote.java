package bibServer.negocio;

import java.util.List;

import javax.ejb.Remote;

import bibServer.modelo.Autor;

@Remote	
public interface GestionAutoresRemote {
	
	public void guardarAutor(String nombre, String apellido, String genero, String fechaNac, String nacionalidad);
	
	public List<Autor> getAutores();

}
