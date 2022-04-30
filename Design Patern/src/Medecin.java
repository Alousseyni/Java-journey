import com.Quality.myPaquage.Deplacement;
import com.Quality.myPaquage.EspritCombatif;
import com.Quality.myPaquage.Soin;

public class Medecin extends Personnage
{
	   public Medecin() {
		   
	   }
	   public Medecin(EspritCombatif espritCombatif,Soin soin, Deplacement deplacement) {
		   this.espritCombatif =espritCombatif;
			  this.deplacement =deplacement;
	       	  this.soin =soin;
	   }
}
