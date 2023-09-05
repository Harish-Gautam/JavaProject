package com.cetpa;
public class CngEngine implements FourWheelerEngine
{
	public CngEngine()
	{
		System.out.println("CNG engine is created...");
	}
	public void startEngine()
	{
		System.out.println("CNG engine started...");
	}
	public void stopEngine()
	{
		System.out.println("CNG engine stopped...");
	}
}
