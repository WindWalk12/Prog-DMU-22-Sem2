package Exercise2;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void beregnBøde_0dageOverskredet_barn() {
        //Arrange
        App bibliotek = new App();
        LocalDate beregnetDato = LocalDate.now();
        LocalDate faktiskDato = LocalDate.now();
        boolean voksen = false;
        //Act
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    void beregnBøde_1dagOverskredet_barn() {
        //Arrange
        App bibliotek = new App();
        LocalDate beregnetDato = LocalDate.now();
        LocalDate faktiskDato = LocalDate.now().plusDays(1);
        boolean voksen = false;
        //Act
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void beregnBøde_7dagOverskredet_barn() {
        //Arrange
        App bibliotek = new App();
        LocalDate beregnetDato = LocalDate.now();
        LocalDate faktiskDato = LocalDate.now().plusDays(7);
        boolean voksen = false;
        //Act
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void beregnBøde_8dagOverskredet_barn() {
        //Arrange
        App bibliotek = new App();
        LocalDate beregnetDato = LocalDate.now();
        LocalDate faktiskDato = LocalDate.now().plusDays(8);
        boolean voksen = false;
        //Act
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        int expected = 30;
        assertEquals(expected, actual);
    }

    @Test
    void beregnBøde_14dagOverskredet_barn() {
        //Arrange
        App bibliotek = new App();
        LocalDate beregnetDato = LocalDate.now();
        LocalDate faktiskDato = LocalDate.now().plusDays(14);
        boolean voksen = false;
        //Act
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        int expected = 30;
        assertEquals(expected, actual);
    }

    @Test
    void beregnBøde_15dagOverskredet_barn() {
        //Arrange
        App bibliotek = new App();
        LocalDate beregnetDato = LocalDate.now();
        LocalDate faktiskDato = LocalDate.now().plusDays(15);
        boolean voksen = false;
        //Act
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        int expected = 45;
        assertEquals(expected, actual);
    }

    @Test
    void beregnBøde_0dageOverskredet_voksen() {
        //Arrange
        App bibliotek = new App();
        LocalDate beregnetDato = LocalDate.now();
        LocalDate faktiskDato = LocalDate.now();
        boolean voksen = true;
        //Act
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    void beregnBøde_1dagOverskredet_voksen() {
        //Arrange
        App bibliotek = new App();
        LocalDate beregnetDato = LocalDate.now();
        LocalDate faktiskDato = LocalDate.now().plusDays(1);
        boolean voksen = true;
        //Act
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        int expected = 20;
        assertEquals(expected, actual);
    }

    @Test
    void beregnBøde_7dagOverskredet_voksen() {
        //Arrange
        App bibliotek = new App();
        LocalDate beregnetDato = LocalDate.now();
        LocalDate faktiskDato = LocalDate.now().plusDays(7);
        boolean voksen = true;
        //Act
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        int expected = 20;
        assertEquals(expected, actual);
    }

    @Test
    void beregnBøde_8dagOverskredet_voksen() {
        //Arrange
        App bibliotek = new App();
        LocalDate beregnetDato = LocalDate.now();
        LocalDate faktiskDato = LocalDate.now().plusDays(8);
        boolean voksen = true;
        //Act
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        int expected = 60;
        assertEquals(expected, actual);
    }

    @Test
    void beregnBøde_14dagOverskredet_voksen() {
        //Arrange
        App bibliotek = new App();
        LocalDate beregnetDato = LocalDate.now();
        LocalDate faktiskDato = LocalDate.now().plusDays(14);
        boolean voksen = true;
        //Act
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        int expected = 60;
        assertEquals(expected, actual);
    }

    @Test
    void beregnBøde_15dagOverskredet_voksen() {
        //Arrange
        App bibliotek = new App();
        LocalDate beregnetDato = LocalDate.now();
        LocalDate faktiskDato = LocalDate.now().plusDays(15);
        boolean voksen = true;
        //Act
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        int expected = 90;
        assertEquals(expected, actual);
    }
}