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
			String s = 	"1-Calcular �rea do quadrado\n"+
						"2-Calcular �rea do ret�ngulo\n"+
						"3-Calcular �rea do tri�ngulo\n"+
						"4-Calcular �rea do Trap�zio\n"+
						"5-Sair\n";;
			System.out.println(s);
			System.out.println("Informe a op��o: ");
			op = sc.nextInt();
			if (op < 1 || op > 5)
				System.out.println("Op��o inv�lida!");
			switch (op) {
			case 1:
				System.out.println("Informe o lado: ");
				double lado = sc.nextDouble();
				area = Math.pow(lado, 2);
				System.out.println("-------------------------");
				System.out.println("A �rea do quadrado �: "+String.format("%.2f", area));
				System.out.println("-------------------------");
				break;
			case 2:				
				System.out.println("Informe o primeiro lado do ret�ngulo: ");
				double lado1 = sc.nextDouble();
				System.out.println("Informe o segundo lado do ret�ngulo: ");
				double lado2 = sc.nextDouble();
				area = lado1 * lado2;
				System.out.println("-------------------------");
				System.out.println("A �rea do ret�ngulo �: "+String.format("%.2f", area));
				System.out.println("-------------------------");			
				break;
			case 3:				
				System.out.println("Informe a base do tri�ngulo: ");
				double base = sc.nextDouble();
				System.out.println("Informe a altura do tri�ngulo: ");
				double altura = sc.nextDouble();
				area = base * altura;
				System.out.println("-------------------------");
				System.out.println("A �rea do tri�gulo �: "+String.format("%.2f", area));
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
				System.out.println("A �rea do trap�zio �: "+String.format("%.2f", area));
				System.out.println("-------------------------");
				break;			
			}
		} while (op != 5);
		System.out.println("-----------------------");
		System.out.println("* PROGRAMA FINALIZADO *");
		System.out.println("-----------------------");

	}
	
}
