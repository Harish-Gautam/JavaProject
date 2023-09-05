package com.cetpa;
public class PetrolEngine implements FourWheelerEngine
{
	public PetrolEngine()
	{
		System.out.println("Petrol engine is created...");
	}
	public void startEngine()
	{
		System.out.println("Pertrol engine started...");
	}
	public void stopEngine()
	{
		System.out.println("Pertrol engine stopped...");
	}
}
