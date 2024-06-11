import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class equation2
{


	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Resolution de d'une equation sous la form e 'aX^2 + bX + c =0");

		double a,b,c;
		do{
			System.out.println("saisir la valeur de a :");
			a=sc.nextDouble();

		}while(a==0);

		System.out.println("saisir la valeur de b :");
			b=sc.nextDouble();

			System.out.println("saisir la valeur de c :");
			c=sc.nextDouble();




  		System.out.println("\n");
		

		NumberFormat formatter=new DecimalFormat("#.###");

			double delta=(b*b)-(4*(a*c));

			System.out.println("delta = "+delta+"\n");
			if (delta >0){

				double temp1,temp2;
				temp1=(-b-Math.sqrt(delta))/(2*a);
				temp2=(-b+Math.sqrt(delta))/(2*a);

				String x1=formatter.format (temp1),x2=formatter.format (temp2);

				System.out.println("solution de l'equation X1 = "+x1+" et X2 = "+x2);
			}else
				if (delta==0) {

					double temp0= (-b/(2*a));
					String x0=formatter.format (temp0);

					System.out.println("l'equation admet une solution unique X0 = " +x0);


				
			}else
				System.out.println(" delta est negatif donc l'equation n'admet pas de solution");
			
		


				sc.close();

		System.out.println("\n FIN du programme\n");

	} //fin main

	}  //fin class
