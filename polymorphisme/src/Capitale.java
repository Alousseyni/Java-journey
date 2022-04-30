
 class Capitale extends Ville{
	 String monument = new String();
	 
	 //default constructor
	 public Capitale() {
		 // this word call the base default constructor
		  super();
		  monument ="aucun";
	 }
	public  String toString() {
		return super.toString()+" et <"+this.monument+"> est l'une des plus grande monument";
		
	}
	//initialization constructor
	public Capitale(String pVille,int pHabitants,String pPays,String monument) {
		//this word will initialize the previous variables or base class variables
		super(pVille,pHabitants,pPays);
		
		this.monument =monument;
	}
	// Getters and Setters
	public String getMonument() {
		return this.monument;
	}
	public void setMonument(String monument) {
		this.monument =monument;
	}

}
