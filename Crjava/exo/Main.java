import Voiture.Voiture;
public class Main{
	public static void main(String[] args)
	{
	 //instanciation à l'aide d'un constructeur sans paramètre
      Voiture v1=new Voiture();
      v1.setmatricule(1);
      v1.setmarque("BMWM");
      v1.setmodel("1980");
      v1.setpuissance(22);
      v1.setnbre(5);
      System.out.println("*------------------------------------------*");
      System.out.println("|              voiture v1                  |");
      System.out.println("*------------------------------------------*");
      System.out.println("|matricule:"+v1.getmatricule());
      System.out.println("|marque:"+v1.getmarque());
      System.out.println("|model:"+v1.getmodel());
      System.out.println("|puissance:"+v1.getpuissance()+"km/s");
      System.out.println("|nombre de place:"+v1.getnbre());
      System.out.println("*------------------------------------------*");
        //instanciation à l'aide d'un constructeur avec paramètre;
      Voiture v2=new Voiture(2,"Mercedes","1980",25,5);

      System.out.println("*------------------------------------------*");
      System.out.println("|              voiture v2                   |");
      System.out.println("*-------------------------------------------*");
      System.out.println("|matricule:"+v2.getmatricule());
      System.out.println("|marque:"+v2.getmarque());
      System.out.println("|model:"+v2.getmodel());
      System.out.println("|puissance:"+v2.getpuissance()+"km/s");
      System.out.println("|nombre de place:"+v2.getnbre());
      System.out.println("*-------------------------------------------*");
	}
}