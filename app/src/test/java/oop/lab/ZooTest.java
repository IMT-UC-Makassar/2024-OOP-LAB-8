package oop.lab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ZooTest {

    private Lion lion;
    private Bat bat;
    private Penguin penguin;
    private Dolphin dolphin;
    private Animal[] zoo;

    @BeforeEach
    public void setUp() {
        lion = new Lion("Simba", 5);
        bat = new Bat("Bruce", 3);
        penguin = new Penguin("Pingu", 4);
        dolphin = new Dolphin("Echo", 7);

        zoo = new Animal[] { lion, bat, penguin, dolphin };
    }

    @Test
    public void testLion() {
        assertEquals("Simba", lion.getName());
        assertEquals(5, lion.getAge());
        assertEquals("Mammal - Lion", lion.getType());
    }

    @Test
    public void testBat() {
        assertEquals("Mammal - Bat", bat.getType());
        assertTrue(bat instanceof Flyable);
    }

    @Test
    public void testPenguin() {
        assertEquals("Pingu", penguin.getName());
        assertEquals("Penguin", penguin.getType());
        assertTrue(penguin instanceof Swimmable);
    }

    @Test
    public void testDolphin() {
        assertEquals("Echo", dolphin.getName());
        assertEquals(7, dolphin.getAge());
        assertEquals("Mammal - Dolphin", dolphin.getType());
        assertTrue(dolphin instanceof Swimmable);
    }

    @Test
    public void testPolymorphism() {
        assertEquals("Mammal - Lion", zoo[0].getType());
        assertEquals("Mammal - Bat", zoo[1].getType());
        assertEquals("Penguin", zoo[2].getType());
        assertEquals("Mammal - Dolphin", zoo[3].getType());
    }
}
