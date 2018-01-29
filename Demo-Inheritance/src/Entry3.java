import com.cg.beans.*;
import com.cg.specs.*;

public class Entry3 {

	public static void main(String[] args) {
		Pet petRef = getAPet();
		
		petRef.beFriendly();
		petRef.play();
		
		System.out.println(Pet.MAX);
		
		Dog aDog = new Dog();
		
		System.out.println(aDog.toString());
		
		try
		{
		    Dog bDog = (Dog) aDog.clone();
		    System.out.println(aDog.equals(bDog));
		    System.out.println(aDog == (bDog));
		}
		catch (CloneNotSupportedException e)
		{
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
		
		try
		{
		    Pet cDog = (Pet)aDog.clone();
		    System.out.println(aDog.equals(cDog));
		    System.out.println(aDog == (cDog));
		}
		catch (CloneNotSupportedException e)
		{
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
	}
	
	
	public static Pet getAPet(){
		return new Cat();
	}
	
}
