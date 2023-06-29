package com.jovemprogramador.cursojavatarde.lista04;

public class ConversaoDeUnidadesDeTempo {

	public static double segundoEmMinutos(double segundos) {
		return segundos / 60;
	}

	public static double minutosEmHoras(double minutos) {
		return minutos / 60;
	}

	public static double horasEmDias(double horas) {
		return horas / 24;
	}

	public static double diasEmSemanas(double dias) {
		return dias / 7;
	}

	public static double diasEmMeses(double dias) {
		return dias / 30;
	}

	public static double diasEmAnos(double dias) {
		return dias / 365.25;
	}

}
