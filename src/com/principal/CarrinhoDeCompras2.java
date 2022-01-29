package com.principal;
import java.util.Scanner;

public class CarrinhoDeCompras2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        String[] carrinho = new String[5];
        double[][] detalhe = new double[5][2];
        
        System.out.println("CARRINHO DE COMPRA - FRUTAS - 5 ÍTENS");
        
        carregaCarrinho(sc, carrinho, detalhe);
        
        finalizaCompra(carrinho, detalhe);
        
        sc.close();
	}
	
	static void carregaCarrinho (Scanner sc, String[] carrinho, double[][] detalhe) {
		int i = 0;
        while(i<5) {
        	System.out.println("Digite o nome da Fruta: ");
        	carrinho[i] = sc.next();
        	System.out.println("Digite a quantidade comprada: ");
        	detalhe[i][0] = sc.nextDouble();
        	System.out.println("Digite o valor unitário: ");
        	detalhe[i][1] = sc.nextDouble();
        	i++;
        }		

	}
	
	static void finalizaCompra (String[] carrinho, double[][] detalhe) {
		int j=0;
		double valorTotal = 0;
		double qtdItens = 0;
		System.out.println();
		System.out.println("**************************");
		System.out.println("DETALHAMENTO DA SUA COMPRA\n");
		for(String item : carrinho) {
        	j++;
        	System.out.printf("Fruta %d: %s%n",j,item);
        	System.out.printf("Qtd: %.02f %n",detalhe[j-1][0]);
        	qtdItens = qtdItens + detalhe[j-1][0];
        	System.out.printf("Valor Unitário: %.02f %n",detalhe[j-1][1]);
        	valorTotal = valorTotal + (detalhe[j-1][1] * detalhe[j-1][0]);
        	System.out.println();
        }
		
		System.out.println();
		System.out.println("**********************************************");
		System.out.printf("QUANTIDADE TOTAL DE ÍTENS COMPRADOS==> %.02f%n", qtdItens);
		System.out.printf("VALOR TOTAL DA COMPRA ===============> %.02f%n", valorTotal);
		System.out.println("**********************************************");
	}
 }
