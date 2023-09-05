package com.cetpa.repositories;

import java.util.*;

import org.hibernate.*;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.cetpa.models.Person;

@Repository
public class PersonRepository 
{
	private Session ses;
	private Transaction t;
	
	@Autowired
	public PersonRepository(SessionFactory factory)
	{
		ses=factory.openSession();
		t=ses.getTransaction();
	}
	public void savePerson(Person person) 
	{
		t.begin();
		ses.save(person);
		t.commit();
	}
	public List<Person> getPersonList()
	{
		Query<Person> q=ses.createQuery("from Person");
		List<Person> plist=q.list();
		return plist;
	}
	public Person getPerson(int pid) 
	{
		Person p=ses.get(Person.class,pid);
		return p;
	}
	public void deletePerson(Person p) 
	{
		t.begin();
		ses.delete(p);
		t.commit();
	}
	public void updatePerson(Person newp) 
	{
		Person oldp=ses.get(Person.class,newp.getPid());
		t.begin();
		oldp.setName(newp.getName());
		oldp.setAddress(newp.getAddress());
		oldp.setPhone(newp.getPhone());
		oldp.setEmail(newp.getEmail());
		t.commit();
	}
}
