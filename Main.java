package remotecontrolcar;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("  Ejercicio 10: Remote Control Car (Interfaces)");
        System.out.println("==================================================");

        ProductionRemoteControlCar prodCar = new ProductionRemoteControlCar();
        ExperimentalRemoteControlCar expCar = new ExperimentalRemoteControlCar();

        // 1. Probar carrera en la pista
        TestTrack.race(prodCar);
        TestTrack.race(expCar);

        System.out.println("1. Distancia auto de produccion (1 carrera): " + prodCar.getDistanceTravelled() + "m (Esperado: 10m)");
        System.out.println("   Distancia auto experimental (1 carrera):  " + expCar.getDistanceTravelled() + "m (Esperado: 20m)");

        // 2. Ranking de autos por victorias
        ProductionRemoteControlCar carA = new ProductionRemoteControlCar();
        carA.setNumberOfVictories(3);

        ProductionRemoteControlCar carB = new ProductionRemoteControlCar();
        carB.setNumberOfVictories(10);

        ProductionRemoteControlCar carC = new ProductionRemoteControlCar();
        carC.setNumberOfVictories(7);

        List<ProductionRemoteControlCar> cars = new ArrayList<>();
        cars.add(carA);
        cars.add(carB);
        cars.add(carC);

        List<ProductionRemoteControlCar> ranked = TestTrack.getRankedCars(cars);

        System.out.println("\n2. Ranking de autos por victorias:");
        for (int i = 0; i < ranked.size(); i++) {
            System.out.println("   Puesto " + (i + 1) + ": " + ranked.get(i).getNumberOfVictories() + " victorias");
        }

        boolean ok = prodCar.getDistanceTravelled() == 10 &&
                     expCar.getDistanceTravelled() == 20 &&
                     ranked.get(0).getNumberOfVictories() == 10 &&
                     ranked.get(1).getNumberOfVictories() == 7 &&
                     ranked.get(2).getNumberOfVictories() == 3;

        System.out.println("\n[RESULTADO]: " + (ok ? "TODAS LAS PRUEBAS PASARON EXITOSAMENTE" : "ERROR EN LAS PRUEBAS"));
        System.out.println("==================================================\n");
    }
}
