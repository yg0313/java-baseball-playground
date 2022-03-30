package study;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.assertj.core.api.Assertions.assertThat;

public class CollectionTest {
    @Test
    public void arrayList(){
        ArrayList<String> values = new ArrayList<>();
        values.add("first");
        values.add("second");
        assertThat(values.add("third")).isTrue();
        assertThat(values.size()).isEqualTo(3);
        assertThat(values.get(0)).isEqualTo("first");
        assertThat(values.contains("first")).isTrue();
        assertThat(values.remove("first")).isTrue();
        assertThat(values.size()).isEqualTo(2);
    }
}
