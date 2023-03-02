package Exercise4;

public class Nedboer {
    public static void main(String[] args) {
        Nedboer n = new Nedboer();
        System.out.println(n.bedsteTreFerieUger());
        System.out.println(n.bedsteFerieUgerStart(4));
        System.out.println(n.ensNedboer());
    }
    private int[] nedboerPrUge = { 20, 10, 12, 12, 13, 14, 15, 10, 8, 7, 13,
        15, 10, 9, 6, 8, 12, 22, 14, 16, 16, 18, 23, 12, 0, 2, 0, 0, 78, 0,
        0, 0, 34, 12, 34, 23, 23, 12, 44, 23, 12, 34, 22, 22, 22, 22, 18,
        19, 21, 32, 24, 13 };
    
    /**
     * Returnerer ugenummeret for den uge i året, hvor man skal starte ferien,
     * hvis man ønsker den minimale nedbørsmængde i de tre uger
     *
     * @return
     */
    // O(n) time
    public int bedsteTreFerieUger() {
        int min = Integer.MAX_VALUE;
        int uge = -1;
        for (int i = 0; i < nedboerPrUge.length - 2; i++) {
            int sum = 0;
            sum += nedboerPrUge[i] + nedboerPrUge[i + 1] + nedboerPrUge[i + 2];
            if (sum < min) {
                min = sum;
                uge = i + 1;
            }
        }
        return uge;
    }
    
    /**
     * Returnerer ugenummeret for den uge i året, hvor man skal starte ferien,
     * hvis man ønsker den minimale nedbørsmængde i det "antal" uger, der er
     * angivet i paramtereren
     *
     * @return
     */
    // O(n)
    public int bedsteFerieUgerStart(int antal) {
        int min = Integer.MAX_VALUE;
        int uge = -1;
        for (int i = 0; i < nedboerPrUge.length - antal; i++) {
            int sum = 0;
            for (int j = 0; j < antal; j++) {
                sum += nedboerPrUge[i+j];
            }
            if (sum < min) {
                min = sum;
                uge = i + 1;
            }
        }
        return uge;
    }
    
    /**
     * Returnerer ugenummeret på den første uge hvor nedbøren har været præcis
     * den samme flest uger i træk
     *
     * @return
     */
    // O(n)
    public int ensNedboer() {
        int counterOfNumbers = 0;
        int counterMax = 0;
        int uge = -1;
        int number = 0;
        for (int i = 0; i < nedboerPrUge.length; i++) {
            if (counterOfNumbers == 0) {
                number = nedboerPrUge[i];
            }
            if (number == nedboerPrUge[i]) {
                counterOfNumbers++;
            } else {
                counterOfNumbers = 0;
            }
            if (counterOfNumbers > counterMax) {
                uge = i + 1;
                counterMax = counterOfNumbers;
                uge -= counterMax - 1;
            }
        }
        return uge;
    }
}
