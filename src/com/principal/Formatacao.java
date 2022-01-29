package com.principal;
import java.util.Scanner;

public class Formatacao {
	public static void main(String[] args) {
		
		int numero = Integer.parseInt(args[0]);
        System.out.printf("Você informou o número %d.", numero);
		
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.println("Informe o peso da primeira pessoa em kg");
        double peso1 = sc.nextDouble();
        System.out.println("Informe o peso da segunda pessoa em kg");
        double peso2 = sc.nextDouble();

        final float FATOR_CONVERSAO_KG_LB = 2.20462f;
        System.out.printf("O peso da primeira pessoa em libras é %flb.%n", (peso1 * FATOR_CONVERSAO_KG_LB));
        System.out.printf("O peso da segunda pessoa em libras é %flb.%n", (peso2 * FATOR_CONVERSAO_KG_LB));
    }
}
