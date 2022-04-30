
public class Ville 
{

	protected String nomVille;
	protected String nomPays;
	protected int nbreHabitants;
	protected char categorie;
	private static int nombreInstance = 0;
	
	
	public Ville() {
		nomVille = "inconnu";
		nomPays = "inconnu";
		nbreHabitants =0;
		this.setCategorie();
		nombreInstance++;
	}
	

	public  Ville(String pNom,int pHabitants,String pPays) 
	{
		nomVille = pNom;
		nomPays = pPays;
		nbreHabitants =pHabitants;
		this.setCategorie();
		nombreInstance++;
	}
	
	public String getNomVille() {
		return nomVille;
	}
	public String getNomPays() {
		return nomPays;
	}
	public int getNbreHabitants() {
		return nbreHabitants;
	}
	
	public void setNomVille(String pNom) {
		nomVille =pNom;
	}
	public void setNomPays(String pPays) {
		nomPays = pPays;
	}
	public void setNbreHabitants(int pNbre) {
		nbreHabitants = pNbre;
	}
	private void setCategorie() 
	{
		int tableauxHabitants[] = {1_000,10_000,20_000,30_000,40_000,50_000,60_000,70_000,80_000,90_000,100_000,500_000,1_000_000,10_000_000,20_000_000};
		char tabCategories[] = {'?','A','B','C','D','E','F','G','H','I','J','K','L','M','N'};
		int i=0;
		while(i<tableauxHabitants.length && this.nbreHabitants > tableauxHabitants[i]) {
			i++;
			this.categorie = tabCategories[i];
		}
	}
	public String comparer(Ville v ) 
	{
		String str = new String();
		if(v.getNbreHabitants()>this.nbreHabitants) {
			str= "La ville <"+v.getNomVille()+"> est plus peuplée que <"+this.nomVille+">";
		}
		else {
			str= "La ville <"+v.getNomVille()+"> est moins peuplée que <"+this.nomVille+">";
		}
		
		return str;
	}
	public String toString() {
		return "La ville de <"+this.nomVille+"> est l'une des plus grande ville de <"+this.nomPays+
				"> Qui est composé de :"+this.nbreHabitants+" habitants et il est de la categorie:"+this.categorie;
	}
	public static int getNombreInstances() {
		return nombreInstance;
	}
}
