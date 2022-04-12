public class Tier {
    private int TierID;
    private String Name;
    private Kunde Besitzer;
    private String Spezies_des_Tier;
    private int Alter;
    private float Gewicht;

    public int getTierID() {
        return TierID;
    }

    public void setTierID(int tierID) {
        TierID = tierID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Kunde getBesitzer() {
        return Besitzer;
    }

    public void setBesitzer(Kunde besitzer) {
        Besitzer = besitzer;
    }

    public String getSpezies_des_Tier() {
        return Spezies_des_Tier;
    }

    public void setSpezies_des_Tier(String spezies_des_Tier) {
        Spezies_des_Tier = spezies_des_Tier;
    }

    public int getAlter() {
        return Alter;
    }

    public void setAlter(int alter) {
        Alter = alter;
    }

    public float getGewicht() {
        return Gewicht;
    }

    public void setGewicht(float gewicht) {
        Gewicht = gewicht;
    }
}
