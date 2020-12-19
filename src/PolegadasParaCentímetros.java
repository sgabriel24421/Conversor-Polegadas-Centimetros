import java.util.Scanner;
public class PolegadasParaCentímetros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double polegadas = 0.393;
		double centimetros = 2.54; 
		double converted;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira 1 para converter Polegadas para Centimetros ");
		System.out.println("Insira 2 para converter Centímetros para Polegadas ");
		double choice = scan.nextDouble();
		
		if (choice== 1) {
			System.out.println("Insira a altura em Polegadas ");
			polegadas = scan.nextDouble();
			converted = centimetros*0.3937;
			System.out.println("A altura em Polegadas é " + converted);
			
		}
		
		else if (choice== 2) {
			System.out.println("Insira a altura em Centimetros");
			centimetros = scan.nextDouble();
			converted = polegadas*2.54;
			System.out.println("A altura em Centimetros é " + converted);
		}
	}
	

}
