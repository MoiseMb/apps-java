import enumfolder.*;
public class Ue {



    private String code;
    private int nbr_credit;
    private Ec []liste_Ec ;
    private enumtype type;

    public Ue(){};

    public Ue(String Vcode,int Vnbr_credit , Ec Vliste_Ec[],enumtype vtype){
                code=Vcode;
                nbr_credit=Vnbr_credit;
                liste_Ec=Vliste_Ec;
                type=vtype;
    }


    public String getCode(){return code;}
    public int getNbr_credit(){return nbr_credit;}
    public Ec[] getListe_Ec(){return liste_Ec;}
    public enumtype gettype(){return type;}


    public void setCode(String Vcode){code=Vcode;}
    public void setnbre_credit(int Vnbr_credit){nbr_credit=Vnbr_credit;}
    public void setListe_Ec(Ec Vliste_Ec[]){liste_Ec=Vliste_Ec;}
    public void settype(enumtype vtype){type=vtype;}
}
