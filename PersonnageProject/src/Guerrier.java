
import myInterface.com.behaving.*;
public class Guerrier extends Personnage
{
	public Guerrier() 
	{
		this.espritCombatif=new CombatPistolet();
	}
	public Guerrier(EspritCombatif pEspritCombatif,Soin pSoin,Deplacement pDeplacer) 
	{
		super(pEspritCombatif,pSoin,pDeplacer);
	}
	public String toString() {
	    return super.toString()+"\n Esprit combatif:Combat au couteau \n Soin:Ne donne aucun soin\n Deplacement:courir";	
	  }
}
