import org.junit.Assert;
import org.junit.Test;

public class WageTest {
  @Test
  public void testWageComparasion() {
    Assert.assertEquals(new Wage(5), new Wage(5));
    Assert.assertNotEquals(new Wage(5), new Wage(6));
  }
}
