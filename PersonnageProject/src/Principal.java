
import myInterface.com.behaving.*;
public class Principal {

	public static void main(String[] args) {
		Personnage tpers[]= {new Guerrier(),new Snipper(),new Chirurgien()};
		EspritCombatif  tArmes[]= {new CombatCouteau(),new CombatPistolet(),new Pacifiste()};
		Soin            tsoin[]= {new AucunSoin(),new AucunSoin(),new Operation()};
		Deplacement  tDplacer[]= {new Marcher(),new Courir(),new Marcher()};
		
		for (int i = 0; i < tArmes.length; i++) {
			System.out.println("Instances de la :"+tpers[i].getClass()+
					"\n--------------------------------\n");
			 tpers[i].setEspritCombatif(tArmes[i]);
			 tpers[i].setSoin(tsoin[i]);
			 tpers[i].setDeplacer(tDplacer[i]);
			 tpers[i].seDeplacer();
			 tpers[i].combattre();
			 tpers[i].soigner();
			 System.out.println(tpers[i].toString());
		}

	}

}
