package concordia.soen6011.team3.ttt.listener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import concordia.soen6011.team3.ttt.object.TTTBoard;
import concordia.soen6011.team3.ttt.object.TTTSquare;
import concordia.soen6011.team3.ttt.object.TTTSymbol;
import concordia.soen6011.team3.ttt.ui.TTTFrame;

/**
 * 
 * @author Team 3
 * @version 1.0
 *
 */
public class AddSymbolMouseListener extends MouseAdapter {

	/**
	 * 
	 */
	private TTTFrame tttFrame;

	/**
	 * 
	 * @param tttBoard
	 */
	public AddSymbolMouseListener(TTTFrame tttFrame) {
		this.tttFrame = tttFrame;
	}

	/**
	 * X
	 * 
	 * @param mouseEvent
	 *            X
	 */
	public void mouseClicked(MouseEvent mouseEvent) {
		for (int col = 0; col < this.tttFrame.getTTTBoard().getColumns(); col++) {
			for (int row = 0; row < this.tttFrame.getTTTBoard().getRows(); row++) {
				if (this.tttFrame.getTTTBoard().getTTTSquares()[col][row].isMouseOn()
						&& (this.tttFrame.getTTTBoard().getTTTSquares()[col][row].getSymbol()
								.getSymbolType() == TTTSymbol.EMPTY_SYMBOL)) {

					if (this.tttFrame.getTTTBoard().getPlayerTurn() == TTTBoard.O_TURN) {
						this.tttFrame.getTTTBoard().getTTTSquares()[col][row]
								.setSymbol(new TTTSymbol(TTTSymbol.O_SYMBOL, this.tttFrame.getTTTBoard()));
					} else {
						this.tttFrame.getTTTBoard().getTTTSquares()[col][row]
								.setSymbol(new TTTSymbol(TTTSymbol.X_SYMBOL, this.tttFrame.getTTTBoard()));
					}
					this.tttFrame.getTTTBoard().nextPlayerTurn();

				}
			}
		}

		this.tttFrame.getTTTCanvas().validate();
		this.tttFrame.getTTTCanvas().repaint();

	}

	/**
	 * X
	 * 
	 * @param mouseEvent
	 *            X
	 */
	public void mouseDragged(MouseEvent mouseEvent) {

	}

	/**
	 * X
	 * 
	 * @param mouseEvent
	 *            X
	 */
	public void mouseEntered(MouseEvent mouseEvent) {

	}

	/**
	 * X
	 * 
	 * @param mouseEvent
	 *            X
	 */
	public void mouseMoved(MouseEvent mouseEvent) {
		for (int col = 0; col < this.tttFrame.getTTTBoard().getColumns(); col++) {
			for (int row = 0; row < this.tttFrame.getTTTBoard().getRows(); row++) {

				if ((this.tttFrame.getTTTBoard().getTTTSquares()[col][row].getXPosition() < mouseEvent.getX())
						&& ((this.tttFrame.getTTTBoard().getTTTSquares()[col][row].getXPosition()
								+ TTTSquare.size) > mouseEvent.getX())
						&& (this.tttFrame.getTTTBoard().getTTTSquares()[col][row].getYPosition() < mouseEvent.getY())
						&& ((this.tttFrame.getTTTBoard().getTTTSquares()[col][row].getYPosition()
								+ TTTSquare.size) > mouseEvent.getY())) {
					this.tttFrame.getTTTBoard().getTTTSquares()[col][row].setMouseOn();
				} else {
					this.tttFrame.getTTTBoard().getTTTSquares()[col][row].setMouseOff();
				}

			}
		}

		this.tttFrame.getTTTCanvas().validate();
		this.tttFrame.getTTTCanvas().repaint();

	}

	/**
	 * X
	 * 
	 * @param mouseEvent
	 *            X
	 */
	public void mouseExited(MouseEvent mouseEvent) {

	}

	/**
	 * X
	 * 
	 * @param mouseEvent
	 *            X
	 */
	public void mousePressed(MouseEvent mouseEvent) {

	}

	/**
	 * X
	 * 
	 * @param mouseEvent
	 *            X
	 */
	public void mouseReleased(MouseEvent mouseEvent) {

	}

}
