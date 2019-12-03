package bibServer.negocio;

import java.util.List;

import javax.ejb.Remote;

import bibServer.modelo.Cliente;

@Remote	
public interface GestionClientesRemote {
	
	public void guardarCliente(int id, String nombre, String apellido, String genero, String correo, String direccion, String fechaNac);
	
	public List<Cliente> getClientes();

}
