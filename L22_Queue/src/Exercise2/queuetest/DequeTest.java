package Exercise2.queuetest;

import Exercise1.bryghus.Produkt;
import Exercise1.bryghus.Salg;
import Exercise1.queue.NodeQueue;
import Exercise2.deque.CircularArrayDeque;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(OrderAnnotation.class)
class DequeTest
{
    private CircularArrayDeque queue;

    private Salg salg1;
    private Salg salg2;
    private Salg salg3;
    private Salg salg4;
    private Salg salg5;
    private Salg salg6;

    @BeforeEach
    void setUp() throws Exception
    {
        // --------------------------------------------------
        // ARRANGE
        // --------------------------------------------------

        this.queue = new CircularArrayDeque(5);

        Produkt kloster = new Produkt("Klosterbryg");
        Produkt sweet = new Produkt("Sweet Georgia Brown");
        Produkt extra = new Produkt("Extra Pilsner");
        Produkt classic = new Produkt("Classic Jazz");
        Produkt klippekort10 = new Produkt("Klippekort 10 klip");
        Produkt klippekort6 = new Produkt("Klippekort 6 klip");

        this.salg1 = new Salg(1);
        this.salg1.createSalgsLinje(kloster, 2, 40);

        this.salg2 = new Salg(2);
        this.salg2.createSalgsLinje(sweet, 3, 60);

        this.salg3 = new Salg(3);
        this.salg3.createSalgsLinje(extra, 2, 40);

        this.salg4 = new Salg(4);
        this.salg4.createSalgsLinje(classic, 3, 60);

        this.salg5 = new Salg(5);
        this.salg5.createSalgsLinje(klippekort10, 1, 160);

        this.salg6 = new Salg(6);
        this.salg6.createSalgsLinje(klippekort6, 2, 200);
    }

    @Test
    @Order(1)
    void test_queue_canAddFirstAndRemoveFirst()
    {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------

        queue.addFirst(salg1);
        queue.addFirst(salg2);
        queue.addFirst(salg3);
        queue.addFirst(salg4);
        queue.addFirst(salg5);
        queue.addFirst(salg6);

        Salg salgTilBehandling = (Salg) queue.removeFirst();
        assertEquals(salg6, salgTilBehandling);

        salgTilBehandling = (Salg) queue.removeFirst();
        assertEquals(salg5, salgTilBehandling);

        salgTilBehandling = (Salg) queue.removeFirst();
        assertEquals(salg4, salgTilBehandling);

        salgTilBehandling = (Salg) queue.removeFirst();
        assertEquals(salg3, salgTilBehandling);

        salgTilBehandling = (Salg) queue.removeFirst();
        assertEquals(salg2, salgTilBehandling);

        salgTilBehandling = (Salg) queue.removeFirst();
        assertEquals(salg1, salgTilBehandling);

        assertThrows(NoSuchElementException.class, () -> {
            queue.removeFirst();
        });
    }

    @Test
    @Order(2)
    void test_queue_canAddLastAndRemoveLast()
    {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------

        queue.addLast(salg1);
        queue.addLast(salg2);
        queue.addLast(salg3);
        queue.addLast(salg4);
        queue.addLast(salg5);
        queue.addLast(salg6);

        Salg salgTilBehandling = (Salg) queue.removeLast();
        assertEquals(salg6, salgTilBehandling);

        salgTilBehandling = (Salg) queue.removeLast();
        assertEquals(salg5, salgTilBehandling);

        salgTilBehandling = (Salg) queue.removeLast();
        assertEquals(salg4, salgTilBehandling);

        salgTilBehandling = (Salg) queue.removeLast();
        assertEquals(salg3, salgTilBehandling);

        salgTilBehandling = (Salg) queue.removeLast();
        assertEquals(salg2, salgTilBehandling);

        salgTilBehandling = (Salg) queue.removeLast();
        assertEquals(salg1, salgTilBehandling);

        assertThrows(NoSuchElementException.class, () -> {
            queue.removeLast();
        });
    }

    @Test
    @Order(3)
    void test_queue_returnsSize()
    {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------

        assertEquals(0, queue.size());

        queue.addFirst(salg1);
        assertEquals(1, queue.size());

        queue.addFirst(salg2);
        assertEquals(2, queue.size());

        queue.addFirst(salg3);
        assertEquals(3, queue.size());

        queue.addFirst(salg4);
        assertEquals(4, queue.size());

        queue.addFirst(salg5);
        assertEquals(5, queue.size());

        queue.addFirst(salg6);
        assertEquals(6, queue.size());

        queue.removeFirst();
        assertEquals(5, queue.size());

        queue.removeFirst();
        assertEquals(4, queue.size());

        queue.removeFirst();
        assertEquals(3, queue.size());

        queue.removeFirst();
        assertEquals(2, queue.size());

        queue.removeFirst();
        assertEquals(1, queue.size());

        queue.removeFirst();
        assertEquals(0, queue.size());
    }

    @Test
    @Order(4)
    void test_queue_returnsIsEmpty()
    {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------

        assertTrue(queue.isEmpty());

        queue.addFirst(salg1);
        assertFalse(queue.isEmpty());

        queue.addFirst(salg2);
        assertFalse(queue.isEmpty());

        queue.addFirst(salg3);
        assertFalse(queue.isEmpty());

        queue.removeFirst();
        assertFalse(queue.isEmpty());

        queue.removeFirst();
        assertFalse(queue.isEmpty());

        queue.removeFirst();
        assertTrue(queue.isEmpty());
    }
}
