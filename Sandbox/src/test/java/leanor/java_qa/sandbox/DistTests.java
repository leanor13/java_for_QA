package leanor.java_qa.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by leanor on 24.07.2016.
 */

public class DistTests {

  @Test
  public void TestDistance1() {
    Point p1 = new Point(4,0);
    Point p2 = new Point(1,4);
    Assert.assertEquals(p1.distance(p2), 5.0);
  }

  @Test
  public void TestDistance2() {
    Point p3 = new Point(1,8);
    Point p4 = new Point(5,5);
    Assert.assertEquals(p3.distance(p4), 5.0);
  }
  @Test
  public void TestDistance3() {
    Point p3 = new Point(1,8);
    Point p4 = new Point(5,5);
    Assert.assertEquals(p3.distance(p4), 6);
  }


}
