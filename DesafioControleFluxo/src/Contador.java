import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro parametro: ");
        int parametroUm = input.nextInt();
        System.out.print("Digite o segundo parametro: ");
        int parametroDois = input.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Corrija: Parametro 2 deve ser MAIOR que o Parametro 1");
        }
    } 

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroDois < parametroUm){
            throw new ParametrosInvalidosException();
        }
        
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o numero " + i);
        }
    }
}
