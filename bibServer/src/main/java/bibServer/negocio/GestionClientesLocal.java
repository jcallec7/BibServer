package bibServer.negocio;

import java.util.List;

import javax.ejb.Local;

import bibServer.modelo.Cliente;

@Local
public interface GestionClientesLocal {
	
	public void guardarCliente(int id, String nombre, String apellido, String genero, String correo, String direccion, String fechaNac);
	
	public List<Cliente> getClientes();
	
	public List<Cliente> getClientesPorNombre(String filtro);
	
}
	
