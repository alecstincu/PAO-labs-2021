package ro.unibuc.pao.interfete.functionale;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, Integer> squareFunction = x -> x * x;
        Function<Integer, Integer> doubleFunction = x -> 2 * x;

        System.out.println(squareFunction.apply(5));

        System.out.println("f ∘ g = " + squareFunction.compose(doubleFunction).apply(2)); // (2*2)->4*4=16
        System.out.println("g ∘ f = " + squareFunction.andThen(doubleFunction).apply(2)); // 8

        System.out.println("g ∘ f = " + doubleFunction.compose(squareFunction).apply(2)); // (2*2)->2*4=8
        System.out.println("f ∘ g = " + doubleFunction.andThen(squareFunction).apply(2)); // 16
    }
}
