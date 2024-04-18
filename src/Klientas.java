import java.util.HashMap;
import java.util.Scanner;

public class Klientas {
    HashMap<Automobilis, Integer> autoNuomosSarasas = new HashMap<Automobilis, Integer>();
    Nuoma n = new Nuoma();
    Scanner sc = new Scanner((System.in));

    private String vardas;
    private String pavarde;
    private int dabarNuomuojasi;
    private int priesTaiNuomotas;

    public String naujasKlientas(){
        new Klientas("","",0,0);
        return naujasKlientas();
    }
    public void pridetiKlientaYSarasa(String klientas){
        n.klientuSarasas.add(klientas);
    }
    public int nuomosSarasas(){
        System.out.println("Pasirinkite funkcija:");
        System.out.println("1. Sukurti nauja klientą.");
        switch(sc.nextInt()) {
            case 1:
                System.out.println("Įveskite naujo kliento informacija: ");
                System.out.println("1 - Vardas.  2 - Pavardė.  3 - 0.  4 - 0.");
                String klientas = naujasKlientas();sc.next();sc.next();sc.next();sc.next();
                System.out.println("Ar norite pridėti klienta į sąrašą?");
                System.out.println("1. Taip");
                pridetiKlientaYSarasa(klientas);
        }
        return 0;
    }



    public Klientas(String vardas, String pavarde, int dabarNuomuojasi, int priesTaiNuomotas) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.dabarNuomuojasi = dabarNuomuojasi;
        this.priesTaiNuomotas = priesTaiNuomotas;
    }
    public String getVardas() {return vardas;}
    public String getPavarde() {return pavarde;}
    public int getDabarNuomuojasi() {return dabarNuomuojasi;}
    public int getPriesTaiNuomotas() {return priesTaiNuomotas;}

    public void setVardas(String vardas) {this.vardas = vardas;}
    public void setPavarde(String pavarde) {this.pavarde = pavarde;}
    public void setDabarNuomuojasi(int dabarNuomuojasi) {this.dabarNuomuojasi = dabarNuomuojasi;}
    public void setPriesTaiNuomotas(int priesTaiNuomotas) {this.priesTaiNuomotas = priesTaiNuomotas;}
}
