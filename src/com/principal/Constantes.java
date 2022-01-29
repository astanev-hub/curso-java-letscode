package com.principal;

public class Constantes {
	
	public static final float FATOR_CONVERSAO_KG_LB = 2.20462f;
	
	public static void main(String[] args) {
		
		System.out.printf("100kg são %.3f lb", (FATOR_CONVERSAO_KG_LB * 100));
		
	}
}
