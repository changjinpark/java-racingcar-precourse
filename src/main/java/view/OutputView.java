package view;

public class OutputView {

    public static final int CAR_NAME_LIMIT_LENGTH = 5;
    public static final String ERROR_MESSAGE_LENGTH = "[ERROR] 자동차 이름은 5글자 이하만 가능합니다.";

    public static void printErrorMessage(int e) {
        if (e == CAR_NAME_LIMIT_LENGTH){
            System.out.println(ERROR_MESSAGE_LENGTH);
        }
    }
}
