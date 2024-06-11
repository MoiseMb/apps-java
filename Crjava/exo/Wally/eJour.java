import java.util.Scanner;

public class eJour {        
    public static void main  (String[] args){
        System.out.println("Veuillez nous donner le jour en question : ");
        Scanner sc = new Scanner(System.in);
        String jour = sc.next();
        //String njour = jour.toUpperCase();
        jour = jour.toUpperCase();
        try 
        {
            
            EnumJour boubou = estInvalide(jour);
        }catch (JourInvalideException e){
            System.out.print(e.getMessage());
        }

    }
    public static EnumJour estInvalide(String vjour) throws JourInvalideException {
        
        int i=0;
        String tabjour[] = new String[7];
        for (EnumJour j : EnumJour.values()) 
        {
            tabjour[i]=String.valueOf(j);
            i++;

  
        }
        
        for (int z=0;z<7;z++)
        {
            if (vjour.equals(tabjour[z]))
            {
                wally = true;
            }
            else
            {
                wally = false;
            }
            
        }
        if (!wally)
        {
            throw new JourInvalideException();
        }
        else
        {
            return EnumJour.valueOf(vjour);
        }
    }
}
// import java.util.Scanner;

// public enum EnumJour {
// LUNDI(8), MARDI(8), MERCREDI(4), JEUDI(8), VENDREDI(8), SAMEDI(4),
// DIMANCHE(0);

// }

// private int heure;

// EnumJour(int heure) {
// this.heure = heure;
// }

// public int getHeure() {
// return heure;
// }

// public class eJour {
// public static void main (String[] args)
// {
// System.out.println("Veuillez nous donner le jour en question");
// Scanner sc = new Scanner (System.in);
// String jour = sc.nextLine();
// String njour= jour.toUpperCase();

// EnumJour day = EnumJour.valueOf(njour);
// for (EnumJour j : EnumJour.values())
// {
// if (day==j)
// {
// System.out.println("Le nombre d'heure de "+day+" est "+day.getHeure());
// }
// }

// }
// }