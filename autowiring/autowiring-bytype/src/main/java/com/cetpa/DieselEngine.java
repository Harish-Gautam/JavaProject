package com.cetpa;
public class DieselEngine implements FourWheelerEngine
{
	public DieselEngine()
	{
		System.out.println("Diesel engine is created...");
	}
	public void startEngine()
	{
		System.out.println("Diesel engine started...");
	}
	public void stopEngine()
	{
		System.out.println("Diesel engine stopped...");
	}
}
