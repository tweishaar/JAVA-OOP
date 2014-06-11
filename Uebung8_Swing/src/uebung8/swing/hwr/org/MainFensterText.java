package uebung8.swing.hwr.org;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainFensterText extends javax.swing.JFrame implements ActionListener{

	private static final long serialVersionUID = 6001805334358225392L;
	private Toolkit t;
	private int x = 0, y=0 , widht = 600, height = 400;
	
	private JLabel jlabel1;
	private JTextField jtextfield1;
	private JButton jbutton1;
	
	
	
	public MainFensterText() { //Konstruktor
		t = Toolkit.getDefaultToolkit();
		
		Dimension d = t.getScreenSize();
		x = (int) ((d.getWidth() - widht) / 2);
		y = (int) ((d.getHeight() - height) / 2);
		//text.setText("Hier könnte ihr Text stehen");
		setTitle("Text");
		setBounds(x, y, widht, height);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		components();
		layoutmanager();
		setVisible(true);
		
	}
	
	private void components() {
		this.jlabel1 = new JLabel("Hier könnte ihr Text stehen");
		//Buttons und Textfield werden erstellt
		this.jbutton1 = new JButton("Post your Text");
		this.jtextfield1 = new JTextField(20);
		//Textfelder und Button werden dem JPanel hinzugefügt
		add(jtextfield1);
		add(jbutton1);
		add(jlabel1);
		//Buttons werden dem Listener zugeordnet
		jbutton1.addActionListener((ActionListener) this);
	}

	private void layoutmanager(){
		setLayout(new FlowLayout(FlowLayout.CENTER));
	}
	public void actionPerformed(ActionEvent ae){
		//System.out.println(ae.getSource());
		if(ae.getSource() == this.jbutton1){
			System.out.println("Check in Button wurde betätigt");
			jlabel1.setText(jtextfield1.getText());
		}
	}	
	
	public static void main(String[] args) {
		new MainFensterText();
	}

}
