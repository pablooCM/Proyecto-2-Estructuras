

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NandaMap extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NandaMap frame = new NandaMap();
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
	public NandaMap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600,600,600,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton SP = new JButton("");
		SP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		SP.setOpaque(false);
		SP.setBorder(null);
		SP.setBackground(Color.BLUE);
		SP.setBounds(331, 26, 122, 133);
		contentPane.add(SP);
		
		JButton CA = new JButton("");
		CA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		CA.setOpaque(false);
		CA.setBorder(null);
		CA.setBackground(Color.BLUE);
		CA.setBounds(249, 106, 89, 193);
		contentPane.add(CA);
		
		JButton SR = new JButton("");
		SR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		SR.setOpaque(false);
		SR.setBorder(null);
		SR.setBackground(Color.BLUE);
		SR.setBounds(179, 0, 133, 95);
		contentPane.add(SR);
		
		JButton Zap2 = new JButton("");
		Zap2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		Zap2.setOpaque(false);
		Zap2.setBorder(null);
		Zap2.setBackground(Color.BLUE);
		Zap2.setBounds(0, 256, 69, 71);
		contentPane.add(Zap2);
		
		JButton Zap = new JButton("");
		Zap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		Zap.setOpaque(false);
		Zap.setBorder(null);
		Zap.setBackground(Color.BLUE);
		Zap.setBounds(64, 106, 162, 139);
		contentPane.add(Zap);
		
		JButton BJ = new JButton("");
		BJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		BJ.setOpaque(false);
		BJ.setBorder(null);
		BJ.setBackground(Color.BLUE);
		BJ.setBounds(68, 304, 385, 224);
		contentPane.add(BJ);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pablo\\workspace\\Proyecto2\\src\\Imagenes\\Guanacaste\\Nanda.JPG"));
		lblNewLabel.setBounds(0, 0, 584, 561);
		contentPane.add(lblNewLabel);
	}

}
