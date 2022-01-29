package com.principal;
import java.util.Scanner;

public class Estado {
	
	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a sigla do seu Estado:");
        String sigla = scan.nextLine().toUpperCase();
        String tratativa;
        
        if (sigla.equals("RJ")) {
        	tratativa = "Carioca";
        } else if (sigla.equals("SP")) {
        	tratativa = "Paulista";
        } else if (sigla.equals("MG")) {
        	tratativa = "Mineiro";
        } else if (sigla.equals("PE")) {
        	tratativa = "Pernambucano";
        } else if (sigla.equals("RN")) {
        	tratativa = "Potiguar";
        } else {
        	tratativa = "habitante de outra localidade";
        }

        System.out.println("Seja bem-vindo " + tratativa + "!");
 		
	}
	
}
