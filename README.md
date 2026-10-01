# Ejercicio 10: Remote Control Car Conundrum (Remote Control Competition)

- **Concepto:** Interfaces / Polymorphism (Interfaces, `Comparable<T>` y polimorfismo)
- **Plataforma:** Exercism (Java Track)

## Descripción del Problema
Organizar una competencia de autos a control remoto utilizando interfaces:
1. **`RemoteControlCar` (Interface):** Declara los métodos `drive()` y `getDistanceTravelled()`.
2. **`ProductionRemoteControlCar`:**
   - Implementa `RemoteControlCar` y `Comparable<ProductionRemoteControlCar>`.
   - Avanza 10 metros por llamada a `drive()`.
   - Registra victorias (`numberOfVictories`).
   - Implementa `compareTo` para ordenar de mayor a menor número de victorias.
3. **`ExperimentalRemoteControlCar`:**
   - Implementa `RemoteControlCar`.
   - Avanza 20 metros por llamada a `drive()`.
4. **`TestTrack`:**
   - `race(RemoteControlCar car)`: Llama a `drive()`.
   - `getRankedCars(List<ProductionRemoteControlCar> cars)`: Ordena la lista de autos según sus victorias.

## Cómo ejecutar en Visual Studio / VS Code:
Abre `Main.java` y haz clic en **Run** o presiona `F5`.
