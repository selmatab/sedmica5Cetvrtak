package sedmica5Cetvrtak;

public class Shelter {
private Zivotinja[] zivotinje;
private int brZiv;
private char naziv;
private static int ukupno=0;



public static int getUkupno() {
	return ukupno;
}
public static void setUkupno(int ukupno) {
	Shelter.ukupno = ukupno;
}
public char getNaziv() {
	return naziv;
}
public void setNaziv(char naziv) {
	this.naziv = naziv;
}
public Shelter(){
	zivotinje=new Zivotinja[2];
	brZiv=0;
	naziv='1';
	naziv++;
	
	
}
public void dodajZivotinju(String name, String type, int numLegs){
	zivotinje[brZiv]=new Zivotinja(name, type, numLegs);
	brZiv++;
	ukupno++;
	if(brZiv==zivotinje.length)
		resizeAnimals();
}
private void resizeAnimals() {
	System.out.println("Veci niz");
	int newLength=2*zivotinje.length;
	Zivotinja[]temp=new Zivotinja[newLength];
	
	for(int i=0;i<zivotinje.length;i++)
	{
		temp[i]=zivotinje[i];
	}
	zivotinje=temp;
	
}
public void dodajZivotinju(String name,String type){
	dodajZivotinju(name, type,4);
}
public String toString(){
	String stringShelterAsString="";
	for(int i=0;i<brZiv;i++)
	{
		stringShelterAsString+=zivotinje[i].toString()+"\n Skladiste: "+this.naziv+"\n";
		
	}
	return stringShelterAsString;
}
}
