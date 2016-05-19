package concordia.soen6011.team3.ttt.object;

import java.awt.Graphics2D;

import concordia.soen6011.team3.ttt.ui.TTTCanvas;
import concordia.soen6011.team3.ttt.ui.TTTFrame;

/**
 * 
 * @author Team 3
 * @version 1.0
 *
 */
public class TTTBoard extends TTTGameElement {

	/**
	 * 
	 */
	private int columns;

	/**
	 * 
	 */
	private int rows;

	/**
	 * 
	 */
	private TTTSquare[][] tttSquares;

	/**
	 * 
	 */
	public static final int MIN_COLUMNS = 3;

	/**
	 * 
	 */
	public static final int MIN_ROWS = 3;

	/**
	 * 
	 */
	public static final int MAX_COLUMNS = 40;

	/**
	 * 
	 */
	public static final int MAX_ROWS = 20;

	/**
	 * 
	 */
	public static final boolean X_TURN = true;

	/**
	 * 
	 */
	public static final boolean O_TURN = false;

	/**
	 * 
	 */
	private TTTFrame tttFrame;

	/**
	 * 
	 */
	private boolean playerTurn;

	/**
	 * 
	 */
	public TTTBoard(TTTFrame tttFrame) {

		this.tttFrame = tttFrame;

		// init board dimension
		this.columns = TTTBoard.MIN_COLUMNS;
		this.rows = TTTBoard.MIN_ROWS;

		// init squares
		this.tttSquares = new TTTSquare[this.columns][this.rows];
		for (int col = 0; col < this.columns; col++) {
			for (int row = 0; row < this.rows; row++) {
				tttSquares[col][row] = new TTTSquare();
			}
		}

		// init player
		playerTurn = TTTBoard.O_TURN;
	}

	/**
	 * 
	 * @param boardWidth
	 * @param boardHeight
	 */
	public TTTBoard(int columns, int rows) {
		// init board dimension
		this.columns = columns;
		this.rows = rows;

		// init squares
		this.tttSquares = new TTTSquare[this.columns][this.rows];
		for (int col = 0; col < this.columns; col++) {
			for (int row = 0; row < this.rows; row++) {
				tttSquares[col][row] = new TTTSquare();
			}
		}

		// init player
		this.playerTurn = TTTBoard.O_TURN;

	}

	/**
	 * 
	 * @return
	 */
	public boolean getPlayerTurn() {
		return playerTurn;
	}

	/**
	 * 
	 */
	public void nextPlayerTurn() {
		if (this.playerTurn == TTTBoard.O_TURN)
			this.playerTurn = TTTBoard.X_TURN;
		else
			this.playerTurn = TTTBoard.O_TURN;
	}

	/**
	 * 
	 * @return
	 */
	public int getColumns() {
		return this.columns;
	}

	/**
	 * 
	 * @param boardWidth
	 */
	public void setColumns(int columns) {
		// values of columns delimited by MIN_COLUMNS and MAX_COLUMNS
		if (columns < TTTBoard.MIN_COLUMNS) {
			this.columns = TTTBoard.MIN_COLUMNS;
		} else if (columns > TTTBoard.MAX_COLUMNS) {
			this.columns = TTTBoard.MAX_COLUMNS;
		} else {
			this.columns = columns;
		}
	}

	/**
	 * 
	 * @return
	 */
	public int getRows() {
		return rows;
	}

	/**
	 * 
	 * @param boardHeight
	 */
	public void setBoardHeight(int rows) {
		// values of columns delimited by MIN_ROWS and MAX_ROWS
		if (rows < TTTBoard.MIN_ROWS) {
			this.rows = TTTBoard.MAX_ROWS;
		} else if (rows > TTTBoard.MAX_ROWS) {
			this.rows = TTTBoard.MAX_ROWS;
		} else {
			this.rows = rows;
		}
	}

	/**
	 * 
	 * @return
	 */
	public TTTSquare[][] getTTTSquares() {
		return tttSquares;
	}

	/**
	 * 
	 * @param tttSquares
	 */
	public void setTTTSquares(TTTSquare[][] tttSquares) {
		this.tttSquares = tttSquares;
	}

	/**
	 * 
	 * 
	 */
	public void drawObject(Graphics2D graphics2d) {

		// dynamic square size and board position
		int xSpace = this.tttFrame.getTTTCanvas().getWidth() - 2 * TTTCanvas.MIN_SPACE;
		int ySpace = this.tttFrame.getTTTCanvas().getHeight() - 2 * TTTCanvas.MIN_SPACE;

		if (xSpace > ySpace) {
			TTTSquare.size = ySpace / this.rows;
			this.setXPosition((this.tttFrame.getTTTCanvas().getWidth() - TTTSquare.size * this.columns) / 2);
			this.setYPosition(TTTCanvas.MIN_SPACE);
		} else {
			TTTSquare.size = xSpace / this.columns;
			this.setXPosition(TTTCanvas.MIN_SPACE);
			this.setYPosition((this.tttFrame.getTTTCanvas().getHeight() - TTTSquare.size * this.rows) / 2);
		}

		// draw squares, which are the board
		for (int col = 0; col < this.columns; col++) {
			for (int row = 0; row < this.rows; row++) {
				tttSquares[col][row].setXPosition(this.getXPosition() + col * TTTSquare.size);
				tttSquares[col][row].setYPosition(this.getYPosition() + row * TTTSquare.size);
				tttSquares[col][row].drawObject(graphics2d);
			}
		}
	}

}
