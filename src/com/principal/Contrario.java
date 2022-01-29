package com.principal;
import java.util.Scanner;

public class Contrario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
        String palavra = sc.next();
    
    	System.out.println();
    	System.out.println("A palavra ao contrário é: ");

        for(int i=palavra.length() - 1; i>=0;i--) {
        	System.out.printf(palavra.substring(i,i+1));
        }
        
        sc.close();
	}

}
