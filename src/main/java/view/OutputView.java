package view;

import static racinggame.ValidationUtils.*;

public class OutputView {

    public static final String ERROR_MESSAGE_LENGTH = "[ERROR] 자동차 이름은 5글자 이하만 가능합니다.";
    public static final String ERROR_MESSAGE_MINIMUM_NUMBER = "[ERROR] 자동차는 최소 2대 이상이어야 게임이 가능합니다.";
    public static final String ERROR_MESSAGE_DUPLICATE = "[ERROR] 자동차 이름은 중복되지 않아야 게임이 가능합니다.";

    public static void printErrorMessage(int e) {
        if (e == CAR_NAME_LIMIT_LENGTH){
            System.out.println(ERROR_MESSAGE_LENGTH);
        }
        if (e == CAR_MINIMUM_NUMBER){
            System.out.println(ERROR_MESSAGE_MINIMUM_NUMBER);
        }

        if (e == CAR_NAME_DUPLICATE){
            System.out.println(ERROR_MESSAGE_DUPLICATE);
        }
    }
}
