import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class DrawChoiceFrame extends JFrame {
	private DrawChoicePanel dcp;
	public void setupGUI() {
		setTitle("Draw Choice Frame V1.0");
		setBounds(100,100,300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		JPanel panSouth = new JPanel();
		panSouth.setLayout(new FlowLayout());
		JButton btnCircle = new JButton("Circle");
		panSouth.add(btnCircle);
		btnCircle.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dcp.setShapeType(0);
						repaint();   // frame repaint --> all the LW components to paintComponent
					}
				}
		);
		JButton btnSquare = new JButton("Square");
		panSouth.add(btnSquare);
		btnSquare.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dcp.setShapeType(1);
						repaint();   // frame repaint --> all the LW components to paintComponent
					}
				}
		);
		c.add(panSouth,BorderLayout.SOUTH);
		dcp = new DrawChoicePanel();
		c.add(dcp,BorderLayout.CENTER);
	}
	public DrawChoiceFrame() {
		setupGUI();
	}
}
