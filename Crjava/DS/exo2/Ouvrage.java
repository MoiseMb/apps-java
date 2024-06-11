import java.util.Date;


public class Ouvrage{
	private String isbn;
	private String titre;
	private Date date_parution;
	private boolean  est_emprunter;

	public Ouvrage () {} //declaration constructeur sans parametre

	public Ouvrage(String visbn,String vtitre,Date vdate_parution,boolean Vest_emprunter){
		isbn=visbn;
		titre=vtitre;
		date_parution=vdate_parution;
		est_emprunter=Vest_emprunter;

	}


	public void setisbn( String visbn)
	{isbn=visbn;}

	public void  settitre(String vtitre)
	{titre=vtitre;}

	public void  setdate_parution(Date vdate_parution)
	{date_parution=vdate_parution;}

	public void setemprunt(boolean Vest_emprunter){est_emprunter=Vest_emprunter;}

	


	public boolean getemprunt(){return est_emprunter;}

	public String getisbn(){
		return isbn;
	}
	public String gettitre(){
		return titre;
	}
	public Date getdate_parution(){
		return date_parution;
	}
	
public void affichageOuvrage(){
	System.out.println("+----------------------------------------+");
	System.out.println("|                 Ouvrage                |");
	System.out.println("+----------------------------------------+");
	System.out.println("| ISBN : "+isbn+"                        |");
	System.out.println("| date_parution : "+date_parution+"      |");
	System.out.println("| titre : "+titre+"                      |");
	System.out.println("| emprunter : "+est_emprunter+"          |");
	System.out.println("+----------------------------------------+");
	System.out.println("");
}

}