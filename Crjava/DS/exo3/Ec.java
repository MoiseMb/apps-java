
public class Ec {
    private String code;
    private int coef;
    private String nom;
    private int h_cm;
    private int h_tp;
    private int h_td;
    public Ec(){}
    public Ec(String vcode , int vcoef, String vnom,int vh_cm,int vh_tp,int vh_td){
        code=vcode;
        coef=vcoef;
        nom=vnom;
        vh_td=h_td;
         vh_tp=h_tp;
          vh_cm=h_cm;

    }
    public String getCode(){return code ;}
    public int getCoef(){return coef ;}
    public int geth_cm(){return h_cm ;}
    public int geth_tp(){return h_tp ;}
    public int geth_td(){return h_td ;}
    public String getnom(){return nom;}
    public void setCode(String Vcode){code=Vcode ;}
    public void setCoef(int Vcoef){coef=Vcoef;}
    public void setNom(String Vnom){nom =Vnom;}
    public void seth_cm(int Vh_cm){h_cm=Vh_cm;}
    public void seth_td(int Vh_td){h_td=Vh_td;}
    public void seth_tp(int Vh_tp){h_tp=Vh_tp;}
}
