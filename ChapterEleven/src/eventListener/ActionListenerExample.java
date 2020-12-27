/**
 * 
 */
package eventListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 * @author Pavel Mačák
 *
 */
public class ActionListenerExample {

    public ActionListenerExample() {
	JFrame frame = new JFrame("Frame text");
	frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

	JButton btn = new JButton("Click me!");
	btn.addActionListener(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(null, "You clicked me!",
			"Button: action!", JOptionPane.PLAIN_MESSAGE);
	    }
	});

	frame.getContentPane().add(btn);
	frame.pack();
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	SwingUtilities.invokeLater(new Runnable() {
	    @Override
	    public void run() {
		new ActionListenerExample();
	    }
	});
    }

}
