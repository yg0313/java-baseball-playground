import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;

class StringCalculatorTest {

    private StringCalculator stringCalculator;
    private Scanner scanner;
    private String value;
    private String[] values;

    @BeforeEach
    void setUp() {
        stringCalculator = new StringCalculator();
        scanner = new Scanner(System.in);
        value = scanner.nextLine();
        values = value.split(" ");
    }

    @DisplayName("문자열 사칙 연산 수행")
    @Test
    public void calc(){
        int result = Integer.parseInt(values[0]);
        for (int i = 0; i < values.length - 2; i += 2) {
            result = stringCalculator.calculate(result, Integer.parseInt(values[i + 2]), values[i + 1]);
        }

        assertThat(result).isEqualTo(20);
        assertThat(result).isEqualTo(21);
    }
}