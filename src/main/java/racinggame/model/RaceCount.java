package racinggame.model;

import static racinggame.ValidationUtils.ERROR_MESSAGE_NOT_POSITIVE_NUMBER;
import static racinggame.ValidationUtils.validationPositive;
import static view.InputView.userInputRaceCount;
import static view.OutputView.printErrorMessage;

public class RaceCount {
    private int raceCount;

    public RaceCount(String raceCount) {
        try {
            validationRaceCount(raceCount);
            this.raceCount = Integer.parseInt(raceCount);
        } catch (NumberFormatException e) {
            printErrorMessage(ERROR_MESSAGE_NOT_POSITIVE_NUMBER);
            userInputRaceCount();
        }
    }

    private void validationRaceCount(String raceCount) {
        if (!validationPositive(raceCount)) {
            printErrorMessage(ERROR_MESSAGE_NOT_POSITIVE_NUMBER);
            userInputRaceCount();
        }
    }
}
