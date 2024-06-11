import java.util.Scanner;

public class test{

	public static Etudiant initiliseEtudiant(){
		Scanner sc=new Scanner(System.in);
		Etudiant E=new Etudiant();
		System.out.println("Saisir le l'ine");
		E.setine(sc.next());
		System.out.println("Saisir le prenom");
		E.setprenom(sc.next());

		return E;
	}

	public static void saisiEtudiant(Etudiant E,Etudiant[] tabEtudiant,int j){
		
		E=initiliseEtudiant();
		tabEtudiant[j]=E;
	}
	public static void afficherEtudiant(Etudiant E){
			System.out.println("INE : "+E.getine());
		System.out.println("prenom : "+E.getprenom());
		System.out.println();
	}

	public static void afficherTEtudiant(Etudiant Tab[],int j){
		afficherEtudiant(Tab[j]);
	}


	public static void main(String[] args) {
		
		// Etudiant M=new Etudiant();
		// Etudiant[] tabetu=new Etudiant[2];
		// saisiEtudiant(M,tabetu,1);
		// System.out.println("INE : "+tabetu[1].getine());
		// System.out.println("prenom : "+tabetu[1].getprenom());

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Saisir le nombre d'Etudiant");
		int n=sc.nextInt();

		Etudiant listeEtudiant[]=new Etudiant[n];

		for (int i=0;i<n ;i++ ) {

			Etudiant M=new Etudiant();
			saisiEtudiant(M,listeEtudiant,i);

			
		}
		for (int i=0;i<n ;i++ ) {

			System.out.println("Etudiant N"+(i+1));
			System.out.println();
			afficherTEtudiant(listeEtudiant,i);
			
		}



	}
}