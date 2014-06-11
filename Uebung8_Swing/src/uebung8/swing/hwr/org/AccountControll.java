package uebung8.swing.hwr.org;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AccountControll extends javax.swing.JFrame implements ActionListener{

	private static final long serialVersionUID = 6001805334358225392L;
	private Toolkit t1;
	private int x = 0, y=0 , widht = 300, height = 170;
	
	private JLabel jlabel1;
	private JLabel jlabel2;
	private JTextField jtextfield1;
	private JPasswordField jtextfield2;
	private JButton jbutton1;
	private JButton jbutton2;
	
	public AccountControll() { //Konstruktor
		t1 = Toolkit.getDefaultToolkit();
		
		Dimension d = t1.getScreenSize();
		x = (int) ((d.getWidth() - widht) / 2);
		y = (int) ((d.getHeight() - height) / 2);
		//text.setText("Hier könnte ihr Text stehen");
		setTitle("Account-Login");
		setBounds(x, y, widht, height);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		components();
		layoutmanager();
		setVisible(true);
	}
	public void NewWindow(){
		JFrame frame = new JFrame();
		frame.setVisible(true);
		setBounds(50, 50, 50, 50);
		
	}
	private void components() {
		this.jlabel1 = new JLabel("Username:");
		this.jlabel2 = new JLabel("Password:");
		//Buttons und Textfield werden erstellt
		this.jbutton1 = new JButton("Login");
		this.jbutton2 = new JButton("Exit");
		this.jtextfield1 = new JTextField();
		this.jtextfield2 = new JPasswordField();
		//Textfelder und Button werden dem JPanel hinzugefügt
		add(jlabel1);
		add(jtextfield1);
		add(jlabel2);
		add(jtextfield2);
		add(jbutton1);
		add(jbutton2);
		
		//Buttons werden dem Listener zugeordnet
		jbutton1.addActionListener((ActionListener) this);
		jbutton2.addActionListener((ActionListener) this);
	}

	private void layoutmanager(){
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
	}
	public void actionPerformed(ActionEvent ae){
		//System.out.println(ae.getSource());
		if(ae.getSource() == this.jbutton1){
			System.out.println("Login Button wurde betätigt");
			NewWindow();
		}
		if(ae.getSource() == this.jbutton2){
			System.out.println("Exit Button wurde betätigt");
			dispose();
		}
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new AccountControll();

	}

}
