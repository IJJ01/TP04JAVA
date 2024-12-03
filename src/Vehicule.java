
public abstract class Vehicule implements Motorisation{
    private String mat;
    private int anneeModele;
    private int prix;
    private Carburant carburant;
    public Carburant getCarburant() {
        return carburant;
    }

    public void setCarburant(Carburant carburant) {
        this.carburant = carburant;
    }

    public int getAnneeModele() {
        return anneeModele;
    }

    public void setAnneeModele(int anneeModele) {
        this.anneeModele = anneeModele;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    @Override
    public Carburant typeCarburant() {
        return getCarburant();
    }

    @Override
    public void periodiciteVidange() {
        int pv = 0;
        switch (getCarburant()){
            case ESSENCE -> pv = 10;
            case GAZ -> pv = 12;
            case DIESEL -> pv = 18;
        }
        System.out.println("Périodicité de vidange: " + pv + " mois");
    }


}
