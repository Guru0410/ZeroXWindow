package concordia.soen6011.team3.ttt.junit;

import static org.junit.Assert.*;
import java.awt.AWTException;
import org.junit.Test;
import concordia.soen6011.team3.ttt.object.TTTGameElement;
import concordia.soen6011.team3.ttt.object.TTTSquare;
import concordia.soen6011.team3.ttt.object.TTTSymbol;

public class TTTGameElementTest {
	
	TTTGameElement tttga = new TTTSquare();
	TTTGameElement tttgb = new TTTSquare();
	TTTSquare ts1 = new TTTSquare();
	TTTSquare ts2 = new TTTSquare();
	TTTSymbol tsymbol1 = new TTTSymbol(1);
	TTTSymbol tsymbol2 = new TTTSymbol(2);
	
	@Test
	public void testSetWidth() {
		tttga.setWidth(300);
		tttgb.setWidth(400);
		assertNotNull(tttga.getWidth());
		assertEquals(tttga.getWidth(),300);
		assertNotEquals(tttga.getWidth(), tttgb.getWidth());
		tttgb.setWidth(300);
		assertEquals(tttga.getWidth(), tttgb.getWidth());		
	}

	@Test
	public void testSetHeight() throws AWTException {
		tttga.setHeight(300);
		tttgb.setHeight(300);
		assertNotNull(tttga.getHeight());
		assertEquals(tttga.getHeight(), tttgb.getHeight());
		tttgb.setHeight(200);
		assertNotEquals(tttga.getHeight(), tttgb.getHeight());
	}
	@Test
	public void testGetSymbol() throws AWTException {
		ts1.setSymbol(tsymbol1);
		assertNotNull(ts1.getSymbol());
		ts1.setSymbol(tsymbol2);
		assertNotNull(ts1.getSymbol());
		ts2.setSymbol(tsymbol2);
		assertEquals(ts1.getSymbol(),ts2.getSymbol());
		ts2.setSymbol(tsymbol1);
		assertNotEquals(ts1.getSymbol(), ts2.getSymbol());		
	}

}
