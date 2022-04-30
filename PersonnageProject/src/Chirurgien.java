import myInterface.com.behaving.*;

public class Chirurgien extends Personnage
{
	public Chirurgien() {
		this.soin=new Operation();
	}
	public Chirurgien(EspritCombatif pEspritCombatif, Soin pSoin,Deplacement pDeplacer) {
		super(pEspritCombatif,pSoin,pDeplacer);
	}
	 public String toString() {
		    return super.toString()+"\n Esprit combatif:Pacifiste\n Soin:donne des operations\n Deplacement:marcher";	
		  }
}
