package Desafios.Desafio7;

import java.util.Arrays;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        numeros.stream()
        .sorted()
        .skip(numeros.size()-2)
        .limit(1)
        .forEach(System.out::println);
    }
}
