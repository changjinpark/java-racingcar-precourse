package racinggame.controller;

import racinggame.model.Cars;
import racinggame.model.RaceCount;

import static view.InputView.userInputCarName;
import static view.InputView.userInputRaceCount;

public class RaceController {
    public void run() {
        Cars cars = userInputCarName();
        System.out.println(cars);
        RaceCount raceCount = userInputRaceCount();
        System.out.println(raceCount);
    }
}
