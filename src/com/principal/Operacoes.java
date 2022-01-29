package com.principal;
import java.util.Scanner;

public class Operacoes {
	
	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
        System.out.printf("Digite o primeiro número:%n");
        int x = scan.nextInt();
        
        System.out.printf("Digite o segundo número:%n");
        int y = scan.nextInt();
        
        System.out.println("******************************************************");
        System.out.printf("O resultado da soma dos 2 números é ==========> %d%n", (x + y));
        System.out.printf("O resultado da subtração dos 2 números é =====> %d%n", (x - y));
        System.out.printf("O resultado da multiplicação dos 2 números é => %d%n", (x * y));
        System.out.printf("A resultado da divisão dos 2 números é =======> %.2f%n", ((double)x/(double)y));
        System.out.println("******************************************************");
		
	}
	
}
