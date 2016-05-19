package concordia.soen6011.team3.ttt.ui;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import concordia.soen6011.team3.ttt.ui.images.ImagePath;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * 
 * 
 * 
 * @author Team 3
 * @version 1.0
 */
public class TTTMenuBar extends JMenuBar implements ActionListener {

	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private JMenu boardMenu;

	/**
	 * 
	 */
	private JMenuItem newBoardMenuItem;
	// private JMenuItem undoMenuItem;
	// private JMenuItem redoMenuItem;

	/**
	 * 
	 */
	private JMenu aboutMenu;

	/**
	 * 
	 */
	private JMenuItem aboutApplicationMenuItem;

	/**
	 * 
	 */
	private JMenuItem aboutTeamMenuItem;

	/**
	 * 
	 */
	private final String newBoardEvent = "NEW_BOARD";

	/**
	 * 
	 */
	private final String undoEvent = "UNDO_MOVE";

	/**
	 * 
	 */
	private final String redoEvent = "REDO_MOVE";

	/**
	 * 
	 */
	private final String aboutAppEvent = "ABOUT_APP";

	/**
	 * 
	 */
	private final String aboutTeamEvent = "ABOUT_TEAM";

	/**
	 * 
	 */
	private TTTFrame tttFrame;

	/**
	 * 
	 * 
	 * @param mainUiParent
	 *            Principal frame
	 */
	public TTTMenuBar(TTTFrame tttFrame) {
		initComponents(tttFrame);
	}

	/**
	 * 
	 * 
	 * @param mainuiParam
	 *            Principal frame
	 */
	private void initComponents(TTTFrame tttFrame) {

		this.tttFrame = tttFrame;

		// Board Menu
		boardMenu = new JMenu("Game");
		boardMenu.setMnemonic(KeyEvent.VK_B);

		newBoardMenuItem = new JMenuItem("New",new ImageIcon(this.getClass().getResource(ImagePath.NEW_BOARD)));
		newBoardMenuItem.setMnemonic(KeyEvent.VK_N);
		newBoardMenuItem.setActionCommand(this.newBoardEvent);
		newBoardMenuItem.addActionListener(this);

		boardMenu.add(newBoardMenuItem);

		/*
		 * undoMenuItem = new JMenuItem("Undo", new
		 * ImageIcon(this.getClass().getResource(ImagePath.UNDO)));
		 * undoMenuItem.setMnemonic(KeyEvent.VK_U);
		 * undoMenuItem.setActionCommand(this.undoEvent);
		 * undoMenuItem.addActionListener(this);
		 * 
		 * boardMenu.add(undoMenuItem);
		 * 
		 * redoMenuItem = new JMenuItem("Redo", new
		 * ImageIcon(this.getClass().getResource(ImagePath.REDO)));
		 * redoMenuItem.setMnemonic(KeyEvent.VK_R);
		 * redoMenuItem.setActionCommand(this.redoEvent);
		 * redoMenuItem.addActionListener(this);
		 * 
		 * boardMenu.add(redoMenuItem);
		 */

		this.add(boardMenu);

		// About Menu
		aboutMenu = new JMenu("About");
		aboutMenu.setMnemonic(KeyEvent.VK_U);

		aboutApplicationMenuItem = new JMenuItem("Application",
				new ImageIcon(this.getClass().getResource(ImagePath.ABOUT_APP)));
		aboutApplicationMenuItem.setMnemonic(KeyEvent.VK_A);
		aboutApplicationMenuItem.setActionCommand(this.aboutAppEvent);
		aboutApplicationMenuItem.addActionListener(this);

		aboutMenu.add(aboutApplicationMenuItem);

		aboutTeamMenuItem = new JMenuItem("Team", new ImageIcon(this.getClass().getResource(ImagePath.ABOUT_TEAM)));
		aboutTeamMenuItem.setMnemonic(KeyEvent.VK_T);
		aboutTeamMenuItem.setActionCommand(this.aboutTeamEvent);
		aboutTeamMenuItem.addActionListener(this);

		aboutMenu.add(aboutTeamMenuItem);

		this.add(aboutMenu);

	}

	/**
	 * 
	 * 
	 * @param actionEvent
	 * 
	 */
	public void actionPerformed(ActionEvent actionEvent) {

		// New Board menu event
		if (this.newBoardEvent.equals(actionEvent.getActionCommand())) {
			tttFrame.newBoard();
		}

		// Undo Movement menu event
		if (this.undoEvent.equals(actionEvent.getActionCommand())) {

		}

		// Redo Movement menu event
		if (this.redoEvent.equals(actionEvent.getActionCommand())) {

		}

		// About Application menu event
		if (this.aboutAppEvent.equals(actionEvent.getActionCommand())) {
			JOptionPane.showMessageDialog(tttFrame,
					"ZeroX Game v1.0 \nSOEN 6011 \nSoftware Engineering Processes \nSummer 2016/AA \nConcordia University",
					"Application Info",
					JOptionPane.INFORMATION_MESSAGE);	
		}

		// About Application menu event
		if (this.aboutTeamEvent.equals(actionEvent.getActionCommand())) {
			JOptionPane.showMessageDialog(tttFrame,
					"Team ZeroX " +
					"\n  Amarpreet Singh, 40013505" +
					"\n  Bhavik Desai, 27520239" + 
					"\n  Gurkamal Dhoot, 27275978" +
					"\n  Gurvinder Devgun, 40012931" +
					"\n  Kamaljeet Dhaliwal, 27616252" +
					"\n  Karan Deep Singh, 40010405" +
					"\n  Labdhi Deliwala, 27801289" +
					"\n  Omar Faruk, 27291698" +
					"\n  Ricardo Cortes, 27734107" +
					"\n  Urvi Desai, 27821964",
					"Team Info",
					JOptionPane.INFORMATION_MESSAGE);	
		}

	}
}
