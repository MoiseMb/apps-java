import enumfolder.*;
import java.util.Scanner;

public class Principale {


    public static void InitialiseEc (Ec e,int r ){
          Scanner sc = new Scanner(System.in) ;
        System.out.println("donner le code de l'ec "+(r+1) );
        String code = sc.next();
        e.setCode(code);
        System.out.println("Donner le coef de l'ec "+(r+1));
        int coef = sc.nextInt();
        e.setCoef(coef);
        System.out.println("donner le nom de l'ec "+(r+1) );
        String nom = sc.next();
        e.setNom(nom);
        System.out.println("Saisir le nombre heure CM:");
        e.seth_cm(sc.nextInt());
        System.out.println("Saisir le nombre heure TP:");
        e.seth_tp(sc.nextInt());
        System.out.println("Saisir le nombre heure TD:");
        e.seth_td(sc.nextInt());
        
        
    }
    public static void InitialiseuE (Ue a ){

        try(  Scanner sc = new Scanner(System.in)) {
        System.out.println("donner le code DE L'UE");
        String code = sc.next();
        a.setCode(code);
        System.out.println("Donner le nbre DE CREDIT DE L'UE");
        int credit = sc.nextInt();
        a.setnbre_credit(credit);
        System.out.println("Saisir le type de Ue (Fondamentale/Transversale)");
        String stype=sc.next();
        enumtype type=enumtype.valueOf(stype.toUpperCase());
        a.settype(type);
        System.out.println("Combien y'a t'il de Ec dans cette Ue ?");
                int nbre_eu=sc.nextInt();
                Ec []Tableau_Ec = new Ec[nbre_eu];
                for (int i = 0; i < nbre_eu; i++) {
                    Tableau_Ec[i]=new Ec();
                    InitialiseEc(Tableau_Ec[i],i);
                }
                a.setListe_Ec(Tableau_Ec);
            
        
        }
    }

    public static void affichage(Ue a){
        System.out.println("+-----------------------------+");
        System.out.println("|       INFORMATIONS UE       |");
        System.out.println("+-----------------------------+");
        System.out.println("| Code UE      : " +a.getCode());
        System.out.println("| credit UE    : " +a.getNbr_credit());
        System.out.println("| Type UE      : " +a.gettype());

        Ec ntab[]=a.getListe_Ec();
        System.out.println("| nombre de Ec : "+ntab.length);
        System.out.println("+-----------------------------+");
            System.out.println();
            System.out.println();
            System.out.println("+------------------------------+");

        for (int i=0;i<ntab.length ;i++ ) {

            System.out.println("| Code  Ec "+(i+1)+" : "+ntab[i].getCode());
            System.out.println("| coef  Ec "+(i+1)+" : "+ntab[i].getCoef());
            System.out.println("| nom   Ec "+(i+1)+" : "+ntab[i].getnom());
            System.out.println("| heure cm "+(i+1)+" : "+ntab[i].geth_cm());
            System.out.println("| heure Tp "+(i+1)+" : "+ntab[i].geth_tp());
            System.out.println("| heure Td "+(i+1)+" : "+ntab[i].geth_td());
            System.out.println("+------------------------------+");
            
        }
        System.out.println();
        System.out.println();
        System.out.println("+-----------------------------+");
        System.out.println("|    BY BISKO THE  GOAT   !!! |");
        System.out.println("+-----------------------------+");

        System.out.println();
        System.out.println();

    }
  
        
    
    public static void main(String[] args) {
 
            


                Ue essai = new Ue();
                InitialiseuE(essai);
                 System.out.println();
                affichage(essai);
        

            }





            
        

            
        
        

    }

    


