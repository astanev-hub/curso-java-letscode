package com.principal;
import java.util.Scanner;

public class Operacoes {
	
	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
        System.out.printf("Digite o primeiro n�mero:%n");
        int x = scan.nextInt();
        
        System.out.printf("Digite o segundo n�mero:%n");
        int y = scan.nextInt();
        
        System.out.println("******************************************************");
        System.out.printf("O resultado da soma dos 2 n�meros � ==========> %d%n", (x + y));
        System.out.printf("O resultado da subtra��o dos 2 n�meros � =====> %d%n", (x - y));
        System.out.printf("O resultado da multiplica��o dos 2 n�meros � => %d%n", (x * y));
        System.out.printf("A resultado da divis�o dos 2 n�meros � =======> %.2f%n", ((double)x/(double)y));
        System.out.println("******************************************************");
		
	}
	
}
