
public class Entry {
	public static void main(String[] args) {
	
		try{	// try block contains risky code
			setValue(10);
		}catch(Exception e){		//exception handler
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("end of main()....");
	}
	
	public static void setValue(int v) throws Exception{
		boolean flag=false;
		
		if(flag){
			System.out.println("Setting the value");
		}else{
//			TODO	raise an exception
			throw new Exception("Not able to set a value");
			
		}
	}
	
//	boolean flag;
	
}

