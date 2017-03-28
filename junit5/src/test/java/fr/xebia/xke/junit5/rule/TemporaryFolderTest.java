package fr.xebia.xke.junit5.rule;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.migrationsupport.rules.EnableRuleMigrationSupport;
import org.junit.rules.TemporaryFolder;

import java.io.File;

import static org.junit.Assert.assertTrue;

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
