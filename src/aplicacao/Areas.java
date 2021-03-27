package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Areas {
	static double area;
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int op = 1;
		do {
			String s = 	"1-Calcular área do quadrado\n"+
						"2-Calcular área do retângulo\n"+
						"3-Calcular área do triângulo\n"+
						"4-Calcular área do Trapézio\n"+
						"5-Sair\n";;
			System.out.println(s);
			System.out.println("Informe a opção: ");
			op = sc.nextInt();
			if (op < 1 || op > 5)
				System.out.println("Opção inválida!");
			switch (op) {
			case 1:
				System.out.println("Informe o lado: ");
				double lado = sc.nextDouble();
				area = Math.pow(lado, 2);
				System.out.println("-------------------------");
				System.out.println("A área do quadrado é: "+String.format("%.2f", area));
				System.out.println("-------------------------");
				break;
			case 2:				
				System.out.println("Informe o primeiro lado do retângulo: ");
				double lado1 = sc.nextDouble();
				System.out.println("Informe o segundo lado do retângulo: ");
				double lado2 = sc.nextDouble();
				area = lado1 * lado2;
				System.out.println("-------------------------");
				System.out.println("A área do retângulo é: "+String.format("%.2f", area));
				System.out.println("-------------------------");			
				break;
			case 3:				
				System.out.println("Informe a base do triângulo: ");
				double base = sc.nextDouble();
				System.out.println("Informe a altura do triângulo: ");
				double altura = sc.nextDouble();
				area = base * altura;
				System.out.println("-------------------------");
				System.out.println("A área do triâgulo é: "+String.format("%.2f", area));
				System.out.println("-------------------------");
				break;
			case 4:
				System.out.println("Informe a base Maior: ");
				double baseMaior = sc.nextDouble();
				System.out.println("Informe a base Menor: ");
				double baseMenor = sc.nextDouble();
				System.out.println("Informe a altura: ");
				double alturaTrapezio = sc.nextDouble();
				area = ((baseMaior + baseMenor)*alturaTrapezio)/2;
				System.out.println("-------------------------");
				System.out.println("A área do trapézio é: "+String.format("%.2f", area));
				System.out.println("-------------------------");
				break;			
			}
		} while (op != 5);
		System.out.println("-----------------------");
		System.out.println("* PROGRAMA FINALIZADO *");
		System.out.println("-----------------------");

	}
	
}
