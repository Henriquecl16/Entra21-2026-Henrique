
 import java.util.Scanner;

import javax.swing.JOptionPane;
public class AulaJavaArrays {

	public static void main(String[] args) {
		/*String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

		
		System.out.println(cars[0]);
		System.out.println(cars[2]);
		
		cars[2] = "Chevrolet";
		System.out.println(cars[2]);
		
		System.out.println("");
		
		//for indexado
		for(int i = 0; i < cars.length; i++ ) {
			System.out.println(i + "->" + cars[i]);
		}
		
		System.out.println("");
		int x = 0;
		while(x < cars.length) {
			System.out.println(x + "->" + cars[x]);
			x++;
			
		}
		
		//não indexado - iterativo
		System.out.println("");
		for(String c : cars) {
			System.out.println(c);
		}*/
		//desafioDobro();
		//desafioimparpar();
		//int retorno = somar (20 , 40);
		//System.out.println(retorno);
		//exercicio3();
		//exercicio4();
		exercicio5();	
		//exercicio6();
		
		
		
		
		
		//double precoPizza = 150.00;
		//int numeroPessoas = 10;
		//System.out.println(dividir(precoPizza, numeroPessoas));		
		
	
	
	}
  static void desafioDobro() {
		Scanner scanner = new Scanner (System.in);
		
		int[] numeros = new int[5];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(" Informe um número " + i );
			numeros[i] = scanner.nextInt();
			
			
		  }
		/*for (int i = 0; i < numeros.length; i++) {

			int dobro = numeros[i] * 2;
			System.out.println(" O dobro do seu número " + i + " é: " + dobro);
			
			
		  }*/
		
		for(int n : numeros) {
			System.out.println(n + n);
		}
		
		scanner.close();
		
		
	}
  
  static void listaArray(int[] dados) {
	  for(int n : dados) {
		  System.out.println(n);
		  
	  }
	  
	 
	  }
  
  static int somar(int n1, int n2) {
	  return n1 + n2;
  }
  
  static double dividir(double numero, int divisor) {
	  if(divisor == 0) {
		  JOptionPane.showInternalMessageDialog(null, "não pode dividir por zero");
		  return 0.0;
	  }
	  return numero / divisor;
  }
	
  
	
	
	static void desafioimparpar() {
		Scanner scanner = new Scanner (System.in);
		
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println( " Informe um numero " + i);
			numeros [i] = scanner.nextInt();
		}
		
		for (int i = 0; i < numeros.length; i++) {
			
			if (numeros[i] % 2 ==0 ) {
				System.out.println("O número " + numeros[i] + " é PAR");
			} else {
				System.out.println("O número " + numeros[i] + " é IMPAR");
				
			}
		}
	}
	
	static void exercicio3() {
		
		int [] vetor = new int[10];
		for (int i = 0; i <10; i++) {
			vetor[i] = i + 1;
		}
				for (int i1 = 9; i1 >=0; i1--) {
				System.out.print(vetor[i1] + " " );
				
				}
			}
	
	static void exercicio4() {
		
		int vetor[] = new int [15];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 15; i++) {
		    System.out.print("Informe um número: ");
		    vetor[i] = sc.nextInt();
		}
		int maior = vetor[0];

		for (int i = 1; i < 15; i++) {
		    if (vetor[i] > maior) {
		        maior = vetor[i];
		    }
		}
		
		System.out.println("Maior valor: " +  maior);
		System.out.println("Posição: ");
		
		for (int i = 0; i <15; i++) {
			if (vetor[i] == maior) {
				System.out.print(i + " " );
				}
				}
		
		
	
	}
	
	static void exercicio5() {
		
		int vetor[] = new int [8];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 8; i++) {
			System.out.println("Digite um número: ");
			vetor [i] = sc.nextInt();
			}
		
		for (int i = 0; i < 8; i++) {
			for (int j = i + 1; j < 8; j++) {
				if (vetor [i] > vetor [j]) {
				int temp = vetor[i];
				vetor[i] = vetor [j];
				vetor[j] = temp;
				}
				}
		}
		System.out.println("Vetor ordenado: ");
		
		for (int i = 0; i < 8; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		
		
	
	}
	
	static void exercicio6() {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int [10];
		
		for (int i = 0; i< 10; i ++) {
			System.out.println("Digite um número: ");
			numeros [i] = sc.nextInt();
		}
		
		int soma = 0;
		for (int i = 0; i < 10; i++) {
			soma += numeros [i];
			}
		
		double media = soma / 10.0;
		
		System.out.println("Média: " + media);
		System.out.println("Numeros acima da média:");
		
		for (int i = 0; i < 10; i++) {
			if (numeros[i] > media) {
				System.out.println(numeros[i]);
				}
		}
		 
	sc.close();
	}
	
	
	
}
