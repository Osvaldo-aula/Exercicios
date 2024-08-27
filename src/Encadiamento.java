import java.util.Scanner;

public class Encadiamento {
    public static void main(String[] args) {
        int numRep;

        System.out.println("insira no numero de repetiçoes");
        Scanner scanner = new Scanner(System.in);
        numRep = scanner.nextInt();

        for (int i = 1; i <= numRep ; i++){
            for (int j = 1; j <= i ; j++){
                System.out.print(i * j + " ");
            }
            System.out.println(" ");
        }
    }
}
