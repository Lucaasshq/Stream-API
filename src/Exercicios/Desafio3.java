package Exercicios;

import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosFiltrados = numeros.stream()
                .filter(n -> n > 0)
                .toList();

        System.out.println("Lista de números positivos: " +numerosFiltrados);
    }
}
