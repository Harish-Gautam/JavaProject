package com.cetpa;
public class HondaCar 
{
	private FourWheelerEngine engine;
	//engine is name of dependency
	//FourWheelerEngine is type of dependency
	public HondaCar()
	{
		System.out.println("Car is created using default constructor...");
	}
	public HondaCar(FourWheelerEngine abc)
	{
		System.out.println("Car is created using parameterized constructor...");
		System.out.println("Dependency is injected using parameterized constructor...");
		this.engine=abc;
	}
	public void setEngine(FourWheelerEngine engine)
	{
		System.out.println("Dependency is injected using stter...");
		this.engine=engine;
	}
	public void turnEngineOn()
	{
		engine.startEngine();
	}
	public void turnEngineOff()
	{
		engine.stopEngine();
	}
}
