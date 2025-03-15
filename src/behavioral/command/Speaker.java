package behavioral.command;

public class Speaker implements Device{
    @Override
    public void on() {
        System.out.println("Speaker on");
    }

    @Override
    public void off() {
        System.out.println("Speaker off");
    }
}
