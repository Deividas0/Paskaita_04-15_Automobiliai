public class NaftosKuroAutomobilis extends Automobilis{
    private double l100Km;

    public NaftosKuroAutomobilis(String marke, String modelis, int metai, int kaina, double l100Km) {
        super(marke, modelis, metai, kaina);
        this.l100Km = l100Km;
    }
    @Override
    public String toString(){
        return "Automobilio markė/modelis/metai/paros kaina/sąnaudos(L/100km): "+getMarke()+"/"+getModelis()+"/"+getMetai()+"/"+
                getKaina()+"/"+getL100Km();
    }

    public double getL100Km() {return l100Km;}

    public void setL100Km(double l100Km) {this.l100Km = l100Km;}
}
