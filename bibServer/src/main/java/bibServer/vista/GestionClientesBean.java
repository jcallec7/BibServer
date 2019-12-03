package bibServer.vista;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import bibServer.modelo.Cliente;
import bibServer.negocio.GestionClientesLocal;

@ManagedBean
public class GestionClientesBean {

	
	@Inject
	private GestionClientesLocal gc;
	
	/*Beans properties*/
	private int id;
	private String nombre;
	private String apellido;
	private String genero;
	private String correo;
	private String direccion;
	private String fechaNac;
	
	private List<Cliente> clientes;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setGc(GestionClientesLocal gc) {
		this.gc = gc;
	}

	public GestionClientesLocal getGc() {
		return gc;
	}

	public void setGa(GestionClientesLocal gc) {
		this.gc = gc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public String guardarCliente() {
		
		gc.guardarCliente(id, nombre, apellido, genero, correo, direccion, fechaNac);
		clientes = gc.getClientes();
		
		//return "listadoAutores";
		return null;
	}
	
}

