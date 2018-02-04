package am.ik.functions;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testFizzBuzz() {
        assertThat(fizzBuzz.apply(15L)).isEqualTo("FizzBuzz");
    }

    @Test
    public void testFizz() {
        assertThat(fizzBuzz.apply(9L)).isEqualTo("Fizz");
    }

    @Test
    public void testBuzz() {
        assertThat(fizzBuzz.apply(10L)).isEqualTo("Buzz");
    }

    @Test
    public void testOther() {
        assertThat(fizzBuzz.apply(7L)).isEqualTo("7");
    }
}