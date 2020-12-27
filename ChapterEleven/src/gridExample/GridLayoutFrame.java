/**
 * 
 */
package gridExample;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * @author Pavel Mačák
 *
 */
public class GridLayoutFrame {

    public GridLayoutFrame() {
	JFrame frame = new JFrame("GridLayout frame");
	frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	GridLayout layout = new GridLayout(4, 4);
	layout.setVgap(5);
	layout.setHgap(10);
	frame.getContentPane().setLayout(layout);

	String[] buttonNames = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
		"11", "12", "+", "-", "=", "*" };
	for (String label : buttonNames) {
	    JButton button = new JButton(label);
	    button.setPreferredSize(new Dimension(100, 100));
	    frame.getContentPane().add(button);
	}

	frame.pack();
	frame.setVisible(true);
    }

    public static void main(String[] args) {
	new GridLayoutFrame();
    }

}
