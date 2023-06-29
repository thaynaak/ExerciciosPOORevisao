 package com.jovemprogramador.cursojavatarde.lista04;

public class ConversaoDeUnidadesDeTempoTeste {

	public static void main(String[] args) {
		double segundos = 3600;
		double minutos = ConversaoDeUnidadesDeTempo.segundoEmMinutos(segundos);
        double horas = ConversaoDeUnidadesDeTempo.minutosEmHoras(minutos);
        double dias = ConversaoDeUnidadesDeTempo.horasEmDias(horas);
        double semanas = ConversaoDeUnidadesDeTempo.diasEmSemanas(dias);
        double meses = ConversaoDeUnidadesDeTempo.diasEmMeses(dias);
        double anos = ConversaoDeUnidadesDeTempo.diasEmAnos(dias);

        System.out.println(segundos + " segundos é igual a:");
        System.out.println(minutos + " minutos");
        System.out.println(horas + " horas");
        System.out.println(dias + " dias");
        System.out.println(semanas + " semanas");
        System.out.println(meses + " meses");
        System.out.println(anos + " anos");
		

	}

}
