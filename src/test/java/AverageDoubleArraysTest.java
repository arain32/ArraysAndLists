import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleArraysTest {
    AverageDoubleArrays test;
    double[]array;

    @BeforeEach
    void setUp() {
        test = new AverageDoubleArrays();
     array=new double[]{5.0,9.0,3.0};
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void count() {
        assertEquals(array.length, test.count(array));
    }

    @Test
    void sum() {

        assertEquals(17.0, test.sum(array));
    }

    @Test
    void average() {
        assertEquals(17/3 ,test.average(array));
    }
}