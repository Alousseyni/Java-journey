import myInterface.com.behaving.*;

public class Civil extends Personnage
{
	public Civil() {
		this.espritCombatif=new Pacifiste();
	}
	public Civil(EspritCombatif pEspritCombatif,Soin pSoin,Deplacement pDeplacer) {
		super(pEspritCombatif,pSoin,pDeplacer);
	}
	public String toString() {
	    return super.toString()+"\n Esprit combatif:Pacifiste\n Soin:Aucun soin\n Deplacement:marcher";	
	  }
}
