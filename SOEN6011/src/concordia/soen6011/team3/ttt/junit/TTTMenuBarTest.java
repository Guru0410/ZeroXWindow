package concordia.soen6011.team3.ttt.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import concordia.soen6011.team3.ttt.ui.TTTFrame;
import concordia.soen6011.team3.ttt.ui.TTTMenuBar;

public class TTTMenuBarTest {
	TTTFrame f1 = new TTTFrame();
	TTTMenuBar mb1 = new TTTMenuBar(f1);
	TTTMenuBar mb2 = new TTTMenuBar(f1);
	@Test
	public void testComponentCount() {
		
		assertNotNull(mb1.getComponentCount());
		assertEquals(mb1.getComponentCount(), mb2.getComponentCount());
		assertEquals(mb1.getComponentCount(), mb2.getComponentCount());
	
	}
	
	@Test
	public void testComponentName() {
		
		assertEquals(mb1.getComponent(0).getName(), "Start Game Menu");
		assertEquals(mb1.getComponent(1).getName(), "About Game Menu");
		assertEquals(mb1.getComponent(0).getName(), mb2.getComponent(0).getName());
		assertEquals(mb1.getComponent(1).getName(), mb2.getComponent(1).getName());
	}
	
	@Test
	public void testComponentVisibility() {
		
		assertEquals(mb1.getComponent(0).isVisible(), true);
		assertEquals(mb1.getComponent(1).isVisible(), true);
		assertEquals(mb1.getComponent(0).isVisible(), mb2.getComponent(0).isVisible());
		assertEquals(mb1.getComponent(1).isVisible(), mb2.getComponent(1).isVisible());
		
	}
}
