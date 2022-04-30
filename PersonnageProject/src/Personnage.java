import myInterface.com.behaving.*;

public abstract class Personnage 
{
	//composition des comportements
		protected EspritCombatif espritCombatif = new Pacifiste();
		protected           Soin           soin = new AucunSoin();
		protected     Deplacement      deplacer = new Marcher();
	//constructeurs
	public Personnage() {};
	
	public Personnage(EspritCombatif espritCombatif,Soin soin,Deplacement deplacer) {
		this.espritCombatif=espritCombatif;
		this.soin=soin;
		this.deplacer=deplacer;
	};
	
 	// setters
	protected void setEspritCombatif(EspritCombatif espritCombatif) {
		this.espritCombatif = espritCombatif;
	}
	
	protected void setDeplacer(Deplacement deplacer) {
		this.deplacer=deplacer;
	}
	
	protected void setSoin(Soin soin) {
		this.soin=soin;
	}
	// methodes
	protected void seDeplacer() {
		deplacer.deplacer();
	}
	protected void soigner() {
		soin.soigner();
	}
	protected void combattre() {
		espritCombatif.combat();
	}
	
	 public Deplacement getDeplacer() {
		return deplacer;
	}


	public EspritCombatif getEspritCombatif() {
		return espritCombatif;
	}

	public Soin getSoin() {
		return soin;
	}

	public String toString() {
		 return "le Personnage "+this.getClass().getName()+" est l'un des personnage qui a  comme caracteristique:";
	 }
}
