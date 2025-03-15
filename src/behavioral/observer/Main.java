package behavioral.observer;

// Observed Pattern is used if we want to notify all subscribers about state changes
// Pub-Sub Model
public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject("Prathap", 100L);
        Observer observerA = new ObserverA();
        Observer observerB = new ObserverB();

        subject.registerObserver(observerA);
        subject.registerObserver(observerB);

        subject.setPrice(200L);
        subject.setPrice(300L);
        subject.setPrice(400L);

        subject.removeObserver(observerA);
        subject.setPrice(500L);
    }
}
