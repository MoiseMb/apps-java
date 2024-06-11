import java.util.Scanner;

public class exotableau{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		

		System.out.println("Saisir la taille du tableau");

		int N=sc.nextInt();
		float tab[]= new float [N];

		

		for (int i=0;i<N ;i++ ) {
			System.out.println("Saisir l'element  "+(i+1)+" du tableau");
			tab[i]=sc.nextFloat();
		 	
		 } 

		 System.out.println("");
		 System.out.println("Tableau saisi  ");
		  System.out.println("");
		 float somme=0,moyenne,max=tab[0],min=max;

		 int indice=0,indice2=0;

		 for (int i=0;i<N ;i++ ) {
			System.out.print(tab[i]+ "\t");
			somme+=tab[i];
			if (tab[i]>max) {
				max=tab[i];
				indice=i;
			}

			if (tab[i]<min) {
				min=tab[i];
				indice2=i;
			}
		 	
		 }

		 moyenne=somme/tab.length;

		 System.out.println("");
		 System.out.println("");
		 System.out.println(" somme  S = "+somme);
		 System.out.println(" moyenne  M = "+moyenne);
		 System.out.println(" max =  "+max+" indice de max "+indice);
		 System.out.println(" min =  "+min+" indice de min "+indice2);
		 System.out.println("");
		 sc.close();
	}
}