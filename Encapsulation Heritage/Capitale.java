package myProgrames;

public class Capitale extends Ville 
{
	private String monument;
	//--------Les constructeurs-----------------
   public Capitale() 
   {
		super();
		monument="Aucun";
    }
   public Capitale(String pVille,int pHabitant,String pPays,String pMonument) 
    throws NombreHabitantException,NomVilleException 
   {
		super(pVille,pHabitant,pPays);
		monument=pMonument;
    }
   //--------Accesseurs et mutateurs-----------------
    public String getMonument() 
    {
		return monument;
	}
    public void setMonument(String pMonument) 
    {
    	monument =pMonument;
    }
    
   public String toString() 
   {
	return super.toString()+" et <"+this.monument+"> est un des grands monument";
   }
   
}

