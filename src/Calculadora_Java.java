import java.util.Locale;
import java.util.Scanner;

public class Calculadora_Java {

	//Divide dois valores
	
	public static void operadorDivisao() {
		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);			
		
		System.out.println("Digite dois valores:");
		double valor1 = tec.nextDouble();
		double valor2 = tec.nextDouble();
		
		double resultado = valor1 / valor2;	
		System.out.println("A divisão dos dois valores é igual a " + resultado);
			
		tec.close();
	}
	
	//Multiplica dois valores
	
	public static void operadorMultiplicacao() {
		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Digite dois valores:");
		double valor1 = tec.nextDouble();
		double valor2 = tec.nextDouble();
		
		double resultado = valor1 * valor2;	
		System.out.println("A multiplicação dos dois valores é igual a " + resultado);
			
		tec.close();
	}
	
	//Subtraí dois valores
	
	public static void operadorSubtracao() {
		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Digite dois valores:");
		double valor1 = tec.nextDouble();
		double valor2 = tec.nextDouble();
		
		double resultado = valor1 - valor2;	
		System.out.println("A subtração dos dois valores é igual a " + resultado);
			
		tec.close();
	}
	
	//Soma dois valores
	
	public static void operadorSoma() {
		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Digite dois valores:");
		double valor1 = tec.nextDouble();
		double valor2 = tec.nextDouble();
		
		double resultado = valor1 + valor2;
		System.out.println("A soma dos dois valores é igual a " + resultado);
		
		tec.close();
	}
	
	//Método de escolha de operador
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Digite um operador (+, -, * ou /):");
		char escolha = tec.next().charAt(0);
		
		switch(escolha) {
			case '+':
				operadorSoma();
				break;
			case '-':
				operadorSubtracao();
				break;
			case '*':
				operadorMultiplicacao();
				break;
			case '/':	
				operadorDivisao();
				break;
			default:
				break;
		}
		tec.close();

	}

}
