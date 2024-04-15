public class ElektrinisAutomobilis extends Automobilis{
    private int baterijosKrovimoLaikas;

    public ElektrinisAutomobilis(String marke, String modelis, int metai, int kaina, int baterijosKrovimoLaikas) {
        super(marke, modelis, metai, kaina);
        this.baterijosKrovimoLaikas = baterijosKrovimoLaikas;
    }
    @Override
    public String toString(){
        return "Automobilio markė/modelis/metai/paros kaina/baterijos įkrovimo laikas(min): "+getMarke()+"/"+getModelis()+"/"+getMetai()+"/"+
                getKaina()+"/"+baterijosKrovimoLaikas+". ";
    }

    public int getBaterijosKrovimoLaikas() {
        return baterijosKrovimoLaikas;}

    public void setBaterijosKrovimoLaikas(int baterijosKrovimoLaikas) {
        this.baterijosKrovimoLaikas = baterijosKrovimoLaikas;}
}
