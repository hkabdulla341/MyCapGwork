package com.cg.beans;

public class Cat extends Feline
{

    public Cat()
    {
	// TODO Auto-generated constructor stub
	System.out.println("instantiating Cat type....");
    }
    
    @Override
    public void roam()
    {
        // TODO Auto-generated method stub
        catRoam();
    }

    private void catRoam()
    {
	System.out.println("Cat roam with independently with Humans Mostly...");
    }
}
