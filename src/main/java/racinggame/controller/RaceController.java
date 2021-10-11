package racinggame.controller;

import racinggame.model.Cars;
import racinggame.model.RaceCount;
import racinggame.service.RaceService;

import static view.InputView.userInputCarName;
import static view.InputView.userInputRaceCount;

public class RaceController {
    public void run() {
        Cars cars = userInputCarName();
        RaceCount raceCount = userInputRaceCount();
        int inputRaceCount = raceCount.raceCount();
        RaceService raceService = new RaceService();
        raceService.start(inputRaceCount, cars);
    }
}
