package primeiralista;
import java.util.Scanner;
import java.util.Arrays;
//System.out.println(Arrays.deepToString(caixa))//depois,criar sistema interno para gerenciamento;
public class Sistemadesaquerasccorrecao {
    
    private static int perguntarSeContinua(Scanner sc){
     int decisao = sc.nextInt();
     if (decisao==2){
       System.out.println("Obrigado!");
    break;}else if(decisao!=1 ){System.out.print("Opçao invalida");break;}
        

    public  void main(String[] args) {
Scanner sc=new Scanner(System.in);
//variaveis contadoras do recebimento de notas
        int recebeNotasCem=0,recebeNotasCinq=0,recebeNotasDez=0,recebeNotasCinco=0,recebeNotasDois=0;
       int decisao =1;
int valorMinimo =10, valorMaximo=2000;
int [][]caixa = {
        {100,50},
        {50, 50},
        {10, 50},
        {5,  50},
        {2,  50}
};
while ( decisao == 1){
System.out.printf("Qual valor vc deseja sacar? ");
int inputvalor= sc.nextInt();

if(inputvalor>valorMinimo && inputvalor<valorMaximo){//se estiver dentro do intervalo
    //notas de 100
    if(caixa[0][1] !=0){
   recebeNotasCem=inputvalor/100;
    inputvalor=inputvalor-recebeNotasCem*100;
    caixa[0][1]=caixa[0][1]-recebeNotasCem;}else{
        System.out.print("Estamos sem notas de 100,deseja realizar a transação mesmo assim?\n1-SIM\n2-NAO");
        perguntarSeContinua(sc);
    }
    //notas de 50
    if(caixa[1][1] !=0){
     recebeNotasCinq=inputvalor/50;
    caixa[1][1]=caixa[1][1]-recebeNotasCinq;
    inputvalor=inputvalor-recebeNotasCinq*50;}else{ System.out.print("Estamos sem notas de 50,deseja realizar a transação mesmo assim?\n1-SIM\n2-NAO");perguntarSeContinua(sc);}
    //notas de 10
    if(caixa[2][1] !=0){
    recebeNotasDez=inputvalor/10;
    caixa[2][1]=caixa[2][1]-recebeNotasDez;
    inputvalor=inputvalor-recebeNotasDez*10;}else{ System.out.print("Estamos sem notas de 10,deseja realizar a transação mesmo assim?\n1-SIM\n2-NAO");perguntarSeContinua(sc);}
     //notas de 5
     if(caixa[3][1]!=0){
    recebeNotasCinco=inputvalor/5;
    caixa[3][1]=caixa[3][1]-recebeNotasCinco;
    inputvalor=inputvalor-recebeNotasCinco*5;}else{ System.out.print("\nEstamos sem notas suficientes para realizar a transacao");}
   //notas de 2
   if(caixa[4][1]!=0){
    recebeNotasDois =inputvalor/2;
    caixa[4][1]=caixa[4][1]-recebeNotasDois;
    inputvalor=inputvalor-recebeNotasDois;}else{System.out.print("\nEstamos sem notas suficientes para realizar a transacao");}


System.out.printf("Notas fornecidas = \n%d notas de 100\n%d notas de 50\n%d notas de 10\n%d notas de 5,\n%d notas de 2",recebeNotasCem,recebeNotasCinq,recebeNotasDez,recebeNotasCinco,recebeNotasDois);
//imprimir=recebeNotasDois+recebeNotasCinco+recebeNotasDez+recebeNotasCinq+recebeNotasCem;
System.out.println("Digite:\n1-Realizar novo saque\n2-Encerrar  ");

}else if(inputvalor<valorMinimo){//se for menor que o valor minimo
    System.out.printf("\nEsse valor é abaixo do minimo necessario para realizar um saque");
    System.out.print("\nDeseja reiniciar a operação\n1-SIM\n2-NAO");
  //decide se realiza outra operaçao      
perguntarSeContinua(sc);
}else{System.out.printf("\nEsse valor é acima do maximo estabelecido para realizar um saque");}
//quantas notas de cada tipo serao fornecidas

System.out.print("\nDeseja reiniciar a operação\n1-SIM\n2-NAO");
  //decide se realiza outra operaçao      
perguntarSeContinua(sc);



   
}
}

}