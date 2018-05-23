package ado;

public class CsaladiAdokedvezmeny extends Adokedvezmeny {

	private int gyerekek;
	private int egyrekedvezmeny;

	static int[] havi = { 10000, 17500, 33000 };

	public CsaladiAdokedvezmeny(int gyerekszam) {
		super("Csaladiadokedvezmeny");
		if (gyerekszam == 1) {
			this.egyrekedvezmeny = havi[0];
		} else if (gyerekszam == 2) {
			this.egyrekedvezmeny = havi[1];
		} else if (gyerekszam >= 3) {
			this.egyrekedvezmeny = havi[3];
		}
	}

	public int getAdoMertek() {
		return gyerekek * egyrekedvezmeny;
	}

	public int getGyerekszam() {
		return gyerekek;
	}

	public int getKedvezmeny() {
		return egyrekedvezmeny;
	}

	public String toString() {
		return "CsaladiAdokedvezmeny{" + "gyerekszam=" + gyerekek + ", kedvezmeny=" + egyrekedvezmeny
				+ ", adokedvezmeny=" + getAdoMertek();
	}

	public boolean osszehasonlito(CsaladiAdokedvezmeny other) {
		return this.getAdoMertek() > other.getAdoMertek();
	}

	@Override
	public int getMertek() {
		// TODO Auto-generated method stub
		return 0;
	}
}
