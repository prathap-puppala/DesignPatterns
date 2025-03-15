package behavioral.state;

public class PlayState implements State {

    @Override
    public void handle() {
        System.out.println("Handling Play State");
    }
}
