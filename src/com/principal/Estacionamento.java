package com.principal;


import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Estacionamento {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        String[] carros = new String[5];
        LocalDateTime[][] horario = new LocalDateTime[5][2];
        int i = 0;
        int achou = 0;
        int lotado = 0;
        
        boolean continua = true;
        String placa;
        
        System.out.println("SISTEMA DE CONTROLE DE TEMPO DE ESTACIONAMENTO");
        System.out.println("NÚMERO MÁXIMO DE PLACAS NOVAS NO SISTEMA: 5");
        
        while(continua) {
        	
        	System.out.println("Insira a placa do veículo");
        	placa = sc.next();
        	
        	for (int j=0;j<5;j++) {
        		if (placa.equals(carros[j])) {
        			achou = 1;
        			horario[j][1] = LocalDateTime.now();
        			break;
          		} 
        	}
        	
        	if (achou == 0) {
        		if (i == 5) {
    				System.out.println("DESCULPE, ESTACIONAMENTO LOTADO!!");
    				lotado = 1;
    				System.out.println();
        		} else {
        			carros[i] = placa;
        			horario[i][0] = LocalDateTime.now();
        			i++;
        		}	
        	}
  
        	achou = 0;
        	
   			if (lotado == 0) {
   	   			System.out.println("********************");
   	   			System.out.println("RELATÓRIO DE CARROS");
   				for(int k=0;k<5;k++) {
   					if (carros[k] != null) {
   						System.out.println("******************");
   						System.out.println("Carro " + carros[k]);
   						System.out.println("Data e Hora de Entrada: " + horario[k][0]);
   						if (horario[k][1] != null) {
   							System.out.println("Data e Hora de Saída: " + horario[k][1]);
   							System.out.printf("Tempo total de permanência do carro em segundos: " + Duration.between(horario[k][0], horario[k][1]).toSeconds());
   							System.out.println();
   						}
   					} 
   				}
   			} else {
   				lotado = 0;
   			}

            System.out.println();
        	System.out.println("Deseja continuar (S ou N)?");
        	if(sc.next().toUpperCase().equals("N")) {
        		continua = false;
        	}
        	
        }
            sc.close();
         	
        }
 
}
