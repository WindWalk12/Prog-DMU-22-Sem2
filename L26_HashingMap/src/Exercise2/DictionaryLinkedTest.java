package Exercise2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryLinkedTest {
    Dictionary<Bil, Integer> dictionary;
    private Bil b1;
    private Bil b2;
    private Bil b3;
    private Bil b4;
    private Bil b5;

    @BeforeEach
    void setUp() {
        dictionary = new DictionaryLinked<>();
        this.b1 = new Bil("GH726FA", "Opel", "GT-7", "Sort");
        this.b2 = new Bil("JA817HK", "Ford", "JS", "Rød");
        this.b3 = new Bil("KJ738GF", "Opel", "GT-6", "Gul");
        this.b4 = new Bil("KJ637GT", "Opel", "GT-7", "Blå");
        this.b5 = new Bil("LK125HG", "Audi", "GT-7", "Sort");
    }

    @Test
    void test_dictionaryLinked_PutAndGet() {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------
        dictionary.put(b1, 3);
        assertEquals(3, dictionary.get(b1));

        dictionary.put(b2, 0);
        assertEquals(0, dictionary.get(b2));

        dictionary.put(b3, 5);
        assertEquals(5, dictionary.get(b3));

        dictionary.put(b4, 6);
        assertEquals(6, dictionary.get(b4));

        dictionary.put(b5, 1);
        assertEquals(1, dictionary.get(b5));

        assertThrows(IllegalArgumentException.class, () -> {
            dictionary.put(null, null);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            dictionary.put(b1, null);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            dictionary.put(null, 4);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            dictionary.get(null);
        });

        dictionary.remove(b1);
        assertNull(dictionary.get(b1));
    }

    @Test
    void test_dictionaryLinked_remove() {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------
        dictionary.put(b1, 3);
        dictionary.put(b2, 0);
        dictionary.put(b3, 5);


        assertEquals(0, dictionary.remove(b2));
        assertEquals(3, dictionary.remove(b1));
        assertEquals(5, dictionary.remove(b3));

        assertThrows(IllegalArgumentException.class, () -> {
            dictionary.remove(null);
        });

        assertThrows(NoSuchElementException.class, () -> {
            dictionary.remove(b1);
        });

        dictionary.put(b2, 0);
        assertNull(dictionary.remove(b1));
    }

    @Test
    void test_dictionaryLinked_isEmpty() {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------
        assertTrue(dictionary.isEmpty());

        dictionary.put(b1, 3);

        assertFalse(dictionary.isEmpty());

        dictionary.remove(b1);

        assertTrue(dictionary.isEmpty());
    }

    @Test
    void test_dictionaryLinked_size() {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------
        assertEquals(0, dictionary.size());

        dictionary.put(b1, 3);
        dictionary.put(b2, 0);
        dictionary.put(b3, 5);

        assertEquals(3, dictionary.size());

        dictionary.remove(b1);

        assertEquals(2, dictionary.size());
    }
}