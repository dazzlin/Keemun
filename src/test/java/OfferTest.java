//import org.junit.Assert;
//import org.junit.Test;

public class OfferTest {
  @Test
  public void testcreateoffer() {
    Offer myoffer = new Offer(new Wage(5));
    Assert.assertEquals(myoffer.getPrice(),Wage(5));
  }
}
