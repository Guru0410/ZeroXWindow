package concordia.soen6011.team3.ttt.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import concordia.soen6011.team3.ttt.object.TTTBoard;

/**
 * 
 * 
 * @author Team 3
 * @version 1.0
 */
public class TTTFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private TTTMenuBar tttMenuBar;
	
	/**
	 * 
	 */
	private JLabel welcomeMessageLabel;

	/**
	 * 
	 */
	private JScrollPane canvasScrollPane;
	
	/**
	 * 
	 */
	private TTTCanvas tttCanvas;
	
	/**
	 * 
	 */
	private TTTBoard tttBoard;

	/**
	 * 
	 * @return
	 */
	public TTTBoard getTTTBoard() {
		return tttBoard;
	}

	/**
	 * 
	 */
	private TTTFrame tttFrame;

	/**
	 * 
	 * 
	 */
	public TTTFrame() {
		initComponents();
	}

	/**
	 * 
	 * 
	 */
	private void initComponents() {

		welcomeMessageLabel = new JLabel();

		this.setTitle("Tic-Tac-Toe");
		this.setPreferredSize(new Dimension(600, 600));
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setLocationRelativeTo(this.getOwner());

		welcomeMessageLabel.setText("Welcome to ZeroX");
		welcomeMessageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		welcomeMessageLabel.setOpaque(true);
		this.add(welcomeMessageLabel, BorderLayout.CENTER);

		this.tttFrame = this;

		tttMenuBar = new TTTMenuBar(tttFrame);
		this.setJMenuBar(tttMenuBar);

	}

	/**
	 * 
	 * 
	 */
	public void newBoard() {

		if (canvasScrollPane != null)
			this.remove(canvasScrollPane);

		tttBoard = new TTTBoard(tttFrame);

		tttCanvas = new TTTCanvas(this.tttFrame, this.tttBoard);
		canvasScrollPane = new JScrollPane(tttCanvas);

		this.remove(welcomeMessageLabel);

		this.add(canvasScrollPane, BorderLayout.CENTER);

		this.validate();
		this.repaint();

	}

	/**
	 * 
	 * @return
	 */
	public JScrollPane getCanvasScrollPane() {
		return canvasScrollPane;
	}

	/**
	 * 
	 * @param canvasScrollPane
	 */
	public void setCanvasScrollPane(JScrollPane canvasScrollPane) {
		this.canvasScrollPane = canvasScrollPane;
	}

	/**
	 * 
	 * @return
	 */
	public TTTCanvas getTTTCanvas() {
		return tttCanvas;
	}

}