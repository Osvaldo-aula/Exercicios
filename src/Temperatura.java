import java.util.Scanner;

public class Temperatura {
   public static void  main(String[] args){
       System.out.println("Insira o valor em Celsius");
       
       Scanner scanner = new Scanner(System.in);
       
       byte cel = scanner.nextByte();

       double far = ((cel * 1.8) + 32);

       System.out.println(far);
    }

}
