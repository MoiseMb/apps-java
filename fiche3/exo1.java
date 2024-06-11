import java.util.Scanner;
import java.util.Random;

public class exo1{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Random rand= new Random();

		System.out.println("Veuillez saisir la taille du tableau : ");
		int N=sc.nextInt();
		int tab[]=new int[N];
		int tab2[]=new int[N];

		for (int i=0;i<N ;i++ ) {
			System.out.println("saisir l'element "+(i+1)+ " du tableau");
			tab[i]=sc.nextInt();
			
		}


		for (int i=0;i<N ;i++ ) {
			
			tab2[i]=rand.nextInt(19);
			
		}
		System.out.println("Tableau saisie avec Scanner :");
		affichage(tab);
		System.out.println();

		System.out.println(" indice Element minimum du tableau T1 : "+min_indice(tab) );

		System.out.println(" indice Element maximum du tableau T1 : "+max_indice(tab) );
		System.out.println();
		System.out.println();


		System.out.println("Tableau initialise avec Random :");
		affichage(tab2);
		System.out.println();

		System.out.println(" indice Element minimum du tableau T2 : "+min_indice(tab2) );

		System.out.println(" indice Element maximum du tableau T2 : "+max_indice(tab2) );

		System.out.println();




		sc.close();
	}

	public static  void affichage (int t[]){


		for (int i=0;i<t.length ;i++ ) {

			System.out.print(t[i] +"\t");
			
		}

		System.out.println();
	}
	public static int min_indice(int t[]){
		int min=t[0],indice=0;
		for (int i=0;i<t.length ;i++ ) {

			if (t[i]<min) {
				min=t[i];
				indice=i;
			}
			
		}
		return indice;
	}

	public static int max_indice(int t[]){
		int max=t[0],indice=0;
		for (int i=0;i<t.length ;i++ ) {

			if (t[i]>max) {
				max=t[i];
				indice=i;
			}
			
		}
		return indice;
	}
}