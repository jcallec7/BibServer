package bibServer.modelo;
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Prestamo implements Serializable{
	
	private static final long serialVersionUID = -20336965027624681L;
	
	@Id
	@Column(name="bib_prest_id")
	private String bib_prest_id;
	
	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinColumn(name = "bib_prest_id")
	private List<Cliente> lib_cliente;
	
	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinColumn(name = "bib_prest_id")
	private List<Libro> lib_libro;
	
	
	public String getBib_prest_id() {
		return bib_prest_id;
	}

	public void setBib_prest_id(String bib_prest_id) {
		this.bib_prest_id = bib_prest_id;
	}

	public List<Libro> getLib_libro() {
		return lib_libro;
	}

	public void setLib_libro(List<Libro> lib_libro) {
		this.lib_libro = lib_libro;
	}


	public List<Cliente> getLib_cliente() {
		return lib_cliente;
	}

	public void setLib_cliente(List<Cliente> lib_cliente) {
		this.lib_cliente = lib_cliente;
	}

	@Override
	public String toString() {
		return "Libro [codigo=" + bib_prest_id + ", cliente=" + lib_cliente+ " libro=" + lib_libro + "]";
	}

}
