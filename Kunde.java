public class Kunde extends Person{
    private int KundeID;
    private Tier tier;

    public int getKundeID() {
        return KundeID;
    }

    public void setKundeID(int kundeID) {
        KundeID = kundeID;
    }

    public Tier getTier() {
        return tier;
    }

    public void setTier(Tier tier) {
        this.tier = tier;
    }
}
