package concordia.soen6011.team3.ttt.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import concordia.soen6011.team3.ttt.object.TTTBoard;

public class TTTBoardTest {

	TTTBoard ttta = new TTTBoard(3,3);
	TTTBoard tttb = new TTTBoard(3,3);
	TTTBoard tttc = new TTTBoard((int)3.9, (int)3.9);
	
	
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
	
	@Test
	public void testValidBoard()
	{
		assertTrue(ttta.validBoard(3, 3));
		assertFalse(ttta.validBoard(3, 4));
		assertEquals(ttta.validBoard(3, 3), tttb.validBoard(4, 4));
		
	}
	
	@Test
	public void testSetColumns()
	{
		ttta.setColumns(3);
		assertEquals(ttta.getColumns(),3);
		
	}

	@Test
	public void testSetRows()
	{
		assertEquals(tttc.getRows(), 3);
				
	}
}
