package behavioral.mediator;

public class Airplane {
    private String id;
    private Mediator mediator;

    public Airplane(String id) {
        this.id = id;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void requestTakeOff() {
        mediator.handleTakeOff(this);
    }

    public void requestLand() {
        mediator.handleLand(this);
    }

    public void receiveNotification(String notification) {
        System.out.println("Notification received: " + notification);
    }

}
