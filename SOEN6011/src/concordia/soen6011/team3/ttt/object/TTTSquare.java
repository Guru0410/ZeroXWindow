package concordia.soen6011.team3.ttt.object;

import java.awt.Color;
import java.awt.Graphics2D;

public class TTTSquare extends TTTGameElement {

	/**
	 * Min size in pixels
	 */
	public static final int MIN_SIZE = 30;

	/**
	 * Max size in pixels
	 */
	public static final int MAX_SIZE = 80;

	/**
	 * 
	 */
	public static final boolean MOUSE_ON = true;

	/**
	 * 
	 */
	public static final boolean MOUSE_OFF = false;

	/**
	 * 
	 */
	public static int size;

	/**
	 * 
	 */
	private TTTSymbol tttSymbol;

	/**
	 * 
	 */
	private boolean isMouseOn;

	
	/**
	 * 
	 * @return
	 */
	public boolean isMouseOn() {
		return isMouseOn;
	}

	/**
	 * 
	 */
	public void setMouseOn() {
		this.isMouseOn = TTTSquare.MOUSE_ON;
	}

	/**
	 * 
	 */
	public void setMouseOff() {
		this.isMouseOn = TTTSquare.MOUSE_OFF;
	}

	/**
	 * 
	 * 
	 */
	public TTTSquare() {
		TTTSquare.size = TTTSquare.MIN_SIZE;
		this.tttSymbol = new TTTSymbol();
		this.isMouseOn = false;

	}

	/**
	 * 
	 * 
	 * @param tttSymbol
	 */
	public TTTSquare(TTTSymbol tttSymbol, TTTBoard tttBoard) {
		TTTSquare.size = TTTSquare.MIN_SIZE;
		this.tttSymbol = tttSymbol;
		this.isMouseOn = false;
	}

	/**
	 * 
	 * 
	 * @return
	 */
	public TTTSymbol getSymbol() {
		return this.tttSymbol;
	}

	/**
	 * 
	 * 
	 * @return
	 */
	public void setSymbol(TTTSymbol tttSymbol) {
		this.tttSymbol = tttSymbol;
	}

	/**
	 * 
	 * 
	 * @return
	 */
	public void clean() {
		this.tttSymbol = new TTTSymbol();
	}

	/**
	 * 
	 * 
	 */
	public void drawObject(Graphics2D graphics2d) {

		// draw white square
		if (this.isMouseOn && (this.tttSymbol.getSymbolType() == TTTSymbol.EMPTY_SYMBOL)) {
			graphics2d.setColor(Color.LIGHT_GRAY);
		} else {
			graphics2d.setColor(Color.WHITE);
		}
		graphics2d.fillRect(this.getXPosition(), this.getYPosition(), TTTSquare.size, TTTSquare.size);

		// draw the symbol
		//if (this.tttSymbol.getSymbolType() != TTTSymbol.EMPTY_SYMBOL) {
			TTTSymbol.size = TTTSquare.size * TTTSymbol.RELATIVE_SIZE / 100;
			tttSymbol.setXPosition(this.getXPosition() + (TTTSquare.size - TTTSymbol.size) / 2);
			tttSymbol.setYPosition(this.getYPosition() + (TTTSquare.size - TTTSymbol.size) / 2);
			tttSymbol.drawObject(graphics2d);
		//}

		// draw black edge
		graphics2d.setColor(Color.BLACK);
		graphics2d.drawRect(this.getXPosition(), this.getYPosition(), TTTSquare.size, TTTSquare.size);

	}

}
