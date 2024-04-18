public class Automobilis {
    private String marke;
    private String modelis;
    private int metai;
    private int kaina;
    private int rida;

    public Automobilis(String marke, String modelis, int metai, int kaina) {
        this.marke = marke;
        this.modelis = modelis;
        this.metai = metai;
        this.kaina = kaina;
    }

    public String getMarke() {return marke;}
    public String getModelis() {return modelis;}
    public int getMetai() {return metai;}
    public int getKaina() {return kaina;}
    public int getRida() {return rida;}

    public void setMarke(String marke) {this.marke = marke;}
    public void setModelis(String modelis) {this.modelis = modelis;}
    public void setMetai(int metai) {this.metai = metai;}
    public void setKaina(int kaina) {this.kaina = kaina;}
    public void setRida(int rida) {this.rida = rida;}
}
