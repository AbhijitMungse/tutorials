package com.abhay.oops;

public class Animal 
{
	public void eat()
	{
		System.out.println("I am eating");
	}

	public void sleep() 
	{
		System.out.println("I am sleeping");
	}
      public static void main(String[] args) 
	{
		System.out.println();
		Animal buzo = new Animal();
		buzo.eat();
		buzo.sleep();
		
	}

	class Bird extends Animal
	{
		public void fly() 
		{
			System.out.println("I am flying");
			Bird bs=new Bird();
			bs.fly();
		}
	}
}
