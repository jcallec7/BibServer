package bibServer.negocio;

import java.util.List;

import bibServer.modelo.Cliente;
import bibServer.modelo.Libro;
import bibServer.modelo.Prestamo;

public interface GestionPrestamoRemote {
	
	public void guardarPrestamo(String codigo, Cliente cliente, Libro libros);
	
	public List<Prestamo> getPrestamo();

}
