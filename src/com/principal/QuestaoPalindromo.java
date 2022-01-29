package com.principal;


import java.util.Scanner;

public class QuestaoPalindromo {
    public static void main(String[] args) {
        System.out.print("Digite uma palavra para ve-la ao contr�rio: ");
        Scanner sc = new Scanner(System.in);

        String palavra = sc.next();
        char[] palavraInvertida = new char[palavra.length()];
        int tamanhoPalavra = palavra.length() - 1;


        for (int i = 0; i < palavraInvertida.length; i++) {
            palavraInvertida[i] = palavra.charAt(tamanhoPalavra - i);
        }
        
      String palavraInvertidaStr = new String(palavraInvertida);
      if(palavra.toUpperCase().equals(palavraInvertidaStr.toUpperCase())) {
        System.out.printf("A palavra %s � um pal�ndromo",palavraInvertidaStr);  
      }else{
          System.out.printf("A palavra %s n�o � um pal�ndromo",palavraInvertidaStr);
      }

    }
}