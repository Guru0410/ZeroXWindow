package concordia.soen6011.team3.ttt.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		
		addWindowListener(new WindowAdapter() {
		    
			@Override
		    public void windowClosing(WindowEvent we)
		    { 
		        String ObjButtons[] = {"Yes","No"};
		        int PromptResult = JOptionPane.showOptionDialog(null,"Are you sure you want to exit?","ZeroX",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,ObjButtons,ObjButtons[1]);
		        
		        if(PromptResult==JOptionPane.YES_OPTION)
		        {
		            System.exit(0);
		        }
		    }
		});
		
		
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