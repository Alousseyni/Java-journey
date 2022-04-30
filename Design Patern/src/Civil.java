import com.Quality.myPaquage.Deplacement;
import com.Quality.myPaquage.EspritCombatif;
import com.Quality.myPaquage.Soin;

public class Civil extends Personnage{
  public Civil() {
		
	}
	public  Civil(EspritCombatif espritCombatif,Soin soin,Deplacement deplacement) {
		this.espritCombatif =espritCombatif;
		  this.deplacement =deplacement;
	 	  this.soin =soin;
	}
}