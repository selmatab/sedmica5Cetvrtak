package sedmica5Cetvrtak;

public class ZivotinjaTest {
	public static void main(String[] args) {
//		Zivotinja zivotinja1 = new Zivotinja();
//		Zivotinja zivotinja2 = new Zivotinja("pas", "pudlica", 4);
//		System.out.println(zivotinja2.toString());
//		System.out.println(zivotinja2.getnumLegs());
//		Zivotinja zivotinja3 = new Zivotinja();
//		zivotinja3.setname("kiki");
//		zivotinja3.settype("pas");
//		zivotinja3.setnumLegs(4);
//		System.out.println(zivotinja3.getname());
//		System.out.println(zivotinja3.getnumLegs());
//		System.out.println(zivotinja3.gettype());
//		zivotinja1 = new Zivotinja(zivotinja2);
//		zivotinja3.setnumLegs(88);
//		System.out.println(zivotinja3.toString());
	Shelter skloniste=new Shelter();
	skloniste.setNaziv('1');
	skloniste.dodajZivotinju("Pujdo", "pas");
	skloniste.dodajZivotinju("Cicko", "type");
	skloniste.dodajZivotinju("Molly", "ptica");
	System.out.println(skloniste.toString());
	Shelter skloniste2=new Shelter ();
	System.out.println(skloniste2.getNaziv());
	System.out.println("Broj zivotinja u svim sklonistima: "+Shelter.getUkupno());

	}
	
}
