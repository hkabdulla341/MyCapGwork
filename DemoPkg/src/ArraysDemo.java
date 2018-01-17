
//import java.lang.String;

import static java.lang.System.out;

class String{
	
}


public class ArraysDemo{
	
	public static void main(java.lang.String[] args){
		
		//int values[] = new int[10];
		
		acceptValues(new int[]
			{
				10,20,30,40
			}
		);
		
		
	}
	
	public static void acceptValues(int[] values){
		
		for(int value: values){
			out.print(value + "\t");
		}
		
	}
	
	
}