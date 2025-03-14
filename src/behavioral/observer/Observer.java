package behavioral.observer;

// Observer: Interface for Subscribers who want to react to state changes
public interface Observer {
    void update(String stockSymbol, Long price);
}
