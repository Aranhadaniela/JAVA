package primeiralista;

import java.util.Scanner;

public class IntervaloDeNumeros {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Digite o primeiro numero = ");
        float n1 = input.nextFloat();
        System.out.printf("\nDigite o segundo numero = ");
        float n2 =input.nextFloat();
       System.out.printf(" \nDigite o numero que voce deseja saber se esta no intervalo dos outros dois = ");
       float intervalo = input.nextFloat();
       if (n1>n2){
        float temporaria =n2;
        n2=n1;
        n1=temporaria;
       } 
       if(intervalo>=n1 && intervalo<=n2){
    System.out.printf("\no numero esta dentro do intervalo\n");
       }else{
        System.out.printf("\no numero nao esta no intervalo\n");
       }

    }
    
}
