package swing.turorial.org;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;



public class SwingMain extends javax.swing.JFrame {
	private static final long serialVersionUID = 2785294706787223082L;

	private Toolkit t;
	private int x = 0, y=0 , widht = 800, height = 600;
	
	//Komponenten
	private JMenuBar menubar1;
	
	private JMenu	menubar1_menu1;
	private JMenu	menubar1_menu2;
	private JMenu	menubar1_menu3;
	
	private JMenuItem menubar1_menu1_menuitem1;
	private JMenuItem menubar1_menu1_menuitem2;
	private JMenuItem menubar1_menu1_menuitem3;
	
	private JMenuItem menubar1_menu2_menuitem1;
	private JMenuItem menubar1_menu2_menuitem2;
	private JMenuItem menubar1_menu2_menuitem3;
	
	private JMenuItem menubar1_menu3_menuitem1;
	private JMenuItem menubar1_menu3_menuitem2;
	private JMenuItem menubar1_menu3_menuitem3;
	
	
	public SwingMain() { //Konstruktor
		t = Toolkit.getDefaultToolkit();
		
		Dimension d = t.getScreenSize();
		x = (int) ((d.getWidth() - widht) / 2);
		y = (int) ((d.getHeight() - height) / 2);
		
		
		setTitle("Swing Tutorial");
		setBounds(x, y, widht, height);
		
		//Anwendung schlie�t, wenn Eigenschaft gesetzt ist
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.initComponents();
		
		setVisible(true);
	}
	
	private void initComponents() {
		// JMenu incl. Menu & MenuItems
		this.menubar1 = new JMenuBar();
		
		this.menubar1_menu1 = new JMenu("Menu 1");
		this.menubar1_menu2 = new JMenu("Menu 2");
		this.menubar1_menu3 = new JMenu("Menu 3");
		
		this.menubar1_menu1_menuitem1 = new JMenuItem("MenuItem 1/1");
		this.menubar1_menu1_menuitem2 = new JMenuItem("MenuItem 1/2");
		this.menubar1_menu1_menuitem3 = new JMenuItem("MenuItem 1/3");
		
		this.menubar1_menu2_menuitem1 = new JMenuItem("MenuItem 2/1");
		this.menubar1_menu2_menuitem2 = new JMenuItem("MenuItem 2/2");
		this.menubar1_menu2_menuitem3 = new JMenuItem("MenuItem 2/3");
		
		this.menubar1_menu3_menuitem1 = new JMenuItem("MenuItem 3/1");
		this.menubar1_menu3_menuitem2 = new JMenuItem("MenuItem 3/2");
		this.menubar1_menu3_menuitem3 = new JMenuItem("MenuItem 3/3");
		
		this.menubar1_menu1.add(this.menubar1_menu1_menuitem1);
		this.menubar1_menu1.add(this.menubar1_menu1_menuitem2);
		this.menubar1_menu1.add(this.menubar1_menu1_menuitem3);
		
		this.menubar1_menu2.add(this.menubar1_menu2_menuitem1);
		this.menubar1_menu2.add(this.menubar1_menu2_menuitem2);
		this.menubar1_menu2.add(this.menubar1_menu2_menuitem3);
		
		this.menubar1_menu3.add(this.menubar1_menu3_menuitem1);
		this.menubar1_menu3.add(this.menubar1_menu3_menuitem2);
		this.menubar1_menu3.add(this.menubar1_menu3_menuitem3);
		
		this.menubar1.add(this.menubar1_menu1);
		this.menubar1.add(this.menubar1_menu2);
		this.menubar1.add(this.menubar1_menu3);
		
		this.setJMenuBar(this.menubar1);
		
	}
	
	
	public static void main(String[] args) {
		new SwingMain();
	}
}
