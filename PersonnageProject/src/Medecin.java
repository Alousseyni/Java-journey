import myInterface.com.behaving.*;

public class Medecin extends Personnage
{
   public Medecin() {
	   this.soin=new PremeierSoin();
   }
   public Medecin(EspritCombatif pEpritCombatif,Soin pSoin,Deplacement pDeplacer) 
   {
	 super(pEpritCombatif,pSoin,pDeplacer);
   }
   public String toString() {
	    return super.toString()+"\n Esprit combatif:Pacifiste\n Soin:donne des premier soin\n Deplacement:marcher";	
	  }
}
