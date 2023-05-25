package Exercise1;

import java.util.Objects;

public class Bil {
    private String registreringsnummer;
    private String maerke;
    private String model;
    private String farve;

    public Bil(String registreringsnummer, String maerke, String model, String farve) {
        this.registreringsnummer = registreringsnummer;
        this.maerke = maerke;
        this.model = model;
        this.farve = farve;
    }

    public String getRegistreringsnummer() {
        return registreringsnummer;
    }

    public void setRegistreringsnummer(String registreringsnummer) {
        this.registreringsnummer = registreringsnummer;
    }

    public String getMaerke() {
        return maerke;
    }

    public void setMaerke(String maerke) {
        this.maerke = maerke;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFarve() {
        return farve;
    }

    public void setFarve(String farve) {
        this.farve = farve;
    }

    @Override
    public String toString() {
        return "Registreringsnummer: " + registreringsnummer + " Mærke: " + maerke + " Model: " + model + " Farve: " + farve;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bil bil = (Bil) o;
        return registreringsnummer.equals(bil.registreringsnummer) && maerke.equals(bil.maerke);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registreringsnummer, maerke);
    }
}
