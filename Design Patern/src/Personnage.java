import com.Quality.myPaquage.*;
public abstract class Personnage 
{
	protected EspritCombatif espritCombatif = new Pacifiste();
	protected    Soin          soin  = new AucunSoin();
	protected Deplacement       deplacement = new Marcher();
	    public Personnage() {
	    	
	    }
		public Personnage(EspritCombatif espritCombatif,Soin soin,Deplacement deplacement) {
		  this.espritCombatif =espritCombatif;
		  this.deplacement =deplacement;
       	  this.soin =soin;
		}
     
     
		// setters
		public void setEspritCombatif(EspritCombatif espritCombatif) {
			this.espritCombatif = espritCombatif;
		}
		
		public void setSoin(Soin soin) {
			this.soin = soin;
		}
		
		public void setDeplacement(Deplacement deplacement) {
			this.deplacement = deplacement;
		}
		   // methods
		  public void combattre() {
			   espritCombatif.combat();
			 }
			   public void seDeplacer() {
				   deplacement.deplacer();
			}
			   public void seSoigner() {
				soin.soigner();
			}
}
