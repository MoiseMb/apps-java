package Voiture;
public class Voiture{
	private int  matricule;
	private String marque;
	private String model;
	private int puissance;
	private int nbrplace;
  //constructeur sans paramètre
  public Voiture(){}
 //constructeur avec paramètre
  public Voiture(int vmatricule,String vmarque,String vmodel,int vpuissance,int vnbre)
  {
  	matricule=vmatricule;
  	marque=vmarque;
  	model=vmodel;
  	puissance=vpuissance;
  	nbrplace=vnbre;
  }
 //methode get et set
  public void setmatricule(int vmatricule){matricule=vmatricule;}
  public int getmatricule(){return matricule;}
  public void setmarque(String vmarque){marque=vmarque;}
  public String getmarque(){return marque;}
  public void setmodel(String vmodel){model=vmodel;}
  public String getmodel(){return model;}
  public void setpuissance(int vpuissance){puissance=vpuissance;}
  public int getpuissance(){return puissance;}
  public void setnbre(int vnbre){nbrplace=vnbre;}
  public int getnbre(){return nbrplace;}

}