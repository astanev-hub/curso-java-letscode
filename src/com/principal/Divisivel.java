package com.principal;
import java.util.Scanner;

public class Divisivel {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um n�mero inteiro: ");
        int x = scan.nextInt();
        
        if ((x%10 == 0) && (x%5 == 0) && (x%2 == 0))  {
        	System.out.printf("O n�mero %d � divis�vel por 10, 5 e 2!!", x);
        } else if ((x%10 != 0) && (x%5 != 0) && (x%2 != 0)) {
        	System.out.printf("O n�mero %d n�o � divis�vel nem por 10, nem por 5 e nem por 2!!", x);
        }
        
	}
	
}
