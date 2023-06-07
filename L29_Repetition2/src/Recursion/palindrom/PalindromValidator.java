package Recursion.palindrom;

public class PalindromValidator implements PalindromValidatorI {

    @Override
    public boolean erGyldigtPalindrom(String tekst) {
        tekst = tekst.replaceAll("[^a-zA-Z0-9æøåÆØÅ]", "").toLowerCase();
        return erGyldigtPalindrom(tekst, 0, tekst.length() - 1);
    }

    private boolean erGyldigtPalindrom(String tekst, int left, int right) {
        if (left >= right) {
            return true;
        } else {
            if (tekst.charAt(left) != tekst.charAt(right)) {
                return false;
            }
        }
        return erGyldigtPalindrom(tekst, left + 1, right - 1);
    }

    @Override
    public boolean erGyldigtPalindromPrimtal(int tal) {
        String talString = Integer.toString(tal);
        return erGyldigtPalindromPrimtal(tal, talString, 0, talString.length() - 1, false);
    }

    public boolean erGyldigtPalindromPrimtal(int tal, String talString, int left, int right, boolean isPrimeChecked) {
        if (!isPrimeChecked && !checkForPrime(tal)) {
            return false;
        }
        if (left >= right) {
            return true;
        } else {
            if (talString.charAt(left) != talString.charAt(right)) {
                return false;
            }
        }
        return erGyldigtPalindromPrimtal(tal, talString, left + 1, right - 1, true);
    }

    private boolean checkForPrime(int inputNumber) {
        boolean isItPrime = true;

        if(inputNumber <= 1)
        {
            isItPrime = false;

            return isItPrime;
        }
        else
        {
            for (int i = 2; i<= inputNumber/2; i++)
            {
                if ((inputNumber % i) == 0)
                {
                    isItPrime = false;

                    break;
                }
            }

            return isItPrime;
        }
    }
}
