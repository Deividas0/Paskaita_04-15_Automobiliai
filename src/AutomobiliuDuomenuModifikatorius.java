public class AutomobiliuDuomenuModifikatorius {
    public NaftosKuroAutomobilis modifikuotiParametra(NaftosKuroAutomobilis automobilis, double l100Km)
    {
        automobilis.setL100Km(l100Km);
        return automobilis;
    }
    public ElektrinisAutomobilis modifikuotiParametra(ElektrinisAutomobilis automobilis, int baterijosKrovimoLaikas)
    {
        automobilis.setBaterijosKrovimoLaikas(baterijosKrovimoLaikas);
        return automobilis;
    }
    public Automobilis modifikuotiRida(Automobilis automobilis, int rida)
    {
        automobilis.setRida(rida);
        return automobilis;
    }
}

