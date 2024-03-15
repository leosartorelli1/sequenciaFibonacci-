import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número a ser verificado se pertence à sequencia: ");
        int numero = Integer.parseInt(scanner.nextLine()); //Lendo a entrada como string e convertendo para int
        boolean pertence = sequenciaFibonacci(numero);

        if(pertence) {
            System.out.println("O número " + numero + " faz parte da sequencia de Fibonacci");
        }
        else {
            System.out.println("O número " + numero + " não faz parte da sequencia de Fibonacci");
        }
    }

    public static boolean sequenciaFibonacci(int numero) {
        int inicioOne = 0; //Primeiro numero inicial da sequencia de Fibonacci
        int inicioTwo = 1; //Segundo numero inicial da sequencia de Fibonacci

        while (inicioOne <= numero) {
            if (inicioOne == numero) {
                return true;
            }
            int sequencia = inicioOne + inicioTwo;
            inicioOne = inicioTwo;
            inicioTwo = sequencia;

        }

        return false;
    }
}
