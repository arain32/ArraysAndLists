import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleListsTest {


    @Test

    void count() {
        AverageDoubleLists test = new AverageDoubleLists();
        ArrayList<Double>array = new ArrayList<>();
        array.add(8.0);
        array.add(3.0);
        array.add(7.0);
        assertEquals(3,test.count(array));
    }

    @Test
    void sum() {
        AverageDoubleLists test = new AverageDoubleLists();
        ArrayList<Double>array = new ArrayList<>();
        array.add(8.0);
        array.add(3.0);
        array.add(7.0);
        assertEquals(18, test.sum(array));
    }

    @Test
    void average() {
        AverageDoubleLists test = new AverageDoubleLists();
        ArrayList<Double>array = new ArrayList<>();
        array.add(8.0);
        array.add(3.0);
        array.add(7.0);
        assertEquals(18/3, test.average(array));
    }
}