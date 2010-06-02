package br.com.jetsoftware.scommerce.service;

import java.util.List;

import javax.ejb.Remove;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.faces.FacesMessages;

import br.com.jetsoftware.scommerce.domain.Person;

@Stateful
@Name("manager")
public class ManagerAction implements Manager {
	
	public ManagerAction() {
	}
	
	@In
	private Person person;
	
	@PersistenceContext
	private EntityManager em;

	@In
	private FacesMessages facesMessages;
	
	@Out
	private List<Person> fans;
	
	public void sayHello () {
		em.persist (person);
		try {
			fans = em.createQuery("select p from Person p").getResultList();
		} catch (Exception e) {
			//facesMessages.add("Has problem saving #{person.name}");
		}
	}
	
	@Remove
	public void destroy () { }
}