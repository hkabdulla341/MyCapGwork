import java.util.Comparator;

public class ComparatorProductByPrice implements Comparator<Product>
{
    @Override
    public int compare(Product o1, Product o2)
    {
	double diff = o1.getPrice() - o2.getPrice();
	
	if(diff == 0)
	{
	    return 0;
	}
	else if (diff < 0)
	{
	    return -1;
	}
	else
	{
	    return 1;
	}
    }
}
