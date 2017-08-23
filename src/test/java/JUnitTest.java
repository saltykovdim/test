import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JUnitTest {

    private MyNowDate test = new MyNowDate();

    @Test
    public void testEquals_1() {
        Assert.assertEquals("Good evening, World!", test.printString(22));

    }

    @Test
    public void testEquals_2() {
        Assert.assertEquals("Good evening, World!", test.printString(20));

    }

    @Test
    public void testEquals_3() {
        Assert.assertEquals("Good morning, World!", test.printString(7));

    }

    @Test
    public void testEquals_4() {
        Assert.assertEquals("Good morning, World!", test.printString(6));

    }

    @Test
    public void testEquals_5() {
        Assert.assertEquals("Good night, World!", test.printString(23));

    }
}
