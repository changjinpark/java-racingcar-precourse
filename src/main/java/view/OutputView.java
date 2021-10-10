package view;

import racinggame.model.Car;
import racinggame.model.Position;

import java.util.List;

public class OutputView {
    public static final String DISTANCE = "-";
    public static final String EXECUTION_RESULT = "실행결과";

    public static void printErrorMessage(String e) {
            System.out.println(e);
    }

    public static void printExecuteResultText() {
        System.out.println(EXECUTION_RESULT);
    }

    public static void printRacingResult(List<Car> cars) {
        for (Car car : cars) {
            System.out.print(car.name() + " : ");
            System.out.println(printCarDistance(car.position()));
        }
        System.out.println();
    }

    private static String printCarDistance(Position position) {
        StringBuilder totalDistance = new StringBuilder();
        for (int i = 0; i < position.distance(); i++) {
            totalDistance.append(DISTANCE);
        }
        return totalDistance.toString();
    }
}
