package com.principal;
import java.util.Scanner;

public class NomeIdade {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int[] idade = new int[5];
        String[] nome = new String[5];
        int i = 0;
        		
        while(i<5) {
        	System.out.println("Digite um nome: ");
        	nome[i] = sc.next();
        	System.out.println("Digite sua idade: ");
        	idade[i] = sc.nextInt();        	
        	i++;
        }

        int idadeMaior = idade[0];
        int idadeMenor = idade[0];
        String nomeMaior = nome[0];
        String nomeMenor = nome[0];
        
        for(int j=0; j<idade.length; j++){
            if (idadeMaior < idade[j]) {
                idadeMaior = idade[j];
                nomeMaior = nome[j];
            }
            if (idadeMenor > idade[j]) {
            	idadeMenor = idade[j];
            	nomeMenor = nome[j];
            } 
        }
        
        System.out.println("O(a) mais novo(a) da turma é: " + nomeMenor + ", com " + idadeMenor + " anos.");
        System.out.println("O(a) mais velho(a) da turma é: " + nomeMaior + ", com " + idadeMaior + " anos.");
        System.out.printf("A média de idade entre eles é: %.2f", (double)((double)(idadeMaior+idadeMenor)/2));
                       
        sc.close();
	}

}
