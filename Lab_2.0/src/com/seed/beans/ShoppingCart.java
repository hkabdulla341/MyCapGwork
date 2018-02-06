package com.seed.beans;

import java.util.HashSet;
import java.util.LinkedList;

//TODO:0	Modification required
public class ShoppingCart
{
    private java.util.Collection<Integer> productIds;

    public ShoppingCart()
    {
	productIds = new LinkedList<Integer>();
    }

    public java.util.Set<Integer> getProductSet()
    {
	return new HashSet<Integer>(productIds);
    }

    public void setProductList(String[] newProductIds)
    {
	// TODO:3 add newProductIds into existing list of product ids

	for (String aProduct : newProductIds)
	{
	    try
	    {
		productIds.add(Integer.parseInt(aProduct));
	    }
	    catch (NumberFormatException ex)
	    {
		System.out.println(ex.getMessage() + " - Exception hit for product : " + aProduct);
	    }
	}
    }
}
