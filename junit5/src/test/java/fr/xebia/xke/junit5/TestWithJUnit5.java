package fr.xebia.xke.junit5;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.runner.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages({"fr.xebia.xke.junit5.extension"})
public class TestWithJUnit5 {

}
