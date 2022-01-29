package com.principal;
import java.util.Scanner;

public class Conversor {
	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite uma temperatura em graus Celsius:");
        double c = scan.nextDouble();
        
        double f = (((c*9)/5) + 32);
        		
        System.out.printf("A temperatura em graus Fahrenheit é: %.1f", f);
 		
	}
	
}

