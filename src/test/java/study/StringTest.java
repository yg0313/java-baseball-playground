package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    public void subString() {
        String input = "(1,2)";
        String result = input.substring(1, input.length() - 1);
        assertThat(5).isSameAs(input.length());
        assertThat(result).isEqualTo("1,2");
    }

}
