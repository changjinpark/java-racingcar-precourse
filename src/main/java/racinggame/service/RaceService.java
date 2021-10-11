package racinggame.service;

import racinggame.model.Cars;

import static view.OutputView.*;

public class RaceService {
    private Cars cars;
    public void start(int raceCount, Cars cars) {
        printExecuteResultText();
        while (raceCount-- > 0) {
            cars.startRacing();
            printRacingResult(cars.cars());
        }
        this.cars = cars;
    }
}
