public public class Car extends Voiture{
    private int puissance;
    private int puissancemoteur;
    private Typemoteur typemoteur;
    
    public enum Typemoteur {
      DIESEL,
      GASOIL
    }
    
    public Car(String marque, String model, int puissance, int puissancemoteur, Typemoteur typemoteur) {
      super(marque, model);
      this.puissance = puissance;
      this.puissancemoteur = puissancemoteur;
      this.typemoteur = typemoteur;
    }
    
    public int getPuissance() {
      return this.puissance;
    }
    
    public void setPuissance(int power) {
      this.power = puissance;
    }
    
    public int getPuissancemoteur() {
      return this.puissancemoteur;
    }
    
    public void setPuissancemoteur(int puissancemoteur) {
      this.puissancemoteur = puissancemoteur;
    }
    
    public FuelType getTypemoteur() {
      return this.typemoteur;
    }
    
    public void Typemoteur(FuelType typemoteur) {
      this.typemoteur = typemoteur;
    }  
}


