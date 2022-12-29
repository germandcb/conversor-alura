package ConversorMonedas;

import javax.swing.*;

public class ConversorMonedas {
	

	public double convertirPesosColombianosADolar(double valorRecibido) {
		double monedaDolar = valorRecibido / 4773.49;
		return monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
	}
	
	
	public double convertirPesosColombianosAEuro(double valorRecibido) {
		double monedaEuro = valorRecibido / 5123.45;
		return monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
	}
	
	public double convertirPesosColombianosALibras(double valorRecibido) {
		double monedaLibra = valorRecibido / 5790.49;
		return monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
	}
	
	public double convertirPesosColombianosAYen(double valorRecibido) {
		double monedaYen = valorRecibido / 36.12;
		return monedaYen = (double) Math.round(monedaYen * 100d) / 100;
	}
	
	public double convertirPesosColombianosAWonCoreano(double valorRecibido) {
		double monedaWon = valorRecibido / 3.80;
		return monedaWon = (double) Math.round(monedaWon * 100d) / 100;
	}
	
	public double convertirDolarAPesoColombiano (double valorRecibido) {
		double monedaPeso = valorRecibido / 0.00021;
		return monedaPeso = (double) Math.round(monedaPeso * 100d) / 100;
	}
	
	public double convertirEurosAPesosColombianos (double valorRecibido) {
		double monedaPeso = valorRecibido / 0.00020;
		return monedaPeso = (double) Math.round(monedaPeso * 100d) / 100;
	} 
	
	public double convertirLibrasAPesosColombianos (double valorRecibido) {
		double monedaPeso = valorRecibido / 0.00017;
		return monedaPeso = (double) Math.round(monedaPeso * 100d) / 100;
	}
	
	public double convertirYenAPesosColombianos (double valorRecibido) {
		double monedaPeso = valorRecibido / 0.028;
		return monedaPeso = (double) Math.round(monedaPeso * 100d) / 100;
	}
	
	public double convertirWoncoreanoAPesoColombiano (double valorRecibido) {
		double monedaPeso = valorRecibido / 0.27;
		return monedaPeso = (double) Math.round(monedaPeso * 100d) / 100;
	}
} 
