import java.util.Scanner;
import java.lang.Math;

public class equation3{


	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Resolution de d'une equation sous la form e 'aX^2 + bX + c =0");

		

		double a=Double.parseDouble(args[0]);
		double b=Double.parseDouble(args[1]);
		double c=Double.parseDouble(args[2]);

		if (a==0 && b==0) {

			System.out.println("\n");
			System.out.println(c+" = 0 n'est pas une equation Donc pas de solution");
			System.out.println("\n");
			System.out.println("\n FIN du programme\n");
			return;
			
		}

		if (a==0 ) {

			System.out.println("\n");
			System.out.println(" La valeur de a doit etre different de 0 .");
			System.out.println("\n");
			System.out.println("\n FIN du programme\n");
			return;
			
		}



  		System.out.println("\n");
		

		

			double delta=(b*b)-(4*(a*c));

			System.out.println("delta = "+delta+"\n");
			if (delta >0){

				double x1,x2;
				x1=(-b-Math.sqrt(delta))/(2*a);
				x2=(-b+Math.sqrt(delta))/(2*a);

				System.out.println("solution de l'equation X1 = "+x1+" et X2 = "+x2);
			}else
				if (delta==0) {

					double x0= (-b/(2*a));

					System.out.println("l'equation admet une solution unique X0 = " +x0);


				
			}else
				System.out.println(" delta est negatif donc l'equation n'admet pas de solution");
			
		




		System.out.println("\n FIN du programme\n");

	} //fin main

	}  //fin class
