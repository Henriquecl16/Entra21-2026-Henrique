import java.util.Scanner;

public class AulaDesviocondicional {
	
	public static void main(String[] args) {
		//verificarNumeroPar();
		//exercicio2();
		//exercicio3();
		exercicio4();
		
	}
	static void verificarNumeroPar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe numero:");
		int numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Numero par");
		}
		
		
		
	}
	
	static void exercicio2() {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("Os dois números são iguais.");
        }

        scanner.close();
    
		
	}
	
	static void exercicio3() {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número: ");
	        int numero = scanner.nextInt();

	        if (numero > 0) {
	            System.out.println("O número é POSITIVO.");
	        } else if (numero < 0) {
	            System.out.println("O número é NEGATIVO.");
	        } else {
	            System.out.println("O número é ZERO.");
	        }

	        scanner.close();
		
	}
	
	static void exercicio4() {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a nota do aluno (0 a 10): ");
	        double nota = scanner.nextDouble();

	        if (nota >= 6) {
	            System.out.println("Aprovado");
	        } else {
	            System.out.println("Reprovado");
	        }

	        scanner.close();
		
	}
	
}
