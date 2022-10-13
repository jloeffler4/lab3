import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.ArrayList;

public class LinkedListTests {
    @Test
    public void testEmptyList() {        
        LinkedList testList = new LinkedList();
        assertEquals("", testList.toString());
        assertEquals(0, testList.length());
        assertThrows(NoSuchElementException.class, () -> testList.first());
        assertThrows(NoSuchElementException.class, () -> testList.last());
    }

    @Test
    public void testFilledList() {
        LinkedList testList = new LinkedList();
        testList.append(1);
        testList.append(2);
        testList.append(3);
        testList.append(4);
        testList.prepend(0);
        assertEquals("0 1 2 3 4 ", testList.toString());
        assertEquals(5, testList.length());
        assertEquals(0, testList.first());
        assertEquals(4, testList.last());
        testList.prepend(-1);
        testList.append(9);
        assertEquals("-1 0 1 2 3 4 9 ", testList.toString());
        assertEquals(7, testList.length());
        assertEquals(-1, testList.first());
        assertEquals(9, testList.last());
    }
}