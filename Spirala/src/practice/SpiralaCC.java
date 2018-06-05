package practice;

import javax.swing.JOptionPane;

public class SpiralaCC {

	public static void main(String args[]) {

		int jedan = Integer.parseInt(JOptionPane.showInputDialog("Unesite prvi broj:"));
		int dva = Integer.parseInt(JOptionPane.showInputDialog("Unesite drugi broj:"));

		int[][] spirala = new int[jedan][dva];
		
		int vrijednost = 1;
		int prviStupac = 0;
		int prviRed = 0;
		int zadnjiStupac = dva-1;
		int zadnjiRed = jedan-1;
		
		while(vrijednost <= jedan*dva) {
			
			for(int i = zadnjiRed; i>=prviRed;i--) {
				spirala[i][zadnjiStupac] = vrijednost;
				vrijednost++;
				
			}
			for(int i= zadnjiStupac-1; i>=prviStupac;i--) {
				spirala[prviRed][i] = vrijednost;
				vrijednost++;
				
			}
			for(int i= prviRed+1;i<=zadnjiRed;i++) {
				spirala[i][prviStupac] = vrijednost;
				vrijednost++;
				
			}
			for(int i= prviStupac+1;i<zadnjiStupac;i++) {
				spirala[zadnjiRed][i]=vrijednost;
				vrijednost++;
			}
			zadnjiRed--;
			zadnjiStupac--;
			prviRed++;
			prviStupac++;
			
		}
		
		for(int i=0;i<jedan;i++) {
			for(int j=0;j<dva;j++) {
				System.out.printf("%-5d", spirala[i][j]);
			}
			System.out.println();
		}

	}
}