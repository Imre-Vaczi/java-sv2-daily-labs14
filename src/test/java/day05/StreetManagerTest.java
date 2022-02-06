package day05;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class StreetManagerTest {

    @Test
    void testInit() {
        StreetManager sm = new StreetManager();
        assertEquals(0, sm.getStreet().size());
    }

    @Test
    void testReadFile() {
        Path path = Paths.get("src/test/resources/streets.txt");
        StreetManager sm = new StreetManager();
        sm.readFile(path);

        assertEquals(2, sm.getStreet().size());
        System.out.println(sm.getStreet().toString());
    }

}