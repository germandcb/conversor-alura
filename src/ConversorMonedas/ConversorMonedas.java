package ConversorMonedas;

import javax.swing.*;

public class ConversorMonedas {
	

	public double ConvertirPesosColombianosADolar(double valorRecibido) {
		double monedaDolar = valorRecibido / 4801.53;
		monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
		//JOptionPane.showMessageDialog(null, "Tienes $" + monedaDolar + "Dolares");
		return monedaDolar;
	}
	
	
	public double ConvertirPesosColombianosAEuro(double valorRecibido) {
		double monedaEuro = valorRecibido / 4801.53;
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
		//JOptionPane.showMessageDialog(null, "Tienes $" + monedaEuro + "Dolares");
		return monedaEuro;
	}
} 
