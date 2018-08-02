package kovacevic.ljetnizadatak;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;

public class Slika extends JFrame {

	private JPanel contentPane;

	public Slika() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 581, 656);
		contentPane = new JPanel();

		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);

		JLabel lblSlika = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblSlika, 0, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblSlika, 0, SpringLayout.WEST, contentPane);
		contentPane.add(lblSlika);
		lblSlika.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kovacevic/ljetnizadatak/penjalista.png")));
	}

}
