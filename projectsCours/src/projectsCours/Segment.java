package projectsCours;

public class Segment {
	private Point pointA;
	private Point pointB;
	//Constructeurs segment
	public  Segment() {
		this.pointA= new Point();
		this.pointB=new Point();
	}
	public  Segment(Point x,Point y) {
		this.pointA=x;
		this.pointB=y;
	}
	//methode
   public String toString() {
	return "Les coordonnées du segment est:"+pointA.getNom()+"("+pointA.getAbsX()+","+pointA.getOrdY()+
			") et "+pointB.getNom()+"("+pointB.getAbsX()+","+pointB.getOrdY()+")";
    }
   public void translater(int x1,int y1,int x2,int y2) {
	this.pointA.translater(x1,y1);
	this.pointB.translater(x2, y2);
   }
   public int getLongueurSegment() {
	   int x1,y1,x2,y2;
	   x1=pointA.getAbsX();y1=pointA.getOrdY();
	   x2=pointB.getAbsX();y2=pointB.getOrdY();
	return (int)Math.sqrt(((x2-x1)*(x2-x1))-((y2-y1)*(y2-y1)));
}
   
}
