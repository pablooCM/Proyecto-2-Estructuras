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


public class SJmap extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SJmap frame = new SJmap();
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
	public SJmap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600,600,600,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Coro = new JButton("");
		Coro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CoroMap obj= new CoroMap();
				obj.setVisible(true);
				
			}
		});
		Coro.setOpaque(false);
		Coro.setBorder(null);
		Coro.setBackground(Color.BLUE);
		Coro.setBounds(252, 69, 57, 93);
		contentPane.add(Coro);
		
		JButton Morav = new JButton("");
		Morav.setOpaque(false);
		Morav.setBorder(null);
		Morav.setBackground(Color.BLUE);
		Morav.setBounds(229, 125, 22, 52);
		contentPane.add(Morav);
		
		JButton Tib = new JButton("");
		Tib.setOpaque(false);
		Tib.setBorder(null);
		Tib.setBackground(Color.BLUE);
		Tib.setBounds(203, 180, 22, 16);
		contentPane.add(Tib);
		
		JButton Goic = new JButton("");
		Goic.setOpaque(false);
		Goic.setBorder(null);
		Goic.setBackground(Color.BLUE);
		Goic.setBounds(252, 159, 57, 16);
		contentPane.add(Goic);
		
		JButton MdO = new JButton("");
		MdO.setOpaque(false);
		MdO.setBorder(null);
		MdO.setBackground(Color.BLUE);
		MdO.setBounds(239, 177, 31, 16);
		contentPane.add(MdO);
		
		JButton Curri = new JButton("");
		Curri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CurriMap obj= new CurriMap();
				obj.setVisible(true);
			}
		});
		Curri.setOpaque(false);
		Curri.setBorder(null);
		Curri.setBackground(Color.BLUE);
		Curri.setBounds(239, 188, 22, 23);
		contentPane.add(Curri);
		
		JButton SJ = new JButton("");
		SJ.setOpaque(false);
		SJ.setBorder(null);
		SJ.setBackground(Color.BLUE);
		SJ.setBounds(186, 195, 48, 16);
		contentPane.add(SJ);
		
		JButton Esc = new JButton("");
		Esc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EscazuMap obj= new EscazuMap();
				obj.setVisible(true);
			}
		});
		Esc.setOpaque(false);
		Esc.setBorder(null);
		Esc.setBackground(Color.BLUE);
		Esc.setBounds(186, 210, 22, 28);
		contentPane.add(Esc);
		
		JButton Alaju = new JButton("");
		Alaju.setOpaque(false);
		Alaju.setBorder(null);
		Alaju.setBackground(Color.BLUE);
		Alaju.setBounds(203, 213, 22, 25);
		contentPane.add(Alaju);
		
		JButton SA = new JButton("");
		SA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaAnaMap obj= new StaAnaMap();
				obj.setVisible(true);
			}
		});
		SA.setOpaque(false);
		SA.setBorder(null);
		SA.setBackground(Color.BLUE);
		SA.setBounds(149, 210, 39, 26);
		contentPane.add(SA);
		
		JButton Mora = new JButton("");
		Mora.setOpaque(false);
		Mora.setBorder(null);
		Mora.setBackground(Color.BLUE);
		Mora.setBounds(99, 236, 89, 34);
		contentPane.add(Mora);
		
		JButton Turru = new JButton("");
		Turru.setOpaque(false);
		Turru.setBorder(null);
		Turru.setBackground(Color.BLUE);
		Turru.setBounds(0, 264, 71, 175);
		contentPane.add(Turru);
		
		JButton Puris = new JButton("");
		Puris.setOpaque(false);
		Puris.setBorder(null);
		Puris.setBackground(Color.BLUE);
		Puris.setBounds(74, 264, 57, 158);
		contentPane.add(Puris);
		
		JButton Acos = new JButton("");
		Acos.setOpaque(false);
		Acos.setBorder(null);
		Acos.setBackground(Color.BLUE);
		Acos.setBounds(149, 281, 63, 91);
		contentPane.add(Acos);
		
		JButton Aser = new JButton("");
		Aser.setOpaque(false);
		Aser.setBorder(null);
		Aser.setBackground(Color.BLUE);
		Aser.setBounds(213, 242, 22, 120);
		contentPane.add(Aser);
		
		JButton Desamp = new JButton("");
		Desamp.setOpaque(false);
		Desamp.setBorder(null);
		Desamp.setBackground(Color.BLUE);
		Desamp.setBounds(231, 213, 98, 67);
		contentPane.add(Desamp);
		
		JButton LC = new JButton("");
		LC.setOpaque(false);
		LC.setBorder(null);
		LC.setBackground(Color.BLUE);
		LC.setBounds(241, 291, 41, 44);
		contentPane.add(LC);
		
		JButton Tarra = new JButton("");
		Tarra.setOpaque(false);
		Tarra.setBorder(null);
		Tarra.setBackground(Color.BLUE);
		Tarra.setBounds(242, 333, 71, 75);
		contentPane.add(Tarra);
		
		JButton dota = new JButton("");
		dota.setOpaque(false);
		dota.setBorder(null);
		dota.setBackground(Color.BLUE);
		dota.setBounds(313, 291, 89, 81);
		contentPane.add(dota);
		
		JButton PZ = new JButton("");
		PZ.setOpaque(false);
		PZ.setBorder(null);
		PZ.setBackground(Color.BLUE);
		PZ.setBounds(412, 302, 172, 211);
		contentPane.add(PZ);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pablo\\workspace\\Proyecto2\\src\\Imagenes\\provincias\\costaricasanjose.jpg"));
		lblNewLabel.setBounds(0, 0, 584, 572);
		contentPane.add(lblNewLabel);
	}

}
