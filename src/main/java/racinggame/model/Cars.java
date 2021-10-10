package racinggame.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static racinggame.ValidationUtils.*;
import static view.InputView.userInputCarName;
import static view.OutputView.printErrorMessage;

public class Cars {
    private final List<Car> cars;

    public Cars(String inputCarNames) {
        String[] carNamesArr = inputCarNames.split(",");
        validateCarName(carNamesArr);
        this.cars = makeCars(carNamesArr);
    }

    private List<Car> makeCars(String[] carNamesArr) {
        List<Car> carList = new ArrayList<>();
        for(String carName : carNamesArr) {
            Car car = new Car(carName);
            carList.add(car);
        }
        return carList;
    }

    private void validateCarName(String[] carNamesArr) {
        if(!validationNameLength(carNamesArr)) {
            printErrorMessage(ERROR_MESSAGE_LENGTH);
            userInputCarName();
        }
        if(!validationNumberOfCars(carNamesArr)) {
            printErrorMessage(ERROR_MESSAGE_MINIMUM_NUMBER);
            userInputCarName();
        }
        if(!validationNonDuplicate(Arrays.asList(carNamesArr))) {
            printErrorMessage(ERROR_MESSAGE_DUPLICATE);
            userInputCarName();
        }
    }
}
