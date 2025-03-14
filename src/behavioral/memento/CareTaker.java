package behavioral.memento;

import java.util.Stack;

// CareTakes: Handles State Management
public class CareTaker {
    private Stack<Memento> mementos = new Stack<>();

    public void add(Originator originator) {
        mementos.add(originator.save());
    }

    public void restore(Originator originator) {
        if (!mementos.isEmpty()) {
            mementos.pop();

            originator.restore(mementos.peek());
        }
    }
}
