package remotecontrolcar;

/**
 * Auto de producción: avanza 10 metros por impulso.
 * Puede competir oficialmente y acumular victorias, además de compararse con otros.
 */
public class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    private int distanceTravelled;
    private int numberOfVictories;

    @Override
    public void drive() {
        this.distanceTravelled += 10;
    }

    @Override
    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    /**
     * Orden descendente por número de victorias (el que tenga más victorias queda primero).
     */
    @Override
    public int compareTo(ProductionRemoteControlCar other) {
        return Integer.compare(other.getNumberOfVictories(), this.numberOfVictories);
    }
}
