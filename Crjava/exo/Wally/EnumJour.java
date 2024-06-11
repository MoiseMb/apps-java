public enum EnumJour {
    LUNDI(8), MARDI(8), MERCREDI(4), JEUDI(8), VENDREDI(8), SAMEDI(4), DIMANCHE(0);

    private int heure;

    private EnumJour(int heure) {
        this.heure = heure;
    }

    public int getHeure() {
        return heure;
    }
}
