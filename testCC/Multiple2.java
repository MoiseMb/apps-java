import java.util.Scanner;

public class Multiple2{

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in); // initialisation sc

		int a; //declaration de la variable "a" 
		string prenom;

		do {
			System.out.println("Veuillez saisir un nombre");

			a=sc.nextInt(); // Pour affecter la valeur saisie au clavier
							//   dans la variable "a" .

			if(a<1)System.out.println("\nErreur !!le nombre doit etre strictement positif \n");
		}
		while(a<1); //verifier si "a" est strictement superieur  a 0
		
		int i,j,m;
			for (i=1;i<=a ;i++ ) {
				System.out.println("table "+i+" : ");
				for (j=1;j<=12 ;j++ ) {
					System.out.println(i+" x "+j+" = "+i*j);

				}
				System.out.println(); 

			}


	}
}