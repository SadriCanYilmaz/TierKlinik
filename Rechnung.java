public class Rechnung {
    private Kunde kunde;
    private String Adresse;
    private float GesamtPreis;
    private Produkte[] Produkt;
    private Termine termin;

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public float getGesamtPreis() {
        return GesamtPreis;
    }

    public void setGesamtPreis(float gesamtPreis) {
        GesamtPreis = gesamtPreis;
    }

    public Produkte[] getProdukt() {
        return Produkt;
    }

    public void setProdukt(Produkte[] produkt) {
        Produkt = produkt;
    }

    public Termine getTermin() {
        return termin;
    }

    public void setTermin(Termine termin) {
        this.termin = termin;
    }
}
