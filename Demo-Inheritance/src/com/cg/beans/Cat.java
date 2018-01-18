package com.cg.beans;

public class Cat extends Feline
{

    public Cat()
    {
	System.out.println("Initalizing Cat...");
    }

    @Override
    public void eat()
    {
	System.out.println("Cat is eating");
    }

    @Override
    public void sleep()
    {
	System.out.println("Cat is Sleeping");
    }

    @Override
    public void roam()
    {
	System.out.println("Cat roam with Humans");
    }
}
