package com.principal;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Conversao {
	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a cotação do Dólar de hoje:");
        double dolar = scan.nextDouble();
        
        System.out.println("Digite o valor desejado em Reais :");
        double real = scan.nextDouble();
        
        double conversao = (real / dolar);
		
        Locale localEstadosUnidos = new Locale("ENGLISH","US");
        NumberFormat nf = NumberFormat.getCurrencyInstance(localEstadosUnidos);
        String valorFormatado = nf.format(conversao);

        System.out.println("O valor total em Dólar é: " + valorFormatado);
 		
	}

}
