package Exercise1.controller;

import Exercise1.ordination.Laegemiddel;
import Exercise1.ordination.Ordination;
import Exercise1.ordination.Patient;
import Exercise1.storage.StorageInterface;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ControllerTest {
    Controller controller;
    StorageInterface storage;

    @Test
    void antalOrdinationerPrVægtPrLægemiddel() {
        //Arrange
        Laegemiddel laegemiddel = new Laegemiddel("Acetylsalicylsyre", 2, 2, 2, "Styk");
        Patient patient = new Patient("123456-7890", "Janne rhododendronpostkasse", 121);
        storage = mock(StorageInterface.class);
        controller = new Controller(storage);

        //Act

        int faktiskResult = controller.antalOrdinationerPrVægtPrLægemiddel(70,80,laegemiddel);

        //Assert
        int forventetResult = 0;
        assertEquals(forventetResult,faktiskResult);
    }

    @Test
    void antalOrdinationerPrVægtPrLægemiddel_2patients_2ordination() {
        //Arrange
        Laegemiddel laegemiddel = new Laegemiddel("Acetylsalicylsyre", 2, 2, 2, "Styk");
        Patient patient = mock(Patient.class);
        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(patient);
        patients.add(patient);
        storage = mock(StorageInterface.class);
        controller = new Controller(storage);
        when(storage.getAllPatienter()).thenReturn(patients);

        //Act

        int faktiskResult = controller.antalOrdinationerPrVægtPrLægemiddel(70,130,laegemiddel);

        //Assert
        int forventetResult = 4;
        assertEquals(forventetResult,faktiskResult);
    }
}