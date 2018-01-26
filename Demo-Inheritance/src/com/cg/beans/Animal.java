package com.cg.beans;

// Eclipse uses incremental compiler

abstract public class Animal extends Object implements Cloneable
{
    private String type;

    public Animal()
    {
	System.out.println("instantiating Animal type....");
    }

    /*
     * public Animal(String type) { this.type = type; }
     */

    abstract public void eat();/*
			        * { System.out.println("It is eating..."); }
			        */

    abstract public void sleep();/*
				  * { System.out.println("It is sleeping..."); }
				  */

    abstract public void roam();/*
				 * { System.out.println("It is roaming..."); }
				 */

    @Override
    public Object clone() throws CloneNotSupportedException
    {
	return super.clone();
    }
}