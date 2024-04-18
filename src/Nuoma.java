import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nuoma {
    List<Automobilis> automobiliuSarasas = new ArrayList<>();
    List<String> klientuSarasas = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);
    AutomobiliuDuomenuModifikatorius ADM = new AutomobiliuDuomenuModifikatorius();

    private int a;


    public void pridetiYSarasa(Automobilis auto) {
        automobiliuSarasas.add(auto);
    }

    public void isimtiIsSaraso(Automobilis auto) {
        automobiliuSarasas.remove(auto);
    }

    public int nuomosKaina() {
        int x = 1;
        for (Automobilis a : automobiliuSarasas) {
            System.out.println(x + ". " + a);
            x++;
        }
        System.out.println("Pasirinkite automobilį: ");
        switch (sc.nextInt()) {
            case 1:
                System.out.println("Jūs pasirinkote: " + automobiliuSarasas.getFirst());
                System.out.println("Kiek dienų norėsite naudoti automobilį?");
                a = sc.nextInt();
                System.out.println("Paros kaina: 100Eur. " + "Pasirinkote " + a + " dienų kiekį. " + "Bendra nuomos suma bus: " + (a * automobiliuSarasas.get(0).getKaina()) + "Eur.");
                break;
            case 2:
                System.out.println("Jūs pasirinkote: " + automobiliuSarasas.get(1));
                System.out.println("Kiek dienų norėsite naudoti automobilį?");
                a = sc.nextInt();
                System.out.println("Paros kaina: 75Eur. " + "Pasirinkote " + a + " dienų kiekį. " + "Bendra nuomos suma bus: " + (a * automobiliuSarasas.get(1).getKaina()) + "Eur.");
                break;
            case 3:
                System.out.println("Jūs pasirinkote: " + automobiliuSarasas.get(2));
                System.out.println("Kiek dienų norėsite naudoti automobilį?");
                a = sc.nextInt();
                System.out.println("Paros kaina: 50Eur. " + "Pasirinkote " + a + " dienų kiekį. " + "Bendra nuomos suma bus: " + (a * automobiliuSarasas.get(2).getKaina()) + "Eur.");
                break;
            case 4:
                System.out.println("Jūs pasirinkote: " + automobiliuSarasas.get(3));
                System.out.println("Kiek dienų norėsite naudoti automobilį?");
                a = sc.nextInt();
                System.out.println("Paros kaina: 150Eur. " + "Pasirinkote " + a + " dienų kiekį. " + "Bendra nuomos suma bus: " + (a * automobiliuSarasas.get(3).getKaina()) + "Eur.");
                break;
            case 5:
                System.out.println("Jūs pasirinkote: " + automobiliuSarasas.get(4));
                System.out.println("Kiek dienų norėsite naudoti automobilį?");
                a = sc.nextInt();
                System.out.println("Paros kaina: 125Eur. " + "Pasirinkote " + a + " dienų kiekį. " + "Bendra nuomos suma bus: " + (a * automobiliuSarasas.get(4).getKaina()) + "Eur.");
                break;
            case 6:
                System.out.println("Jūs pasirinkote: " + automobiliuSarasas.get(5));
                System.out.println("Kiek dienų norėsite naudoti automobilį?");
                a = sc.nextInt();
                System.out.println("Paros kaina: 100Eur. " + "Pasirinkote " + a + " dienų kiekį. " + "Bendra nuomos suma bus: " + (a * automobiliuSarasas.get(5).getKaina()) + "Eur.");
                break;
            default:
                System.out.println("Ivyko klaida bandykite dar karta.");
                nuomosKaina();
        }
        return 0;
    }

    public void parametruModifikavimas() {
        System.out.println("Kokį veiksmą norite atlikti? 1 - Pakeisti kuro sąnaudas. 2 - Koreguoti įkrovimo laiką. ");
        switch (sc.nextInt()) {
            case 1:
                int x = 1;
                for (Automobilis a : automobiliuSarasas) {
                    if (a instanceof NaftosKuroAutomobilis) {
                        System.out.println(x + ". " + a);
                    }
                    x++;
                }
                System.out.println("Pasirinkite norima varianta: ");
                switch (sc.nextInt()) {
                    case 1:

                        System.out.println("Pasirinkote " + automobiliuSarasas.get(0) + " su " + ((NaftosKuroAutomobilis) automobiliuSarasas.get(0)).getL100Km() + " l/100km sąnaudomis.");
                        System.out.println("Įveskite naujas degalų sąnaudas: ");
                        double naujosSanaudos = sc.nextDouble();
                        ((NaftosKuroAutomobilis) automobiliuSarasas.get(0)).setL100Km(naujosSanaudos);
                        System.out.println("Automobilio degalų sąnaudos sėkmingai pakeistos į " + ((NaftosKuroAutomobilis) automobiliuSarasas.get(0)).getL100Km() + " l/100km");
                        break;
                    case 2:
                        System.out.println("Pasirinkote " + automobiliuSarasas.get(1) + " su " + ((NaftosKuroAutomobilis) automobiliuSarasas.get(1)).getL100Km() + " l/100km sąnaudomis.");
                        System.out.println("Įveskite naujas degalų sąnaudas: ");
                        double naujosSanaudos2 = sc.nextDouble();
                        ((NaftosKuroAutomobilis) automobiliuSarasas.get(1)).setL100Km(naujosSanaudos2);
                        System.out.println("Automobilio degalų sąnaudos sėkmingai pakeistos į " + ((NaftosKuroAutomobilis) automobiliuSarasas.get(1)).getL100Km() + " l/100km");
                        break;
                    case 3:
                        System.out.println("Pasirinkote " + automobiliuSarasas.get(2) + " su " + ((NaftosKuroAutomobilis) automobiliuSarasas.get(2)).getL100Km() + " l/100km sąnaudomis.");
                        System.out.println("Įveskite naujas degalų sąnaudas: ");
                        double naujosSanaudos3 = sc.nextDouble();
                        ((NaftosKuroAutomobilis) automobiliuSarasas.get(2)).setL100Km(naujosSanaudos3);
                        System.out.println("Automobilio degalų sąnaudos sėkmingai pakeistos į " + ((NaftosKuroAutomobilis) automobiliuSarasas.get(2)).getL100Km() + " l/100km");
                        break;
                }
                break;
            case 2:
                int y = -2;
                for (Automobilis a : automobiliuSarasas) {
                    if (a instanceof ElektrinisAutomobilis) {
                        System.out.println(y + ". " + a);
                    }
                    y++;
                }
                System.out.println("Pasirinkite norima varianta: ");
                switch (sc.nextInt()) {
                    case 1:
                        System.out.println("Pasirinkote " + automobiliuSarasas.get(3) + " su " + ((NaftosKuroAutomobilis) automobiliuSarasas.get(3)).getL100Km());
                        System.out.println("Iveskite nauja įkrovimo laiką: ");
                        int naujasIkrovimoLaikas = sc.nextInt();
                        ((ElektrinisAutomobilis) automobiliuSarasas.get(3)).setBaterijosKrovimoLaikas(naujasIkrovimoLaikas);
                        System.out.println("Įkrovimo laikas sėkmingai pakeistas į - " + ((ElektrinisAutomobilis) automobiliuSarasas.get(3)).getBaterijosKrovimoLaikas());
                        break;
                    case 2:
                        System.out.println("Pasirinkote " + automobiliuSarasas.get(4) + " su " + ((NaftosKuroAutomobilis) automobiliuSarasas.get(4)).getL100Km());
                        System.out.println("Iveskite nauja įkrovimo laiką: ");
                        int naujasIkrovimoLaikas2 = sc.nextInt();
                        ((ElektrinisAutomobilis) automobiliuSarasas.get(4)).setBaterijosKrovimoLaikas(naujasIkrovimoLaikas2);
                        System.out.println("Įkrovimo laikas sėkmingai pakeistas į - " + ((ElektrinisAutomobilis) automobiliuSarasas.get(4)).getBaterijosKrovimoLaikas());
                        break;
                    case 3:
                        System.out.println("Pasirinkote " + automobiliuSarasas.get(5) + " su " + ((NaftosKuroAutomobilis) automobiliuSarasas.get(5)).getL100Km());
                        System.out.println("Iveskite nauja įkrovimo laiką: ");
                        int naujasIkrovimoLaikas3 = sc.nextInt();
                        ((ElektrinisAutomobilis) automobiliuSarasas.get(5)).setBaterijosKrovimoLaikas(naujasIkrovimoLaikas3);
                        System.out.println("Įkrovimo laikas sėkmingai pakeistas į - " + ((ElektrinisAutomobilis) automobiliuSarasas.get(5)).getBaterijosKrovimoLaikas());
                        break;
                }
        }

    }
}

