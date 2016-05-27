package concordia.soen6011.team3.ttt.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import concordia.soen6011.team3.ttt.object.TTTBoard;

public class TTTBoardTest {

	TTTBoard ttta = new TTTBoard(3,3);
	TTTBoard tttb = new TTTBoard(3,3);
	TTTBoard tttc = new TTTBoard((int)3.9, (int)3.9);
	
	// Test toggle of turn between both the players
	@Test
	public void testNextTurn() {
		assertEquals(ttta.getPlayerTurn(), false);
		assertEquals(ttta.getPlayerTurn(),tttb.getPlayerTurn());
		ttta.nextPlayerTurn();
		assertEquals(ttta.getPlayerTurn(),true);
		assertNotEquals(ttta.getPlayerTurn(),tttb.getPlayerTurn());
		tttb.nextPlayerTurn();
		assertEquals(ttta.getPlayerTurn(),tttb.getPlayerTurn());
		
	}
	
	//Test ValidBoard functionality.
	@Test
	public void testValidBoard()
	{
		assertTrue(ttta.validBoard(3, 3));
		assertFalse(ttta.validBoard(3, 4));
		assertEquals(ttta.validBoard(3, 3), tttb.validBoard(4, 4));
		
	}
	
	
	//Test the board width i.e. columns are delimited by min and max columns.
	@Test
	public void testSetColumns()
	{
		ttta.setColumns(3);
		assertEquals(ttta.getColumns(),3);
		ttta.setColumns(4);
		assertNotSame(ttta.getColumns(),3);
		//test if number of columns are less than min then assign min value for number of columns.
		ttta.setColumns(1);
		assertEquals(ttta.getColumns(), 3);
		//test if number of columns are more than max value then assign max value for number of columns.
		ttta.setColumns(10001);
		assertEquals(ttta.getColumns(), 40);
		
	}
	
	//Test that the board height is delimited by max and min rows.
	@Test
	public void testSetRows()
	{	
		ttta.setBoardHeight(4);
		assertEquals(ttta.getRows(), 4);
		//test if the number of rows are less than min then assign the max value.
		ttta.setBoardHeight(1);
		assertNotSame(ttta.getRows(), 1);
		assertEquals(ttta.getRows(), 20);
		//test if the number of rows are more than max then assign the max value.
		ttta.setBoardHeight(30);
		assertEquals(ttta.getRows(), 20);
				
	}
}
