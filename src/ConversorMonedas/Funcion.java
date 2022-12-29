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
		case "De CO a US": {
			return resultadoFinal = monedas.ConvertirPesosColombianosAEuro(ValorRecibido) + " US";
		}
		case "DE CO a EU": {
			return resultadoFinal = monedas.ConvertirPesosColombianosAEuro(ValorRecibido) + "EU ";
		} 
		}
		return resultadoFinal;
	}
}
