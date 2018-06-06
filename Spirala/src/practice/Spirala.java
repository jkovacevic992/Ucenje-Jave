package practice;

import javax.swing.JOptionPane;

public class Spirala {

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
			
			for(int i = zadnjiStupac; i>=prviStupac;i--) {
				spirala[zadnjiRed][i] = vrijednost++;
				
				
			}
			for(int i= zadnjiRed-1; i>=prviRed;i--) {
				spirala[i][prviStupac] = vrijednost++;
				
				
			}
			for(int i= prviStupac+1;i<=zadnjiStupac;i++) {
				spirala[prviRed][i] = vrijednost++;
				
				
			}
			for(int i= prviRed+1;i<zadnjiRed;i++) {
				spirala[i][zadnjiStupac]=vrijednost++;
				
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