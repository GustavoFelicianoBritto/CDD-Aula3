package javaAula3;
import java.util.Scanner;

public class Exercicio1 {
	
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		float soma=0;
		int notasInseridas=0;
		float notaTemp;
		System.out.print("Digite a quantidade de alunos na turma: ");
		int resp = input.nextInt();
		
		while(notasInseridas<resp)
		{
			System.out.printf("Digite a nota do aluno %d: ",notasInseridas+1);
			notaTemp= input.nextFloat();
			soma=soma+notaTemp;
			notasInseridas++;
			
		}
		float media=soma/resp;
		System.out.printf("A média dos %d alunos foi %.1f",resp,media);
		
		input.close();
		
		
		
	}
	
	
	
	
}
