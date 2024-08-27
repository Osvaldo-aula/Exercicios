import java.util.Scanner;

public class CompararNum {
    static public void main (String[] args) {
        int num1, num2;

        System.out.println("Insira o valor do primeiro numero: ");
        Scanner scanner1 = new Scanner(System.in);
        num1 = scanner1.nextInt();

        System.out.println("Insira o valor do segundo numero: ");
        Scanner scanner2 = new Scanner(System.in);
        num2 = scanner2.nextInt();

        if (num1 == num2) {
            System.out.println(num1 + " é igual a " + num2);
            System.out.println(num1 + " é maior ou igual a " + num2);
            System.out.println(num1 + " é menor ou igual a " + num2);
        } else if (num1 > num2) {
            System.out.println(num1 + " não é igual a " + num2);
            System.out.println(num1 + " é maior que " + num2);
            System.out.println(num1 + " é maior ou igual a " + num2);
            System.out.println(num1 + " não é menor que " + num2);
            System.out.println(num1 + " não é menor ou igual a " + num2);
        } else {
            System.out.println(num1 + " não é igual a " + num2);
            System.out.println(num1 + " é menor que " + num2);
            System.out.println(num1 + " é menor ou igual a " + num2);
            System.out.println(num1 + " não é maior que " + num2);
            System.out.println(num1 + " não é maior ou igual a " + num2);
        }
    }
}
