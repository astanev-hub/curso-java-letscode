package com.principal;
import java.util.Scanner;

public class Centimetros {
	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a medida em Polegadas:");
        double p = scan.nextDouble();
        
        double c = p * 2.54;
        
        System.out.printf("A medida em Centímetros é %.2f.", c);
 		
	}

}
