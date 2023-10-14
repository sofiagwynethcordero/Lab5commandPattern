package commandPattern;

public class PowerOn implements Command{

    private Switch execute;

    public PowerOn (Switch execute){
        this.execute = execute;

    }
    @Override
    public String execute() {
        return execute.SwitchOn();
    }
}
