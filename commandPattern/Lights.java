package commandPattern;

public class Lights implements Switch{
	
	@Override
	public String SwitchOn() {
		return "Lights are switched-on!";
	}
	
	@Override
	public String SwitchOff() {
		return "Lights are switched-off!";
	}
	
	 public String BrightnessUp() {
	    	return "Brightness of the lights increased!";
	    }
	    
	 public String BrightnessDown() {
	    	return "Brightness of the lights decreased!";
	    }
	
}
