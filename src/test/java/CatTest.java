import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    @DisplayName("[10] test constructor")
    void test_constructor(){
        Cat barlow = new Cat("Barlow");
        String expected = "Cat{name='Barlow', isAlive=true}";
        String actual = barlow.toString();
        assertTrue(expected.equals(actual),"Expected:\n"+expected+"\n\nActual:\n"+actual);
        Cat panda = new Cat("Panda");
        expected = "Cat{name='Panda', isAlive=true}";
        actual = panda.toString();
        assertTrue(expected.equals(actual),"Expected:\n"+expected+"\n\nActual:\n"+actual);
    }

    @Test
    @DisplayName("[10] test setName")
    void setName() {
        Cat barlow = new Cat();
        barlow.setName("Barlow");
        String expected = "Cat{name='Barlow', isAlive=true}";
        String actual = barlow.toString();
        assertTrue(expected.equals(actual),"Expected:\n"+expected+"\n\nActual:\n"+actual);
        Cat panda = new Cat();
        panda.setName("Panda");
        expected = "Cat{name='Panda', isAlive=true}";
        actual = panda.toString();
        assertTrue(expected.equals(actual),"Expected:\n"+expected+"\n\nActual:\n"+actual);
    }

    @Test
    @DisplayName("[10] test die")
    void die() {
        Cat barlow = new Cat();
        barlow.die();
        String expected = "Cat{name='Felix', isAlive=false}";
        String actual = barlow.toString();
        assertTrue(expected.equals(actual),"Expected:\n"+expected+"\n\nActual:\n"+actual);
        Cat panda = new Cat();
        panda.die();
        expected = "Cat{name='Felix', isAlive=false}";
        actual = panda.toString();
        assertTrue(expected.equals(actual),"Expected:\n"+expected+"\n\nActual:\n"+actual);
    }
}