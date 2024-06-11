import java.util.Scanner;

public class jour {

private static String verifiJour(String j) throws jourexception{
	boolean vrai=false;
	String tr;
	for ( enumjour jour :enumjour.values()) {
		tr=String.valueOf(jour);
		if (tr.equals(j)) {
			vrai=true;
			break;
		}
		
	}
	
	if (vrai==true) {
		enumjour jr=enumjour.valueOf(j);
		return jr.getheure();
		
	}
		throw new jourexception("\n\nLa chaine saisir ne correspond a aucun jour de la semaine\n\nFIN PROGRAME !!!\n\n");
	
	
}

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);

		System.out.println("Saisir un jour de la semaine on vous indique le nombre de jour de travail");
		String jr=sc.next();
		jr=jr.toUpperCase();
		try{
		String 	b=verifiJour(jr);
		System.out.println("JOUR  : " +jr);
		System.out.println("HEURE : " +b);
		}catch (jourexception e){
			System.out.println(e.getMessage());
		
		}


		
	}
}