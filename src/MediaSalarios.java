import java.util.Scanner;

public class MediaSalarios {
    public static void main (String[] args) {

        double sal = 0, somaSal = 0, mediaSal, numFunc = 0;

        do {
            System.out.println("insira o valor do salario. Para finalizar o processo entre 0!");
            Scanner scannerNum = new Scanner(System.in);
            sal = scannerNum.nextDouble();
            if (sal > 0) {
                somaSal = (somaSal + sal);
            }
            if (sal > 0) {
                numFunc++;
            }
        } while (sal != 0);

        mediaSal = (somaSal/numFunc);

        System.out.println(mediaSal);
    }
}
