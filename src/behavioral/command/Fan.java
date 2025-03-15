package behavioral.command;

public class Fan implements Device {
    @Override
    public void on() {
        System.out.println("Fan on");
    }

    @Override
    public void off() {
        System.out.println("Fan off");
    }
}
