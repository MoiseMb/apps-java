public abstract class Vehicule {
    private String marque;
    private String modele;

  public Vehicle(String marque, String modele) {
    this.marque = marque;
    this.modele = modele;
  }

    public String getMarque() {
        return this.marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return this.modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

}
