import java.util.Scanner;

public class TrocarValores {
    public static void main(String[] args) {
        int val1, val2, temp;

        System.out.println("insira o primeiro valor");
        Scanner scanner1 = new Scanner(System.in);
        val1 = scanner1.nextInt();

        System.out.println("insira o segundo valor");
        Scanner scanner2 = new Scanner(System.in);
        val2 = scanner2.nextInt();

        temp = val1;
        val1 = val2;
        val2 = temp;

        System.out.println("Primeiro valor: " + val1 + "Segundo valor: " + val2);
    }
}
