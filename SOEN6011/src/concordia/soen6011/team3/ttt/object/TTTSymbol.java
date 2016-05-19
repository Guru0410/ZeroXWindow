package concordia.soen6011.team3.ttt.object;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 * 
 * @author Team 3
 * @version 1.0
 */
public class TTTSymbol extends TTTGameElement {

	/**
	 * 
	 */
	public static final int EMPTY_SYMBOL = 0;

	/**
	 * 
	 */
	public static final int O_SYMBOL = 1;

	/**
	 * 
	 */
	public static final int X_SYMBOL = 2;

	// relative size to square, in percentage
	/**
	 * 
	 */
	public static final int RELATIVE_SIZE = 75;

	/**
	 * 
	 */
	private int symbolType;

	/**
	 * 
	 */
	public static int size;
	
	/**
	 * 
	 */
	private TTTBoard tttBoard;
	
	/**
	 * 
	 */
	private boolean isMouseOn;

	
	/**
	 * 
	 */
	public void setMouseOn(boolean isMouseOn) {
		this.isMouseOn = isMouseOn;
	}

	
	
	/**
	 * 	
	 * @param tttBoard
	 */
	public void setTTTBoard(TTTBoard tttBoard) {
		this.tttBoard = tttBoard;
	}
	

	// attributes to draw X symbol
	private int[] xpoints = new int[4];
	private int[] ypoints = new int[4];

	/**
	 * 
	 */
	public TTTSymbol() {
		this.symbolType = TTTSymbol.EMPTY_SYMBOL;
	}

	/**
	 * 
	 * @param symbolType
	 */
	public TTTSymbol(int symbolType) {
		this.symbolType = symbolType;
	}


	/**
	 * 
	 * @param symbolType
	 */
	public TTTSymbol(int symbolType, TTTBoard tttBoard) {
		this.symbolType = symbolType;
		this.tttBoard = tttBoard;
	}

	/**
	 * 
	 * @return
	 */
	public int getSymbolType() {
		return symbolType;
	}

	/**
	 * 
	 * @param symbolType
	 */
	public void setSymbolType(int symbolType) {
		this.symbolType = symbolType;
	}

	/**
	 * 
	 */
	public void drawObject(Graphics2D graphics2d) {

		if(this.symbolType == TTTSymbol.EMPTY_SYMBOL)
			graphics2d.setColor(Color.BLACK);
		else
			graphics2d.setColor(Color.BLUE);
		
		if ( (this.symbolType == TTTSymbol.X_SYMBOL) || ((this.tttBoard.getPlayerTurn() == TTTBoard.X_TURN) && this.isMouseOn) ) {
			// draw X
			xpoints[0] = this.getXPosition() + (int) (TTTSymbol.size * 0.1 * 0.707);
			xpoints[1] = this.getXPosition() - (int) (TTTSymbol.size * 0.1 * 0.707);
			xpoints[2] = this.getXPosition() + TTTSymbol.size - (int) (TTTSymbol.size * 0.1 * 0.707);
			xpoints[3] = this.getXPosition() + TTTSymbol.size + (int) (TTTSymbol.size * 0.1 * 0.707);
			ypoints[0] = this.getYPosition() - (int) (TTTSymbol.size * 0.1 * 0.707);
			ypoints[1] = this.getYPosition() + (int) (TTTSymbol.size * 0.1 * 0.707);
			ypoints[2] = this.getYPosition() + TTTSymbol.size + (int) (TTTSymbol.size * 0.1 * 0.707);
			ypoints[3] = this.getYPosition() + TTTSymbol.size - (int) (TTTSymbol.size * 0.1 * 0.707);
			graphics2d.fillPolygon(xpoints, ypoints, 4);

			xpoints[0] = this.getXPosition() + TTTSymbol.size - (int) (TTTSymbol.size * 0.1 * 0.707);
			xpoints[1] = this.getXPosition() + TTTSymbol.size + (int) (TTTSymbol.size * 0.1 * 0.707);
			xpoints[2] = this.getXPosition() + (int) (TTTSymbol.size * 0.1 * 0.707);
			xpoints[3] = this.getXPosition() - (int) (TTTSymbol.size * 0.1 * 0.707);
			ypoints[0] = this.getYPosition() - (int) (TTTSymbol.size * 0.1 * 0.707);
			ypoints[1] = this.getYPosition() + (int) (TTTSymbol.size * 0.1 * 0.707);
			ypoints[2] = this.getYPosition() + TTTSymbol.size + (int) (TTTSymbol.size * 0.1 * 0.707);
			ypoints[3] = this.getYPosition() + TTTSymbol.size - (int) (TTTSymbol.size * 0.1 * 0.707);
			graphics2d.fillPolygon(xpoints, ypoints, 4);

		} else if ( (this.symbolType == TTTSymbol.O_SYMBOL) || ((this.tttBoard.getPlayerTurn() == TTTBoard.O_TURN) && this.isMouseOn)) {
			// draw O
			graphics2d.fillOval(this.getXPosition(), this.getYPosition(), TTTSymbol.size, TTTSymbol.size);
			
			if(this.symbolType == TTTSymbol.EMPTY_SYMBOL)
				graphics2d.setColor(Color.LIGHT_GRAY);
			else
				graphics2d.setColor(Color.WHITE);
			
			graphics2d.fillOval(this.getXPosition() + (int) (TTTSymbol.size * 0.15),
					this.getYPosition() + (int) (TTTSymbol.size * 0.15), (int) (TTTSymbol.size * 0.7),
					(int) (TTTSymbol.size * 0.7));
		} 
		
		
	}

}
