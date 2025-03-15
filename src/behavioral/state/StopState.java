package behavioral.state;

public class StopState implements State {

    @Override
    public void handle() {
        System.out.println("Handling Stop State");
    }
}
