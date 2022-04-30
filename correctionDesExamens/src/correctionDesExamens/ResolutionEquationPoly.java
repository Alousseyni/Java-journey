package correctionDesExamens;

import java.util.*;

public class ResolutionEquationPoly {

	public static void main(String[] args) 
	{
		Scanner clavier =new Scanner(System.in);
		System.out.println("entre le degre de votre polynome");
		int deg = clavier.nextInt();
		//la saisie des donnees
		float[] Px = new float[deg+1];
		System.out.println("saisir les coeficients de l'equation");
		for(int i=0;i < Px.length;i++) 
		{
			System.out.println("\n entrer le coefficient de degre:"+(deg-i)+":");
			 Px[i]=clavier.nextFloat();
		}
		//Affichage du polynome
		System.out.println("l'equation est:\n");
		for (int i = 0; i < Px.length; i++) {
			System.out.print(Px[i]+"X^"+(deg-i)+"+");
		}
		System.out.println("\n le resultat est:"+fonctionCalc(-4.0f, Px));
		// resolution
		if (deg<4) 
		  {
				System.out.println("\n *********Resolution par la methode Numerique***********");
				System.out.println("Entre votre intervalle de resolution\n");
				  System.out.println("Entre le maximum:");
				   float a=clavier.nextFloat(); 
				  System.out.println("Entre le minimum:");
				   float b=clavier.nextFloat();
				   System.out.println("entre votre près de resolution:");
				    float pFinal=clavier.nextFloat();
				  //pour les equation a deg > 4
				   if ( (fonctionCalc(a, Px) * fonctionCalc(b, Px))<0) 
				   {
					   float pDebit=b-a;
					    int k=0;
					    while (pDebit>pFinal) 
					    {
							float m = (a+b)/2;
							if ((fonctionCalc(a,Px) * fonctionCalc(m,Px))<0) {
								a = a;
								b=m;
							}
							else 
							{
								a = m;
								b=b;
							}
							k++;
							pDebit=b-a;
						}
					    System.out.println("la solution approximer est compris:"+a+" et "+b);
				 }
				   else {
					System.out.println("Aucune solution ne se trouver dans cet intervalle\n");
				}
		  } //fin de resolution
		
	}
	public static float fonctionCalc(float x,float Poly[])
	{
		float result=0;
		float taille=Poly.length-1;
		for (int i = 0; i < Poly.length; i++) {
			result = result + Poly[i]*((float)Math.pow(x, taille-i));
		}
		return result;
	}

}
