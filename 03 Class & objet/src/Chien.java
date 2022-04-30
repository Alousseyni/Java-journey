
public class Chien extends Canin implements Rintintin
{
	 public Chien() {
		 
	 }
	 public Chien(String color,int weight) {
		 this.couleur =color;
		 this.poids=weight;
	 }
	  void crier() {
		System.out.println("j'aboue sans raison");
	 }
	  public void faireCalin() {
		  System.out.println("Je fais un gros calin");
	  }
	  public void faireLechouille() {
		System.out.println("Je fais de grosses lechouille…");
	}
	  public void faireLeBeaux() {
		System.out.println("Je fais le beaux !");
	}
}
