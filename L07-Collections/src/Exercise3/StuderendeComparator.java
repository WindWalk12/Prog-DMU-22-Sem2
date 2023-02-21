package Exercise3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StuderendeComparator implements Comparator<Studerende> {
    private Integer studieNr;
    private String navn;
    private List<Integer> karakterer;

    public StuderendeComparator(int studieNr, String navn, List<Integer> karakterer) {
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
    public int compare(Studerende student1, Studerende student2) {
        return student1.getNavn().compareTo(student2.getNavn());
    }
}
