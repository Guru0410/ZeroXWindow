package concordia.soen6011.team3.ttt.main;

import javax.swing.SwingUtilities;

import concordia.soen6011.team3.ttt.ui.TTTFrame;

/**
 * 
 * 
 * @author Team 3
 * @version 1.0
 */
public class TTTMain {

	/**
	 * 
	 * 
	 */
	private static void createAndShowMainUi() {
		// Create and set up the window.
		TTTFrame mainUi = new TTTFrame();

		// Display the window.
		mainUi.pack();
		mainUi.setLocationRelativeTo(null);
		mainUi.setVisible(true);
	}

	/**
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI.
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowMainUi();
			}
		});
	}
}
