//3) Ler dois inteiros (vari�veis A e B) e imprimir o resultado do quadrado da diferen�a do 
//primeiro valor pelo segundo. 
package Exercicios;
import java.util.Scanner;

public class Exercicio03 {

public static void main (String[]args){
	
Scanner sc = new Scanner(System.in);
	
System.out.println("Digite o primeiro valor");

int numero1= sc.nextInt();

System.out.println("Digite o segundo valor que deseja subtrair");

int numero2= sc.nextInt();

double resultado;
resultado = numero1-numero2;

System.out.println("resultado do quadrado da diferen�a do primeiro pelo segundo � de " + resultado*resultado);
}
}



	