public class Camion extends Vehicule{
    private static int nbrCam = 0;
    private static final int nbMaxC = 10;

    public Camion(int anneeModel, int prix, Carburant carburant) {
        setMat(getClass()+":"+ ++nbrCam);
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

    }
}
