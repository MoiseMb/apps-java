
public class voiture2{
public static void main(String[] args) {
	

	//declaration sans parametre
	voiture v1;
	v1 = new voiture ();

	v1.setMarque("Ferrari");
	v1.setModele("SP48 unica");
	v1.setPuissance(710.4);
	v1.setNombre_place(2);
	v1.setMatriculations("AA -197 - AG");

	System.out.println("\n+-------------------------------------------+\n");

	System.out.println(" \tinformation Voiture 1 ");

	System.out.println("Marque : "+v1.getMarque());
	System.out.println("Modele : "+v1.getModele());
	System.out.println("Puissance : "+v1.getPuissance());
	System.out.println("Nombre de place  : "+v1.getNombre_place());
	System.out.println("Matriculations : "+v1.getMatriculations());
	System.out.println("\n+-------------------------------------------+\n");

    //declaration avec parametre

	voiture v2= new voiture("Tesla","S plaid",26.4, 5 ,"AA - 1964  - BD" );


	System.out.println(" \tinformation Voiture 2 ");

	System.out.println("Marque : "+v2.getMarque());
	System.out.println("Modele : "+v2.getModele());
	System.out.println("Puissance : "+v2.getPuissance());
	System.out.println("Nombre de place  : "+v2.getNombre_place());
	System.out.println("Matriculations : "+v2.getMatriculations());
	System.out.println("+-------------------------------------------+\n");








}
}