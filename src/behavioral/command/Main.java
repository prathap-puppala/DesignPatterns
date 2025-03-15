package behavioral.command;

// Use the Command Design Pattern in Java when you need to encapsulate requests
// as objects, enabling features like undo/redo, queuing, logging, and decoupling
// of sender and receiver.
public class Main {
    public static void main(String[] args) {
        // Light
        Light light = new Light();
        RemoteController remoteController = new RemoteController(
                new OnCommand(light),
                new OffCommand(light)
        );
        remoteController.pressOff();
        remoteController.pressOn();

        // Fan
        Fan fan = new Fan();
        RemoteController remoteController2 = new RemoteController(
                new OnCommand(fan),
                new OffCommand(fan)
        );
        remoteController2.pressOn();
        remoteController2.pressOff();

    }
}
