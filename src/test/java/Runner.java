import listeners.TestListeners;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        TestNG testNG = new TestNG();
        testNG.addListener(new TestListeners());
        XmlSuite suite = new XmlSuite();
        suite.setSuiteFiles(Collections.singletonList("./src/test/java/resources/testng.xml"));
        List<XmlSuite> listSuites = new ArrayList<>();
        listSuites.add(suite);
        testNG.setXmlSuites(listSuites);
        testNG.run();
    }
}
