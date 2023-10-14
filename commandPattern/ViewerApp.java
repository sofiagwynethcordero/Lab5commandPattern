package commandPattern;

public class ViewerApp {

    public static void main(String[] args){

        Tv tv = new Tv();
        Lights lights = new Lights();
        MusicPlayer musicPlayer = new MusicPlayer();
        Aircon aircon = new Aircon();
        RemoteControl rc = new RemoteControl();
        PowerOn powerOn;
        PowerOff powerOff;
         
        powerOn = new PowerOn(tv);
        powerOff = new PowerOff(tv);
        
        rc.setCommand(powerOn);
        String control = rc.clickButton();
        System.out.println(control);
        
        System.out.println(tv.VolumeUp());
        System.out.println(tv.VolumeDown());
        
        rc.setCommand(powerOff);
        control = rc.clickButton();
        System.out.println(control);
        
        System.out.println();
        
        powerOn = new PowerOn(lights);
        powerOff = new PowerOff(lights);
        
        rc.setCommand(powerOn);
        String control1 = rc.clickButton();
        System.out.println(control1);
        
        System.out.println(lights.BrightnessUp());
        System.out.println(lights.BrightnessDown());

        rc.setCommand(powerOff);
        control1 = rc.clickButton();
        System.out.println(control1);
        System.out.println();
        
        powerOn = new PowerOn(musicPlayer);
        powerOff = new PowerOff(musicPlayer);
        
        rc.setCommand(powerOn);
        String control2 = rc.clickButton();
        System.out.println(control2);
        
        System.out.println(musicPlayer.VolumeUp());
        System.out.println(musicPlayer.VolumeDown());
            
        rc.setCommand(powerOff);
        control2 = rc.clickButton();
        System.out.println(control2);
        
        System.out.println();
        
        powerOn = new PowerOn(aircon);
        powerOff = new PowerOff(aircon);
        
        rc.setCommand(powerOn);
        String control3 = rc.clickButton();
        System.out.println(control3);
        
        System.out.println(aircon.tempUp());
        System.out.println(aircon.tempDown());
              
        rc.setCommand(powerOff);
        control3 = rc.clickButton();
        System.out.println(control3);
    }
}
