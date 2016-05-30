package concordia.soen6011.team3.ttt.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import concordia.soen6011.team3.ttt.ui.TTTFrame;
import concordia.soen6011.team3.ttt.ui.TTTMenuBar;

public class TTTMenuBarTest {
	TTTFrame f1 = new TTTFrame();
	TTTMenuBar mb1 = new TTTMenuBar(f1);
	TTTMenuBar mb2 = new TTTMenuBar(f1);
	
	//To check if all the components are instantiated properly.
	@Test
	public void testComponentCount() {
		
		assertNotNull(mb1.getComponentCount());
		assertEquals(mb1.getComponentCount(), mb2.getComponentCount());
		assertEquals(mb1.getComponentCount(), mb2.getComponentCount());
	
	}
	
	
	//To check that correct components are displayed on the screen every-time.
	@Test
	public void testComponentName() {
		
		assertEquals(mb1.getComponent(0).getName(), "Start Game Menu");
		assertEquals(mb1.getComponent(1).getName(), "About Game Menu");
		assertEquals(mb1.getComponent(0).getName(), mb2.getComponent(0).getName());
		assertEquals(mb1.getComponent(1).getName(), mb2.getComponent(1).getName());
	}
	
	//To check the visibility of the components that should be displayed.
	@Test
	public void testComponentVisibility() {
		
		for(int i=0;i<mb1.getComponentCount();i++ )
		{
		assertEquals(mb1.getComponent(i).isVisible(), true);
		}
		
		assertEquals(mb1.getComponent(0).isVisible(), mb2.getComponent(0).isVisible());
		assertEquals(mb1.getComponent(1).isVisible(), mb2.getComponent(1).isVisible());
		
	}
}
