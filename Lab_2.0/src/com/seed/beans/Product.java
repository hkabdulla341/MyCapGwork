package com.seed.beans;

import java.util.HashMap;
import java.util.Map;

import com.seed.util.ProductsRepository;

abstract public class Product implements ProductsRepository
{
    private int id;
    private String name;
    private double price;

    public Product()
    {
    }

    public int getId()
    {
	return id;
    }

    public void setId(int id)
    {
	this.id = id;
    }

    public String getName()
    {
	return name;
    }

    public void setName(String name)
    {
	this.name = name;
    }

    public double getPrice()
    {
	return price;
    }

    public void setPrice(double price)
    {
	this.price = price;
    }
    
    @Override
    public Map<Integer, Product> getProductEntries()
    {
	return new HashMap<Integer, Product>();
    }
}
