package Desafios.Desafio9;

import java.util.Arrays;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println(numeros.stream().distinct().count() == numeros.size());
    }
}
