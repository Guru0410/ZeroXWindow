package concordia.soen6011.team3.ttt.junit;

import static org.junit.Assert.*;
import java.awt.AWTException;
import org.junit.Test;
import concordia.soen6011.team3.ttt.object.TTTGameElement;
import concordia.soen6011.team3.ttt.object.TTTSquare;
import concordia.soen6011.team3.ttt.object.TTTSymbol;
import concordia.soen6011.team3.ttt.ui.TTTCanvas;
import concordia.soen6011.team3.ttt.ui.TTTFrame;

public class TTTGameElementTest {
	
	TTTGameElement tttga = new TTTSquare();
	TTTGameElement tttgb = new TTTSquare();
	TTTSquare ts1 = new TTTSquare();
	TTTSquare ts2 = new TTTSquare();
	TTTSymbol tsymbol1 = new TTTSymbol(1);
	TTTSymbol tsymbol2 = new TTTSymbol(2);
	TTTFrame tf1 = new TTTFrame();
	TTTFrame tf2 = new TTTFrame();
	
	//Validating that the symbols are placed properly on board.
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

	
	//Testing if the canvas, canvas scroll pane and game board are created for the board.
	@Test
	public void testNewBoard() {
		
		assertNull(tf1.getTTTCanvas());
		assertNull(tf1.getTTTBoard());
		assertNull(tf1.getCanvasScrollPane());
		tf1.newBoard();
		assertNotNull(tf1.getTTTCanvas());
		tf2.newBoard();
		assertNotNull(tf1.getTTTBoard());
		assertNotNull(tf2.getTTTBoard());
		assertNotNull(tf1.getCanvasScrollPane());
		assertNotNull(tf2.getCanvasScrollPane());
	}
	
	
	//Testing the setWidth method for the board.
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

	//Testing the setHeight method for the board.
	@Test
	public void testSetHeight() throws AWTException {
		tttga.setHeight(300);
		tttgb.setHeight(300);
		assertNotNull(tttga.getHeight());
		assertEquals(tttga.getHeight(), tttgb.getHeight());
		tttgb.setHeight(200);
		assertNotEquals(tttga.getHeight(), tttgb.getHeight());
	}
	
	

}
