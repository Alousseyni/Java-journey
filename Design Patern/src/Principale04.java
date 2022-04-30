import com.Quality.myPaquage.*;

public class Principale04 {

	public static void main(String[] args) {
		Personnage tPers[] = { new Guerrier(),new Medecin(),new Civil()};
		for (Personnage p : tPers) {
			System.out.println("instance de "+p.getClass().getName());
			System.out.println("***********************************");
			p.combattre();
			p.seDeplacer();
			p.seSoigner();
		}
	}

}
