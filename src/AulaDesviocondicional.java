import java.util.Scanner;

public class AulaDesviocondicional {
	
	public static void main(String[] args) {
		//verificarNumeroPar();
		exercicio2();
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
	
}
