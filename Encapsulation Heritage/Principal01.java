package myProgrames;


public class Principal01 
{

	public static void main(String[] args)
	{
		 try {
			 Ville  monVille =new Ville("Bk",19_000_000,"Mali");
		     } 
		 catch (NombreHabitantException | NomVilleException e) 
		 {
			System.out.println(e.getMessage());
		 }
		 /*catch (NomVilleException e2) {
			System.out.println(e2.getMessage());
		}*/
		 finally {
			System.out.println("c'est l'une des deux qui sera executer");
		}
		
	}

}
