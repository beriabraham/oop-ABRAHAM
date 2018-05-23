package ado;

public abstract class Adokedvezmeny {

	private String type;

	public Adokedvezmeny(String type) {
		
		this.type = type;
	}

public String getType() {
	return type;
	
}


	public abstract int getMertek();

}
