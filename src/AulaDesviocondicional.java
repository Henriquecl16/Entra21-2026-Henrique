import java.util.Scanner;

public class AulaDesviocondicional {
	
	public static void main(String[] args) {
		//verificarNumeroPar();
		//exercicio2();
		//exercicio3();
		//exercicio4();
		//exercicio5();
		//exercicio6();
		//exercicio7();
		//exercicio8();
		exercicio9();
		
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
	
	static void exercicio5() {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        if (idade >= 16) {
            System.out.println("Pode votar.");
        } else {
            System.out.println("Não pode votar.");
        }

        scanner.close();
	}
	
	static void exercicio6() {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int n3 = scanner.nextInt();

        int maior;

        if (n1 >= n2 && n1 >= n3) {
            maior = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            maior = n2;
        } else {
            maior = n3;
        }

        System.out.println("O maior número é: " + maior);

        scanner.close();
		
	}
	
	static void exercicio7() {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota (0 a 10): ");
        double nota = scanner.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
        } else if (nota <= 4) {
            System.out.println("Classificação: Insuficiente");
        } else if (nota <= 6) {
            System.out.println("Classificação: Regular");
        } else if (nota <= 8) {
            System.out.println("Classificação: Bom");
        } else {
            System.out.println("Classificação: Excelente");
        }

        scanner.close();
	}
	
	static void exercicio8() {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o lado B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o lado C: ");
        double c = scanner.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Os lados formam um triângulo válido!");
        } else {
            System.out.println("Os lados NÃO formam um triângulo.");
        }

        scanner.close();		
		
	}
	
	static void exercicio9() {
		
	      Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o lado A: ");
	        double a = scanner.nextDouble();

	        System.out.print("Digite o lado B: ");
	        double b = scanner.nextDouble();

	        System.out.print("Digite o lado C: ");
	        double c = scanner.nextDouble();

	       
	        if (a + b > c && a + c > b && b + c > a) {
	            System.out.println("Os lados formam um triângulo válido!");

	           
	            if (a == b && b == c) {
	                System.out.println("Tipo: Equilátero");
	            } else if (a == b || a == c || b == c) {
	                System.out.println("Tipo: Isósceles");
	            } else {
	                System.out.println("Tipo: Escaleno");
	            }

	        } else {
	            System.out.println("Os lados NÃO formam um triângulo.");
	        }

	        scanner.close();
		
	}
	
	
	
}
