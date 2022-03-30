import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    public void setUp() {
        System.out.println("CalculatorTest.setUp");
        calculator = new Calculator();
    }

    @Test
    public void 덧셈() {
        System.out.println("CalculatorTest.덧셈");
        assertEquals(7, calculator.add(3, 4));
    }

    @Test
    public void 뺄셈() {
        System.out.println("CalculatorTest.뺄셈");
        assertEquals(1, calculator.substract(5,4));
    }

    @Test
    public void 곱셈(){
        System.out.println("CalculatorTest.곱셈");
        assertEquals(6, calculator.multiply(2,3));
    }

    @Test
    public void 나눗셈(){
        System.out.println("CalculatorTest.나눗셈");
        assertEquals(2, calculator.divide(8,4));
    }

    @AfterEach
    public void tearDown(){
        System.out.println("CalculatorTest.tearDown");
        calculator = null;
    }

}