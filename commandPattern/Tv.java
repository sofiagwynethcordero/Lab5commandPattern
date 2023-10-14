package commandPattern;

public class Tv implements Switch{

	@Override
	public String SwitchOn() {
		return "Tv is switched-on!";
	}
	
	@Override
	public String SwitchOff() {
		return "Tv is switched-off!";
	}
	
	 public String VolumeUp() {
	    	return "Volume of the Tv increased!";
	    }
	    
	 public String VolumeDown() {
	    	return "Volume of the Tv decreased!";
	    }
}
