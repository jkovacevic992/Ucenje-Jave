package practice;

import java.util.Scanner;

public class MailMaker {
	public static void main(String[] args) {

		String[] imePrezime = imePrezime();

		String mailAdresa = mail(imePrezime[0], imePrezime[1]);

		ispis(mailAdresa);

	}

	static String[] imePrezime() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite ime:");
		String unosIme = sc.next();
		System.out.println("Unesite prezime:");
		String unosPrezime = sc.next();
		String[] imePrezime = { unosIme, unosPrezime };

		sc.close();
		return imePrezime;

	}

	static void ispis(String adresa) {
		System.out.println(adresa);
	}

	static String mail(String ime, String prezime) {

		String imeLower = ime.toLowerCase().replace("�", "�").replace("�", "c").replace("�", "s").replace("�", "z")
				.replace("�", "d");
		String prezimeLower = prezime.toLowerCase().replace("�", "�").replace("�", "c").replace("�", "s")
				.replace("�", "z").replace("�", "d");

		String mail = "Va�a nova mail adresa je: " + imeLower.substring(0, 1) + prezimeLower + "@tvrtka.com";

		return mail;
	}

}
