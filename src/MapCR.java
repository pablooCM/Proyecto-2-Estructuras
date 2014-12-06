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
import java.awt.event.ContainerEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class MapCR extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	ImageIcon Guana = new ImageIcon("C:\\Users\\pablo\\workspace\\Proyecto2\\src\\Imagenes\\provincias\\guanacaste_costa_rica_map.jpg");
	JLabel guani = new JLabel(Guana);
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MapCR frame = new MapCR();
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
	public MapCR() {
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600,600,600,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Bienvenid@ al sistema de información geográfica de Costa Rica");
		
		JButton A1 = new JButton("");
		A1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlajMap obj= new AlajMap();
				obj.setVisible(true);
			}
		});
		A1.setBorder(null);
		A1.setOpaque(false);
		A1.setBackground(new Color(154, 205, 50));
		A1.setBounds(199, 73, 71, 121);
		contentPane.add(A1);
		
		JButton A2 = new JButton("");
		A2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlajMap obj= new AlajMap();
				obj.setVisible(true);
			}
		});
		A2.setBorder(null);
		A2.setOpaque(false);
		A2.setBackground(new Color(154, 205, 50));
		A2.setBounds(104, 45, 55, 29);
		contentPane.add(A2);
		
		JButton A3 = new JButton("");
		A3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlajMap obj= new AlajMap();
				obj.setVisible(true);
			}
		});
		A3.setBorder(null);
		A3.setOpaque(false);
		A3.setBackground(new Color(154, 205, 50));
		A3.setBounds(157, 44, 55, 53);
		contentPane.add(A3);
		
		JButton A4 = new JButton("");
		A4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlajMap obj= new AlajMap();
				obj.setVisible(true);
			}
		});
		A4.setBorder(null);
		A4.setOpaque(false);
		A4.setBackground(new Color(154, 205, 50));
		A4.setBounds(210, 45, 45, 29);
		contentPane.add(A4);
		
		JButton A5 = new JButton("");
		A5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlajMap obj= new AlajMap();
				obj.setVisible(true);
			}
		});
		A5.setBorder(null);
		A5.setOpaque(false);
		A5.setBackground(new Color(154, 205, 50));
		A5.setBounds(183, 96, 17, 61);
		contentPane.add(A5);
		
		JButton G1 = new JButton("");
		G1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GuanaMap obj= new GuanaMap();
				obj.setVisible(true);
			}
		});
		G1.setBorder(null);
		G1.setOpaque(false);
		G1.setBackground(new Color(204, 255, 51));
		G1.setBounds(51, 41, 55, 191);
		contentPane.add(G1);
		
		JButton G2 = new JButton("");
		G2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GuanaMap obj= new GuanaMap();
				obj.setVisible(true);
			}
		});
		G2.setBorder(null);
		G2.setVisible(true);
		G2.setBackground(new Color(204, 255, 51));
		G2.setOpaque(false);
		G2.setBounds(100, 84, 27, 130);
		contentPane.add(G2);
		
		JButton G3 = new JButton("");
		G3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GuanaMap obj= new GuanaMap();
				obj.setVisible(true);
			}
		});
		G3.setBackground(new Color(204, 255, 102));
		G3.setBorder(null);
		G3.setOpaque(false);
		G3.setBounds(123, 85, 45, 72);
		contentPane.add(G3);
		
		JButton G4 = new JButton("");
		G4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				guani.show();
			}
		});
		G4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GuanaMap obj= new GuanaMap();
				obj.setVisible(true);
			}
		});
		G4.setBackground(new Color(153, 102, 102));
		G4.setBorder(null);
		G4.setOpaque(false);
		G4.setAutoscrolls(true);
		G4.setBounds(167, 113, 17, 29);
		contentPane.add(G4);
		
		JButton P1 = new JButton("");
		P1.setBorder(null);
		P1.setBackground(new Color(51, 204, 255));
		P1.setOpaque(false);
		P1.setBounds(123, 191, 45, 61);
		contentPane.add(P1);
		
		JButton P2 = new JButton("");
		P2.setBorder(null);
		P2.setBackground(new Color(51, 102, 0));
		P2.setOpaque(false);
		P2.setBounds(157, 157, 43, 37);
		contentPane.add(P2);
		
		JButton P3 = new JButton("");
		P3.setBorder(null);
		P3.setBackground(new Color(51, 204, 153));
		P3.setOpaque(false);
		P3.setBounds(181, 191, 31, 72);
		contentPane.add(P3);
		
		JButton P4 = new JButton("");
		P4.setBackground(new Color(51, 153, 51));
		P4.setBorder(null);
		P4.setOpaque(false);
		P4.setBounds(233, 240, 45, 23);
		contentPane.add(P4);
		
		JButton P5 = new JButton("");
		P5.setBackground(new Color(51, 153, 51));
		P5.setBorder(null);
		P5.setOpaque(false);
		P5.setBounds(274, 262, 27, 23);
		contentPane.add(P5);
		
		JButton P6 = new JButton("");
		P6.setBackground(new Color(51, 153, 51));
		P6.setBorder(null);
		P6.setOpaque(false);
		P6.setBounds(369, 284, 89, 168);
		contentPane.add(P6);
		
		JButton P7 = new JButton("");
		P7.setBackground(new Color(51, 153, 51));
		P7.setBorder(null);
		P7.setOpaque(false);
		P7.setBounds(338, 310, 31, 93);
		contentPane.add(P7);
		
		JButton SJ1 = new JButton("");
		SJ1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SJmap obj= new SJmap();
				obj.setVisible(true);
			}
		});
		SJ1.setBackground(new Color(51, 153, 51));
		SJ1.setBorder(null);
		SJ1.setOpaque(false);
		SJ1.setBounds(290, 158, 17, 36);
		contentPane.add(SJ1);
		
		JButton SJ2 = new JButton("");
		SJ2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SJmap obj= new SJmap();
				obj.setVisible(true);
			
			}
		});
		SJ2.setBackground(new Color(51, 153, 51));
		SJ2.setBorder(null);
		SJ2.setOpaque(false);
		SJ2.setBounds(219, 195, 71, 37);
		contentPane.add(SJ2);
		
		JButton SJ3 = new JButton("");
		SJ3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SJmap obj= new SJmap();
				obj.setVisible(true);
			
			}
		});
		SJ3.setBackground(new Color(51, 153, 51));
		SJ3.setBorder(null);
		SJ3.setOpaque(false);
		SJ3.setBounds(288, 229, 27, 34);
		contentPane.add(SJ3);
		
		JButton SJ4 = new JButton("");
		SJ4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SJmap obj= new SJmap();
				obj.setVisible(true);
			
			}
		});
		SJ4.setBackground(new Color(51, 153, 51));
		SJ4.setBorder(null);
		SJ4.setOpaque(false);
		SJ4.setBounds(311, 250, 55, 49);
		contentPane.add(SJ4);
		
		JButton H1 = new JButton("");
		H1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HeredMap obj= new HeredMap();
				obj.setVisible(true);
			
			}
		});
		H1.setBackground(new Color(51, 153, 51));
		H1.setBorder(null);
		H1.setOpaque(false);
		H1.setBounds(274, 84, 41, 72);
		contentPane.add(H1);
		
		JButton H2 = new JButton("");
		H2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HeredMap obj= new HeredMap();
				obj.setVisible(true);
			
			}
		});
		H2.setBackground(new Color(51, 153, 51));
		H2.setBorder(null);
		H2.setOpaque(false);
		H2.setBounds(270, 157, 17, 37);
		contentPane.add(H2);
		
		JButton H3 = new JButton("");
		H3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HeredMap obj= new HeredMap();
				obj.setVisible(true);
			}
		});
		H3.setOpaque(false);
		H3.setBackground(new Color(51, 153, 51));
		H3.setBorder(null);
		H3.setBounds(311, 74, 17, 23);
		contentPane.add(H3);
		
		JButton L1 = new JButton("");
		L1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LimonMap obj= new LimonMap();
				obj.setVisible(true);
			}
		});
		L1.setBackground(new Color(51, 153, 51));
		L1.setBorder(null);
		L1.setOpaque(false);
		L1.setBounds(330, 74, 45, 105);
		contentPane.add(L1);
		
		JButton L2 = new JButton("");
		L2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LimonMap obj= new LimonMap();
				obj.setVisible(true);
			}
		});
		L2.setBackground(new Color(51, 153, 51));
		L2.setBorder(null);
		L2.setOpaque(false);
		L2.setBounds(311, 96, 27, 72);
		contentPane.add(L2);
		
		JButton L3 = new JButton("");
		L3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LimonMap obj= new LimonMap();
				obj.setVisible(true);
			}
		});
		L3.setBackground(new Color(51, 153, 51));
		L3.setBorder(null);
		L3.setOpaque(false);
		L3.setBounds(369, 229, 117, 49);
		contentPane.add(L3);
		
		JButton L4 = new JButton("");
		L4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LimonMap obj= new LimonMap();
				obj.setVisible(true);
			}
		});
		L4.setBackground(new Color(51, 153, 51));
		L4.setBorder(null);
		L4.setOpaque(false);
		L4.setBounds(379, 134, 41, 53);
		contentPane.add(L4);
		
		JButton L5 = new JButton("");
		L5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LimonMap obj= new LimonMap();
				obj.setVisible(true);
			}
		});
		L5.setBackground(new Color(51, 153, 51));
		L5.setBorder(null);
		L5.setOpaque(false);
		L5.setBounds(389, 191, 69, 37);
		contentPane.add(L5);
		
		JButton C1 = new JButton("");
		C1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CartaMap obj= new CartaMap();
				obj.setVisible(true);
			
			}
		});
		C1.setBackground(new Color(51, 153, 51));
		C1.setBorder(null);
		C1.setOpaque(false);
		C1.setBounds(300, 191, 71, 41);
		contentPane.add(C1);
		
		JButton C2 = new JButton("");
		C2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CartaMap obj= new CartaMap();
				obj.setVisible(true);
			
			}
		});
		C2.setBackground(new Color(51, 153, 51));
		C2.setBorder(null);
		C2.setOpaque(false);
		C2.setBounds(311, 180, 27, 14);
		contentPane.add(C2);
		
		JButton C3 = new JButton("");
		C3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CartaMap obj= new CartaMap();
				obj.setVisible(true);
			
			}
		});
		C3.setBackground(new Color(51, 153, 51));
		C3.setBorder(null);
		C3.setOpaque(false);
		C3.setBounds(369, 191, 17, 29);
		contentPane.add(C3);
		
		JButton C4 = new JButton("");
		C4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CartaMap obj= new CartaMap();
				obj.setVisible(true);
			
			}
		});
		C4.setBorder(null);
		C4.setBackground(new Color(153, 102, 153));
		C4.setOpaque(false);
		C4.setBounds(320, 229, 45, 23);
		contentPane.add(C4);
		
		JButton G5 = new JButton("");
		G5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GuanaMap obj= new GuanaMap();
				obj.setVisible(true);
				
			}
		});
		G5.setBorder(null);
		G5.setBackground(new Color(204, 153, 102));
		G5.setOpaque(false);
		G5.setBounds(51, 11, 55, 29);
		contentPane.add(G5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pablo\\workspace\\Proyecto2\\src\\Imagenes\\CR.jpg"));
		lblNewLabel.setBounds(0, 0, 500, 464);
		contentPane.add(lblNewLabel);
	}
}
