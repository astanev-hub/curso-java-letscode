package com.principal;
import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        String[] nome = new String[5];
        double[] altura = new double[5];
        double[] peso = new double[5]; 
        int i = 0;
        double imc = 0;
        		
        while(i<5) {
        	System.out.println("Digite um nome: ");
        	nome[i] = sc.next();
        	System.out.println("Digite sua altura: ");
        	altura[i] = sc.nextDouble();
        	System.out.println("Digite seu peso: ");
        	peso[i] = sc.nextDouble();
        	i++;
        }
        
        for(int j=0; j<5; j++){
        	imc = (peso[j] /(altura[j]*altura[j])); 
        	
        	if (imc>18.5 && imc<25) { 
        		System.out.printf("O peso de %s está dentro do ideal, pois seu IMC é: %.2f.%n", nome[j], imc);
        	} else {
        		System.out.printf("O peso de %s está fora do ideal, pois seu IMC é: %.2f.%n", nome[j], imc);        		
        	}
        }
                       
        sc.close();
	}

}
