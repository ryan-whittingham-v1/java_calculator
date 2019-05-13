import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

public class DisplayScreen extends JPanel {
	
	private String displayText = "";
	JLabel displayLbl;
	
	public DisplayScreen(String text) {
		this.setBackground(Color.WHITE);
		this.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.setLayout(new GridLayout(0, 1, 0, 0));
		
		displayLbl = new JLabel(displayText, SwingConstants.RIGHT);
		displayLbl.setFont(new Font("FreeSans", Font.BOLD, 30));
		this.add(displayLbl);
	}
	
	public void clear() {
		displayLbl.setText("");
	}
	
	public void say(String text) {
		displayLbl.setText(text);		
	}
}
