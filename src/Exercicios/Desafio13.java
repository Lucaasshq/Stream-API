package Exercicios;

import java.util.Arrays;
import java.util.List;

//Desafio 13 - Filtrar os números que estão dentro de um intervalo:
//Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.

public class Desafio13 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int intervalo1 = 5;
        int intervalo2 = 10;

     List<Integer> intervalo =  numeros.stream()
                .filter(n -> n >= intervalo1 && n <= intervalo2).toList();

        System.out.println(intervalo);
    }
}
