import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApacheTest {

    private static final String STRING = "Привет всем кто живет на луне!";

    @Test
    public void testAbbreviate10() {
        String result = StringUtils.abbreviate(STRING, 10);
        Assert.assertEquals(result, "Привет ...");
    }

    @Test
    public void testAbbreviate20() {
        String result = StringUtils.abbreviate(STRING, 20);
        Assert.assertEquals(result, "Привет всем кто ж...");
    }
}
