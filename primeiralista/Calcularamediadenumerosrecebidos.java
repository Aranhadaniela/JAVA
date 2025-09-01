package primeiralista;

import java.util.Scanner;

public class Calcularamediadenumerosrecebidos {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        float []numeros =new float[10];
        float maior,menor;
        for(int linhas= 0;linhas<10;linhas++){
            System.out.printf("Digite o %d^0 numero = ",linhas+1);
            numeros[linhas] =input.nextFloat();


        }
        maior=numeros[0];
        menor=numeros[0];
        for(int linhas= 0;linhas<3;linhas++){
            if(numeros[linhas]>maior){
                maior=numeros[linhas];
            }else if (numeros[linhas]<menor){
                menor=numeros[linhas];
            }


        }
        float soma = menor+maior;
        float media = (maior+menor)/2;
        
        System.out.printf("o maior numero  = %.2f",maior);
        System.out.printf("\n o menor numero  = %.2f",menor);
        System.out.printf("\nA soma entre ele é %.2f",soma  );
        System.out.printf("\nA média é %.2f",media);
    }
}
