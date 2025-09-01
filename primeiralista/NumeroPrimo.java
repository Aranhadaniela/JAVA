package primeiralista;
import java.util.Scanner;
public class NumeroPrimo{
    public static void main (String[]args){
       boolean primo=true;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite um numero para saber se e primo ou nao = ");
        int numeros = sc.nextInt();
        if (numeros<=1){
            primo = false;
        }else{
            for(int i =2;i<numeros;i++){
                if (numeros% i ==0){
                    primo =false;
                    break;
                }
            }
        }
        if(primo){
            System.out.printf("%d e primo\n",numeros);
            
        }else{
            System.out.printf("%d nao e primo\n",numeros);
        }
    sc.close();

    }
}