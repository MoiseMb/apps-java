import java.util.Scanner;


public class test{

	public enum enumsituation{
		marie,divorcer,celibataire,veuf;
	}

	public static void affichenum(){

		for (enumsituation x:enumsituation.values() ) {
			System.out.println(x.ordinal()+"-"+x);
			
		}
	}

	public static void main(String[] args) {

		System.out.println("Les situation :");
		affichenum();

		Scanner sc=new Scanner(System.in);

		System.out.println("Veuillez nous indiquer une situation");
		String sit=sc.next();

		enumsituation j=enumsituation.valueOf(sit);

		switch(j){

		case marie: 
			System.out.println("Felicitation");
			break;

		case divorcer: 
			System.out.println("du courage");
			break;
		case veuf: 
			System.out.println("mais condoléances ");
			break;
		default:
				System.out.println("Marie toi c'est mieux ");
			break;
		}

		System.out.println("");


	
	}
}