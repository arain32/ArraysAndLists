import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AverageIntegerListsTest {
    AverageIntegerLists test;

    ArrayList<Integer>array;

    @BeforeEach
    void setUp() {
        test = new AverageIntegerLists();
        array=new ArrayList<>();
        array.add(7);
        array.add(9);
        array.add(2);
        array.add(5);

    }

    @Test
    void count() {
        assertEquals(4,test.count(array));
    }

    @Test
    void sum() {
        assertEquals(23, test.sum(array));
    }

    @Test
    void average() {
        assertEquals(23/4, test.average(array));
    }
}