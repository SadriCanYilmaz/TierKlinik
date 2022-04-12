public class Person {
    private String Vorname;
    private String Nachname;
    private int Telefonnummer;
    private String E_mail;
    private String IDnummer;
    private String Geschlecht;
    private String Adresse;


    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String vorname) {
        Vorname = vorname;
    }

    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String nachname) {
        Nachname = nachname;
    }

    public int getTelefonnummer() {
        return Telefonnummer;
    }

    public void setTelefonnummer(int telefonnummer) {
        Telefonnummer = telefonnummer;
    }

    public String getE_mail() {
        return E_mail;
    }

    public void setE_mail(String e_mail) {
        E_mail = e_mail;
    }

    public String getIDnummer() {
        return IDnummer;
    }

    public void setIDnummer(String IDnummer) {
        this.IDnummer = IDnummer;
    }

    public String getGeschlecht() {
        return Geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        Geschlecht = geschlecht;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }
}
