package com.jovemprogramador.cursojavatarde.lista04;

public class ContadorTeste {
	public static void main(String[] args) {
		Contador cont = new Contador();
		System.out.println ("O valor inicial do contador é:" + Contador.getContador());
		
		Contador.aumentarContagem();
		System.out.println ("O valor atual do contador é:" + Contador.getContador());
		Contador.aumentarContagem();
		Contador.aumentarContagem();
		System.out.println ("O valor atual do contador é:" + Contador.getContador());
		Contador.zerarContador();
		System.out.println ("O valor atual do contador é:" + Contador.getContador());
		Contador.aumentarContagem();
		System.out.println ("O valor atual do contador é:" + Contador.getContador());
		Contador.aumentarContagem();
		System.out.println ("O valor atual do contador é:" + Contador.getContador());
	}
}
