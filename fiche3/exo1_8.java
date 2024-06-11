import java.util.Scanner;
import java.util.Random;

public class exo1_8{

	public static void main(String[] args) {



		Scanner sc=new Scanner(System.in);
		Random rand= new Random();

		System.out.println("Veuillez saisir la taille du tableau : ");
		int N=sc.nextInt();
		int tab2[]=new int[N];


		for (int i=0;i<N ;i++ ) {
			
			tab2[i]=rand.nextInt(19);
			
		}

		System.out.println("tableau initialise");
		affichage(tab2);
		System.out.println("la moyenne du  tableau est M = "+moyenne_tableau(tab2));

		
	}

	public static float moyenne_tableau(int t[]){

		float moy=0;
		for (int i=0;i<t.length ;i++ ) {
			moy+=t[i];
			
		}
		return (float)moy/t.length;
	}

	public static  void affichage (int t[]){


		for (int i=0;i<t.length ;i++ ) {

			System.out.print(t[i] +"\t");
			
		}

		System.out.println();
	}
}