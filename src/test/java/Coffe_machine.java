import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Coffe_machine {


    @Test
    public void test1() {
        CoffeMachine test1 = new CoffeMachine();
        assertEquals("Power On!" + "Lights On!", test1.openMachine());
    }

    @Test
    public void test2() {
        CoffeMachine test2 = new CoffeMachine();
        test2.isPowerOn = true;
        assertEquals("Error!", test2.openMachine());
    }

    @Test
    public void test3() {
        CoffeMachine test3 = new CoffeMachine();
        assertEquals("Turn Machine On first!", test3.addMoney(30));
    }

    @Test
    public void test4() {
        CoffeMachine test4 = new CoffeMachine();
        test4.openMachine();
        assertEquals("Successfully added money", test4.addMoney(30));
    }

    @Test
    public void test5() {
        CoffeMachine test5 = new CoffeMachine();
        test5.openMachine();
        test5.closeMachine();
        assertEquals("Turn Machine On first!", test5.addMoney(30));
    }

}