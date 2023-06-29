package com.jovemprogramador.cursojavatarde.lista04;

public class Contador {
	
	private static int contador = 0;
	
	Contador(){
		
	}
	
	public static void zerarContador(){
		contador = 0;
		System.out.println("O contador foi zerado");
	}
	public static void aumentarContagem() {
		contador++;
	}
	public static int getContador() {
		return contador;
	}
}
