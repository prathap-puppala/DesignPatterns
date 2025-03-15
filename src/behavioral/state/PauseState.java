package behavioral.state;

public class PauseState implements State {

    @Override
    public void handle() {
        System.out.println("Handling Pause State");
    }
}
