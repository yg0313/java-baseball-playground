package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class SetTest {

    private Set<Integer> numbers;

    @BeforeEach
    void setUp(){
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);
    }

    @DisplayName("set의 사이즈")
    @Test
    void setSize(){
        assertThat(numbers.size()).isEqualTo(4);
    }

    @DisplayName("값의 존재여부")
    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void existValue(int num){
        assertThat(numbers.contains(num)).isTrue();
    }

    @DisplayName("값의 여부에 따른 true,false 테스트")
    @ParameterizedTest
    @CsvSource(value = {"1:true","2:true","3:true","4:true","5:false"}, delimiter = ':')
    void checkValue(int value, boolean expectValue){
        assertThat(numbers.contains(value)).isEqualTo(expectValue);
    }

}
