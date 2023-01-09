import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número e aperte enter para ver sua tabela de multiplicação:");

        int userInput = in.nextInt();

        System.out.println("Tabela de multiplicação de " + userInput + ":");

        int i = 1;

        while(i <= 10) {
            int multiplicationResult = i * userInput;
            System.out.println(i + "x" + userInput + " = " + multiplicationResult);
            i++;
        }
    }
}
