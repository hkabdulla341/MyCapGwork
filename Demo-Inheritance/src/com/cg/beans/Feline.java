package com.cg.beans;

abstract public class Feline extends Animal
{
    public Feline()
    {
	System.out.println("Initalizing Feline...");
    }

    @Override
    abstract public void eat();

    @Override
    abstract public void sleep();

    @Override
    public void roam()
    {
	System.out.println("Feline Roam solo...");
    }

}
