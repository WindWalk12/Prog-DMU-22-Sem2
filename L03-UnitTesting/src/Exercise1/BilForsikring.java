
package Exercise1;

public class BilForsikring {
    private double grundPraemie;

    public double getGrundPraemie() {
        return grundPraemie;
    }

    public void setGrundpaemie(double grundPr) {
        if (grundPr <= 0) {
            throw new RuntimeException("grundPr skal vaere positiv");
        }
        grundPraemie = grundPr;
    }

    public double beregnPraemie(int alder, boolean isKvinde, int skadeFrieAar) {
        double praemie = grundPraemie;
        double praemieProcent = 1;
        if (praemie == 0) {
            throw new RuntimeException("GrundPraemie har ikke faeet en vaerdi");
        }
        if (alder < 18) {
            throw new RuntimeException("Du er for ung til at tegne en forsikring");
        }
        if (alder - skadeFrieAar < 18) {
            throw new RuntimeException("Du kan ikke have koert skadefri saalaenge");
        }
        if (skadeFrieAar < 0) {
            throw new RuntimeException("Antal skade frie aer skal vaere positiv");
        }
        if (alder < 25) {
            praemieProcent += 0.25;
        }
        if (isKvinde) {
            praemieProcent -= 0.05;
        }
        if (skadeFrieAar < 3) {
        } else if (skadeFrieAar < 6) {
            praemieProcent -= 0.15;
        } else if (skadeFrieAar < 8) {
            praemieProcent -= 0.25;
        } else {
            praemieProcent -= 0.35;
        }
        return praemie * praemieProcent;
    }

}
