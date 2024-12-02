public class Voiture extends Vehicule{
    private static int nbrVoit = 0;
    private static final int nbMaxV=20;

    public Voiture(int anneeModel, int prix, Carburant carburant) {
        setMat(getClass()+":"+ ++nbrVoit);
        setAnneeModele(anneeModel);
        setPrix(prix);
        setCarburant(carburant);
    }

    @Override
    public Carburant typeCarburant() {
        return getCarburant();
    }

    @Override
    public void periodiciteVidange() {
        int pv;
        switch (getCarburant()){
            case ESSENCE -> pv = 10; break;
            case GAZ -> pv = 12; break;
            case DIESEL -> pv = 18; break;
        }
    }
}
