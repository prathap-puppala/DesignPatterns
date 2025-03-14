package behavioral.observer;

public class ObserverB implements Observer {

    @Override
    public void update(String stockSymbol, Long price) {
        System.out.println(stockSymbol + ": " + price);
    }
}
