package com.principal;
import java.util.Scanner;

public class ImparEmMaiusculo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
        String palavra = sc.next();
        String letra;
        
    	System.out.println();
    	System.out.println("A palavra com os caracteres impares em maiusculo é: ");

        for(int i=0; i<palavra.length(); i++) {
        	if ((i == 0)||(i%2 == 0)) {
        		letra = palavra.substring(i,i+1).toUpperCase();
        	} else {
        		letra = palavra.substring(i,i+1);
        	}
        	
        	System.out.printf("%s", letra);
        }
        
        sc.close();
	}

}
