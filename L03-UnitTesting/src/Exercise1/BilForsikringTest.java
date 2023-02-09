package Exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BilForsikringTest {

    @Test
    void TC1_beregnPraemie_18aar_Mand_SkadeFriAar0() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 18;
        boolean isKvinde = false;
        int skadeFriAar = 0;

        //Act
        int actual = (int)bilForsikring.beregnPraemie(alder, isKvinde, skadeFriAar);

        //Assert
        int expected = 1250;
        assertEquals(expected, actual);
    }

    @Test
    void TC2_beregnPraemie_18aar_Kvinde_SkadeFriAar0() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 18;
        boolean isKvinde = true;
        int skadeFriAar = 0;

        //Act
        int actual = (int)bilForsikring.beregnPraemie(alder, isKvinde, skadeFriAar);

        //Assert
        int expected = 1200;
        assertEquals(expected, actual);
    }

    @Test
    void TC3_beregnPraemie_19aar_Mand_SkadeFriAar0() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 19;
        boolean isKvinde = false;
        int skadeFriAar = 0;

        //Act
        int actual = (int)bilForsikring.beregnPraemie(alder, isKvinde, skadeFriAar);

        //Assert
        int expected = 1250;
        assertEquals(expected, actual);
    }

    @Test
    void TC4_beregnPraemie_19aar_Kvinde_SkadeFriAar0() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 19;
        boolean isKvinde = true;
        int skadeFriAar = 0;

        //Act
        int actual = (int)bilForsikring.beregnPraemie(alder, isKvinde, skadeFriAar);

        //Assert
        int expected = 1200;
        assertEquals(expected, actual);
    }

    @Test
    void TC5_beregnPraemie_25aar_Mand_SkadeFriAar0() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 25;
        boolean isKvinde = false;
        int skadeFriAar = 0;

        //Act
        int actual = (int)bilForsikring.beregnPraemie(alder, isKvinde, skadeFriAar);

        //Assert
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    void TC6_beregnPraemie_25aar_Kvinde_SkadeFriAar0() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 25;
        boolean isKvinde = true;
        int skadeFriAar = 0;

        //Act
        int actual = (int)bilForsikring.beregnPraemie(alder, isKvinde, skadeFriAar);

        //Assert
        int expected = 950;
        assertEquals(expected, actual);
    }

    @Test
    void TC7_beregnPraemie_26aar_Mand_SkadeFriAar0() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 26;
        boolean isKvinde = false;
        int skadeFriAar = 0;

        //Act
        int actual = (int)bilForsikring.beregnPraemie(alder, isKvinde, skadeFriAar);

        //Assert
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    void TC8_beregnPraemie_26aar_Kvinde_SkadeFriAar0() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 26;
        boolean isKvinde = true;
        int skadeFriAar = 0;

        //Act
        int actual = (int)bilForsikring.beregnPraemie(alder, isKvinde, skadeFriAar);

        //Assert
        int expected = 950;
        assertEquals(expected, actual);
    }

    @Test
    void TC9_beregnPraemie_30aar_Mand_SkadeFriAar2() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 30;
        boolean isKvinde = false;
        int skadeFriAar = 2;

        //Act
        int actual = (int)bilForsikring.beregnPraemie(alder, isKvinde, skadeFriAar);

        //Assert
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    void TC10_beregnPraemie_30aar_Mand_SkadeFriAar3() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 30;
        boolean isKvinde = false;
        int skadeFriAar = 3;

        //Act
        int actual = (int)bilForsikring.beregnPraemie(alder, isKvinde, skadeFriAar);

        //Assert
        int expected = 850;
        assertEquals(expected, actual);
    }

    @Test
    void TC11_beregnPraemie_30aar_Mand_SkadeFriAar4() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 30;
        boolean isKvinde = false;
        int skadeFriAar = 4;

        //Act
        int actual = (int)bilForsikring.beregnPraemie(alder, isKvinde, skadeFriAar);

        //Assert
        int expected = 850;
        assertEquals(expected, actual);
    }

    @Test
    void TC12_beregnPraemie_30aar_Mand_SkadeFriAar5() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 30;
        boolean isKvinde = false;
        int skadeFriAar = 5;

        //Act
        int actual = (int)bilForsikring.beregnPraemie(alder, isKvinde, skadeFriAar);

        //Assert
        int expected = 850;
        assertEquals(expected, actual);
    }

    @Test
    void TC13_beregnPraemie_30aar_Mand_SkadeFriAar6() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 30;
        boolean isKvinde = false;
        int skadeFriAar = 6;

        //Act
        int actual = (int)bilForsikring.beregnPraemie(alder, isKvinde, skadeFriAar);

        //Assert
        int expected = 750;
        assertEquals(expected, actual);
    }

    @Test
    void TC14_beregnPraemie_30aar_Mand_SkadeFriAar7() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 30;
        boolean isKvinde = false;
        int skadeFriAar = 7;

        //Act
        int actual = (int)bilForsikring.beregnPraemie(alder, isKvinde, skadeFriAar);

        //Assert
        int expected = 750;
        assertEquals(expected, actual);
    }

    @Test
    void TC15_beregnPraemie_30aar_Mand_SkadeFriAar8() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 30;
        boolean isKvinde = false;
        int skadeFriAar = 8;

        //Act
        int actual = (int)bilForsikring.beregnPraemie(alder, isKvinde, skadeFriAar);

        //Assert
        int expected = 650;
        assertEquals(expected, actual);
    }

    @Test
    void TC16_beregnPraemie_30aar_Mand_SkadeFriAar9() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 30;
        boolean isKvinde = false;
        int skadeFriAar = 9;

        //Act
        int actual = (int)bilForsikring.beregnPraemie(alder, isKvinde, skadeFriAar);

        //Assert
        int expected = 650;
        assertEquals(expected, actual);
    }

    @Test
    void TC17_beregnPraemie_30aar_Kvinde_SkadeFriAar9() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 30;
        boolean isKvinde = true;
        int skadeFriAar = 9;

        //Act
        int actual = (int)bilForsikring.beregnPraemie(alder, isKvinde, skadeFriAar);

        //Assert
        int expected = 600;
        assertEquals(expected, actual);
    }

    @Test
    void TC18_beregnPraemie_24aar_Mand_SkadeFriAar5() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 24;
        boolean isKvinde = false;
        int skadeFriAar = 5;

        //Act
        int actual = (int)bilForsikring.beregnPraemie(alder, isKvinde, skadeFriAar);

        //Assert
        int expected = 1100;
        assertEquals(expected, actual);
    }

    @Test
    void TC19_beregnPraemie_24aar_Kvinde_SkadeFriAar5() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 24;
        boolean isKvinde = true;
        int skadeFriAar = 5;

        //Act
        int actual = (int)bilForsikring.beregnPraemie(alder, isKvinde, skadeFriAar);

        //Assert
        int expected = 1050;
        assertEquals(expected, actual);
    }

    @Test
    void TC20_beregnPraemie_17aar_Mand_SkadeFriAar0() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 17;
        boolean isKvinde = false;
        int skadeFriAar = 0;

        //Act & Assert
        Exception exception = assertThrows(RuntimeException.class, () -> {
            bilForsikring.beregnPraemie(alder, isKvinde, skadeFriAar);
        });
        assertEquals(exception.getMessage(), "Du er for ung til at tegne en forsikring");
    }

    @Test
    void TC21_beregnPraemie_18aar_Mand_SkadeFriAar2() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 18;
        boolean isKvinde = false;
        int skadeFriAar = 2;

        //Act & Assert
        Exception exception = assertThrows(RuntimeException.class, () -> {
            bilForsikring.beregnPraemie(alder, isKvinde, skadeFriAar);
        });
        assertEquals(exception.getMessage(), "Du kan ikke have koert skadefri saalaenge");
    }

    @Test
    void TC22_beregnPraemie_18aar_Mand_SkadeFriAar1() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 18;
        boolean isKvinde = false;
        int skadeFriAar = 1;

        //Act & Assert
        Exception exception = assertThrows(RuntimeException.class, () -> {
            bilForsikring.beregnPraemie(alder, isKvinde, skadeFriAar);
        });
        assertEquals(exception.getMessage(), "Du kan ikke have koert skadefri saalaenge");
    }
}