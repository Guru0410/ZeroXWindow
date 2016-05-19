package concordia.soen6011.team3.ttt.object;

import java.awt.Graphics2D;

import concordia.soen6011.team3.ttt.interfaces.TTTDrawable;

/**
 * 
 * @author Team 3
 * @version 1.0
 *
 */
public abstract class TTTGameElement implements TTTDrawable {

	/**
	 * 
	 */
	private int xPosition;

	/**
	 * 
	 */
	private int yPosition;

	/**
	 * 
	 */
	private int width;

	/**
	 * 
	 */
	private int height;

	/**
	 * 
	 * @param graphics2d
	 */
	public void drawObject(Graphics2D graphics2d) {

	}

	/**
	 * 
	 * @return
	 */
	public int getXPosition() {
		return xPosition;
	}

	/**
	 * 
	 * @param xPosition
	 */
	public void setXPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	/**
	 * 
	 * @return
	 */
	public int getYPosition() {
		return yPosition;
	}

	/**
	 * 
	 * @param yPosition
	 */
	public void setYPosition(int yPosition) {
		this.yPosition = yPosition;
	}

	/**
	 * 
	 * @return
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * 
	 * @param width
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * 
	 * @return
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * 
	 * @param height
	 */
	public void setHeight(int height) {
		this.height = height;
	}

}
