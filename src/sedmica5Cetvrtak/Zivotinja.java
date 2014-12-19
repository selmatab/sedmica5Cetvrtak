package sedmica5Cetvrtak;

public class Zivotinja {
	private String name;
	private String type;
	private int numLegs;

	public Zivotinja() {

		this.name = "nepoznato";

		this.type = "nepoznato";

		this.numLegs = 0;

	}

	public Zivotinja(String name, String type, int numLegs) {

		this.name = name;

		this.settype(type);

		this.setnumLegs(numLegs);

	}
	public Zivotinja (Zivotinja kopija){
		this.name=kopija.name;
		this.type=kopija.type;
		this.numLegs=kopija.numLegs;
	}

	public String toString() {
		String ispis = "";
		ispis = "Ime: " + name + "\nTip: " + type + "\nBr.nogu: " + numLegs;
		return ispis;
	}

	public int getnumLegs() {
		return numLegs;
	}

	public void setnumLegs(int numLegs) {
		if((this.type.equals("pas"))|| (this.type.equals("macka")) || (this.type.equals("konj"))){
			if((numLegs<0) || (numLegs>4))
				this.numLegs=4;
		}
			else if(this.type.equals("ptica")){
			if((numLegs<0) || (numLegs>2))
				this.numLegs=2;
			}
			else 
				this.numLegs=0;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name.toLowerCase();
	}

	public String gettype() {
		return type;
	}

	public void settype(String type) {
		this.type = type;
	}
}
