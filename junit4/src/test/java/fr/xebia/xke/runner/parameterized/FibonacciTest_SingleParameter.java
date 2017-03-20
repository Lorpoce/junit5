package fr.xebia.xke.runner.parameterized;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FibonacciTest_SingleParameter {

  @Parameter
  public String data;

  @Parameters
  public static Iterable<? extends Object> data() {
    return Arrays.asList("first test", "second test");
  }

  @Test
  public void test() {
    assertTrue(Arrays.asList("first test", "second test").contains(data));
  }

}
