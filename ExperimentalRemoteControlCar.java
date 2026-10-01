package remotecontrolcar;

/**
 * Auto experimental: prototipo más rápido que avanza 20 metros por impulso,
 * pero no puede competir oficialmente en el ranking de victorias.
 */
public class ExperimentalRemoteControlCar implements RemoteControlCar {

    private int distanceTravelled;

    @Override
    public void drive() {
        this.distanceTravelled += 20;
    }

    @Override
    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }
}
