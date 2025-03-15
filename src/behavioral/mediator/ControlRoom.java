package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ControlRoom implements Mediator {
    private List<Airplane> airplaneList;
    int takeOffCounter;
    int landCounter;

    public ControlRoom() {
        this.airplaneList = new ArrayList<>();
        this.takeOffCounter = 1;
        this.landCounter = 1;
    }

    @Override
    public void registerAirplane(Airplane airplane) {
        airplaneList.add(airplane);
        airplane.setMediator(this);
    }

    @Override
    public void handleTakeOff(Airplane airplane) {
        if (takeOffCounter > 0) {
            takeOffCounter--;
            airplane.receiveNotification("Taking off");
        } else {
            System.out.println("Taking off blocked due to too many taking offs");
        }
    }

    @Override
    public void handleLand(Airplane airplane) {
        if (landCounter > 0) {
            landCounter--;
            airplane.receiveNotification("Landing");
        } else {
            System.out.println("Landing blocked due to too many taking offs");
        }
    }
}
