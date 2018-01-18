package com.cg.beans;

abstract public class Canine extends Animal
{
    public Canine()
    {
	// super("Canine"); // chaining constructor using super
	System.out.println("instantiating Canine type....");
    }

    @Override
    public void roam()
    {
	System.out.println("It is roaming in groups...");

	// return ;
    }

    @Override
    abstract public void eat();

    @Override
    abstract public void sleep();
}
