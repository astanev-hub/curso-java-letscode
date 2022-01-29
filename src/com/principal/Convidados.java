package com.principal;
import java.util.Scanner;

public class Convidados {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        String[] convidados = new String[5];
        int i = 0;
        
        System.out.println("Digite o nome de 5 pessoas: ");
        while(i<5) {
        	convidados[i] = sc.next();
        	i++;
        }

        String nomeMaior = convidados[0];
        
        for(String nome : convidados) {
        	if (nome.length() > nomeMaior.length()) {
        		nomeMaior = nome;
        	}	
        }
        
        System.out.println("O maior nome da lista é o: " + nomeMaior);
        
        sc.close();
	}

}
