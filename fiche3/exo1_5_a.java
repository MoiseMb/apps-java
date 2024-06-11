import java.util.Scanner;
import java.util.Random;

public class exo1_5_a{

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		Random rand= new Random();

		System.out.println("Veuillez saisir la taille du tableau : ");
		int N=sc.nextInt();
		int tab2[]=new int[N];


		for (int i=0;i<N ;i++ ) {
			
			tab2[i]=rand.nextInt(19);
			
		}

		int[] array = {3,2,1,4,5};


		System.out.println("Avant trie");
		affichage(array);
		selection(array);



	
		System.out.println();

		System.out.println("Apres  trie");
		affichage(array);


	}

	public static  void affichage (int t[]){


		for (int i=0;i<t.length ;i++ ) {

			System.out.print(t[i] +"\t");
			
		}

		System.out.println();
	}

	public static int min_indice2(int t[]){
		int min=t[0],indice=0;
		for (int i=0;i<t.length ;i++ ) {

			if (t[i]<min) {
				min=t[i];
				indice=i;
			}
			
		}
		return indice;
	}


	public static int min_indice2(int t[]){
		int min=t[0],indice=0;
		for (int i=0;i<t.length ;i++ ) {

			if (t[i]<min) {
				min=t[i];
				indice=i;
			}
			
		}
		return indice;
	}

	public static void selectionSort(int[] tab) {
    for (int i = 0; i < tab.length; i++) {
        int minIndex = min_indice2(tab,i);
        int temp = tab[i];
        tab[i] = tab[minIndex];
        tab[minIndex] = temp;
    }
}

}