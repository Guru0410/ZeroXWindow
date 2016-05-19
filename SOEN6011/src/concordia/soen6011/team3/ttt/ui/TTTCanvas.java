package concordia.soen6011.team3.ttt.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import concordia.soen6011.team3.ttt.listener.AddSymbolMouseListener;
import concordia.soen6011.team3.ttt.ui.TTTFrame;
import concordia.soen6011.team3.ttt.object.TTTBoard;

public class TTTCanvas extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Space in pixels
	 */
	public static final int MIN_SPACE = 30;

	/**
	 * 
	 */
	private AddSymbolMouseListener addSymbolMouseListener;

	/**
	 * 
	 */
	private Graphics2D graphics2d;

	/**
	 * 
	 */
	private TTTFrame tttFrame;

	/**
	 * 
	 */
	private TTTBoard tttBoard;

	/**
	 * 
	 */
	public TTTCanvas(TTTFrame tttFrame, TTTBoard tttBoard) {
		this.tttFrame = tttFrame;
		this.tttBoard = tttBoard;

		// setting mouse listeners
		this.addSymbolMouseListener = new AddSymbolMouseListener(this.tttFrame);
		this.addMouseListener(addSymbolMouseListener);
		this.addMouseMotionListener(addSymbolMouseListener);
	}

	/**
	 * 
	 */
	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		graphics2d = (Graphics2D) graphics;
		this.setBackground(Color.WHITE);

		tttBoard.drawObject(graphics2d);
	}

}
