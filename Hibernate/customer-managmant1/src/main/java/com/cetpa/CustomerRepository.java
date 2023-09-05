package com.cetpa;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class CustomerRepository 
{
	Session ses;
	Transaction t;
	public CustomerRepository()
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		ses=factory.openSession();
		t=ses.getTransaction();
	}
	public void saveCustomer(Customer customer) 
	{
		t.begin();
		ses.save(customer);
		t.commit();
	}
	public Customer getRecord(int cid) 
	{
		Customer c=ses.get(Customer.class,cid);
		return c;
	}
	public List<Customer> getList() 
	{
		Query<Customer> q=ses.createQuery("from Customer");
		List<Customer> clist=q.list();
		return clist;
	}
	public void deleteRecord(Customer customer) 
	{
		t.begin();
		ses.delete(customer);
		t.commit();
	}
	public void updateRecord(String name, String phone,Customer cust) 
	{
		t.begin();
		cust.setName(name);
		cust.setPhone(phone);
		t.commit();
	}
}
