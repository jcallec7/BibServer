package bibServer.datos;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import bibServer.modelo.Autor;

@Stateless
public class AutorDAO {
	
	@Inject
	private EntityManager em;
	
	public void insert(Autor autor) {
		em.persist(autor);
		
	}
	
	public void update(Autor autor) {
		em.merge(autor);
		
	}
	
	public void remove(int id) {
		
		Autor autor = this.read(id);
		
		em.remove(autor);
		
	}
	
	public Autor read(int id) {
		
		Autor a = em.find(Autor.class, id);
		
		return null;
		
	}
	
	public List<Autor> getAutores() {
		
		String jpql = "SELECT a FROM Autor a";
		Query q = em.createQuery(jpql, Autor.class);
		
		List<Autor> autores = q.getResultList();	
		
		return autores;
	}
	
	public List<Autor> getAutoresXNombre(String filtro){
		String jpql = "SELECT a FROM Autor a WHERE bib_aut_nombre LIKE ?1";
		Query q = em.createQuery(jpql, Autor.class);
		q.setParameter(1, "%" + filtro + "%");
		
		List<Autor> autores = q.getResultList();
		
		return autores;
	}

}

