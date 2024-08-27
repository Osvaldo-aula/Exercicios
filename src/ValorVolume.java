import java.util.Scanner;

public class ValorVolume {
    public static void main (String[] args) {
        final float pi = 3.14159F;
        int r , a;
        float vol;

        System.out.println("Insira o valor do raio: ");
        Scanner scannerR = new Scanner(System.in);
        r = scannerR.nextInt();

        System.out.println("Insira o valor da altura: ");
        Scanner scannerA = new Scanner(System.in);
        a = scannerA.nextInt();

        vol = pi*(r*r)*a;

        System.out.println("O valor do raio é: " + vol);
    }
}
