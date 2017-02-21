package cz.uhk.fim.zlomky;

import javax.swing.JOptionPane;

public class TestApp {

	/**
	 * Startovaci metoda projektu
	 * @param args
	 */
	public static void main(String[] args) {
		Zlomek a = nactiZlomek();
		Zlomek b = nactiZlomek();
		
		Zlomek c = a.vynasob(b); //c bude vyrobeno v metode
		vypisZlomek(c);
		
		c = a.vydel(b); //c bude vyrobeno v metode
		vypisZlomek(c);
		
		c = a.secti(b); //c bude vyrobeno v metode
		vypisZlomek(c);

		c = a.odecti(b); //c bude vyrobeno v metode
		vypisZlomek(c);
	}

	private static void vypisZlomek(Zlomek zlomek) {
		System.out.println(zlomek.getCitatel()
				+"\n---------\n"
				+zlomek.getJmenovatel());
	}
	
	private static Zlomek nactiZlomek() {
		//nacist text od uzivatele
		String text = JOptionPane.showInputDialog("Zadej zlomek");
		//rozdelit na text s citatelem a jmenovatelem
		String[] cisla = text.split("/");
		//prevest texty na cisla
		int cit = Integer.valueOf(cisla[0]);
		int jmen = Integer.valueOf(cisla[1]);
		//vyrobit zlomek
		//vratit zlomek
		return new Zlomek(cit, jmen);
	}

}







