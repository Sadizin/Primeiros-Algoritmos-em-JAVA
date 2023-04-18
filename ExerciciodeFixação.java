package aplicação;

import java.util.Scanner;

import entidades.Carro;

import java.util.Scanner;
import entidade.Carro;
public class Aplicaçaõ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro car;
		Scanner sc;
		double preco;
		int escolha;

		sc = new Scanner(System.in);
		car = new Carro();
		
		System.out.println("Quantos Km foram rodados com o carro?");
		car.kmRodados = sc.nextDouble();
		
		preco = car.calcularPreco(car.kmRodados, car.gassValor);
		
		System.out.printf("O valor gasto na viajem é de : %.2fR$%n", preco);
		System.out.println("Escolha a ação que o carro irá executar:\r\n"
				+ "1 - Frear\r\n"
				+ "2 - Acelerar\r\n"
				+ "3 - Parar\r\n"
				+ "4 - Trocar Marcha");
		escolha = sc.nextInt();
		switch(escolha) {
		
		case 1: System.out.println(car.frear);
		break;
		
		case 2: System.out.println(car.acelerar);
		break;
		
		case 3: System.out.println(car.parar);
		break;
		
		case 4: System.out.println(car.trocarMarcha);
		break;
		}
	
		
		}
}
		
		

	


