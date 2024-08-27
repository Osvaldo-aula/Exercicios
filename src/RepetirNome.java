import java.util.Scanner;

public class RepetirNome {
    public static void main(String[] args) {
        int num;

        System.out.println("Insira o nome");
        Scanner scannerNom = new Scanner(System.in);
        String nome = scannerNom.nextLine();

        System.out.println("Insira o numero de repetições");
        Scanner scannerNum = new Scanner(System.in);
        num = scannerNum.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println(nome);
        }
    }
}
