public class Autocar extends Vehicule{
    public static int nbrAutoCar = 0;
    public static final int nbMaxAutoC = 5;

    public Autocar(int anneeModel, int prix, Carburant carburant){
        setMat(getClass()+":"+ ++nbrAutoCar);
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
