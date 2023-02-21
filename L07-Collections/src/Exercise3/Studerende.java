package Exercise3;

import java.util.ArrayList;
import java.util.List;

public class Studerende implements Comparable<Studerende> {
    private Integer studieNr;
    private String navn;
    private List<Integer> karakterer;

    public Studerende(int studieNr, String navn, List<Integer> karakterer) {
        this.studieNr = studieNr;
        this.navn = navn;
        this.karakterer = new ArrayList<>();
    }

    public int getStudieNr() {
        return studieNr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void addKarakter(int karakter) {
        karakterer.add(karakter);
    }

    public List<Integer> getKarakterer() {
        return new ArrayList<>(karakterer);
    }

    @Override
    public String toString() {
        return "Studerende{" +
                "studieNr=" + studieNr +
                ", navn='" + navn + '\'' +
                '}';
    }

    @Override
    public int compareTo(Studerende student) {
        return this.studieNr.compareTo(student.studieNr);
    }
}
