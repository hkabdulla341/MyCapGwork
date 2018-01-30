
public class EmpKey
{
    private int key;
    private String suffix;

    public EmpKey(int key)
    {
	this.key = key;
	this.suffix = "_FS";
    }

    public String getKey()
    {
	return key + this.suffix;
    }
    
    @Override
    public boolean equals(Object obj)
    {
	return this.key == ((EmpKey)obj).key;
    }
    
    @Override
    public int hashCode()
    {
	return this.suffix.hashCode() + this.key;
    }
}
