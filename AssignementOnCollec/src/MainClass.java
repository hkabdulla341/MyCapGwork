import java.util.Set;
import java.util.TreeSet;

public class MainClass
{
    public static void main(String[] args)
    {
	Product productA = new Product(2, "Cash", 50);
	Product productB = new Product(1, "Pen", 3.5);
	Product productC = new Product(3, "Apple Mobile", 1550);
	
	Set<Product> natOrderSet = new TreeSet<Product>();
	natOrderSet.add(productA);
	natOrderSet.add(productB);
	natOrderSet.add(productC);
	
	System.out.println("Print by id Ascending -- By implementing comparable interface (override CompareTo method)...");
	for(Product aProduct : natOrderSet)
	{
	    System.out.println(aProduct.toString());
	}
	System.out.println();
	
	System.out.println("Print by Name Ascending -- By implementing a new Class implementing Comperator (override Compare method)...");
	Set<Product> orderByNameSet = new TreeSet<Product>(new ComparatorProductByName());
	orderByNameSet.add(productA);
	orderByNameSet.add(productB);
	orderByNameSet.add(productC);
	
	for(Product aProduct : orderByNameSet)
	{
	    System.out.println(aProduct.toString());
	}
	System.out.println();
	
	System.out.println("Print by Price Ascending -- By implementing a new Class implementing Comperator (override Compare method)...");
	Set<Product> orderByPriceSet = new TreeSet<Product>(new ComparatorProductByPrice());
	orderByPriceSet.add(productA);
	orderByPriceSet.add(productB);
	orderByPriceSet.add(productC);
	
	for(Product aProduct : orderByPriceSet)
	{
	    System.out.println(aProduct.toString());
	}
	System.out.println();
    }
}
