package com.principal;
import java.text.NumberFormat;
import java.util.Scanner;

public class Venda {
	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor da Produto:");
        double valorProduto = scan.nextDouble();
        double valorVenda;
        
        if (valorProduto < 20.00) {
        	valorVenda = valorProduto * 1.45;
        } else {
        	valorVenda = valorProduto * 1.30;
        }
        	
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        String valorFormatado = nf.format(valorVenda);

        System.out.println("O valor total da Venda é: " + valorFormatado);
	}
}
