package com.principal;
import java.util.Scanner;

public class Divisivel {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        int x = scan.nextInt();
        
        if ((x%10 == 0) && (x%5 == 0) && (x%2 == 0))  {
        	System.out.printf("O número %d é divisível por 10, 5 e 2!!", x);
        } else if ((x%10 != 0) && (x%5 != 0) && (x%2 != 0)) {
        	System.out.printf("O número %d não é divisível nem por 10, nem por 5 e nem por 2!!", x);
        }
        
	}
	
}
