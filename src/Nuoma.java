import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nuoma {
    List<Automobilis> automobiliuSarasas = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    private int a;


    public void pridetiYSarasa(Automobilis auto) {
        automobiliuSarasas.add(auto);
    }

    public void isimtiIsSaraso(Automobilis auto) {
        automobiliuSarasas.remove(auto);
    }

    public int nuomosKaina() {
        int x = 1;
        for(Automobilis a: automobiliuSarasas){
            System.out.println(x+". " +a);
            x++;
        }
        System.out.println("Pasirinkite automobilį: ");
        switch(sc.nextInt()){
            case 1:
                System.out.println("Jūs pasirinkote: " + automobiliuSarasas.getFirst());
                System.out.println("Kiek dienų norėsite naudoti automobilį?");
                a = sc.nextInt();
                System.out.println("Paros kaina: 100Eur. "+"Pasirinkote "+a+" dienų kiekį. "+"Bendra nuomos suma bus: "+(a * automobiliuSarasas.get(0).getKaina())+"Eur.");
                break;
            case 2:
                System.out.println("Jūs pasirinkote: " + automobiliuSarasas.get(1));
                System.out.println("Kiek dienų norėsite naudoti automobilį?");
                a = sc.nextInt();
                System.out.println("Paros kaina: 75Eur. "+"Pasirinkote "+a+" dienų kiekį. "+"Bendra nuomos suma bus: "+(a * automobiliuSarasas.get(1).getKaina())+"Eur.");
                break;
            case 3:
                System.out.println("Jūs pasirinkote: " + automobiliuSarasas.get(2));
                System.out.println("Kiek dienų norėsite naudoti automobilį?");
                a = sc.nextInt();
                System.out.println("Paros kaina: 50Eur. "+"Pasirinkote "+a+" dienų kiekį. "+"Bendra nuomos suma bus: "+(a * automobiliuSarasas.get(2).getKaina())+"Eur.");
                break;
            case 4:
                System.out.println("Jūs pasirinkote: " + automobiliuSarasas.get(3));
                System.out.println("Kiek dienų norėsite naudoti automobilį?");
                a = sc.nextInt();
                System.out.println("Paros kaina: 150Eur. "+"Pasirinkote "+a+" dienų kiekį. "+"Bendra nuomos suma bus: "+(a * automobiliuSarasas.get(3).getKaina())+"Eur.");
                break;
            case 5:
                System.out.println("Jūs pasirinkote: " + automobiliuSarasas.get(4));
                System.out.println("Kiek dienų norėsite naudoti automobilį?");
                a = sc.nextInt();
                System.out.println("Paros kaina: 125Eur. "+"Pasirinkote "+a+" dienų kiekį. "+"Bendra nuomos suma bus: "+(a * automobiliuSarasas.get(4).getKaina())+"Eur.");
                break;
            case 6:
                System.out.println("Jūs pasirinkote: " + automobiliuSarasas.get(5));
                System.out.println("Kiek dienų norėsite naudoti automobilį?");
                a = sc.nextInt();
                System.out.println("Paros kaina: 100Eur. "+"Pasirinkote "+a+" dienų kiekį. "+"Bendra nuomos suma bus: "+(a * automobiliuSarasas.get(5).getKaina())+"Eur.");
                break;
            default:
                System.out.println("Ivyko klaida bandykite dar karta.");
                nuomosKaina();
        }
    return 0;
    }
}
