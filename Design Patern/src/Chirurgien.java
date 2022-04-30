import com.Quality.myPaquage.Deplacement;
import com.Quality.myPaquage.EspritCombatif;
import com.Quality.myPaquage.Soin;

public class Chirurgien extends Personnage
{		
			public Chirurgien() {};
		   public Chirurgien(EspritCombatif espritCombatif,Soin soin,Deplacement deplacement) {
			   this.espritCombatif =espritCombatif;
				  this.deplacement =deplacement;
		       	  this.soin =soin;
		   }
}
