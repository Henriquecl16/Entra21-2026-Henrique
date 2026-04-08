
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
		
		double precoPizza = 150.00;
		int numeroPessoas = 10;
		System.out.println(dividir(precoPizza, numeroPessoas));		
		
	
	
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
	
}
