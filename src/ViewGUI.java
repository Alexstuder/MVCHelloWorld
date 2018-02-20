import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ViewGUI extends JFrame {
	
	private static final long serialVersionUID = 1L;
	public static final String HOCHZAEHLEN = "HOCHZAEHLEN" ;
	
	private JTextField text = new JTextField(3);
	private JButton knopf = new JButton();
	
	public ViewGUI() {
		this.setTitle("Workshop MVC");
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    this.setLayout(new FlowLayout());
	    
	    text.setEditable(false);
	    this.add(text);
	    
	    knopf.setText("hochzaehlen");
		knopf.setActionCommand(ViewGUI.HOCHZAEHLEN);
		
		this.add(knopf);
		this.pack();
	    
		
	}

	public JTextField getText() {
		return text;
	}

	public JButton getKnopf() {
		return knopf;
	}
	
	
	
	

}
