package behavioral.state;

// You should use the State pattern when an object's behavior changes based on its internal state
public class Main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.handle();

        mediaPlayer.setCurrentState(new PauseState());
        mediaPlayer.handle();

        mediaPlayer.setCurrentState(new PlayState());
        mediaPlayer.handle();
    }
}
