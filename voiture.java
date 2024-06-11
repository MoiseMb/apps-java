public class voiture{

private String Marque;
private String Modele;
private double Puissance;
private int Nombre_place;
private String Matriculations;

public voiture () {}  //definition cosntrcuteur sans parametre .


//defintion constructeur avec parametre .

public voiture (String vMarque ,String vModele , double vPuissance , int vNombre_place , String  vMatriculations ){

	Marque=vMarque; 
	Modele=vModele; 
	Puissance=vPuissance;
	Nombre_place=vNombre_place;
	Matriculations=vMatriculations;
}


public String getMarque (){ return Marque;}
public String getModele (){ return Modele;}
public double getPuissance (){ return Puissance;}
public int  getNombre_place (){ return Nombre_place;}           //definition de la methode get.
public String getMatriculations (){ return Matriculations;}

public void setMarque(String vMarque)
{ Marque=vMarque; }

public void setModele(String vModele)
{ Modele=vModele; }

public void setPuissance(double vPuissance)
{ Puissance=vPuissance; }
	public void setNombre_place(int  vNombre_place)           //definition de la methode set.
{ Nombre_place=vNombre_place; }

public void setMatriculations(String vMatriculations)
{ Matriculations=vMatriculations; }


}