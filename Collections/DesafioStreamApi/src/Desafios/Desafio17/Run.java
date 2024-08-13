package Desafios.Desafio17;

import java.util.Arrays;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        numeros.stream().filter(n -> {
            if (n <= 1){
                return false;
            }
            for (int i = 2; i * i <= n; i++){
                if (n % i == 0){
                    return false;
                }
            }
            return true;
        })
        .forEach(System.out::println);  
    }
}
