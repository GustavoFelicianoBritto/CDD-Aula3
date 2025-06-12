package javaAula3;

public class Exercicio6 {

	public static void main(String[] args)
	{
		int soma3=0,soma5=0,somatotal=0;
		
		for (int i=0;i<20;i++)
		{
			if(i%3==0)
			{
				soma3+=i;
			}
			if(i%5==0) 
			{
				soma5+=i;
			}
		}
		somatotal=soma3+soma5;
		System.out.println(soma3);
		System.out.printf("soma total: %d ",somatotal);
		
		
	}

}
