import java.util.Scanner;
import java.util.Random;

public class exo1_9{

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
		System.out.println("Saisir un element a chercher : ");
		int rec=sc.nextInt();

		if (recherche_element(tab2,rec))
			System.out.println("Element trouver !!");
		else
			System.out.println("Element introuvable !!");

		
	}

	

	public static  void affichage (int t[]){


		for (int i=0;i<t.length ;i++ ) {

			System.out.print(t[i] +"\t");
			
		}

		System.out.println();
	}
	public static boolean recherche_element(int t[],int n){

		for (int i=0;i<t.length ;i++ ) {
			if (t[i]==n) {
				return true;
			}
		}
		return false;
	} 
}