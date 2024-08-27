import java.util.Scanner;

public class valorABC {
    public static void main (String[] args) {
        int a, b, c, res, res2;

        System.out.println("Entre o valor de a: ");
        Scanner scannerA = new Scanner(System.in);
        a = scannerA.nextInt();

        System.out.println("Entre o valor de b: ");
        Scanner scannerB = new Scanner(System.in);
        b = scannerB.nextInt();

        System.out.println("Entre o valor de b: ");
        Scanner scannerC = new Scanner(System.in);
        c = scannerC.nextInt();

        res = (a-b)*(c^2);

        res2 = a-b*c^2;
        System.out.println("expressão aritmética: a – b * c ** 2" + res2);
        System.out.println("expressão aritmética: (a – b) * (c ** 2)" + res);
    }
}
