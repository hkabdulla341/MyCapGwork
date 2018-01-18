import com.cg.beans.Animal;
import com.cg.beans.Canine;
import com.cg.beans.Cat;
import com.cg.beans.Dog;
import com.cg.beans.Feline;

public class Entry
{
    public static void main(String[] args)
    {
	//
	// Animal aRef;
	//
	// aRef = new Animal();
	//
	// System.out.println(aRef.toString());
	// System.out.println(aRef.getClass());
	// System.out.println(aRef);
	//
	// aRef.eat();
	// aRef.sleep();
	// aRef.roam();
	//
	// Object ob = null;
	// // System.out.println(ob.toString());
	//
	// // Up-casting
	//
	// // Every reference has a static type and dynamic type
	// ob = (Object) aRef; // implicit casting
	//
	// // Methods are binded at run time by default
	// System.out.println(ob.getClass());
	//
	// /*
	// * ob = new String("Test"); System.out.println(ob.getClass());
	// */
	// // Explicit down-casting
	// ((Animal) ob).eat();
	//
	// Canine cRef = new Dog();
	//
	// cRef.eat();
	// cRef.roam();
	// System.out.println(cRef.getClass());
	// // cRef.roamInGroups();
	// cRef = new Canine();
	// System.out.println(cRef.getClass());
	// System.out.println();
	//
	// Feline fRef = new Cat();
	// fRef.roam();
	// System.out.println(fRef.getClass());
	//
	// fRef = new Feline();
	// fRef.roam();
	// System.out.println(fRef.getClass());

	Animal aRef = new Cat();
	aRef.roam();
	
	Canine cRef = new Dog();
	cRef.roam();

	Feline fRef = new Cat();
	fRef.roam();
    }

}
