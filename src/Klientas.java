import java.util.HashMap;
import java.util.Scanner;


public class Klientas {
    HashMap<String, Integer> autoNuomosSarasas = new HashMap<String, Integer>();
    Scanner sc = new Scanner((System.in));
    Nuoma n = new Nuoma();

    private String vardas;
    private String pavarde;
    private Automobilis dabarNuomuojasi;
    private Automobilis priesTaiNuomotas;

    public Klientas(HashMap<String, Integer> autoNuomosSarasas) {
        this.autoNuomosSarasas = autoNuomosSarasas;
    }

    public Klientas() {

    }

    public HashMap<String, Integer> getAutoNuomosSarasas() {     ////////////////////////////
        return autoNuomosSarasas;
    }

    public void klientasSuAutoYSarasa(Klientas klientas, Integer auto){
        autoNuomosSarasas.put(vardas, auto);
    }

    public void priskirtiDabarNuomuojamas(Automobilis auto){
        dabarNuomuojasi = auto;
    }
    public void priskirtiPriesTaiNuomuotas(Automobilis auto){
        priesTaiNuomotas = auto;
    }

    public Klientas(String vardas, String pavarde) {
        this.vardas = vardas;
        this.pavarde = pavarde;
    }

    public String getVardas() {
        return vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public Automobilis getDabarNuomuojasi() {
        return dabarNuomuojasi;
    }

    public Automobilis getPriesTaiNuomotas() {
        return priesTaiNuomotas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public void setDabarNuomuojasi(Automobilis dabarNuomuojasi) {
        this.dabarNuomuojasi = dabarNuomuojasi;
    }

    public void setPriesTaiNuomotas(Automobilis priesTaiNuomotas) {
        this.priesTaiNuomotas = priesTaiNuomotas;
    }

    @Override
    public String toString() {
        return getVardas() + " " + getPavarde();
    }
}
