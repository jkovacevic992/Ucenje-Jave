package practice;

import javax.swing.JOptionPane;

public class Switch {
	public static void main(String[] args) {
		
		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesite uspjeh na kraju �kolske godine (1-5):"));
		
		switch (i) {
		case 1:
			System.out.println("Na�alost, ocjena nedovoljan(1) nije dovoljna za prolaz.");
			break;
		case 2:
			System.out.println("�estitamo, uspje�no ste zavr�ili �kolsku godinu s ocjenom dovoljan(2).");
			break;
		case 3:
			System.out.println("�estitamo, uspje�no ste zavr�ili �kolsku godinu s ocjenom dobar(3).");
			break;
		case 4:
			System.out.println("�estitamo, uspje�no ste zavr�ili �kolsku godinu s ocjenom vrlo dobar(4).");
			break;
		case 5:
			System.out.println("�estitamo, uspje�no ste zavr�ili �kolsku godinu s ocjenom odli�an(5).");
			break;

		default:
			System.out.println("Postoje�e ocjene mogu biti od 1 do 5.");
			break;
		}
		
		
	}
}
