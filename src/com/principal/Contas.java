package com.principal;
import java.util.Scanner;

public class Contas {
	
	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
        System.out.printf("Digite o primeiro n�mero:%n");
        int x = scan.nextInt();
        
        System.out.printf("Digite outro n�mero diferente do primeiro:%n");
        int y = scan.nextInt();
        
        int quadrado;
        int cubo;
        
        if (x == y) {
        	System.out.println("Os n�meros s�o iguais!!");
        } else if (x > y) {
            quadrado = x*x;
            cubo = y*y*y;
        	System.out.printf("O quadrado de %d � %d.%n", x, quadrado);
        	System.out.printf("O cubo de %d � %d.", y, cubo);
        } else {
            quadrado = y*y;
            cubo = x*x*x;
        	System.out.printf("O quadrado de %d � %d.%n", y, quadrado);
        	System.out.printf("O cubo de %d � %d.", x, cubo);
        }
        
	}
	
}
