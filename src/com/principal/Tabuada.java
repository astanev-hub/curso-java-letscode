package com.principal;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
        System.out.printf("Digite um número entre 01 e 10:%n");
        int i = scan.nextInt();
        
        if ((i > 0) && (i < 11)) {
            System.out.printf("** TABUADA DO %02d **%n", i);
            System.out.printf("01 x %02d => %03d%n", i, (1 * i));
            System.out.printf("02 x %02d => %03d%n", i, (2 * i));
            System.out.printf("03 x %02d => %03d%n", i, (3 * i));
            System.out.printf("04 x %02d => %03d%n", i, (4 * i));
            System.out.printf("05 x %02d => %03d%n", i, (5 * i));
            System.out.printf("06 x %02d => %03d%n", i, (6 * i));
            System.out.printf("07 x %02d => %03d%n", i, (7 * i));
            System.out.printf("08 x %02d => %03d%n", i, (8 * i));
            System.out.printf("09 x %02d => %03d%n", i, (9 * i));
            System.out.printf("10 x %02d => %03d%n", i, (10 * i));
            System.out.println("**  FIM DA TABUADA **"); 	
        } else {
            System.out.println("** NÚMERO INVÁLIDO **");
        }
		
	}
	
}
