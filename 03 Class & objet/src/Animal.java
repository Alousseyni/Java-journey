
 abstract class Animal {
 // instance
  protected String couleur ;
  protected int poids;
 // methods
  protected void manger() {
	  System.out.println("Je manger de la viande");
  }
  protected void boire() {
	  System.out.println("Je bois de l'eau");
  }
  
    abstract void deplacer();
    abstract void crier();
    
    public String toString() {
		return "je suis un objet de "+this.getClass()+", je suis de la couleur "+this.couleur+" et je pese "+this.poids+"Kg";
	}
}
