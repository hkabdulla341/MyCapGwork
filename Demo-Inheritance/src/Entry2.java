import com.cg.beans.Animal;
import com.cg.beans.Cat;
import com.cg.beans.Dog;

public class Entry2 {
	public static void main(String[] args) {
		
		Animal aRef = getAnimal();
		
		aRef.eat();
		aRef.sleep();
		aRef.roam();
	}
	
//	Factory pattern
	public static Animal getAnimal(){
		return new Cat();
		
	}
	
	
	
	
	
	
}
