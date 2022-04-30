package projectsCours;

public class Point {
	//instances 
	private char nom;
	private int absX;
	private int ordY=0;
	//constructeurs
	public Point() {// ce nest pas un constructeeur par defaut;
		nom='o';
		absX=0;
		ordY=0;
	}
	public  Point(char pNom,int pAbsX) {
		nom=pNom;
		absX=pAbsX;
	}
	public  Point(Character pNom,int pAbsX,int pOrdY) {
		nom=pNom;
		absX=pAbsX;
		ordY=pOrdY;
}

// accesseurs et mutateurs
	public char getNom() {
		return nom;
	}
	public int getOrdY() {
		return ordY;
	}
	public void  setOrdY(int y) {
		ordY=y;
	}
	
	public int getAbsX() {
		return absX;
	}
	
	
	public void setNom(char pNom) {
		nom=pNom;
	}
	public void  setAbsX(int x) {
		absX=x;
	}
	// methode de class
	public String toString() {
		if (ordY != 0) {
			return "le point '"+this.nom+"' est a la position ("+this.absX+","+this.ordY+")";
		} else {
			return "le point '"+this.nom+"' est a la position x="+this.absX;
		}
	}
	public void translater(int x) {
		this.absX = absX+x;
		
	}
	public void translater(int t,int y) {
		this.absX = absX+t;
		this.ordY=ordY+y;
		
	}

}
