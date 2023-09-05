package com.cetpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cetpa.models.Person;
import com.cetpa.repositories.PersonRepository;

@Service
public class PersonService 
{
	@Autowired
	private PersonRepository repo;

	public void saveRecord(Person person) 
	{
		repo.savePerson(person);
	}

	public List<Person> getList()
	{
		List<Person> list=repo.getPersonList();
		return list;
	}
	public Person getRecord(int pid)
	{
		Person pp=repo.getPerson(pid);
		return pp;
	}
	public void deleteRecord(Person p) 
	{
		repo.deletePerson(p);
	}

	public void updateRecord(Person person) 
	{
		repo.updatePerson(person);
	}
}
