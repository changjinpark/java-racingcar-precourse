package racinggame.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class CarsTest {
    @Test
    @DisplayName("1명 우승자를 찾는 테스트")
    void findOneWinner() {
        Car Audi = new Car(new CarName("Audi"), new Position(1));
        Car Tesla = new Car(new CarName("Tesla"), new Position(2));
        Car BMW = new Car(new CarName("BMW"), new Position(1));

        Cars cars = new Cars(Arrays.asList(Audi, Tesla, BMW));
        Assertions.assertThat(cars.findWinners()).contains(Tesla);
    }
}
