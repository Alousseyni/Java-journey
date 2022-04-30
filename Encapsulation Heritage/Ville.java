package myProgrames;

public class Ville {
		protected String nomVile;
        protected String nomPays;
        protected int nombreHabitants;
        protected  char categorie;
        protected static int nombreVille=0;
		//constructeurs
		
		public Ville() {
			nomVile="Inconnu";
			nomPays="inconnu";
			nombreHabitants=0;
			this.setCategorie();
			nombreVille++;
		}
		public Ville(String pNomVille,int pNombreHabitants,String pNomPays) 
			throws NombreHabitantException,NomVilleException
		{
			if (pNombreHabitants < 0) {
				String paramString ="Vous essayez de creer un ville avec un nombre d'habitant negative:"+pNombreHabitants+" incorrect";
				throw new NombreHabitantException(paramString);
			} 
		    if (pNomVille.length()<3) {
		    	String paramString ="le nom de votre ville est inferieur a 3 caractere:"+pNomVille+" incorrect";
				throw new NomVilleException(paramString);
			}
			else 
			{
				nomVile=pNomVille;
				nomPays=pNomPays;
				nombreHabitants=pNombreHabitants;
				this.setCategorie();
				nombreVille++;
			}
		}
		//Accesseurs et Mutateurs
		
		public String getNomVile() {
			return nomVile;
		}
		
		public void setNomVile(String nomVile) {
			this.nomVile = nomVile;
		}
		
		public String getNomPays() {
			return nomPays;
		}
		
		public void setNomPays(String nomPays) {
			this.nomPays = nomPays;
		}
		
		public int getNombreHabitants() {
			return nombreHabitants;
		}
		
		public void setNombreHabitants(int nombreHabitants) {
			this.nombreHabitants = nombreHabitants;
			this.setCategorie();
		}
		public int getNombreVille() {
			return this.nombreVille;
		}
		// Methodes
		
		public String toString() 
		{
			return "<"+this.nomVile+"> est une ville de <"+this.nomPays+">,Comporte:"+this.nombreHabitants+
					" d'habitants"+"==> categorie<"+this.categorie+">";
		}
		private void  setCategorie() 
		{
			int tabHabitant[] = {0,10_000,20_000,30_000,40_000,50_000,60_000,70_000,80_000,90_000,100_000,1_000_000
					,10_000_000,50_000_000,100_000_000,1_000_000_000};
			char categories[]= {'?','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O'};
			int i=0;
			while(i<tabHabitant.length && this.nombreHabitants>=tabHabitant[i]) {
				this.categorie = categories[i];
				i++;
				
			}
		}
		public void comparer(Ville autreVille) {
			if (autreVille.nombreHabitants>this.nombreHabitants) {
				System.out.println("la ville<"+autreVille.nomVile+"> est plus peuplée que <"+this.nomVile+">");
			} else {
				System.out.println("la ville<"+autreVille.nomVile+"> est moins peuplée que <"+this.nomVile+">");
			}
		}
}
