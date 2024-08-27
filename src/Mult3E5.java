public class Mult3E5 {
    public static void main(String[] args){
        for (int i=1 ; i <= 100; i++){
            if (i % 3 == 0){
                System.out.println("O numero " + i + " é multiplo de 3!");
            }if (i % 5 == 0){
                System.out.println("O numero " + i + " é multiplo de 5!");
            }
        }
    }
}
