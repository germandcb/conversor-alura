package ConversorMonedas;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class WindowConvert extends JFrame{
	public JPanel panel;
	
	public WindowConvert() {
		
		setSize(600, 600);
		setResizable(false);
		setTitle("Conversor Alura");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		colocarComponentes();		
	}
	
	private void colocarComponentes() {
		panel();
		etiquetas();
		additionalButtons();
		mainBottons();
	}

	public void panel() {
		panel = new JPanel();
		panel.setLayout(null); // Desactivar diseño por defecto
		panel.setBackground(new Color(177,223,214));
		this.getContentPane().add(panel);
	}
	
	public void etiquetas() {
		JLabel messageHome = new JLabel("Conversor Alura");
		messageHome.setBounds(100, 100, 350, 80);
		messageHome.setHorizontalAlignment(SwingConstants.CENTER);
		messageHome.setFont(new Font("Consolas",Font.BOLD, 30));
		panel.add(messageHome);
	}
	
	public void additionalButtons() {
		JButton icon = new JButton();
		icon.setBounds(0,0,70,70);
		ImageIcon imgIcon = new ImageIcon("convert.png");
		icon.setIcon(new ImageIcon(imgIcon.getImage().getScaledInstance
				(icon.getWidth(), icon.getHeight(), Image.SCALE_SMOOTH)));
		icon.setBackground(null);
		icon.setBorder(null);
		panel.add(icon);
		
		JButton iconHome = new JButton();
		iconHome.setBounds(0,490,70,70);
		ImageIcon imgIconHome = new ImageIcon("home.png");
		iconHome.setIcon(new ImageIcon(imgIconHome.getImage().getScaledInstance
				(iconHome.getWidth(), iconHome.getHeight(), Image.SCALE_SMOOTH)));
		iconHome.setBackground(null);
		iconHome.setBorder(null);
		panel.add(iconHome);
		
		MouseListener mainButtonWindow = new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				WindowConvert windowHome = new WindowConvert();
				windowHome.setVisible(true);
				WindowConvert.this.dispose();
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		};
		icon.addMouseListener(mainButtonWindow);
		iconHome.addMouseListener(mainButtonWindow);
	}
	
	public void mainBottons() {
		JButton converteMoney = new JButton("Convertir Moneda");
		converteMoney.setBounds(120, 200, 320, 80);
		converteMoney.setBorder(null);
		converteMoney.setBackground(new Color(238,224,33));
		converteMoney.setFont(new Font("Consolas",Font.BOLD, 20));
		converteMoney.setFocusable(false);
		converteMoney.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(converteMoney);
		
		MouseListener buttonConverteMoney = new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				ConverterMoney windowConverterMoney = new ConverterMoney();
				windowConverterMoney.setVisible(true);
				WindowConvert.this.dispose();
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		converteMoney.addMouseListener(buttonConverteMoney);
		
		JButton converteTemperature = new JButton("Convertir Temperatura");
		converteTemperature.setBounds(120, 300, 320, 80);
		converteTemperature.setBorder(null);
		converteTemperature.setBackground(new Color(238,224,33));
		converteTemperature.setFont(new Font("Consolas",Font.BOLD, 20));
		converteTemperature.setFocusable(false);
		converteTemperature.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(converteTemperature);
	}

}
