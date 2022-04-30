
public class Principal01 {

	public static void main(String[] args) 
	{
		int x=20;
		int y=0;
		 try 
		 {
			 System.out.println("la division de X/Y est:"+x/y);
			  
	   	 } 
		 catch (ArithmeticException e) 
		 {
			System.out.println("Impossible:"+e.getMessage());
		 }
		 System.out.println("la vie est belle");
	}

}
