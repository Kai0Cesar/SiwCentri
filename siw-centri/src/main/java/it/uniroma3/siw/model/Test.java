package it.uniroma3.siw.model;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
 
		Allievo user = new Allievo();
		user.setCognome("Merialdo");
		user.setEmail("test@gmail.com");
		user.setNome("Paolo");
		user.setDataDiNascita(new Date());
		user.setLuogoDiNascita("Italia");
		user.setTelefono("000000000");
		
		session.save(user);
		session.getTransaction().commit();
		session.close();
	}
}
