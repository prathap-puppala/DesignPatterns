package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

// ConcreteSubject: Stores the actual state and sends notification when state changes
public class ConcreteSubject implements Subject {
    private String stockSymbol;
    private Long price;
    private List<Observer> observers = new ArrayList<Observer>();

    ConcreteSubject(String stockSymbol, Long price) {
        this.stockSymbol = stockSymbol;
        this.price = price;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockSymbol, price);
        }
    }

    public void setPrice(Long price) {
        this.price = price;
        notifyObservers();
    }
}
