package com.principal;
import java.util.Scanner;

public class NumerosSeparados {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int[] entrada = new int[5];
        int[] pares = new int[5];
        int[] impares = new int[5];
        int i = 0;
        int idxPar = 0;
        int idxImpar = 0;
        		
        System.out.println("Digite 5 numeros: ");
        
        while(i<5) {
        	entrada[i] = sc.nextInt();
        	i++;
        }

        for(int numero : entrada) {
        	if (numero%2 == 0) {
        		pares[idxPar] = numero;
        		idxPar++;
        	} else {
        		impares[idxImpar] = numero;
        		idxImpar++;
        	}
        }

        System.out.println("Números Ímpares: ");
        for (int j=0;j<idxImpar; j++) {
        	System.out.println(impares[j]);
        }
        
        System.out.println("Números Pares: ");
        for (int j=0;j<idxPar; j++) {
        	System.out.println(pares[j]);
        }
        
        sc.close();
	}

}
