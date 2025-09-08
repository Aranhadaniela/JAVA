package primeiralista;
import java.util.Scanner;
import java.util.Arrays;
//System.out.println(Arrays.deepToString(caixa))//depois,criar sistema interno para gerenciamento;
public class Sistemadesaque {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
//variaveis contadoras do recebimento de notas
        int recebeNotasCem=0,recebeNotasCinq=0,recebeNotasDez=0,recebeNotasCinco=0,recebeNotasDois=0;
int valorMinimo =10, valorMaximo=2000;
int [][]caixa = {
        {100,50},
        {50, 50},
        {10, 50},
        {5,  50},
        {2,  50}
};

System.out.printf("Qual valor vc deseja sacar? ");
int inputvalor= sc.nextInt();

if(inputvalor>valorMinimo && inputvalor<valorMaximo){//se estiver dentro do intervalo
   recebeNotasCem=inputvalor/100;
    inputvalor=inputvalor-recebeNotasCem*100;
    caixa[0][1]=caixa[0][1]-recebeNotasCem;
     recebeNotasCinq=inputvalor/50;
    caixa[1][1]=caixa[1][1]-recebeNotasCinq;
    inputvalor=inputvalor-recebeNotasCinq*50;
    recebeNotasDez=inputvalor/10;
    caixa[2][1]=caixa[2][1]-recebeNotasDez;
    inputvalor=inputvalor-recebeNotasDez*10;
     recebeNotasCinco=inputvalor/5;
    caixa[3][1]=caixa[3][1]-recebeNotasCinco;
    inputvalor=inputvalor-recebeNotasCinco*5;
    recebeNotasDois =inputvalor/2;
    caixa[4][1]=caixa[4][1]-recebeNotasDois;
    inputvalor=inputvalor-recebeNotasDois;



//imprimir=recebeNotasDois+recebeNotasCinco+recebeNotasDez+recebeNotasCinq+recebeNotasCem;


}else if(inputvalor<valorMinimo){//se for menor que o valor minimo
    System.out.printf("\nEsse valor é abaixo do minimo necessario para realizar um saque");
}else{System.out.printf("\nEsse valor é acima do maximo estabelecido para realizar um saque");}
//quantas notas de cada tipo serao fornecidas

System.out.printf("Notas fornecidas = \n%d notas de 100\n%d notas de 50\n%d notas de 10\n%d notas de 5\n%d notas de 2",recebeNotasCem,recebeNotasCinq,recebeNotasDez,recebeNotasCinco,recebeNotasDois);
System.out.printf("\nDigite:\n1-Repetir transação\n2-Encerrar");
        

int decisao = sc.nextInt();

if(decisao==1){
    System.out.printf("Qual valor vc deseja sacar? ");
     inputvalor= sc.nextInt();
    if(inputvalor>valorMinimo && inputvalor<valorMaximo){//se estiver dentro do intervalo
        recebeNotasCem=inputvalor/100;
        inputvalor=inputvalor-recebeNotasCem*(100);
        caixa[0][1]=caixa[0][1]-recebeNotasCem;

        recebeNotasCinq=inputvalor/50;
        caixa[1][1]=caixa[1][1]-recebeNotasCinq;
        inputvalor=inputvalor-recebeNotasCinq*(50);
        recebeNotasDez=inputvalor/10;
        caixa[2][1]=caixa[2][1]-recebeNotasDez;
        inputvalor=inputvalor-recebeNotasDez*(10);
        recebeNotasCinco=inputvalor/5;
        caixa[3][1]=caixa[3][1]-recebeNotasCinco;
        inputvalor=inputvalor-recebeNotasCinco*(5);
        recebeNotasDois =inputvalor/2;
        caixa[4][1]=caixa[4][1]-recebeNotasDois;
        inputvalor=inputvalor-recebeNotasDois;

}else if(inputvalor<valorMinimo){//se for menor que o valor minimo
        System.out.printf("\nEsse valor é abaixo do minimo necessario para realizar um saque");
    }else{System.out.printf("\nEsse valor é acima do maximo estabelecido para realizar um saque");}
//quantas notas de cada tipo serao fornecidas

    System.out.printf("Notas fornecidas = \n%d notas de 100\n%d notas de 50\n%d notas de 10\n%d notas de 5,\n%d notas de 2",recebeNotasCem,recebeNotasCinq,recebeNotasDez,recebeNotasCinco,recebeNotasDois);


    }else{
    System.out.printf("Obrigado!");
    }

    }
}
