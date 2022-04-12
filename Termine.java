import java.util.Date;

public class Termine {
    private Date Datum;
    private Arzt arzt;
    private Tier tier;
    private String Diagnose;
    private int TerminID;
    private float Preis;

    public Date getDatum() {
        return Datum;
    }

    public void setDatum(Date datum) {
        Datum = datum;
    }

    public Arzt getArzt() {
        return arzt;
    }

    public void setArzt(Arzt arzt) {
        this.arzt = arzt;
    }

    public Tier getTier() {
        return tier;
    }

    public void setTier(Tier tier) {
        this.tier = tier;
    }

    public String getDiagnose() {
        return Diagnose;
    }

    public void setDiagnose(String diagnose) {
        Diagnose = diagnose;
    }

    public int getTerminID() {
        return TerminID;
    }

    public void setTerminID(int terminID) {
        TerminID = terminID;
    }

    public float getPreis() {
        return Preis;
    }

    public void setPreis(float preis) {
        Preis = preis;
    }
}
