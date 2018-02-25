import java.util.Observable;

public class Model extends Observable {
	
	private int zahl = 0 ;
	
	
	public void zaehlen() {
		zahl=(zahl+1);
		setChanged();
		notifyObservers();
		
		
	}
	public void reset() {
		zahl = 0 ;
		setChanged();
		notifyObservers();
	}
	public int getzahl() {
		return zahl;
	}

}
