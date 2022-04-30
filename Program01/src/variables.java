
import java.util.Scanner;
public class variables {

	public static void main(String[] args) {
         Scanner keyboard = new Scanner(System.in);
         String stringTab[][] = {{"Alhouss","Alkess","Tiombe"},{"1","2","3"}};
         for(String caract[] : stringTab) {
        	 for(String str: caract) {
        		 System.out.print(" "+str);
        	 }
        	 System.out.println();
         }
         
	}

}