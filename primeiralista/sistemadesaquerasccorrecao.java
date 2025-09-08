package primeiralista;
import java.util.Scanner;
import java.util.Arrays;
//System.out.println(Arrays.deepToString(caixa))//depois,criar sistema interno para gerenciamento;
public class Sistemadesaque {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
//variaveis contadoras do recebimento de notas
        int recebeNotasCem=0,recebeNotasCinq=0,recebeNotasDez=0,recebeNotasCinco=0,recebeNotasDois=0;
        boolean continua = true;
int valorMinimo =10, valorMaximo=2000;
int [][]caixa = {
        {100,50},
        {50, 50},
        {10, 50},
        {5,  50},
        {2,  50}
};
while ( continua = true){
System.out.printf("Qual valor vc deseja sacar? ");
int inputvalor= sc.nextInt();

if(inputvalor>valorMinimo && inputvalor<valorMaximo){//se estiver dentro do intervalo
    if(caixa[0][1] !=0){
   recebeNotasCem=inputvalor/100;
    inputvalor=inputvalor-recebeNotasCem*100;
    caixa[0][1]=caixa[0][1]-recebeNotasCem;}else{
        System.out.print("Estamos sem notas de 100,deseja realizar a transação mesmo assim?\n1-SIM\n2-NAO");
        int decisao = sc.nextInt();
    }
    if(caixa[1][1] !=0){
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


System.out.printf("Notas fornecidas = \n%d notas de 100\n%d notas de 50\n%d notas de 10\n%d notas de 5,\n%d notas de 2",recebeNotasCem,recebeNotasCinq,recebeNotasDez,recebeNotasCinco,recebeNotasDois);
//imprimir=recebeNotasDois+recebeNotasCinco+recebeNotasDez+recebeNotasCinq+recebeNotasCem;
System.out.println("Digite:\n1-Encerrar\n2-Realizar novo saque");

}else if(inputvalor<valorMinimo){//se for menor que o valor minimo
    System.out.printf("\nEsse valor é abaixo do minimo necessario para realizar um saque");
}else{System.out.printf("\nEsse valor é acima do maximo estabelecido para realizar um saque");}
//quantas notas de cada tipo serao fornecidas


  //decide se realiza outra operaçao      

int decisao = sc.nextInt();
if(decisao==1){
    continua =false;
    System.out.println("Obrigado!");
    break;
    }
}




 

    }
}
