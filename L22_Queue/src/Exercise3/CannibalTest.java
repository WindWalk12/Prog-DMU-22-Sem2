package Exercise3;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(OrderAnnotation.class)
class CannibalTest
{
    private CircularCannibalMeal cannibalQueue;
    private Person p1;
    private Person p2;
    private Person p3;
    private Person p4;
    private Person p5;
    private Person p6;

    @BeforeEach
    void setUp() throws Exception
    {
        // --------------------------------------------------
        // ARRANGE
        // --------------------------------------------------

        this.cannibalQueue = new CircularCannibalMeal();
        this.p1 = new Person("Susan");
        this.p2 = new Person("Lars");
        this.p3 = new Person("Marie");
        this.p4 = new Person("Emilie");
        this.p5 = new Person("Rasmus");
        this.p6 = new Person("Anna");

    }

    @Test
    @Order(1)
    void test_cannibalQueue_ContainsAndCanAddPerson()
    {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------
        cannibalQueue.addPerson(p1);
        assertTrue(cannibalQueue.contains(p1));

        cannibalQueue.addPerson(p2);
        assertTrue(cannibalQueue.contains(p2));

        cannibalQueue.addPerson(p3);
        assertTrue(cannibalQueue.contains(p3));

        cannibalQueue.addPerson(p4);
        assertTrue(cannibalQueue.contains(p4));

        cannibalQueue.addPerson(p5);
        assertTrue(cannibalQueue.contains(p5));

        cannibalQueue.addPerson(p6);
        assertTrue(cannibalQueue.contains(p6));
    }

    @Test
    @Order(2)
    void test_cannibalQueue_Size()
    {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------
        cannibalQueue.addPerson(p1);
        assertEquals(1, cannibalQueue.size());

        cannibalQueue.addPerson(p2);
        assertEquals(2, cannibalQueue.size());

        cannibalQueue.addPerson(p3);
        assertEquals(3, cannibalQueue.size());

        cannibalQueue.addPerson(p4);
        assertEquals(4, cannibalQueue.size());

        cannibalQueue.addPerson(p5);
        assertEquals(5, cannibalQueue.size());

        cannibalQueue.addPerson(p6);
        assertEquals(6, cannibalQueue.size());

    }

    @Test
    @Order(3)
    void test_cannibalQueue_canEatRandomPerson()
    {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------
        cannibalQueue.addPerson(p1);
        cannibalQueue.addPerson(p2);
        cannibalQueue.addPerson(p3);
        cannibalQueue.addPerson(p4);
        cannibalQueue.addPerson(p5);
        cannibalQueue.addPerson(p6);

        Person testPerson = cannibalQueue.eatRandomPerson();
        System.out.println(testPerson.getName() + " bliver spist");
        assertFalse(cannibalQueue.contains(testPerson));

        testPerson = cannibalQueue.eatRandomPerson();
        System.out.println(testPerson.getName() + " bliver spist");
        assertFalse(cannibalQueue.contains(testPerson));

        testPerson = cannibalQueue.eatRandomPerson();
        System.out.println(testPerson.getName() + " bliver spist");
        assertFalse(cannibalQueue.contains(testPerson));

        testPerson = cannibalQueue.eatRandomPerson();
        System.out.println(testPerson.getName() + " bliver spist");
        assertFalse(cannibalQueue.contains(testPerson));

        testPerson = cannibalQueue.eatRandomPerson();
        System.out.println(testPerson.getName() + " bliver spist");
        assertFalse(cannibalQueue.contains(testPerson));

        testPerson = cannibalQueue.eatRandomPerson();
        System.out.println(testPerson.getName() + " bliver spist");
        assertFalse(cannibalQueue.contains(testPerson));

        assertThrows(NoSuchElementException.class, () -> {
            cannibalQueue.eatRandomPerson();
        });
    }

    @Test
    @Order(4)
    void test_cannibalQueue_canEatNextPerson()
    {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------
        cannibalQueue.addPerson(p1);
        cannibalQueue.addPerson(p2);
        cannibalQueue.addPerson(p3);
        cannibalQueue.addPerson(p4);
        cannibalQueue.addPerson(p5);
        cannibalQueue.addPerson(p6);

        Person testPerson = cannibalQueue.eatNextPerson(2);
        System.out.println(testPerson.getName() + " bliver spist");
        assertFalse(cannibalQueue.contains(testPerson));

        testPerson = cannibalQueue.eatNextPerson(2);
        System.out.println(testPerson.getName() + " bliver spist");
        assertFalse(cannibalQueue.contains(testPerson));

        testPerson = cannibalQueue.eatNextPerson(2);
        System.out.println(testPerson.getName() + " bliver spist");
        assertFalse(cannibalQueue.contains(testPerson));

        testPerson = cannibalQueue.eatNextPerson(2);
        System.out.println(testPerson.getName() + " bliver spist");
        assertFalse(cannibalQueue.contains(testPerson));

        testPerson = cannibalQueue.eatNextPerson(2);
        System.out.println(testPerson.getName() + " bliver spist");
        assertFalse(cannibalQueue.contains(testPerson));

        testPerson = cannibalQueue.eatNextPerson(2);
        System.out.println(testPerson.getName() + " bliver spist");
        assertFalse(cannibalQueue.contains(testPerson));

        assertThrows(NoSuchElementException.class, () -> {
            cannibalQueue.eatNextPerson(2);
        });
    }

    @Test
    @Order(5)
    void test_cannibalQueue_isEmpty()
    {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------
        assertTrue(cannibalQueue.isEmpty());
        cannibalQueue.addPerson(p1);
        assertFalse(cannibalQueue.isEmpty());
        cannibalQueue.addPerson(p2);
        assertFalse(cannibalQueue.isEmpty());
        cannibalQueue.addPerson(p3);
        assertFalse(cannibalQueue.isEmpty());


        cannibalQueue.eatNextPerson(1);
        assertFalse(cannibalQueue.isEmpty());
        cannibalQueue.eatNextPerson(1);
        assertFalse(cannibalQueue.isEmpty());
        cannibalQueue.eatNextPerson(1);
        assertTrue(cannibalQueue.isEmpty());
    }

    @Test
    @Order(6)
    void test_cannibalQueue_danceMacabre()
    {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------
        cannibalQueue.addPerson(p1);
        cannibalQueue.addPerson(p2);
        cannibalQueue.addPerson(p3);
        cannibalQueue.addPerson(p4);
        cannibalQueue.addPerson(p5);
        cannibalQueue.addPerson(p6);

        cannibalQueue.danceMacabre();
        assertTrue(cannibalQueue.isEmpty());
    }
}
