import java.util.Scanner;

public class AlturaSexo {
    public static void main(String[] args){
        float maiorAlt = 0, menorAlt = 100, mediaAlt, alt;
        int numMol = 0, sexo;

        for (int i=1 ; i <= 10; i++){
            System.out.println("Introduza a altura: ");
            Scanner scannerAlt = new Scanner(System.in);
            alt = scannerAlt.nextFloat();

            System.out.println("Se o sexo é masculino entre 0 caso feminino insira 1:");
            Scanner scannerSexo = new Scanner(System.in);
            sexo = scannerSexo.nextInt();

            if (alt >= maiorAlt){
                maiorAlt = alt;
            }
            if (alt <= menorAlt){
                menorAlt = alt;
            }
            if(sexo == 1){
                numMol++;
            }
        }

        mediaAlt = (maiorAlt + menorAlt)/2;

        System.out.println("A maior altura é: " + maiorAlt);
        System.out.println("A menor altura é: " +menorAlt);
        System.out.println("A media das alturas são: " +mediaAlt);
        System.out.println("São " + numMol + " mulheres na lista.");
    }
}
