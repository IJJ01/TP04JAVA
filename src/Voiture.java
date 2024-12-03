public class Voiture extends Vehicule implements Decapotable {
    private static int nbrVoit = 0;
    private static final int nbMaxV=20;
    private Boolean toitReplie;

    public Voiture(int anneeModel, int prix, Carburant carburant) {
        setMat(getClass()+":"+ ++nbrVoit);
        setAnneeModele(anneeModel);
        setPrix(prix);
        setCarburant(carburant);
    }

    @Override
    public void replieLeToit() {
        toitReplie = !toitReplie;
        System.out.println("Le toit est maintenant " + (toitReplie ? "replié" : "déplié"));
    }

    @Override
    public String toString() {
        return super.toString() + ", Toit replié: " + (toitReplie ? "Oui" : "Non");
    }
}
