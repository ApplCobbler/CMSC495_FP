package views;
import java.awt.*;
import javax.swing.*;


/**
 * @author Group 2
 * 
 * This class is the main app window
 *
 */
public class CurrencyView extends JFrame{
	private static final long serialVersionUID = 1L;
	
	//Set the size of the window
	static final int WIDTH = 600, HEIGHT = 600;
	
	//Constructor
	public CurrencyView(){
	super("Currency Converter (ver 1.0)");
	setSize(WIDTH, HEIGHT);
	
	//Add customizable panel
	add(new CurrencyPanel());
	
	this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
}
	class CurrencyPanel extends JPanel {
		private static final long serialVersionUID = 1L;
		
		//Create main views, lay them out accordingly
		//Add in all buttons within this panel
		
	}

