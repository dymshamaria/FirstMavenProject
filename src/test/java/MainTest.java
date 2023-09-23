import org.example.Main;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {

    @Test
    public void testSum0() {
        int result = Main.sum(0, 0);
        Assert.assertEquals(result, 0);
    }

    @Test
    public void testSum1() {
        int result = Main.sum(10, 5);
        Assert.assertEquals(result, 15);
    }

    @Test
    public void testSum2() {
        int result = Main.sum(Integer.MAX_VALUE, 1);
        Assert.assertEquals(result, Integer.MIN_VALUE);
    }

    @Test
    public void testMin() {
        int result = Main.min(12, 7);
        Assert.assertEquals(result, 5);
    }

    @Test
    public void testSub() {
        int result = Main.sub(8, 3);
        Assert.assertEquals(result, 24);
    }

    @Test
    public void testDe0() {
        int result = Main.del(6, 3);
        Assert.assertEquals(result, 2);
    }

    @Test
    public void testDel1() {
        int result = Main.del(8, 2);
        Assert.assertEquals(result, 4);
    }
}