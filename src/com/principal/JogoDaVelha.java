package com.principal;
import java.util.Scanner;

public class JogoDaVelha {
	
	public static void main(String[] args) {
	
	String[][] matrizString = {{"[ ]","[ ]","[ ]"},{"[ ]","[ ]","[ ]"},{"[ ]","[ ]","[ ]"}};
	int jogadaLinha = 0;
	int jogadaColuna = 0;
	Scanner sc = new Scanner(System.in);
	int i = 0;
	int vencedor = 0;

	System.out.println("Bem-vindos ao jogo da Velha!"); 	
	montaVelha(matrizString);

	while(i<9 && vencedor == 0) {	

		System.out.println("Jogador 1, digite a sua jogada (Linha e depois Coluna: ");
		System.out.println("Linha: ");
		jogadaLinha = sc.nextInt();
		System.out.println("Coluna: ");
		jogadaColuna = sc.nextInt();
		matrizString[jogadaLinha][jogadaColuna] = "[X]";
		montaVelha(matrizString);
		
		vencedor = testaFinal(matrizString);
		if (vencedor != 0) {
			break;
		}

		System.out.println("Jogador 2, digite a sua jogada (Linha e depois Coluna: ");
		System.out.println("Linha: ");
		jogadaLinha = sc.nextInt();
		System.out.println("Coluna: ");
		jogadaColuna = sc.nextInt();
		matrizString[jogadaLinha][jogadaColuna] = "[0]";
		montaVelha(matrizString);

		vencedor = testaFinal(matrizString);
		if (vencedor != 0) {
			break;
		}
	}
	
	if (vencedor == 0) {
		System.out.println("DEU EMPATE!!");
	} else if (vencedor == 1) {
		System.out.println("O JOGADOR 1 VENCEU!!");
	} else {
		System.out.println("O JOGADOR 2 VENCEU!!");
	}
	
	sc.close();
		
	}
	
	static void montaVelha(String[][] matriz) {
		for (int i=0; i < matriz.length; i++) {
			  for (int j=0; j < matriz[i].length; j++) {
			    System.out.printf("%s", matriz[i][j]);
			  }
			  System.out.println("\n");
		}
	}
		
	static int testaFinal(String[][] matriz) {
	
		int ret = 0;
		
		if ((matriz[0][0] == "[X]" &&
			 matriz[1][0] == "[X]" &&
			 matriz[2][0] == "[X]"   ) || 
			(matriz[0][1] == "[X]" &&
			 matriz[1][1] == "[X]" &&
			 matriz[2][1] == "[X]"   ) ||
			(matriz[0][2] == "[X]" &&
			 matriz[1][2] == "[X]" &&
			 matriz[2][2] == "[X]"   ) ||
			(matriz[0][1] == "[X]" &&
			 matriz[0][2] == "[X]" &&
			 matriz[0][3] == "[X]"   ) ||
			(matriz[1][1] == "[X]" &&
			 matriz[1][2] == "[X]" &&
			 matriz[1][3] == "[X]"   ) ||
			(matriz[2][1] == "[X]" &&
			 matriz[2][2] == "[X]" &&
			 matriz[2][3] == "[X]"   ) ||
			(matriz[0][0] == "[X]" &&
			 matriz[1][1] == "[X]" &&
			 matriz[2][2] == "[X]"   )) {
				ret = 1;
			}
					
		if ((matriz[0][0] == "[0]" &&
			 matriz[1][0] == "[0]" &&
			 matriz[2][0] == "[0]"   ) || 
			(matriz[0][1] == "[0]" &&
			 matriz[1][1] == "[0]" &&
			 matriz[2][1] == "[0]"   ) ||
			(matriz[0][2] == "[0]" &&
			 matriz[1][2] == "[0]" &&
			 matriz[2][2] == "[0]"   ) ||
			(matriz[0][0] == "[0]" &&
			 matriz[0][1] == "[0]" &&
			 matriz[0][2] == "[0]"   ) ||
			(matriz[1][0] == "[0]" &&
			 matriz[1][1] == "[0]" &&
			 matriz[1][2] == "[0]"   ) ||
			(matriz[2][0] == "[0]" &&
			 matriz[2][1] == "[0]" &&
			 matriz[2][2] == "[0]"   ) ||
			(matriz[0][0] == "[0]" &&
			 matriz[1][1] == "[0]" &&
			 matriz[2][2] == "[0]"   )) {
				ret = 2;
			}		
		
		return ret;
				
	}
	
}
