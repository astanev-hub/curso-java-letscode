package com.principal;
import java.util.Scanner;

public class SeparaNumeros {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int[] entrada = new int[5];
        int i = 0;
                		
        System.out.println("Digite 5 numeros: ");
        
        while(i<5) {
        	entrada[i] = sc.nextInt();
        	i++;
        }

        int valorMaior = entrada[0];
        int valorMenor = entrada[0];
        
        for(int numero : entrada){
            if (valorMaior < numero) {
                valorMaior = numero;
            }
            if (valorMenor > numero) {
            	valorMenor = numero;
            } 
        }
        
        System.out.println("O maior número é o: " + valorMaior);
        System.out.println("O menor número é o: " + valorMenor);
        System.out.printf("A média entre o maior e o menor número é: %.2f", (double)((double)(valorMaior+valorMenor)/2));
                       
        sc.close();
	}
}
