import java.util.Scanner;
import java.util.Random;

public class exo1_5_b{

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		Random rand= new Random();

		System.out.println("Veuillez saisir la taille du tableau : ");
		int N=sc.nextInt();
		int tab2[]=new int[N];


		for (int i=0;i<N ;i++ ) {
			
			tab2[i]=rand.nextInt(19);
			
		}


		System.out.println("Avant trie");
		affichage(tab2);

		trie(tab2);
		System.out.println();

		System.out.println("Apres  trie");
		affichage(tab2);


	}

	public static  void affichage (int t[]){


		for (int i=0;i<t.length ;i++ ) {

			System.out.print(t[i] +"\t");
			
		}

		System.out.println();
	}
	public static int[] trie(int t[]){
	int tmp;

		for (int i=0;i<t.length-1 ;i++ ) {
			for (int j=i+1;j<t.length ; j++) {
				if (t[i]>t[j]) {

					tmp=t[i];
					t[i]=t[j];
					t[j]=tmp;
					
				}
			}
		}
		return t;
	}
}