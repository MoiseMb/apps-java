public class Abonnee{
	private int numero;
	private String nom;
	private String prenom;
	private Enumsexe sexe;
	private int nombre_emprunt  =3;

	public Abonnee(){}

	public Abonnee(int Vnumero, String Vprenom,String Vnom,Enumsexe Vsexe){
		numero =Vnumero;
		nom=Vnom;
		prenom=Vprenom;
		sexe=Vsexe;
	}

	public void setnumero(int Vnumero){numero=Vnumero;}
	public void setnom(String  Vnom){nom=Vnom;}
	public void setprenom(String  Vprenom){prenom=Vprenom;}
	public void setnombre_emprunt(){nombre_emprunt--;}
	public void setsexe(Enumsexe vsexe){sexe=Vsexe;}

	public int getnumero(){return numero;}
	public String getnom(){return nom;}
	public String prenom(){return prenom;}
	public int getnombre_emprunt(){return nombre_emprunt;}
	public Enumsexe getsexe(){return sexe;}

public void affichageAbonnee(){
	System.out.println("+----------------------------------------+");
	System.out.println("|                 Abonnee                |");
	System.out.println("+----------------------------------------+");
	System.out.println("| numero: "+numero+"                     |");
	System.out.println("| Prenom : "+prenom+"                    |");
	System.out.println("| nom : "+nom+"                          |");
	System.out.println("| sexe : "+sexe+"                        |");
	System.out.println("| reste emprunt : "+nombre_emprunt+"     |");
	System.out.println("+----------------------------------------+");
	System.out.println("");
}

}