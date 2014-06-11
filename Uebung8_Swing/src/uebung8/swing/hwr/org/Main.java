package uebung8.swing.hwr.org;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class Main extends javax.swing.JFrame implements ActionListener{
	
	private static final long serialVersionUID = 8609725423148810917L;
	private Toolkit t;
	private int x = 0, y=0 , widht = 300, height = 400;
	
	private JButton jbutton1;
	private JButton jbutton2;
	private JButton jbutton3;
	
	
	private Main() { // Konstruktor
		
		t = Toolkit.getDefaultToolkit();
		
		Dimension d = t.getScreenSize();
		x = (int) ((d.getWidth() - widht) / 2);
		y = (int) ((d.getHeight() - height) / 2);
		
		
		setTitle("Taschenrechner");
		setBounds(x, y, widht, height);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		layoutmanager();
		components();
		setVisible(true);
	}
	
	private void components() {
		//Buttons werden erstellt
		this.jbutton1 = new JButton("Beenden");
		this.jbutton2 = new JButton("Fenster schließen");
		this.jbutton3 = new JButton("Hallo");
		//Buttons werden dem Listener zugeordnet
		jbutton1.addActionListener((ActionListener) this);
		jbutton2.addActionListener((ActionListener) this);
		jbutton3.addActionListener((ActionListener) this);
		//Buttons werden dem JPanel hinzugefügt
		add(jbutton1);
		add(jbutton2);
		add(jbutton3);
	} 
	public void actionPerformed(ActionEvent ae){
		//System.out.println(ae.getSource());
		if(ae.getSource() == this.jbutton1){
			System.out.println("Button wurde betätigt und das Programm wird beendet");
			dispose();
		}
		if(ae.getSource() == this.jbutton2){
            this.setVisible(false);
        }
		if(ae.getSource() == this.jbutton3){
           jbutton3.setText("Godbye");
        }
		
	}
	private void layoutmanager(){
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
	}
	public static void main(String[] args) {
		new Main();
		// TODO Auto-generated method stub

	}
}
