package behavioral.mediator;

// Use the Mediator Pattern when you need to centralize communication between multiple objects
public class Main {
    public static void main(String[] args) {
        ControlRoom controlRoom = new ControlRoom();

        Airplane airplane1 = new Airplane("1");
        Airplane airplane2 = new Airplane("2");
        Airplane airplane3 = new Airplane("3");
        Airplane airplane4 = new Airplane("4");

        controlRoom.registerAirplane(airplane1);
        controlRoom.registerAirplane(airplane2);
        controlRoom.registerAirplane(airplane3);
        controlRoom.registerAirplane(airplane4);

        airplane1.requestLand();
        airplane2.requestLand();
        airplane3.requestLand();
    }
}
