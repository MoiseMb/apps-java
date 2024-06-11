import java.util.Scanner;
import java.util.Random;


public class exo1_6{

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		Random rand= new Random();

		System.out.println("Veuillez saisir la taille du tableau  : ");
		int N=sc.nextInt();
		double tab2[]=new double[N];


		for (int i=0;i<N ;i++ ) {
			
			tab2[i]=rand.nextDouble(19);
			
		}

		System.out.println("tableau initialise  ");
		affichage(tab2);

		// System.out.println("Element le plus grand du tableau  :" +grand_element(tab2));

		System.out.format("Element le plus grand du tableau  :  %.2f" ,grand_element(tab2));
		System.out.println();

	}

	public static double grand_element(double t[]){

		double max=t[0];
		for (int i=0; i<t.length;i++ ) {
			if (t[i]>max) {
				max=t[i];
				
			}
		}
		return max;
	}

	public static  void affichage (double t[]){


		for (int i=0;i<t.length ;i++ ) {

			// System.out.println(t[i] +"\t");
			System.out.format("%.2f\t",t[i]);
			
		}

		System.out.println();
	}
}