import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class atm_test {

    @Test
    public void test1() {
        ATM test1 = new ATM();
        test1.isValidatedCard = false;
        assertEquals("Card not validated", test1.enterCard());
    }

    @Test
    public void test2() {
        ATM test2 = new ATM();

        assertEquals("Validated card", test2.enterCard());
    }

    @Test
    public void test3() {
        ATM test3 = new ATM();
        assertEquals("Successful login", test3.enterPassword());
    }

    @Test
    public void test4() {
        ATM test4 = new ATM();
        assertEquals("Validated card", test4.enterCard());
        test4.isValidPassword = false;
        assertEquals("Wrong password", test4.enterPassword());
    }

    @Test
    public void test5() {
        ATM test5 = new ATM();
        assertEquals("Validated card", test5.enterCard());
        assertEquals("Successful login", test5.enterPassword());
        assertEquals("Not enough balance", test5.withdraw(10));
    }

    @Test
    public void test6() {
        ATM test6 = new ATM();
        assertEquals("Validated card", test6.enterCard());
        assertEquals("Successful login", test6.enterPassword());
        assertEquals("Enter valid amount", test6.deposit(20));
        assertEquals("Not enough balance", test6.withdraw(10));
    }

    @Test
    public void test7() {
        ATM test7 = new ATM();
        assertEquals("Validated card", test7.enterCard());
        assertEquals("Successful login", test7.enterPassword());
        assertEquals("Successful deposit", test7.deposit(50));
        assertEquals("Not enough balance", test7.withdraw(10));
    }

    @Test
    public void test8() {
        ATM test8 = new ATM();
        assertEquals("Validated card", test8.enterCard());
        assertEquals("Successful login", test8.enterPassword());
        assertEquals("Successful deposit", test8.deposit(1000));
        assertEquals("Successful withdraw", test8.withdraw(10));
    }

    @Test
    public void test9() {
        ATM test9 = new ATM();
        assertEquals("Validated card", test9.enterCard());
        assertEquals("Successful login", test9.enterPassword());
        assertEquals("Enter valid amount", test9.deposit(50001));
        assertEquals("Not enough balance", test9.withdraw(10));
    }

}