package racinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationUtilsTest {

    @Test
    @DisplayName("자동차 이름이 5글자 초과할 경우, false 반환하며 [ERROR] 시작 메세지 출력")
    void 자동차이름_5글자_초과() {
        String[] carNameArray = "Audi,BMW,Hyundai,Kia".split(",");
        assertThat(ValidationUtils.validationNameLength(carNameArray)).isFalse();
    }

    @Test
    @DisplayName("자동차 이름이 5글자 이하일 경우 정상")
    void 자동차이름_5글자_이하() {
        String[] carNameArray = "Audi,BMW,Kia,tesla".split(",");
        assertThat(ValidationUtils.validationNameLength(carNameArray)).isTrue();
    }

    @Test
    @DisplayName("자동차가 2대 미만일 경우, false 반환하며 [ERROR] 시작 메세지 출력")
    void 자동차가_2대_미만_입력() {
        String[] carNameArray = "Audi".split(",");
        assertThat(ValidationUtils.validationNumberOfCars(carNameArray)).isFalse();

        carNameArray = "".split(",");
        assertThat(ValidationUtils.validationNumberOfCars(carNameArray)).isFalse();
    }

    @Test
    @DisplayName("자동차 이름이 중복된 값이 있을 경우, false 반환하며 [ERROR] 시작 메세지 출력")
    void 자동차가_중복_입력() {
        String[] carNameArray = "Audi,BMW,Kia,Audi,tesla".split(",");
        assertThat(ValidationUtils.validationNonDuplicate(Arrays.asList(carNameArray))).isFalse();
    }

    @ParameterizedTest
    @ValueSource(strings = {"abc", "-1"})
    @DisplayName("입력한 라운드 값이 양의 정수가 아닐 경우, false 반환하며 [ERROR] 시작 메세지 출력")
    void 라운드_숫자_아닌_경우(String round) {
        assertThat(ValidationUtils.validationPositive(round)).isFalse();
    }
}
