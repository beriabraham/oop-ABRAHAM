package haz;
import haz.Helyiseg;

public class Szoba extends Helyiseg{



	private int belmagassag;
	private int alapterulet;

	public Szoba(int belmagassag, int megnevezes, int alapterulet) {

		this.belmagassag = belmagassag;

	}

	public int legkobmeter() {
		return this.alapterulet * belmagassag;

	}

public String toString() {
	
	return "Szoba neve: " +this.megnevezes+"Terulet: " +this.getAlapterulet"Belmagassag: " +this.legkobmeter+;
}

public boolean nagyobb() {
	return false;
	
}


}


