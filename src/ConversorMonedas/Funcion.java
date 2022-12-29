package ConversorMonedas;

import javax.swing.JOptionPane;

public class Funcion {
	public String resultadoFinal;
	ConversorMonedas monedas = new ConversorMonedas();

	public String ConvertirMonedas(double ValorRecibido, String opcion) {
		/*
		String opcion = (JOptionPane.showInputDialog(null, "Seleccione la moneda a la que desea converir su dinero",
				"Monedas", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"De CO a US", "DE CO a EU"}, "Seleccion" 
				)).toString();
		
		*/ 
 		switch (opcion) {
		case "De Pesos a Dolares": {
			return resultadoFinal = monedas.convertirPesosColombianosAEuro(ValorRecibido) + " US";
		}
		case "DE Pesos a Euros": {
			return resultadoFinal = monedas.convertirPesosColombianosAEuro(ValorRecibido) + " EUR";
		}
		case "De Peso a Libras": {
			return resultadoFinal = monedas.convertirPesosColombianosADolar(ValorRecibido) + " GBP";
		}
		case "De Pesos a Yen": {
			return resultadoFinal = monedas.convertirPesosColombianosAYen(ValorRecibido) + " JPY";
		}
		case "De Pesos a Won Coreano": {
			return resultadoFinal = monedas.convertirPesosColombianosAWonCoreano(ValorRecibido) + " KRW";
		}
		case "De Dolar a Pesos": {
			return resultadoFinal = monedas.convertirDolarAPesoColombiano(ValorRecibido) + " COP";
		}
		case "De Euros a Pesos": {
			return resultadoFinal = monedas.convertirEurosAPesosColombianos(ValorRecibido) + " COP";
		}
		case "De Libras a Pesos": { 
			return resultadoFinal = monedas.convertirLibrasAPesosColombianos(ValorRecibido) + " COP";
		}
		case "De Yen a Pesos": {
			return resultadoFinal = monedas.convertirYenAPesosColombianos(ValorRecibido) + " COP";
		}
		case "De Won Coreano a Pesos": {
			return resultadoFinal = monedas.convertirWoncoreanoAPesoColombiano(ValorRecibido) + " COP";
		}
		}
		return resultadoFinal;
	}
}
