package ado;

public abstract class Adokedvezmeny {

	private String ado;

	public Adokedvezmeny(String ado) {

		this.ado = ado;

	}

	public String getTipus() {
		return ado;

	}
	public abstract int getMertek();
}