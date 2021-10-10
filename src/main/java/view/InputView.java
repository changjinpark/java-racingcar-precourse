package view;

import nextstep.utils.Console;
import racinggame.model.Cars;
import racinggame.model.RaceCount;

public class InputView {

    public static final String CAR_NAME_INPUT_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    public static final String RACE_COUNT_INPUT_MESSAGE = "시도할 회수는 몇회인가요?";

    public static Cars userInputCarName() {
        System.out.println(CAR_NAME_INPUT_MESSAGE);
        String inputCarNames = Console.readLine();
        return new Cars(inputCarNames);
    }
    public static RaceCount userInputRaceCount() {
        System.out.println(RACE_COUNT_INPUT_MESSAGE);
        String raceCount = Console.readLine();
        return new RaceCount(raceCount);
    }
}
