package fr.xebia.xke.junit5.extension.rule;

import static org.junit.Assert.assertTrue;

import java.io.File;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.migrationsupport.rules.EnableRuleMigrationSupport;
import org.junit.rules.TemporaryFolder;

@EnableRuleMigrationSupport
public class TemporaryFolderTest {

  @Rule
  public TemporaryFolder tempFolder = new TemporaryFolder();

  @Test
  public void testFile() throws Exception {
    File testFolder = tempFolder.newFolder("TestFolder");
    File testFile = tempFolder.newFile("test.txt");
    System.out.println(testFile);
    assertTrue(testFolder.exists());
    assertTrue(testFile.exists());
  }

}
