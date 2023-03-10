package ConversorMonedas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class ConverterMoney extends WindowConvert{
	private static final String String = null;
	String [] typesOfCoins = { "De Pesos a Dolares", "DE Pesos a Euros", "De Peso a Libras",
			"De Pesos a Yen", "De Pesos a Won Coreano", "De Dolar a Pesos", "De Euros a Pesos",
			"De Libras a Pesos", "De Yen a Pesos", "De Won Coreano a Pesos"};
	private JLabel result;
	private JTextField amountMoney;
	public double valorRecibido;
	public JComboBox listOfCoins; 
	
	public ConverterMoney() {
		
		setSize(600, 600);
		setResizable(false);
		setTitle("Convertir Monedas");
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		colocarComponentes();		
	}
	
	private void colocarComponentes() {
		panel();
		etiquetas();
		additionalButtons();
		mainBottons();
		textField();
		comboBox();
	}
	
	public void panel() {
		panel = new JPanel();
		panel.setLayout(null); // Desactivar diseño por defecto
		panel.setBackground(new Color(238,224,33));
		this.getContentPane().add(panel);
	}
	
	public void etiquetas() {
		JLabel messageWindow = new JLabel("Convertir Moneda");
		messageWindow.setOpaque(true);
		messageWindow.setBackground(new Color(255,255,255));
		messageWindow.setBounds(0, 70, 600, 80);
		messageWindow.setHorizontalAlignment(SwingConstants.CENTER);
		messageWindow.setFont(new Font("Consolas",Font.BOLD, 30));
		panel.add(messageWindow);
		
		JLabel messageList = new JLabel("Moneda a Convertir");
		messageList.setBounds(50, 220, 250, 50);
		messageList.setHorizontalAlignment(SwingConstants.CENTER);
		messageList.setFont(new Font("Consolas",Font.BOLD, 20));
		panel.add(messageList);
		
		JLabel messageAmount = new JLabel("Cantidad a Convertir");
		messageAmount.setBounds(300, 220, 250, 50);
		messageAmount.setHorizontalAlignment(SwingConstants.CENTER);
		messageAmount.setFont(new Font("Consolas",Font.BOLD, 20));
		panel.add(messageAmount);
	}
	
	public void comboBox() {
		listOfCoins = new JComboBox(typesOfCoins);
        listOfCoins.setBounds(75, 260, 200, 50); 
        listOfCoins.setBorder(null);
        listOfCoins.setFont(new Font("Consolas",Font.BOLD, 17));
        listOfCoins.setBackground(new Color(255,255,255));
        listOfCoins.setSelectedItem("Seleccione");   //Orden del item    
        panel.add(listOfCoins);
        
        // return (String) listOfCoins.getSelectedItem();
	}
	
    public void textField(){
        amountMoney = new JTextField();
        amountMoney.setBounds(320, 260, 200, 50);
        amountMoney.setBorder(null);
        amountMoney.setFont(new Font("Consolas",Font.BOLD, 17));
        panel.add(amountMoney);
    }
	
	public void mainBottons() { 
		JButton converteMoney = new JButton("Convertir");
		converteMoney.setBounds(150, 350, 300, 60);
		converteMoney.setBorder(null);
		converteMoney.setBackground(new Color(255,255,255));
		converteMoney.setFont(new Font("Consolas",Font.BOLD, 20));
		converteMoney.setFocusable(false);
		converteMoney.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(converteMoney);
		
		result = new JLabel();
		result.setOpaque(true);
		result.setBackground(new Color(255,255,255));
		result.setHorizontalAlignment(SwingConstants.CENTER);
		result.setFont(new Font("Consolas",Font.BOLD, 16));
		panel.add(result);
				
		ActionListener buttonConverteMoney = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				result.setBounds(0, 420, 600, 60);
				String input = amountMoney.getText().toString(); //Convierte el valor del input a string
				// valorRecibido = Double.parseDouble(input); //Convierte el valor a double 
				String options = listOfCoins.getSelectedItem().toString(); // Item de la lista selecionado
				Funcion monedas = new Funcion();
				boolean booleanResult;
			
				if (isDouble(input) == true) {
					valorRecibido = Double.parseDouble(input);
					result.setForeground(new Color(0,0,0));
					result.setText("Tienes " + monedas.ConvertirMonedas(valorRecibido, options));
				} else {
					if (amountMoney.getText().length() == 0) {
						result.setForeground(new Color(226,13,13));
						result.setText("Ingrese un valora para convertir");
					} else {
						result.setForeground(new Color(226,13,13));
						result.setText("El valor ingresado no es valido");
					}
				} 
				
				
			}
		};
		converteMoney.addActionListener(buttonConverteMoney);
	}
	
	public boolean isDouble (String numero) {
		 try{
		     Integer.parseInt(numero);
		     return true;
		 }catch(NumberFormatException e){
		     return false;
		}
	}
}
