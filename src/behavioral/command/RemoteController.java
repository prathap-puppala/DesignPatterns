package behavioral.command;

public class RemoteController {
    private OnCommand onCommand;
    private OffCommand offCommand;

    public RemoteController(OnCommand onCommand, OffCommand offCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }

    public void pressOn(){
        onCommand.execute();
    }

    public void pressOff(){
        offCommand.execute();
    }
}
