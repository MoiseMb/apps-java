import java.util.Scanner;
import java.util.Random;



public class exo1_7{

public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Random rand= new Random();

		System.out.println("Veuillez saisir la taille du tableau 1 : ");
		int N=sc.nextInt();
		int tab[]=new int[N];

		System.out.println("Veuillez saisir la taille du tableau 2 : ");
		int N2=sc.nextInt();
		int tab2[]=new int[N2];

		for (int i=0;i<N ;i++ ) {
			
			tab[i]=rand.nextInt(19);
			
		}

		for (int i=0;i<N2 ;i++ ) {
			
			tab2[i]=rand.nextInt(40);
			
		}


		System.out.println("Tableau 1 ");
		affichage(tab);
		System.out.println();

		System.out.println("Tableau 2 ");
		affichage(tab2);
		System.out.println();

		System.out.println("Tableau fusionner ");
		int tab3[]=fusion(tab,tab2);

		affichage(tab3);


	
}







	public static int[] fusion(int[] T1, int [] T2){

	int t []= new int [T1.length+T2.length];
	int i,j;

	for ( i=0;i<T1.length ;i++ ) {

		t[i]=T1[i];
		
	}

	

	for ( j=0;j<T2.length ;j++ ) {
		
		t[i+j]=T2[j];
		
	}
	return t;
}

public static  void affichage (int t[]){


		for (int i=0;i<t.length ;i++ ) {

			System.out.print(t[i] +"\t");
			
		}

		System.out.println();
	}

}