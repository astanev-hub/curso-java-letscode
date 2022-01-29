package com.principal;
import java.util.Arrays;
import java.util.Scanner;

public class JogoDaVelha2 {
	  public static void main(String[] args) { 
	        Scanner ler = new Scanner(System.in); 
	        System.out.println("Entre o nome do jogador 1"); 
	        String nomeJog1 = ler.nextLine(); 
	        System.out.println("Entre o nome do jogador 2"); 
	        String nomeJog2 = ler.nextLine(); 
	        int nroJogadas = 0; 
	        int[][] matrizJogo = new int[3][3]; 
	 
	        while (nroJogadas < 9) { 
	            boolean flag = false; 
	            int linha, coluna; 
	            String jogador; 
	 
	            jogador = selJogador(nroJogadas, nomeJog1, nomeJog2); 
	            imprimeMapa(matrizJogo); 
	 
	            do { 
	                System.out.println(jogador + ", entre linha da jogada [0-2]"); 
	                linha = ler.nextInt(); 
	                System.out.println(jogador + ", entre coluna da jogada [0-2]"); 
	                coluna = ler.nextInt(); 
	 
	                if ((linha > 2) || (linha < 0) || (coluna > 2) || (coluna < 0)) { 
	                    System.out.println("Coordenadas inválidas."); 
	                } else if (matrizJogo[linha][coluna] != 0) { 
	                    System.out.println("Coordenada ja utilizada."); 
	                } else { 
	                    matrizJogo[linha][coluna] = (jogador.equals(nomeJog1)) ? 1 : -1; 
	                    flag = true; 
	                } 
	            } while (!flag); 
	 
	            if (ganhou(matrizJogo)) { 
	                imprimeMapa(matrizJogo); 
	                System.out.println("Parabens " + jogador + ". Você ganhou."); 
	                break; 
	            } 
	            nroJogadas++; 
	        } 
	        if (nroJogadas == 9) { 
	            System.out.println(nomeJog1 + " e " + nomeJog2 + ". Vocês empataram."); 
	        } 
	    } 
	    static String selJogador (int jogada, String jog1, String jog2) { 
	        return ((jogada % 2) == 0) ? jog1 : jog2; 
	    } 
	    static boolean ganhou(int[][] matriz) { 
	        // Testa linha 
	        for (int i = 0; i < 3; i++) { 
	            if (((Arrays.stream(matriz[i]).sum()) == 3) || ((Arrays.stream(matriz[i]).sum()) == -3)) { 
	                return true; 
	            } 
	        } 
	        // Testa coluna 
	        for (int i = 0; i < 3; i++) { 
	            int soma = 0; 
	            for (int j = 0; j < 3; j++) { 
	                soma += matriz[j][i]; 
	            } 
	            if ((soma == 3) || (soma == -3)) { 
	                return true; 
	            } 
	        } 
	        // Testa diagonal 
	        int somaDiag1 = matriz[0][0] + matriz[1][1] + matriz[2][2]; 
	        int somaDiag2 = matriz[0][2] + matriz[1][1] + matriz[2][0]; 
	        return Math.abs(somaDiag1) == 3 || Math.abs(somaDiag2) == 3; 
	    } 
	    static void imprimeMapa(int[][] matriz) { 
	        char[][] valXO = new char[3][3]; 
	        for (int i = 0; i < 3; i++) { 
	            for (int j = 0; j < 3; j++) { 
	                switch (matriz[i][j]) { 
	                    case 1: 
	                        valXO[i][j] = 'X'; 
	                        break; 
	                    case -1: 
	                        valXO[i][j] = 'O'; 
	                        break; 
	                    default: 
	                        valXO[i][j] = ' '; 
	                        break; 
	                } 
	            } 
	        } 
	        System.out.println("\t0\t1\t2"); 
	        for (int i = 0; i < 3; i++) { 
	            System.out.printf("%s", i); 
	            for (int j = 0; j < 3; j++) { 
	                System.out.printf("\t%s",valXO[i][j]); 
	                if (j != 2) { 
	                    System.out.print(" |"); 
	                } 
	            } 
	            System.out.println(); 
	            if (i != 2) { 
	                System.out.println("   -----------"); 
	            } 
	        } 
	    } 
}
