
public class Principale03 {

	public static void main(String[] args) 
	{
		Chien chien = new Chien("Gris",20);
		Animal chat= new Chat("blanc",10);
		chat.manger();
		chat.boire();
		chat.deplacer();
		chat.crier();
		System.out.println(chat.toString());
		System.out.println("---------------------------------------");
		chien.manger();
		chien.boire();
		chien.deplacer();
		chien.crier();
		chien.faireCalin();
		chien.faireLeBeaux();
		chien.faireLechouille();
		System.out.println(chien.toString());
		System.out.println("---------------------------------------");
	}

}
