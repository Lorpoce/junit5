package fr.xebia.xke.runner.enclosed;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class EnclosedTests {

  // ...useful shared stuff...

  public static class InnerTest1 {

    @Before
    public void innerBefore() {
    }

    @Test
    public void innerTest() {

    }
  }

  //<editor-fold desc="Description">
  public static class InnerTest2 {
    //</editor-fold>

    @Before
    public void innerBefore() {
    }

    @Test
    public void innerTest() {

    }
  }

  // Ignored
  public abstract static class AbstractInnerTest {

    @Test
    public void ignored() {

    }
  }
}
