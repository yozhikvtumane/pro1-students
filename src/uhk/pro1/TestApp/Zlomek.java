package cz.uhk.fim.zlomky;

/**
 * Trida zlomek, obsahuje citatel a jmenovatel a implementuje zakladni operace
 * scitani, odcitani, nasobeni, deleni 
 * @author Tomas Kozel
 *
 */
public class Zlomek {
	/**
	 * Citatel zlomku
	 */
	private int citatel;
	/**
	 * Jmenovatel zlomku
	 */
	private int jmenovatel;
	
	public Zlomek() {
		citatel = 0;
		jmenovatel = 1;
	}

	public Zlomek(int citatel, int jmenovatel) {
		this.citatel = citatel;
		this.jmenovatel = jmenovatel;
	}
	
	public int getCitatel() {
		return citatel;
	}
	
	public void setCitatel(int citatel) {
		this.citatel = citatel;
	}

	public int getJmenovatel() {
		return jmenovatel;
	}

	public void setJmenovatel(int jmenovatel) {
		this.jmenovatel = jmenovatel;
	}
	
	// Zlomek c = a.vynasob(b); 
	public Zlomek vynasob(Zlomek b) {
		Zlomek vysledek = new Zlomek();  //lokalni promenna
		
		int cit = this.citatel *b.citatel;
		int jm = this.jmenovatel * b.jmenovatel;
		
		vysledek.setCitatel(cit);
		vysledek.setJmenovatel(jm);
		vysledek.zkrat();
		
		return vysledek;
	}
	
	public Zlomek vydel(Zlomek b) {
		Zlomek vysledek = new Zlomek();  //lokalni promenna
		
		int cit = this.citatel * b.jmenovatel;
		int jm = this.jmenovatel * b.citatel;
		
		vysledek.setCitatel(cit);
		vysledek.setJmenovatel(jm);
		vysledek.zkrat();
		
		return vysledek;
	}
	
	public Zlomek secti(Zlomek b) {
		Zlomek vysledek = new Zlomek();  //lokalni promenna
		
		int cit = this.citatel *b.jmenovatel + b.citatel*jmenovatel ;
		int jm = this.jmenovatel * b.jmenovatel;
		
		vysledek.setCitatel(cit);
		vysledek.setJmenovatel(jm);
		vysledek.zkrat();
		
		return vysledek;
	}
	
	public Zlomek odecti(Zlomek b) {
		Zlomek vysledek = new Zlomek();  //lokalni promenna
		
		int cit = this.citatel *b.jmenovatel - b.citatel*jmenovatel ;
		int jm = this.jmenovatel * b.jmenovatel;
		
		vysledek.setCitatel(cit);
		vysledek.setJmenovatel(jm);
		vysledek.zkrat();
		
		return vysledek;
	}
	
	public void zkrat() {
		int x,y;
		if (citatel > jmenovatel) {
			x = citatel;
			y = jmenovatel;
		} else {
			x = jmenovatel;
			y = citatel;
		}
		
		while (y!=0) {
			int zb = x % y;
			x = y;
			y = zb;
		}
		citatel /= x;
		jmenovatel /= x;
	}
	
}












