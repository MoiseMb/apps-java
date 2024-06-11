 class Etudiant{

	private String nom;

	//Constructeur  pour nom
	public  Etudiant(String vnom){nom=vnom;}

	//une public sans parametre travail
	public void travailler() {System.out.println(nom+" se met au travail");} 

	public void Sereposer() {System.out.println(nom+" se repose");} 
}

public class TestEtudiant{

	public static void main(String[] args) {


		Etudiant E1=new Etudiant(args[0]);

		E1.travailler();
		E1.Sereposer();
	}
}