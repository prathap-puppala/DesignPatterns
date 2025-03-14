package behavioral.memento;

// Memento Pattern used for Undo Redo Feature
public class Main {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();

        Originator originator = new Originator("Prathap", 26, "Male");
        careTaker.add(originator);

        originator.setName("Prathap Puppala");
        careTaker.add(originator);
        System.out.println(originator);

        careTaker.restore(originator);
        System.out.println(originator);

    }
}
