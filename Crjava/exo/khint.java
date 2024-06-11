
import java.util.Random;
import java.util.Scanner;
public class khint{


	public static void initialise (int []tab,int n){
		Random R = new Random();
		for (int i=0;i<n;i++ ) {
			tab[i]=R.nextInt();
		}

	}
//question 2

	public  static int indicemax(int []tab, int pos){
		int verif = tab[pos] ;
		int indice =pos;

		for (int i=pos; i<tab.length ;i++ ) {
			if (verif<tab[i]) {
				verif=tab[i];
				indice=i;
			}
		}
		return indice;
	}

public static void afficher (int []tab){
		System.out.println("Tableau saisie");

		for (int i=0;i<tab.length;i++ ) {
			System.out.print(tab[i]+"\t");
		}

		System.out.println();
	}
		//question 4

	public static int Somme(int T[][]){
		int somme = 0;
		for (int i=0;i< T.length;i++ ) {
			for (int j=0;j<T.length ;j++ ) {
				somme += T[i][j];
			}
		}
		return somme;
	}


	public static int[][] SommeMatrice(int mat1[][],int mat2[][]){
		int newmat[][]= new int [mat1.length][mat1.length];

		for (int i=0;i< mat1.length;i++ ) {
			for (int j=0;j<mat2.length ;j++ ) {
				newmat[i][j]= mat1[i][j]+mat2[i][j];
			}
		}
		return newmat;
	}


	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Saisir la taille du tableau");
		int n=sc.nextInt();
		int tab[]=new int[n];

		initialise(tab,n);
		afficher(tab);

		int []tab2=tab;
		int indicemax,temp;
		for (int i=0;i<tab2.length ;i++ ) {
			indicemax=indicemax(tab2,i);
			temp=tab2[indicemax];
			tab2[indicemax]=tab2[i];
			tab[i]=temp;
		}

		// for (int i=0;i<tab2.length ;i++ ) {
		// 	for (int j=i;j<tab2.length ;j++ ) {
		// 			if (tab[i]<tab[j]) {
		// 				temp=tab2[j];
		// 				tab2[j]=tab2[i];
		// 				tab[i]=temp;
		// 			}
		// }
		// }

		afficher(tab2);

		
	}
}

