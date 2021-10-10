package racinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
}
