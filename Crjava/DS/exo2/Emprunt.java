import java.util.Date;


public class Emprunt {

	private Date date_emprunt ;
	private Date date_de_retour;
	private Ouvrage Ov;
	private Abonnee Ab;

	public Emprunt(){}

	public void setdate_emprunt (Date vdate1){date_emprunt=vdate1;}
	public void setdate_de_retour (Date vdate2){date_de_retour=vdate2;}
	public void setOuvrage(Ouvrage vOv){Ov=vOv;}
	public void setAbonnee(Abonnee vAb){Ab=vAb;}

	

}