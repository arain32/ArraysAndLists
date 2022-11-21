import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoadAndStoreTest {

    // write all these out too.

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void loadIntArrayFromFile() {
        LoadAndStore loadAndStore = new LoadAndStore();
        String filename = "testIntegerData1.txt";
        assertEquals(4,loadAndStore.loadIntArrayFromFile(filename)[0]);
    }

    @Test
    void loadIntegerArrayListFromFile() {

        LoadAndStore loadAndStore = new LoadAndStore();
        String filename = "testStringData3.txt";
        System.out.println(loadAndStore.loadStringArrayListFromFile(filename));
        assertEquals("Foo", loadAndStore.loadStringArrayListFromFile(filename).get(2));
    }

    @Test
    void loaddoubleArrayFromFile() {
        LoadAndStore loadAndStore = new LoadAndStore();
        String filename = "testDoubleData2.txt";
        System.out.println(loadAndStore.loadStringArrayListFromFile(filename));
        assertEquals("6.34", loadAndStore.loadStringArrayListFromFile(filename).get(2));
    }



    @Test
    void loadDoubleArrayListFromFile() {
        LoadAndStore loadAndStore = new LoadAndStore();
        String filename = "testDoubleData2.txt";
        System.out.println(loadAndStore.loadStringArrayListFromFile(filename));
        assertEquals("6.34", loadAndStore.loadStringArrayListFromFile(filename).get(2));
    }

    @Test
    void loadStringArrayFromFile() {
        LoadAndStore loadAndStore = new LoadAndStore();
        String filename = "testStringData3.txt";
        System.out.println(loadAndStore.loadStringArrayListFromFile(filename));
        assertEquals("11.0001", loadAndStore.loadStringArrayListFromFile(filename).get(3));

    }

    @Test
    void loadStringArrayListFromFile() {
        LoadAndStore loadAndStore = new LoadAndStore();
        String filename = "testStringData3.txt";
        System.out.println(loadAndStore.loadStringArrayListFromFile(filename));
        assertEquals("Lost in Space", loadAndStore.loadStringArrayListFromFile(filename).get(5));


    }
}