import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Digiwatch {
    @Test
    public void test1() {
        DigitalWatch test1 = new DigitalWatch();
        assertEquals("Turned On!", test1.turnOn());
    }

    @Test
    public void test2() {
        DigitalWatch test2 = new DigitalWatch();
        assertEquals("Turned On!", test2.turnOn());
        assertEquals("Already turned on", test2.turnOn());
    }

    @Test
    public void test3() {
        DigitalWatch test3 = new DigitalWatch();
        assertEquals("Turned On!", test3.turnOn());
        assertEquals("Already turned on", test3.turnOn());
        assertEquals("Turned off", test3.turnOff());
    }

    @Test
    public void test4() {
        DigitalWatch test4 = new DigitalWatch();
        assertEquals("Turned On!", test4.turnOn());
        assertEquals("Timer set", test4.setTimer(10));
    }

    @Test
    public void test5() {
        DigitalWatch test5 = new DigitalWatch();
        assertEquals("Turned On!", test5.turnOn());
        assertEquals("Timer set", test5.setTimer(10));
        assertEquals("Wait for timer to end", test5.doSomething());
    }

    @Test
    public void test6() {
        DigitalWatch test6 = new DigitalWatch();
        assertEquals("Turned On!", test6.turnOn());
        assertEquals("Timer set", test6.setTimer(10));
        test6.isTimerSet = false;
        assertEquals("Accepted", test6.doSomething());
    }

    @Test
    public void test7() {
        DigitalWatch test7 = new DigitalWatch();
        assertEquals("Turned On!", test7.turnOn());
        assertEquals("Timer set", test7.setTimer(10));
        test7.isTimerSet = false;
        assertEquals("Accepted", test7.doSomething());
        assertEquals("Turned off", test7.turnOff());
    }

    @Test
    public void test8() {
        DigitalWatch test8 = new DigitalWatch();
        assertEquals("Turned On!", test8.turnOn());
        assertEquals("Timer set", test8.setTimer(10));
        test8.isTimerSet = false;
        assertEquals("Accepted", test8.doSomething());
        test8.isOpen = false;
        assertEquals("Error", test8.turnOff());
    }

}
