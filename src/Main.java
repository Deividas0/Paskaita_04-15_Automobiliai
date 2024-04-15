

//Sukurkite automobilių nuomos sistemą. Jums reikės sukurti pagrindinę klasę Automobilis, kuri turės šiuos atributus: marke, modelis, metai ir kaina už dieną. Sukurkite reikiamus getterius ir setterius, taip pat konstruktorių, leidžiantį sukurti automobilio objektą su nurodytais atributais.
//Toliau sukurti dvi subklases, NaftosKuroAutomobilis ir ElektrinisAutomobilis. Kiekviena subklasė turi papildomą atributą, pavyzdžiui, degalų suvartojimas 100 km atstumu arba baterijos krovimo laikas. Taip pat, kiekviena subklasė turi turėti savo konstruktorių, kuris prideda šiuos papildomus atributus, ir tinkamus getterius ir setterius.
//Galų gale, parašykite klasę Nuoma, kurioje yra sąrašas su turimais automobiliais. Sukurti metodus, kurie leistų pridėti naujus automobilius į sąrašą, pasiimti automobilį iš sąrašo ir apskaičiuoti nuomos kainą už nurodytą dienų skaičių.
////Pridėti viso autoparko atspausdinimą. Susikūrus klasę autoparkas prisidėti sąrašą automobilių.


public class Main {
    public static void main(String[] args) {

        NaftosKuroAutomobilis audi = new NaftosKuroAutomobilis("Audi", "A6", 2020, 100, 6.7);
        NaftosKuroAutomobilis ford = new NaftosKuroAutomobilis("Ford", "Kuga", 2018, 75, 5.2);
        NaftosKuroAutomobilis seat = new NaftosKuroAutomobilis("Seat", "Ibiza", 2024, 50, 4.8);

        ElektrinisAutomobilis audiEv = new ElektrinisAutomobilis("Audi", "E-tron", 2023, 150, 78);
        ElektrinisAutomobilis bmwEv = new ElektrinisAutomobilis("BMW", "iX3", 2024, 125, 67);
        ElektrinisAutomobilis citroenEv = new ElektrinisAutomobilis("Citroen", "e-SpaceTourer", 2024, 100, 121);

        Nuoma nuoma = new Nuoma();
        nuoma.pridetiYSarasa(audi);
        nuoma.pridetiYSarasa(ford);
        nuoma.pridetiYSarasa(seat);
        nuoma.pridetiYSarasa(audiEv);
        nuoma.pridetiYSarasa(bmwEv);
        nuoma.pridetiYSarasa(citroenEv);

        nuoma.nuomosKaina();
    }
}