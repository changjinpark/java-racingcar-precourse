package racinggame;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidationUtils {

    public static final int CAR_NAME_LIMIT_LENGTH = 5;
    public static final int CAR_MINIMUM_NUMBER = 2;
    public static final String ERROR_MESSAGE_LENGTH = "[ERROR] 자동차 이름은 5글자 이하만 가능합니다.";
    public static final String ERROR_MESSAGE_MINIMUM_NUMBER = "[ERROR] 자동차는 최소 2대 이상이어야 게임이 가능합니다.";
    public static final String ERROR_MESSAGE_DUPLICATE = "[ERROR] 자동차 이름은 중복되지 않아야 게임이 가능합니다.";
    public static final String ERROR_MESSAGE_NOT_POSITIVE_NUMBER = "[ERROR] 라운드 값은 양의 정수만 가능합니다.";

    public static boolean validationNameLength(String[] carNameArray) {
        int i = 0;
        while (i < carNameArray.length - 1 && validationLength(carNameArray[i])){
            i++;
        }
        return validationLength(carNameArray[i]);

    }

    private static boolean validationLength(String carName) {
        return carName.length() <= CAR_NAME_LIMIT_LENGTH;
    }

    public static boolean validationNumberOfCars(String[] carNameArray) {
        return carNameArray.length >= CAR_MINIMUM_NUMBER;
    }

    public static boolean validationNonDuplicate(List<String> carList) {
        Set<String> carSet = new HashSet<>(carList);
        return carSet.size() == carList.size();
    }

    public static boolean validationPositive(String round) {
        return Integer.parseInt(round) > 0;
    }
}
