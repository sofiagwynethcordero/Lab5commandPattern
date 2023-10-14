package commandPattern;

public class MusicPlayer implements Switch{

	@Override
	public String SwitchOn() {
		return "Music Player is switched-on!";
	}
	
	@Override
	public String SwitchOff() {
		return "Music Player is switched-off!";
	}
	
	
	public String VolumeUp() {
		return "Volume of the Music Player increased!";
	}

	public String VolumeDown() {
		return "Volume of the Music Player decreased!";
	}


}
