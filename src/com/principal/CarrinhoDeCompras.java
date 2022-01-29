package com.principal;
import java.util.Scanner;

public class CarrinhoDeCompras {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        String[] carrinho = new String[5];
        int i = 0;
        
        System.out.println("Digite o nome de 5 frutas: ");
        while(i<5) {
        	carrinho[i] = sc.next();
        	i++;
        }

        i = 0;
        for(String item : carrinho) {
        	i++;
        	System.out.printf("Fruta %d: %s%n",i,item);
        }
        sc.close();
	}
}
