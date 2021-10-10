package racinggame;

import static view.OutputView.printErrorMessage;

public class ValidationUtils {

    public static final int CAR_NAME_LIMIT_LENGTH = 5;

    public static boolean validationNameLength(String[] carNameArray) {
        int i = 0;
        while (i < carNameArray.length - 1 && validationLength(carNameArray[i])){
            i++;
        }
        return validationLength(carNameArray[i]);

    }

    private static boolean validationLength(String carName) {
        if (carName.length() > CAR_NAME_LIMIT_LENGTH){
            printErrorMessage(CAR_NAME_LIMIT_LENGTH);
            return false;
        }
        return true;
    }
}
