package racinggame.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static racinggame.utils.ValidationUtils.*;
import static view.InputView.userInputCarName;
import static view.OutputView.printErrorMessage;

public class Cars {
    private final List<Car> cars;

    public Cars(String inputCarNames) {
        String[] carNamesArr = inputCarNames.split(",");
        validateCarName(carNamesArr);
        this.cars = makeCars(carNamesArr);
    }

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    private List<Car> makeCars(String[] carNamesArr) {
        List<Car> carList = new ArrayList<>();
        for(String carName : carNamesArr) {
            Car car = new Car(carName);
            carList.add(car);
        }
        return carList;
    }

    public List<Car> cars() {
        return this.cars;
    }

    public void startRacing() {
        for (Car car : this.cars) {
            RandomDecimalNumber randomDecimalNumber = new RandomDecimalNumber();
            car.move(randomDecimalNumber);
        }
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

    public List<Car> findWinners() {
        List<Car> winners = new ArrayList<>();
        Position firstCarPosition = this.getFirstPosition();
        for (Car car : cars) {
            if (car.isWinner(firstCarPosition)) {
                winners.add(car);
            }
        }
        return winners;
    }

    private Position getFirstPosition() {
        Position maxPosition = new Position();
        for (Car car : cars) {
            Position carPosition = car.position();
            if (carPosition.isBiggerThan(maxPosition)) {
                maxPosition = car.position();
            }
        }
        return maxPosition;
    }
}
