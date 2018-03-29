import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ViewGUI extends JFrame {
	
	private static final long serialVersionUID = 1L;
	public static final String HOCHZAEHLEN = "HOCHZAEHLEN" ;
	public static final String RESET = "RESET" ;
	
	private JTextField text = new JTextField(3);
	private JButton knopf_hochzaehlen = new JButton();
	private JButton knopf_reset = new JButton();
	
	public ViewGUI() {
		this.setTitle("Workshop MVC");
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    this.setLayout(new FlowLayout());
	    
	    text.setEditable(false);
	    this.add(text);
	    
	    knopf_hochzaehlen.setText("hochzaehlen");
		knopf_hochzaehlen.setActionCommand(ViewGUI.HOCHZAEHLEN);
		
		this.add(knopf_hochzaehlen);

		knopf_reset.setText("reset");
		knopf_reset.setActionCommand(ViewGUI.RESET);
		
		this.add(knopf_reset);
		
		
		this.pack();
	    
		
	}

	public JTextField getText_hochzaehlen() {
		return text;
	}

	public JButton getKnopf_hochzaehlen() {
		return knopf_hochzaehlen;
	}
	
	public JTextField getText_reset() {
		return text;
	}
	
	public JButton getKnopf_reset() {
		return knopf_reset;
	}
	
	
	
	

}
