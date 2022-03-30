package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");

    }

    @DisplayName("split 테스트")
    @Test
    void split(){
        String numbers = "1,2";
        assertThat(numbers.split(",")).isEqualTo(new String[]{"1","2"});
        assertThat(numbers.split(",")).contains("1");
    }

    @DisplayName("substring 테스트")
    @Test
    public void subString() {
        String numbers = "(1,2)";
        assertThat(5).isSameAs(numbers.length());
        assertThat(numbers.substring(1, numbers.length()-1)).isEqualTo("1,2");
    }
    
    @DisplayName("charAt 테스트")
    @Test
    public void charAt(){
        String s = "abc";
        assertThat(s.charAt(0)).isEqualTo('a');

        // 예외처리 메시지포함여부
        assertThatThrownBy(()->{
            assertThat(s.charAt(3)).isEqualTo('4');
        }).isInstanceOf(StringIndexOutOfBoundsException.class).hasMessageContaining("String index out of range");

        assertThatExceptionOfType(IndexOutOfBoundsException.class)
                .isThrownBy(()->{
                    assertThat(s.charAt(3)).isEqualTo('4');
                }).withMessageMatching("String index out of range: 3");

    }

}
