import java.util.Scanner;

public class MaiorDeN {
    public static void main(String[] args){
        int maior = 0, entr = -1;
        
        do {
            Scanner scanner = new Scanner(System.in);
             entr = scanner.nextInt();
            if (entr > maior){
                maior = entr;
            }
        }while (entr != 0);

        System.out.println("O maior numero foi " + maior);
    }
}
