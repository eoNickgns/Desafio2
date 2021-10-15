package desafio2a;

import java.util.Locale;
import java.util.Scanner;

import desafio2a.entities.Product;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Value: ");
		product.value = sc.nextDouble();
		System.out.print("Tax: ");
		product.tax = sc.nextDouble();
		System.out.println();
		System.out.println(product);
		
		System.out.println();
		
		System.out.print("Enter with discount: ");
		double percentage = sc.nextDouble();
		product.DiscountProduct(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		
		sc.close();
		
	}

}
