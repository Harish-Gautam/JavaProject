package com.cetpa;

public class Customer 
{
	private int cid;
	private String name;
	private String phone;

	public Customer(){}
	public Customer(int cid, String name, String phone) 
	{
		this.cid = cid;
		this.name = name;
		this.phone = phone;
	}
	public int getCid() 
	{
		return cid;
	}
	public void setCid(int cid) 
	{
		this.cid = cid;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getPhone() 
	{
		return phone;
	}
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}
	public String toString() 
	{
		return "Customer [cid=" + cid + ", name=" + name + ", phone=" + phone + "]";
	}

}
