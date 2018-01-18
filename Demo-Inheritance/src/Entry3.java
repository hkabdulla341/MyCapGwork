import com.cg.beans.*;
import com.cg.specs.*;

public class Entry3 {

	public static void main(String[] args) {
		Pet petRef = getAPet();
		
		petRef.beFriendly();
		petRef.play();
		
		System.out.println(Pet.MAX);
	}
	
	
	public static Pet getAPet(){
		return new Cat();
	}
	
}
