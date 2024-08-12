package StreamAPI.BinaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(5,10);

        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        int resultado = numeros.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println(resultado);
    }
}
