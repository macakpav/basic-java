/**
 * 
 */
package exerciseOne;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

/**
 * @author Pavel Mačák
 *
 */
public class SwingPrefferedSize {

    private JFrame frame;

    private JPanel panel;
    private JLabel[] labels;
    private final String[] labelTexts = { "first label", "second label",
	    "third label" };
    private final String[] labelPositions = { BorderLayout.LINE_START,
	    BorderLayout.LINE_END, BorderLayout.PAGE_END };
    private JButton button;

    public SwingPrefferedSize(String title) {
	this.frame = new JFrame(title);
	this.frame.setPreferredSize(new Dimension(400, 400));

	this.panel = new JPanel();
	this.panel.setPreferredSize(new Dimension(300, 300));
	this.panel.setLayout(new GridLayout(3, 4));

	this.labels = new JLabel[this.labelTexts.length];
	for (int j = 0; j < this.labelTexts.length; j++) {
	    this.labels[j] = new JLabel(this.labelTexts[j]);
	    this.panel.add(this.labels[j]);
	}

	this.button = new JButton("Button 1");
	this.button.addActionListener(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent e) {
		SwingPrefferedSize.this.frame.dispose();
	    }
	});

	this.panel.add(this.button);

	this.frame.add(this.panel);

	this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	this.frame.pack();
	this.frame.setResizable(false);
	this.frame.setLocationRelativeTo(null);
	this.frame.setVisible(true);

    }

    public static void main(String[] args) {
	SwingUtilities.invokeLater(new Runnable() {
	    @Override
	    public void run() {
		new SwingPrefferedSize("Swing Application");
	    }
	});
    }

}
