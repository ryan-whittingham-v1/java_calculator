import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.CardLayout;
import javax.swing.SwingConstants;
import javax.swing.SpringLayout;
import java.awt.GridLayout;
import java.awt.Font;

public class MainFrame extends JFrame {


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
					frame.setTitle("PA3 - Calculator");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		getContentPane().setBackground(new Color(183, 183, 183));
		getContentPane().setLayout(new MigLayout("", "[grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow]", "[grow][grow][grow][grow][grow][grow][grow][grow]"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(450, 300));
		setBounds(200, 200, 450, 300);
		
		MyCalculator calculator = new MyCalculator();
		
		// Calculator display
		DisplayScreen display = new DisplayScreen("screen");
		getContentPane().add(display, "height 50::, cell 1 1 9 1, grow");
		
		keyPanel panel_3 = new keyPanel("sq");
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseOver();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseExit();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseDown();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseUp();
				//display.buildNum(key.value());
			}
		});
		getContentPane().add(panel_3, "cell 1 3,grow");
		
		keyPanel panel_4 = new keyPanel("exp");
		panel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseOver();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseExit();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseDown();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseUp();
				//display.buildNum(key.value());
			}
		});
		getContentPane().add(panel_4, "cell 2 3,grow");
		
		keyPanel panel_5 = new keyPanel("|a|");
		panel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseOver();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseExit();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseDown();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseUp();
				//display.buildNum(key.value());
			}
		});
		getContentPane().add(panel_5, "cell 3 3,grow");
		
		keyPanel panel_13 = new keyPanel("7");
		panel_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseOver();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseExit();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseDown();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseUp();
				calculator.setNum(key.getValueStr());
				display.say(calculator.getNum());
			}
		});
		getContentPane().add(panel_13, "cell 5 3,grow");
		
		keyPanel panel_14 = new keyPanel("8");
		panel_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseOver();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseExit();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseDown();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseUp();
				calculator.setNum(key.getValueStr());
				display.say(calculator.getNum());
			}
		});
		getContentPane().add(panel_14, "cell 6 3,grow");
		
		keyPanel panel_21 = new keyPanel("9");
		panel_21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseOver();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseExit();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseDown();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseUp();
				calculator.setNum(key.getValueStr());
				display.say(calculator.getNum());
			}
		});
		getContentPane().add(panel_21, "cell 7 3,grow");
		
		keyPanel panel_22 = new keyPanel("/");
		panel_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseOver();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseExit();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseDown();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseUp();
				//display.buildNum(key.value());
			}
		});
		getContentPane().add(panel_22, "cell 8 3,grow");
		
		keyPanel panel_23 = new keyPanel("del");
		panel_23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseOver();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseExit();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseDown();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseUp();
				display.clear();
				calculator.clear();
			}
		});
		getContentPane().add(panel_23, "cell 9 3,grow");
		
		keyPanel panel_6 = new keyPanel("sqrt");
		panel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseOver();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseExit();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseDown();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseUp();
				//display.buildNum(key.value());
			}
		});
		getContentPane().add(panel_6, "cell 1 4,grow");
		
		keyPanel panel_8 = new keyPanel("nthrt");
		panel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseOver();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseExit();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseDown();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseUp();
				//display.buildNum(key.value());
			}
		});
		getContentPane().add(panel_8, "cell 2 4,grow");
		
		keyPanel panel_11 = new keyPanel("pi");
		panel_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseOver();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseExit();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseDown();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseUp();
				//display.buildNum(key.value());
			}
		});
		getContentPane().add(panel_11, "cell 3 4,grow");
		
		keyPanel panel_12 = new keyPanel("4");
		panel_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseOver();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseExit();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseDown();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseUp();
				calculator.setNum(key.getValueStr());
				display.say(calculator.getNum());
			}
		});
		getContentPane().add(panel_12, "cell 5 4,grow");
		
		keyPanel panel_15 = new keyPanel("5");
		panel_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseOver();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseExit();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseDown();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseUp();
				calculator.setNum(key.getValueStr());
				display.say(calculator.getNum());
			}
		});
		getContentPane().add(panel_15, "cell 6 4,grow");
		
		keyPanel panel_24 = new keyPanel("6");
		panel_24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseOver();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseExit();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseDown();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseUp();
				calculator.setNum(key.getValueStr());
				display.say(calculator.getNum());
			}
		});
		getContentPane().add(panel_24, "cell 7 4,grow");
		
		keyPanel panel_25 = new keyPanel("x");
		panel_25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseOver();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseExit();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseDown();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseUp();
				//display.buildNum(key.value());
			}
		});
		getContentPane().add(panel_25, "cell 8 4,grow");
		
		keyPanel panel_26 = new keyPanel("%");
		panel_26.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseOver();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseExit();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseDown();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseUp();
			//	display.buildNum(key.value());
			}
		});
		getContentPane().add(panel_26, "cell 9 4,grow");
		
		keyPanel panel_7 = new keyPanel("sin");
		panel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseOver();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseExit();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseDown();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseUp();
		//		display.buildNum(key.value());
			}
		});
		getContentPane().add(panel_7, "cell 1 5,grow");
		
		keyPanel panel_16 = new keyPanel("cos");
		panel_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseOver();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseExit();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseDown();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseUp();
	//			display.buildNum(key.value());
			}
		});
		getContentPane().add(panel_16, "cell 2 5,grow");
		
		keyPanel panel_17 = new keyPanel("tan");
		panel_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseOver();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseExit();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseDown();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseUp();
			}
		});
		getContentPane().add(panel_17, "cell 3 5,grow");
		
		keyPanel panel_27 = new keyPanel("1");
		//panel_27.setValue("1");
		panel_27.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseOver();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseExit();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseDown();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseUp();
				calculator.setNum(key.getValueStr());
				display.say(calculator.getNum());
			}
		});
		getContentPane().add(panel_27, "cell 5 5,grow");
		
		keyPanel panel_28 = new keyPanel("2");
		panel_28.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseOver();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseExit();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseDown();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseUp();
				calculator.setNum(key.getValueStr());
				display.say(calculator.getNum());
			}
		});
		getContentPane().add(panel_28, "cell 6 5,grow");
		
		keyPanel panel_29 = new keyPanel("3");
		panel_29.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseOver();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseExit();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseDown();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseUp();
				calculator.setNum(key.getValueStr());
				display.say(calculator.getNum());
			}
		});
		getContentPane().add(panel_29, "cell 7 5,grow");
		
		keyPanel panel_30 = new keyPanel("-");
		panel_30.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseOver();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseExit();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseDown();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseUp();
			//	display.buildNum(key.value());
			}
		});
		getContentPane().add(panel_30, "cell 8 5,grow");
		
		keyPanel panel_31 = new keyPanel("frac");
		panel_31.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseOver();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseExit();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseDown();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseUp();
			//	display.buildNum(key.value());
			}
		});
		getContentPane().add(panel_31, "cell 9 5,grow");
		
		keyPanel panel = new keyPanel("(");
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseOver();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseExit();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseDown();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseUp();
			//	display.buildNum(key.value());
			}
		});
		getContentPane().add(panel, "cell 1 6,grow");
		
		keyPanel panel_1 = new keyPanel(")");
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseOver();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseExit();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseDown();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseUp();
			//	display.buildNum(key.value());
			}
		});
		getContentPane().add(panel_1, "cell 2 6,grow");
		
		keyPanel panel_2 = new keyPanel(",");
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseOver();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseExit();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseDown();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseUp();
			//	display.buildNum(key.value());
			}
		});
		getContentPane().add(panel_2, "cell 3 6,grow");
		
		// ZERO
		keyPanel zeroKey = new keyPanel("0");
		zeroKey.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseOver();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseExit();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseDown();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseUp();
				calculator.setNum(key.getValueStr());
				display.say(calculator.getNum());
			}
		});
		getContentPane().add(zeroKey, "cell 5 6,grow");
		
		//
		keyPanel panel_10 = new keyPanel(".");
		panel_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseOver();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseExit();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseDown();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseUp();
				//display.buildNum(key.value());
			}
		});
		getContentPane().add(panel_10, "cell 6 6,grow");
		
		keyPanel panel_18 = new keyPanel("A");
		panel_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseOver();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseExit();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseDown();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseUp();
				//display.buildNum(key.value());
			}
		});
		getContentPane().add(panel_18, "cell 7 6,grow");
		
		keyPanel panel_19 = new keyPanel("+");
		panel_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseOver();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseExit();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseDown();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseUp();
				calculator.setMode(key.getValueStr());
				calculator.endNum();
				display.clear();
			}
		});
		getContentPane().add(panel_19, "cell 8 6,grow");
		
		////////////////////////////////////////////////
		keyPanel enterKey = new keyPanel("=");
		enterKey.setValue("=");
		enterKey.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseOver();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseExit();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseDown();
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				keyPanel key = (keyPanel) e.getSource();
				key.mouseUp();
				calculator.equals();
				display.say(calculator.getResult());
			}
		});
		getContentPane().add(enterKey, "cell 9 6,grow");
		
		/////////////////////////////////////////////////	
	}
}
