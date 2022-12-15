package DAO;

import java.util.List;
import javax.persistence.*;
import org.springframework.stereotype.Component;

//Clase donde implementamos la interfaz y sus metodos 

@Component
public class notasServiceImpl implements notasService {

	@PersistenceContext
	private EntityManager em;

	public void insertaNotas(notas n) {
		em.persist(n);
		
	}

	public List<notas> muestraNotas() {
		
		return em.createQuery("SELECT notas FROM notas notas").getResultList();
	}
	
	

}
