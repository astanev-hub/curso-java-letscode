package com.principal;
import java.util.Scanner;

public class Modulo {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int numero =  scanner.nextInt();

	        if(numero % 2==0){
	            System.out.println("N�mero par");
	        }else{
	            System.out.println("N�mero impar");
	        }
	    }
}
