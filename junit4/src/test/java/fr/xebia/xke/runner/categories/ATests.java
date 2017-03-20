package fr.xebia.xke.runner.categories;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ATests {

  @Test
  public void test() {
  }

  @Category(SlowTests.class)
  @Test
  public void slowTest() {
  }

  @Category(FastTests.class)
  @Test
  public void fastTest() {
  }

}
