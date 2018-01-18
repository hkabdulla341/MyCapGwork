package com.cg.beans;
import com.cg.specs.Pet;

public class Cat extends Feline implements Pet
{
    int MAX = 13;
    
    public Cat()
    {
	System.out.println("Initialize Cat Obj ...");
    }

    @Override
    public void eat()
    {
	System.out.println("Cat is eating fish");
    }

    @Override
    public void sleep()
    {
	System.out.println("Cat is sleeping on Sofa");
    }

    @Override
    public void roam()
    {
	System.out.println("Cat is roaming with Human");
    }

    @Override
    public void beFriendly()
    {
	System.out.println("Cat lays on Human Lap and being friendly");
    }
    
    @Override
    public void play()
    {
	System.out.println("Cat play with Ball thread");
    }
}
