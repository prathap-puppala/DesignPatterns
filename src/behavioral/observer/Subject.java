package behavioral.observer;

// Subject: Maintains a list of Observers
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
