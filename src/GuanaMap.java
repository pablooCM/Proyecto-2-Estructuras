

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

public class GuanaMap extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuanaMap frame = new GuanaMap();
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
	public GuanaMap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600,600,600,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Guanacaste");
		
		JButton LC = new JButton("");
		LC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LaCruzMap obj= new LaCruzMap();
				obj.setVisible(true);
			}
		});
		LC.setOpaque(false);
		LC.setBorder(null);
		LC.setBackground(new Color(102, 102, 204));
		LC.setBounds(114, 11, 89, 23);
		contentPane.add(LC);
		
		JButton LC1 = new JButton("");
		LC1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LaCruzMap obj= new LaCruzMap();
				obj.setVisible(true);
			}
		});
		LC1.setOpaque(false);
		LC1.setBorder(null);
		LC1.setBackground(new Color(153, 102, 204));
		LC1.setBounds(99, 33, 154, 61);
		contentPane.add(LC1);
		
		JButton LC2 = new JButton("");
		LC2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LaCruzMap obj= new LaCruzMap();
				obj.setVisible(true);
			}
		});
		LC2.setOpaque(false);
		LC2.setBorder(null);
		LC2.setBackground(new Color(153, 102, 204));
		LC2.setBounds(10, 94, 134, 48);
		contentPane.add(LC2);
		
		JButton LB = new JButton("");
		LB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LiberiaMap obj= new LiberiaMap();
				obj.setVisible(true);
			}
		});
		LB.setOpaque(false);
		LB.setBorder(null);
		LB.setBackground(new Color(153, 102, 204));
		LB.setBounds(143, 105, 60, 182);
		contentPane.add(LB);
		
		JButton LB2 = new JButton("");
		LB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LiberiaMap obj= new LiberiaMap();
				obj.setVisible(true);
			}
		});
		LB2.setOpaque(false);
		LB2.setBorder(null);
		LB2.setBackground(new Color(153, 102, 204));
		LB2.setRequestFocusEnabled(true);
		LB2.setBounds(103, 142, 39, 79);
		contentPane.add(LB2);
		
		JButton LB3 = new JButton("");
		LB3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LiberiaMap obj= new LiberiaMap();
				obj.setVisible(true);
			}
		});
		LB3.setOpaque(false);
		LB3.setBorder(null);
		LB3.setBackground(new Color(153, 102, 204));
		LB3.setBounds(201, 142, 14, 106);
		contentPane.add(LB3);
		
		JButton LB4 = new JButton("");
		LB4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LiberiaMap obj= new LiberiaMap();
				obj.setVisible(true);
			}
		});
		LB4.setOpaque(false);
		LB4.setBorder(null);
		LB4.setBackground(new Color(153, 102, 204));
		LB4.setBounds(213, 152, 22, 42);
		contentPane.add(LB4);
		
		JButton CA = new JButton("");
		CA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarrilloMap obj= new CarrilloMap();
				obj.setVisible(true);
			}
		});
		CA.setOpaque(false);
		CA.setBorder(null);
		CA.setBackground(new Color(153, 102, 204));
		CA.setBounds(64, 225, 69, 48);
		contentPane.add(CA);
		
		JButton CA2 = new JButton("");
		CA2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarrilloMap obj= new CarrilloMap();
				obj.setVisible(true);
			}
		});
		CA2.setOpaque(false);
		CA2.setBorder(null);
		CA2.setBackground(new Color(153, 102, 204));
		CA2.setBounds(98, 273, 45, 23);
		contentPane.add(CA2);
		
		JButton CA3 = new JButton("");
		CA3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarrilloMap obj= new CarrilloMap();
				obj.setVisible(true);
			}
		});
		CA3.setOpaque(false);
		CA3.setBorder(null);
		CA3.setBackground(new Color(153, 102, 204));
		CA3.setBounds(114, 298, 97, 28);
		contentPane.add(CA3);
		
		JButton SC = new JButton("");
		SC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaCruzMap obj= new StaCruzMap();
				obj.setVisible(true);
			
			}
		});
		SC.setOpaque(false);
		SC.setBorder(null);
		SC.setBackground(new Color(153, 102, 204));
		SC.setBounds(74, 284, 25, 146);
		contentPane.add(SC);
		
		JButton SC2 = new JButton("");
		SC2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaCruzMap obj= new StaCruzMap();
				obj.setVisible(true);
			}
		});
		SC2.setOpaque(false);
		SC2.setBorder(null);
		SC2.setBackground(new Color(153, 102, 204));
		SC2.setBounds(48, 284, 25, 146);
		contentPane.add(SC2);
		
		JButton SC3 = new JButton("");
		SC3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaCruzMap obj= new StaCruzMap();
				obj.setVisible(true);
			
			}
		});
		SC3.setOpaque(false);
		SC3.setBorder(null);
		SC3.setBackground(new Color(153, 102, 204));
		SC3.setBounds(99, 298, 14, 155);
		contentPane.add(SC3);
		
		JButton SC4 = new JButton("");
		SC4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaCruzMap obj= new StaCruzMap();
				obj.setVisible(true);
			
			}
		});
		SC4.setOpaque(false);
		SC4.setBorder(null);
		SC4.setBackground(new Color(153, 102, 204));
		SC4.setBounds(114, 330, 39, 73);
		contentPane.add(SC4);
		
		JButton SC5 = new JButton("");
		SC5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaCruzMap obj= new StaCruzMap();
				obj.setVisible(true);
			
			}
		});
		SC5.setOpaque(false);
		SC5.setBorder(null);
		SC5.setBackground(new Color(153, 102, 204));
		SC5.setBounds(114, 403, 22, 42);
		contentPane.add(SC5);
		
		JButton SC6 = new JButton("");
		SC6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaCruzMap obj= new StaCruzMap();
				obj.setVisible(true);
			
			}
		});
		SC6.setOpaque(false);
		SC6.setBorder(null);
		SC6.setBackground(new Color(153, 102, 204));
		SC6.setBounds(146, 330, 22, 42);
		contentPane.add(SC6);
		
		JButton BA = new JButton("");
		BA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BagacesMap obj= new BagacesMap();
				obj.setVisible(true);
			}
		});
		BA.setOpaque(false);
		BA.setBorder(null);
		BA.setBackground(new Color(153, 102, 204));
		BA.setBounds(237, 174, 69, 47);
		contentPane.add(BA);
		
		JButton BA2 = new JButton("");
		BA2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BagacesMap obj= new BagacesMap();
				obj.setVisible(true);
			}
		});
		BA2.setOpaque(false);
		BA2.setBorder(null);
		BA2.setBackground(new Color(153, 102, 204));
		BA2.setBounds(217, 225, 76, 35);
		contentPane.add(BA2);
		
		JButton BA3 = new JButton("");
		BA3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BagacesMap obj= new BagacesMap();
				obj.setVisible(true);
			}
		});
		BA3.setOpaque(false);
		BA3.setBorder(null);
		BA3.setBackground(new Color(153, 102, 204));
		BA3.setBounds(201, 259, 89, 42);
		contentPane.add(BA3);
		
		JButton BA4 = new JButton("");
		BA4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BagacesMap obj= new BagacesMap();
				obj.setVisible(true);
			}
		});
		BA4.setOpaque(false);
		BA4.setBorder(null);
		BA4.setBackground(new Color(153, 102, 204));
		BA4.setBounds(213, 303, 60, 28);
		contentPane.add(BA4);
		
		JButton BA5 = new JButton("");
		BA5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BagacesMap obj= new BagacesMap();
				obj.setVisible(true);
			}
		});
		BA5.setOpaque(false);
		BA5.setBorder(null);
		BA5.setBackground(new Color(153, 102, 204));
		BA5.setBounds(241, 330, 25, 28);
		contentPane.add(BA5);
		
		JButton BA6 = new JButton("");
		BA6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BagacesMap obj= new BagacesMap();
				obj.setVisible(true);
			}
		});
		BA6.setOpaque(false);
		BA6.setBorder(null);
		BA6.setBackground(new Color(153, 102, 204));
		BA6.setBounds(223, 191, 14, 30);
		contentPane.add(BA6);
		
		JButton CÑ = new JButton("");
		CÑ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CañasMap obj= new CañasMap();
				obj.setVisible(true);
			}
		});
		CÑ.setOpaque(false);
		CÑ.setBorder(null);
		CÑ.setBackground(new Color(153, 102, 204));
		CÑ.setBounds(289, 220, 39, 122);
		contentPane.add(CÑ);
		
		JButton CÑ2 = new JButton("");
		CÑ2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CañasMap obj= new CañasMap();
				obj.setVisible(true);
			}
		});
		CÑ2.setOpaque(false);
		CÑ2.setBorder(null);
		CÑ2.setBackground(new Color(153, 102, 204));
		CÑ2.setBounds(307, 198, 25, 23);
		contentPane.add(CÑ2);
		
		JButton CÑ3 = new JButton("");
		CÑ3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CañasMap obj= new CañasMap();
				obj.setVisible(true);
			}
		});
		CÑ3.setOpaque(false);
		CÑ3.setBorder(null);
		CÑ3.setBackground(new Color(153, 102, 204));
		CÑ3.setBounds(275, 303, 14, 55);
		contentPane.add(CÑ3);
		
		JButton TL = new JButton("");
		TL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TilaMap obj= new TilaMap();
				obj.setVisible(true);
			}
		});
		TL.setOpaque(false);
		TL.setBorder(null);
		TL.setBackground(new Color(153, 102, 204));
		TL.setBounds(329, 252, 89, 61);
		contentPane.add(TL);
		
		JButton TL2 = new JButton("");
		TL2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TilaMap obj= new TilaMap();
				obj.setVisible(true);
				
			}
		});
		TL2.setOpaque(false);
		TL2.setBorder(null);
		TL2.setBackground(new Color(153, 102, 204));
		TL2.setBounds(329, 225, 33, 28);
		contentPane.add(TL2);
		
		JButton NC = new JButton("");
		NC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NicoyaMap obj= new NicoyaMap();
				obj.setVisible(true);
			}
		});
		NC.setOpaque(false);
		NC.setBorder(null);
		NC.setBackground(new Color(153, 102, 204));
		NC.setBounds(178, 335, 60, 95);
		contentPane.add(NC);
		
		JButton NC2 = new JButton("");
		NC2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NicoyaMap obj= new NicoyaMap();
				obj.setVisible(true);
			}
		});
		NC2.setOpaque(false);
		NC2.setBorder(null);
		NC2.setBackground(new Color(153, 102, 204));
		NC2.setBounds(156, 369, 22, 128);
		contentPane.add(NC2);
		
		JButton NC3 = new JButton("");
		NC3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NicoyaMap obj= new NicoyaMap();
				obj.setVisible(true);
			}
		});
		NC3.setOpaque(false);
		NC3.setBorder(null);
		NC3.setBackground(new Color(153, 102, 204));
		NC3.setBounds(114, 442, 39, 55);
		contentPane.add(NC3);
		
		JButton NC4 = new JButton("");
		NC4.setOpaque(false);
		NC4.setBorder(null);
		NC4.setBackground(new Color(153, 102, 204));
		NC4.setBounds(237, 353, 36, 77);
		contentPane.add(NC4);
		
		JButton HJ = new JButton("");
		HJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HojanchaMap obj= new HojanchaMap();
				obj.setVisible(true);
			}
		});
		HJ.setOpaque(false);
		HJ.setBorder(null);
		HJ.setBackground(new Color(153, 102, 204));
		HJ.setBounds(188, 435, 33, 48);
		contentPane.add(HJ);
		
		JButton AB = new JButton("");
		AB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AbangaMap obj= new AbangaMap();
				obj.setVisible(true);
			}
		});
		AB.setOpaque(false);
		AB.setBorder(null);
		AB.setBackground(new Color(153, 102, 204));
		AB.setBounds(339, 319, 54, 84);
		contentPane.add(AB);
		
		JButton AB2 = new JButton("");
		AB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AbangaMap obj= new AbangaMap();
				obj.setVisible(true);
			}
		});
		AB2.setOpaque(false);
		AB2.setBorder(null);
		AB2.setBackground(new Color(153, 102, 204));
		AB2.setBounds(276, 342, 64, 48);
		contentPane.add(AB2);
		
		JButton ND = new JButton("");
		ND.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NandaMap obj= new NandaMap();
				obj.setVisible(true);
			}
		});
		ND.setOpaque(false);
		ND.setBorder(null);
		ND.setBackground(new Color(153, 102, 204));
		ND.setBounds(229, 430, 97, 106);
		contentPane.add(ND);
		
		JButton ND2 = new JButton("");
		ND2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NandaMap obj= new NandaMap();
				obj.setVisible(true);
			}
		});
		ND2.setOpaque(false);
		ND2.setBorder(null);
		ND2.setBackground(new Color(153, 102, 204));
		ND2.setBounds(188, 483, 44, 23);
		contentPane.add(ND2);
		
		JLabel Guana = new JLabel("");
		Guana.setIcon(new ImageIcon("C:\\Users\\pablo\\workspace\\Proyecto2\\src\\Imagenes\\provincias\\guanacaste_costa_rica_map.jpeg"));
		Guana.setBounds(0, 0, 475, 556);
		contentPane.add(Guana);
	}

}
