package igoristomin.calc.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainControllerTest {

    private final MainController mainController = new MainController();

    // Add
    @Test
    void testAdd() {
        assertEquals(mainController.showIndex("add", 3, 2), "5");
    }

    // Subtract
    @Test
    void testSub() {
        assertEquals(mainController.showIndex("sub", 3, 2), "1");
    }

    // Multiply
    @Test
    void testMult() {
        assertEquals(mainController.showIndex("mult", 3, 2), "6");
    }

    // Divide
    @Test
    void testDiv() {
        assertEquals(mainController.showIndex("div", 3, 2), "1,5");
    }

}