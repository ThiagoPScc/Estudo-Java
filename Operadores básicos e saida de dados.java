public class MyClass {
   public static void main(String[] args) {
		/*Regra de prioridade: 
		1.Operações feitas com parenteses.
		2.Divisão e multiplicação.
		3.Soma e subtração.
		*/
		
		
		/*tipos de variaveis básicas
		Inteiro:numeros inteiros 32 bits
		long:numeros inteiros com 64 bits
		String : texto e caracteres
		float: numero com casas decimasi com 32 bits
		double : numero com casas decimais com 64 bits
		Boolean: valores lógicos: verdadeiro ou falso
		char: um caracter unicode
		*/
		
		
		//O print e o println possuem uma diferença: o println quebra linha no final.
		
		
		//conta de soma
		int num1 = 2;
		int num2 = 3;
		int soma = num1 + num2;
		
		System.out.println(soma);
		System.out.println("-----------------------");
		
		//conta de subtração
		float num3 = 2.2f;
		float num4 = 3.2f;
		float subtracao = num4 - num3;
		System.out.println(subtracao);
		System.out.println("-----------------------");
		
		//conta de multiplicação
		int num5 = 5;
		float num6 = 5.6f;
		float multiplicacao = num5*num6;
		System.out.println(multiplicacao);
		System.out.printf("%.2fn",multiplicacao);
		//o compilador online que estou usando não aceita o \n :(
		System.out.println("");
		System.out.printf("%.4fn",multiplicacao);
		System.out.println("");
		System.out.println("-----------------------");
		
		//conta de divisão 
		// existe tembem a concatenação dos elementos ao usar o printf
		int num7 = 10;
		int num8 = 2;
		int divisao = num7 / num8;
		System.out.printf("Resultado da divisão de: %d por %d é: %d",num7,num8,divisao);
		System.out.println("");
		System.out.println("-----------------------");
		
		//Conta final
		String nome = "Maria";
		int idade = 35;
		float altura = 1.46f;
		float peso = 67.5f;
		float IMC = peso/(altura*altura);
		System.out.println("A pessoa:"+nome+" possui a idade de:"+idade+" e o IMC de:"+IMC);
		
   }
}