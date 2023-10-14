package commandPattern;

public class PowerOff implements Command{

    private Switch execute;

    public PowerOff(Switch execute){
        this.execute = execute;
    }
    @Override
    public String execute() {
        return execute.SwitchOff();
    }
}
