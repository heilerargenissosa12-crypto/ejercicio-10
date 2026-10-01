package remotecontrolcar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Pista de pruebas: permite poner a prueba cualquier auto que cumpla
 * la interfaz RemoteControlCar y rankear autos de producción.
 */
public class TestTrack {

    /**
     * Hace correr un auto de cualquier tipo gracias al polimorfismo.
     */
    public static void race(RemoteControlCar car) {
        car.drive();
    }

    /**
     * Ordena una lista de autos de producción por su número de victorias de mayor a menor.
     */
    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        List<ProductionRemoteControlCar> sorted = new ArrayList<>(cars);
        Collections.sort(sorted);
        return sorted;
    }
}
