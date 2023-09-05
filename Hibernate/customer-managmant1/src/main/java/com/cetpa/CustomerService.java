package com.cetpa;

import java.util.List;
import java.util.Scanner;

public class CustomerService 
{
	CustomerRepository repo=new CustomerRepository();
	Scanner sc=new Scanner(System.in);
	public void insertRecord() 
	{
		System.out.println("============================");
		System.out.print("Enter customer id:");
		int cid=Integer.parseInt(sc.nextLine());
		System.out.print("Enter customer name:");
		String name=sc.nextLine();
		System.out.print("Enter customer phone:");
		String phone=sc.nextLine();
		Customer customer=new Customer(cid,name,phone);
		repo.saveCustomer(customer);
		System.out.println("Customer record has been saved");
		System.out.println("============================");
	}
	public void showRecord()
	{
		System.out.println("============================");
		System.out.print("Enter customer id:");
		int cid=Integer.parseInt(sc.nextLine());
		Customer customer=repo.getRecord(cid);
		if(customer==null)
		{
			System.out.println("Customer with id "+cid+" not found");
			System.out.println("============================");
			return;
		}
		System.out.println("Customer    id:"+customer.getCid());
		System.out.println("Customer  name:"+customer.getName());
		System.out.println("Customer phone:"+customer.getPhone());
		System.out.println("====================================");
	}
	public void showAllRecords() 
	{
		System.out.println("============================");
		List<Customer> clist=repo.getList();
		if(clist.isEmpty())
		{
			System.out.println("Customer list is empty");
			System.out.println("============================");
			return;
		}
		for(Customer c:clist)
		{
			System.out.println(c);
		}
		System.out.println("============================");
	}
	public void deleteRecord()
	{
		System.out.println("============================");
		System.out.print("Enter customer id:");
		int cid=Integer.parseInt(sc.nextLine());
		Customer customer=repo.getRecord(cid);
		if(customer==null)
		{
			System.out.println("Customer with id "+cid+" does not exist");
			System.out.println("============================");
			return;
		}
		repo.deleteRecord(customer);
		System.out.println("Customer record has been deleted");
		System.out.println("=================================");
	}
	public void updateRecord() 
	{
		System.out.println("============================");
		System.out.print("Enter customer id:");
		int cid=Integer.parseInt(sc.nextLine());
		Customer customer=repo.getRecord(cid);
		if(customer==null)
		{
			System.out.println("Customer with id "+cid+" does not exist");
			System.out.println("============================");
			return;
		}
		System.out.print("Enter customer edited name:");
		String name=sc.nextLine();
		System.out.print("Enter customer edited phone:");
		String phone=sc.nextLine();
		repo.updateRecord(name,phone,customer);
		System.out.println("Customer record has been updated");
		System.out.println("================================");
	}
}
