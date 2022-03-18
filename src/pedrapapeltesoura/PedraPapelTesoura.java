package pedrapapeltesoura;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PedraPapelTesoura extends JFrame {
	
	int n;
	int j;		
	int j2;
	String Pj, Pj2;


	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PedraPapelTesoura frame = new PedraPapelTesoura();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PedraPapelTesoura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		
		JLabel lblContador = new JLabel("0");
		lblContador.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContador.setBounds(129, 39, 46, 14);
		contentPane.add(lblContador);
		
		JLabel lblContador2 = new JLabel("0");
		lblContador2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContador2.setBounds(461, 39, 46, 14);
		contentPane.add(lblContador2);
		
		
		JLabel lblNewLabel = new JLabel("Jogador");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(88, 64, 134, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblnwe = new JLabel("CPU");
		lblnwe.setForeground(Color.RED);
		lblnwe.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblnwe.setBounds(447, 64, 80, 40);
		contentPane.add(lblnwe);
		
		JPanel versus = new JPanel();
		versus.setBounds(31, 115, 551, 214);
		contentPane.add(versus);
		versus.setLayout(null);
		
		JLabel lblOpção = new JLabel("tesoura");
		lblOpção.setForeground(Color.BLUE);
		lblOpção.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblOpção.setBounds(59, 32, 143, 44);
		versus.add(lblOpção);
		
		JLabel lblOpção2 = new JLabel("tesoura");
		lblOpção2.setForeground(Color.RED);
		lblOpção2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblOpção2.setBounds(398, 20, 143, 69);
		versus.add(lblOpção2);
		
		JLabel lblResultado = new JLabel("teste");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblResultado.setBounds(244, 124, 110, 53);
		versus.add(lblResultado);
		versus.setVisible(false);
		
		
		JButton btnPedra = new JButton("Pedra");
		btnPedra.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPedra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				versus.setVisible(true);
				lblOpção.setText("Pedra");
				n = (int) (1 + Math.random() * (3));
				if (n==1) {
					lblOpção2.setText("Pedra");
				}
				if (n==2) {
					lblOpção2.setText("Papél");
				}
				if (n==3) {
					lblOpção2.setText("Tesoura");
				}
				
				if (n==2) {
					lblResultado.setText("Perdeu");
					j2++;
					Pj2 = Integer.toString(j2);
					lblContador2.setText(Pj2);	
				}
				if (n==3) {
					lblResultado.setText("Ganhou");
					j++;
					Pj = Integer.toString(j);
					lblContador.setText(Pj);
					
				}
				if (n==1) {
					lblResultado.setText("Empate");
					
				}
				
			}
		});
		btnPedra.setBounds(31, 340, 125, 40);
		contentPane.add(btnPedra);
		
		JButton btnPapel = new JButton("Pap\u00E9l");
		btnPapel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPapel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				versus.setVisible(true);
				lblOpção.setText("Papél");
				n = (int) (1 + Math.random() * (3));
				if (n==1) {
					lblOpção2.setText("Pedra");
				}
				if (n==2) {
					lblOpção2.setText("Papél");
				}
				if (n==3) {
					lblOpção2.setText("Tesoura");
				}
				if (n==3) {
					lblResultado.setText("Perdeu");
					j2++;
					Pj2 = Integer.toString(j2);
					lblContador2.setText(Pj2);	
				}
				if (n==1) {
					lblResultado.setText("Ganhou");
					j++;
					Pj = Integer.toString(j);
					lblContador.setText(Pj);
					
				}
				if (n==2) {
					lblResultado.setText("Empate");
					
				}
				
			}
		});
		btnPapel.setBounds(241, 340, 125, 40);
		contentPane.add(btnPapel);
		
		JButton btnTesoura = new JButton("Tesoura");
		btnTesoura.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTesoura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				versus.setVisible(true);
				lblOpção.setText("Tesoura");
				n = (int) (1 + Math.random() * (3));
				if (n==1) {
					lblOpção2.setText("Pedra");
				}
				if (n==2) {
					lblOpção2.setText("Papél");
				}
				if (n==3) {
					lblOpção2.setText("Tesoura");
				}
				if (n==1) {
					lblResultado.setText("Perdeu");
					j2++;
					Pj2 = Integer.toString(j2);
					lblContador2.setText(Pj2);	
				}
				if (n==2) {
					lblResultado.setText("Ganhou");
					j++;
					Pj = Integer.toString(j);
					lblContador.setText(Pj);
					
				}
				if (n==3) {
					lblResultado.setText("Empate");
					
				}
				
			}
		});
		btnTesoura.setBounds(465, 340, 117, 40);
		contentPane.add(btnTesoura);
		
		JLabel lblNewLabel_1 = new JLabel("X");
		lblNewLabel_1.setBounds(285, 77, 46, 14);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		
		
	}
}
