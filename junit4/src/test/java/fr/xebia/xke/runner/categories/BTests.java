package fr.xebia.xke.runner.categories;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category({SlowTests.class, FastTests.class})
public class BTests {

  @Test
  public void testBoth() {
  }

}
