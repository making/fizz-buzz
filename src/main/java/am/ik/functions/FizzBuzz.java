package am.ik.functions;

import java.util.function.Function;

public class FizzBuzz implements Function<Long, String> {
    @Override
    public String apply(Long x) {
        if (x == null) {
            return "";
        }
        if (x % 3 == 0 && x % 5 == 0) {
            return "FizzBuzz";
        }
        if (x % 3 == 0) {
            return "Fizz";
        }
        if (x % 5 == 0) {
            return "Buzz";
        }
        return x.toString();
    }
}
