import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JUnitTest {
    
    private MyNowDate test;

    @Before
    public void setUp() {
        test = new MyNowDate();
    }

    @After
    public void close() {
        test = null;
    }

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

}
