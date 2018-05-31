package practice.operators;

import javax.swing.JOptionPane;

public class BasicOperators {
	public static void main(String[] args) {
		float prviBroj = Float.parseFloat(JOptionPane.showInputDialog("Unesite prvi broj."));
		float drugiBroj = Float.parseFloat(JOptionPane.showInputDialog("Unesite drugi broj."));

		float zbroj = prviBroj + drugiBroj;
		float razlika = prviBroj - drugiBroj;
		float umnozak = prviBroj * drugiBroj;
		float kolicnik = prviBroj / drugiBroj;
		float modulus = prviBroj % drugiBroj;

		System.out.println("Zbroj " + prviBroj + " i " + drugiBroj + " je " + zbroj);
		System.out.println("Razlika " + prviBroj + " i " + drugiBroj + " je " + razlika);
		System.out.println("Umnožak " + prviBroj + " i " + drugiBroj + " je " + umnozak);
		System.out.println("Koliènik " + prviBroj + " i " + drugiBroj + " je " + kolicnik);
		System.out.println("Ako " + prviBroj + " podijelimo s " + drugiBroj + ", ostatak je " + modulus);
	}

}