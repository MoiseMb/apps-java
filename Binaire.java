import java.util.Scanner;

public class Binaire{

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Conversion entier en binaire  ");
		System.out.println("saisir un nombre :  ");

		int nb=sc.nextInt();

		int compteur=1,div=2,d=nb;

		while(d!=1){
			d=d/div;
			
			compteur++;
		}



		int tab[]=new  int [compteur];
		int i=0,r=compteur-1;

		while(nb!=1){
			tab[i]=(nb%div);

			
			nb=nb/div;
			
			 i++;
			
			
		}
		tab[compteur-1]=1;
		int temp[]=new  int [compteur];

		System.out.print("\n conversion binaire = ");
		for (int j=0;j<compteur ;j++ ) {
			temp[r]=tab[j];
			r--;
		}
		for (int j=0;j<compteur ;j++ ) {
			System.out.print(temp[j]);
		}
		
		System.out.println("\n");
		
	}
}