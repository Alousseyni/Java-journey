package projectsCours;

public class Principal01 {

	public static void main(String[] args) {
		Point pointA =new Point('A',2,4);
		Point pointB=new Point('B',3,6);
		Point pointC=new Point('C',1);
		Segment seg1=new Segment(pointA,pointB);

		System.out.println(pointA.toString());
		System.out.println("------------------------");
		System.out.println(pointB.toString());
		System.out.println("------------------------");
		System.out.println(pointC.toString());
		System.out.println("je translate le point c");
		 pointC.translater(-1);
		System.out.println(pointC.toString());
		System.out.println("------------------------");
		System.out.println(seg1.toString());
		System.out.println("Apres la translation");
		seg1.translater(4, 6, 8, 4);
		System.out.println(seg1.toString());
		System.out.println("la longueur du segment est:"+seg1.getLongueurSegment());
	}

}
