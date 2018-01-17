package com.cg.beans;

public class Feline extends Animal
{
    public Feline()
    {
	// TODO Auto-generated constructor stub
	System.out.println("instantiating Feline type....");
    }
    
    @Override
    public void roam()
    {
        // TODO Auto-generated method stub
        felineRoam();
    }
    
    private void felineRoam()
    {
	System.out.println("Roam independently...");
    }
}
