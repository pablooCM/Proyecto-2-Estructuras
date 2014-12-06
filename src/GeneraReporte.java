

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GeneraReporte extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GeneraReporte frame = new GeneraReporte();
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
	public GeneraReporte() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEscojaElReporte = new JLabel("Escoja el reporte que desee crear");
		lblEscojaElReporte.setFont(new Font("Mufferaw Rg", Font.PLAIN, 16));
		lblEscojaElReporte.setBounds(62, 11, 331, 34);
		contentPane.add(lblEscojaElReporte);
		
		JButton btnProvinciasDelPas = new JButton("Provincias del pa\u00EDs");
		btnProvinciasDelPas.setBounds(24, 51, 151, 23);
		contentPane.add(btnProvinciasDelPas);
		
		JButton btnCantonesDeUna = new JButton("Cantones de una provincia");
		btnCantonesDeUna.setBounds(24, 105, 145, 23);
		contentPane.add(btnCantonesDeUna);
		
		JButton btnDistritosDeUn = new JButton("Distritos de un cant\u00F3n");
		btnDistritosDeUn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				distritosCantoon obj = new distritosCantoon();
				obj.setVisible(true);
				
			}
		});
		btnDistritosDeUn.setBounds(237, 51, 151, 23);
		contentPane.add(btnDistritosDeUn);
		
		JButton btnLugaresTursticos = new JButton("Lugares tur\u00EDsticos");
		btnLugaresTursticos.setBounds(237, 105, 151, 23);
		contentPane.add(btnLugaresTursticos);
	}

}
