import myInterface.com.behaving.*;
public class Snipper  extends Personnage
{
   public Snipper() {
	this.espritCombatif=new CombatPistolet();
	//this.soin=new AucunSoin();
	//this.deplacer=new Courir();
   }
   public Snipper(EspritCombatif pEspritCombatif,Soin pSoin,Deplacement pDeplacer) {
		super(pEspritCombatif,pSoin,pDeplacer);
   }
   public String toString() {
    return super.toString()+"\n Esprit combatif:Combat au Pistolet \n Soin:Aucun soin\n Deplacement:Courir";	
  }
}
