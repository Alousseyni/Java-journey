
abstract class Animal implements Rintintin
{
	protected String color;
	protected int weight;
	protected void eat() {
	System.out.println("Je mange de la viande");
	}
	protected void drink() {
		System.out.println("je bois de l'eau");
	}
	abstract void move();
	abstract void shout();
	public String toString() {
		return "I am an object from "+this.getClass()+", i am "+this.color+" and i have:"+this.weight+"kg as size";
	}
	@Override
	public void faireCalin() {
		System.out.println("I give you a big hug");
	}
	@Override
	public void faireLeBeau() {
		System.out.println("Lemme me give you a kiss");
	}
	@Override
	public void faireLechouille() {
		System.out.println("lemme me enjoy your company");
	}
	
}
