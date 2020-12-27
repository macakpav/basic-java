/**
 * 
 */
package exampleOne;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 * @author Pavel Mačák
 *
 */
public class SimpleFrame {

    public SimpleFrame(String location) {
	JFrame frame = new JFrame("Frame text");
	frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	frame.setSize(360, 360);

	JLabel hedgehog = new JLabel(new ImageIcon("src/exampleOne/" + location));
	frame.getContentPane().add(hedgehog);
	frame.setVisible(true);
    }

    public static void main(String[] args) {
	new SimpleFrame("hedgehog.png");
    }
}
