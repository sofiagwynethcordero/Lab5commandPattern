package commandPattern;

public class Aircon implements Switch{
	
	@Override
	public String SwitchOn() {
		return "Aircon is switched-on!";
	}
	@Override
	public String SwitchOff() {
		return "Aircon is switched-off!";
	}
		
	 public String tempUp(){
	        return "Aircon increased temperature!";
	    }

	 public String tempDown(){
	        return "Aircon decreased temperature!";
	    }

}