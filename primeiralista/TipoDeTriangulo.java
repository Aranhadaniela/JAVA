package primeiralista;
import java.util.Scanner;
public class TipoDeTriangulo {


public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	float []triangulo=new float [3];
	for(int lado = 0;lado<3;lado++){
	    	System.out.printf("Digite o %d lado do triangulo = ",lado+1);
	    	triangulo[lado]=input.nextFloat();
	    	if(triangulo[lado]<=0){
	    	    System.out.printf("0 nao e um comprimento valido");break;
	    	}
	}
	if(triangulo[0]+triangulo[1]>triangulo[2] && triangulo[0]+triangulo[2]>triangulo[1] && triangulo[1]+triangulo[2]>triangulo[0]){//se equivale a um triangulo podemos classifica-lo em:
	    if(triangulo[0]==triangulo[1]&& triangulo[2]==triangulo[1]){
	        System.out.printf("Esses valores formam um triangulo equilatero\n");
	    }else if (triangulo[1]==triangulo[0]||triangulo[1]==triangulo[2]||triangulo[0]==triangulo[2]){
	        System.out.printf("Esses valores formam um triangulo isosceles\n");
	    }else{System.out.printf("Esses valores formam um triangulo escaleno\n");
	}
}else{
    System.out.printf("Esses valores nao formam um triangulo");
}

	}}
