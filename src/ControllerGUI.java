import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class ControllerGUI implements Observer, ActionListener {

	private Model model;
	private ViewGUI view;

	public ControllerGUI(Model model, ViewGUI view) {

		this.model = model;
		this.view = view;

		model.addObserver(this);

		view.getKnopf_hochzaehlen().addActionListener(this);
		view.getText_hochzaehlen().setText(String.valueOf(model.getzahl()));
		
		view.getKnopf_reset().addActionListener(this);
		view.getText_reset().setText(String.valueOf(model.getzahl()));

		view.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
        //System.out.println("arg0.getActionCommand() :" + arg0.getActionCommand().toString());
        
		switch (arg0.getActionCommand()) {
		case ViewGUI.HOCHZAEHLEN:
			model.zaehlen();
			
			break;
		case ViewGUI.RESET:
			model.reset();
			
			break;

		default:
			System.out.println("Unbekannte Aktion" + arg0.getActionCommand());
			break;
		}
		
		
	}

	@Override
	public void update(Observable arg0, Object arg1) {

		if (arg0 == model) {
			view.getText_hochzaehlen().setText(String.valueOf(model.getzahl()));
		}

	}

}
