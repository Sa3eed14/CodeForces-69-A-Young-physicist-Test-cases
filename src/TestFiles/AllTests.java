package TestFiles;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ EquilibriumTests.class, NotEquilbriumTests.class })
public class AllTests {

}
