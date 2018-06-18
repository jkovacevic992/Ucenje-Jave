package practice;

import javax.swing.JOptionPane;

public class Spirala {

	public static void main(String args[]) {
		int jedan = Integer.parseInt(JOptionPane.showInputDialog("Unesite prvi broj:"));
		int dva = Integer.parseInt(JOptionPane.showInputDialog("Unesite drugi broj:"));
		String smjer = JOptionPane.showInputDialog("U smjeru kazaljke na satu (CW) ili obrnuto (CC)?");

		if (smjer.toLowerCase().equals("cw")) {
			spiralaCW(jedan, dva);
		}else if(smjer.toLowerCase().equals("cc")) {
			spiralaCC(jedan, dva);
		}

	}

	

	public static void spiralaCW(int jedan, int dva) {
		int[][] spirala = new int[jedan][dva];

		int vrijednost = 1;
		int prviStupac = 0;
		int prviRed = 0;
		int zadnjiStupac = dva - 1;
		int zadnjiRed = jedan - 1;
		kraj: while (vrijednost <= jedan * dva) {

			for (int i = zadnjiStupac; i >= prviStupac; i--) {
				spirala[zadnjiRed][i] = vrijednost++;
				if (vrijednost > jedan * dva) {
					break kraj;
				}

			}
			for (int i = zadnjiRed - 1; i >= prviRed; i--) {
				spirala[i][prviStupac] = vrijednost++;
				if (vrijednost > jedan * dva) {
					break kraj;
				}

			}
			for (int i = prviStupac + 1; i <= zadnjiStupac; i++) {
				spirala[prviRed][i] = vrijednost++;
				if (vrijednost > jedan * dva) {
					break kraj;
				}

			}
			for (int i = prviRed + 1; i < zadnjiRed; i++) {
				spirala[i][zadnjiStupac] = vrijednost++;
				if (vrijednost > jedan * dva) {
					break kraj;
				}

			}
			zadnjiRed--;
			zadnjiStupac--;
			prviRed++;
			prviStupac++;
		}
		for (int i = 0; i < jedan; i++) {
			for (int j = 0; j < dva; j++) {
				System.out.printf("%-5d", spirala[i][j]);
			}
			System.out.println();
		}

	}

	public static void spiralaCC(int jedan, int dva) {
		int[][] spirala = new int[jedan][dva];

		int vrijednost = 1;
		int prviStupac = 0;
		int prviRed = 0;
		int zadnjiStupac = dva - 1;
		int zadnjiRed = jedan - 1;
		kraj: while (vrijednost <= jedan * dva) {

			for (int i = zadnjiRed; i >= prviRed; i--) {
				spirala[i][zadnjiStupac] = vrijednost++;
				if (vrijednost > jedan * dva) {
					break kraj;
				}

			}
			for (int i = zadnjiStupac - 1; i >= prviStupac; i--) {
				spirala[prviRed][i] = vrijednost++;
				if (vrijednost > jedan * dva) {
					break kraj;
				}

			}
			for (int i = prviRed + 1; i <= zadnjiRed; i++) {
				spirala[i][prviStupac] = vrijednost++;
				if (vrijednost > jedan * dva) {
					break kraj;
				}

			}
			for (int i = prviStupac + 1; i < zadnjiStupac; i++) {
				spirala[zadnjiRed][i] = vrijednost++;
				if (vrijednost > jedan * dva) {
					break kraj;
				}
			}
			zadnjiRed--;
			zadnjiStupac--;
			prviRed++;
			prviStupac++;

		}

		for (int i = 0; i < jedan; i++) {
			for (int j = 0; j < dva; j++) {
				System.out.printf("%-5d", spirala[i][j]);
			}
			System.out.println();
		}
	}
}