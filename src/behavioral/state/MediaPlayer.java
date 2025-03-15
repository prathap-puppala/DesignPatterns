package behavioral.state;

public class MediaPlayer {
    private State currentState;

    public MediaPlayer() {
        currentState = new PlayState();
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void handle() {
        currentState.handle();
    }
}
