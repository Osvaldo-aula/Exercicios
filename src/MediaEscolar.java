import java.util.Scanner;

public class MediaEscolar {
    public static void main(String[] args) {
        float n1, n2, n3, n4, media, rec, novaMedia;

        System.out.println("Insira a Primeira nota:");
        Scanner scanner1 = new Scanner(System.in);
        n1 = scanner1.nextFloat();

        System.out.println("Insira a Segunda nota:");
        Scanner scanner2 = new Scanner(System.in);
        n2 = scanner2.nextFloat();

        System.out.println("Insira a Terceira nota:");
        Scanner scanner3 = new Scanner(System.in);
        n3 = scanner3.nextFloat();

        System.out.println("Insira a Quarta nota:");
        Scanner scanner4 = new Scanner(System.in);
        n4 = scanner4.nextFloat();

        media = (n1 + n2 + n3 + n4)/4;

        if(media <= 7){
            System.out.println("O aluno foi Aprovado com a media: " + media);
        } else {
            System.out.println("O aluno ficou de não foi aprovado insira a nota da Recuperação:");
            Scanner scannerR = new Scanner(System.in);
            rec = scannerR.nextFloat();

            novaMedia = (media + rec)/2;

            if (novaMedia <= 7) {
                System.out.println("O aluno foi Aprovado na recuperação com a media: " + novaMedia);
            } else {
                System.out.println("O aluno foi Reprovado com a media: " + novaMedia);
            }
        }
    }
}
