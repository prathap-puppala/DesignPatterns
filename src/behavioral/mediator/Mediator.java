package behavioral.mediator;

public interface Mediator {
    void registerAirplane(Airplane airplane);
    void handleTakeOff(Airplane airplane);
    void handleLand(Airplane airplane);
}
