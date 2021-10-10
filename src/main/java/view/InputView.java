package view;

import nextstep.utils.Console;
import racinggame.model.Cars;

public class InputView {

    public static final String CAR_NAME_INPUT_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";

    public static Cars userInputCarName() {
        System.out.println(CAR_NAME_INPUT_MESSAGE);
        String inputCarNames = Console.readLine();
        return new Cars(inputCarNames);
    }

}
