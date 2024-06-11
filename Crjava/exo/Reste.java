import java.util.Scanner;
public class Reste{
public static void main(String[] args)
{
  int dividende,diviseur,reste;
  Scanner scan=new Scanner(System.in);
  System.out.println("saisir le dividende");
  dividende=scan.nextInt();
  System.out.println("saisir le diviseur");
  diviseur=scan.nextInt();
  reste=dividende;
 while(reste>=diviseur)
 reste=reste-diviseur;
System.out.println("le reste de la division de "+dividende+" par "+diviseur+" est: "+reste);

}
}