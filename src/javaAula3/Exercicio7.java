package javaAula3;
import java.util.Scanner;
import java.util.Arrays;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int listaA[]=new int[4];
		int listaB[]=new int[4];
		int listaC[]=new int[4];
		int listaD[]=new int[4];
		
		for(int i=0;i<listaA.length;i++)
		{
			System.out.printf("Lista A: Digite o %d valor: ",i+1);
			listaA[i]= input.nextInt();
		}
		String ListaAstr= Arrays.toString(listaA);
		for(int i=0;i<listaB.length;i++)
		{
			System.out.printf("Lista B: Digite o %d valor: ",i+1);
			listaB[i]= input.nextInt();
		}
		String ListaBstr= Arrays.toString(listaB);
		for(int i=0;i<listaC.length;i++)
		{
			System.out.printf("Lista C: Digite o %d valor: ",i+1);
			listaC[i]= input.nextInt();
		}
		String ListaCstr= Arrays.toString(listaC);
		for(int i=0;i<listaD.length;i++)
		{
			System.out.printf("Lista D: Digite o %d valor: ",i+1);
			listaD[i]= input.nextInt();
		}
		String ListaDstr= Arrays.toString(listaD);
		
		System.out.printf("Lista A: %s\nLista B: %s\nLista C: %s\nLista D: %s",ListaAstr,ListaBstr,ListaCstr,ListaDstr);
		
		
		
	}
	
}
