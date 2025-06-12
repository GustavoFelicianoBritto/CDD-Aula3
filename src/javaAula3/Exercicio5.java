package javaAula3;
import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) 
	{
		float soma=0,notatemp=0;
	
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Digite a quantidade de alunos: ");
		int resp = input.nextInt();
		
		for(int i=1;i<=resp;i++)
		{
			System.out.printf("Digitea nota do aluno %d: ",i);
			notatemp=input.nextFloat();
			
			soma+=notatemp;
		}
		float media = soma/resp;
		System.out.printf("A média de %d alunos foi: %.1f ",resp,media);
		
		input.close();
	}

}
