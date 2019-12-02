package bibServer.modelo;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Libro implements Serializable{
	
	private static final long serialVersionUID = -20336965027624681L;
	
	@Id
	private String bib_lib_id;
	private String bib_lib_nombre;
	private String bib_lib_autor;
	private String bib_lib_editorial;
	private int bib_lib_copias;
	public String getBib_lib_id() {
		return bib_lib_id;
	}
	public void setBib_lib_id(String bib_lib_id) {
		this.bib_lib_id = bib_lib_id;
	}
	public String getBib_lib_nombre() {
		return bib_lib_nombre;
	}
	public void setBib_lib_nombre(String bib_lib_nombre) {
		this.bib_lib_nombre = bib_lib_nombre;
	}
	public String getBib_lib_autor() {
		return bib_lib_autor;
	}
	public void setBib_lib_autor(String bib_lib_autor) {
		this.bib_lib_autor = bib_lib_autor;
	}
	public String getBib_lib_editorial() {
		return bib_lib_editorial;
	}
	public void setBib_lib_editorial(String bib_lib_editorial) {
		this.bib_lib_editorial = bib_lib_editorial;
	}
	public int getBib_lib_copias() {
		return bib_lib_copias;
	}
	public void setBib_lib_copias(int bib_lib_copias) {
		this.bib_lib_copias = bib_lib_copias;
	}
	
	@Override
	public String toString() {
		return "Libro [codigo=" + bib_lib_id + ", titulo=" + bib_lib_nombre + "]";
	}

}
