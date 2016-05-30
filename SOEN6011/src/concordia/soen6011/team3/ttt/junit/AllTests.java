package concordia.soen6011.team3.ttt.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TTTBoardTest.class, TTTGameElementTest.class, TTTMenuBarTest.class })
public class AllTests {

}
