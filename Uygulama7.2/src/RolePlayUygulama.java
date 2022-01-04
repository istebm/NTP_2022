
public class RolePlayUygulama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Ogrenci ogr1=new Ogrenci();
		ogr1.AdSoyad="Ali Ateþ";
		ogr1.ogrNo=5;
		ogr1.egitimSeviyesiRolu=new Lisans();
		ogr1.devamDurumuRolu=new NormalOgrenci();
		System.out.println("Nota göre Geçti mi?:"+ogr1.egitimSeviyesiRolu.mezuniyet(1.99));
		ogr1.devamDurumuRolu.devamlizlik=16;
		System.out.println("Devamsýzlýða göre Geçti mi?:"+ogr1.devamDurumuRolu.Devam());
		//ogr1.devamDurumuRolu.DevamsizliktanKalma();
		//Abstract classda tanimlanan fonksiyon ve degiskenler disindaki yapilara
		//Yani turetilen yeni classda eklenen fonksiyon ve degiskenlere erisim mumkun degildir
		
		
		Ogrenci ogr2=new Ogrenci();
		ogr2.AdSoyad="Ali Deneme";
		ogr2.ogrNo=55;
		ogr2.egitimSeviyesiRolu=new YLisans();
		ogr2.devamDurumuRolu=new NormalOgrenci();
		System.out.println("Nota göre Geçti mi?:"+ogr2.egitimSeviyesiRolu.mezuniyet(3.99));
		ogr2.devamDurumuRolu.devamlizlik=5555 ;
		System.out.println("Devamsýlýða göre Geçti mi?:"+ogr2.devamDurumuRolu.Devam());
		
		//Ogr2 nesnesine egitimSeviyesine yeni rol ataniyor.
		ogr2.egitimSeviyesiRolu=new Doktora();
		//Farklý bir rol atandiginda yalnizca o role ait yapilar degisir
		System.out.println(ogr2.devamDurumuRolu.devamlizlik);
		
		
	}

}


abstract class DevamDurumu{
	public abstract boolean Devam();
	int devamlizlik;
}

class SosyalSorumluluk extends DevamDurumu{
	@Override
	public boolean Devam() {
		if(devamlizlik>15) {
			return false;
		}
		else {
			return true;
		}		
	}
	
	public void DevamsizliktanKalma() {
		if(Devam()) {
			System.out.println("Öðrenci SosyalSorumluluk classina bagli ve devamlidir.");
		}
		else {
			System.out.println("Öðrenci SosyalSorumluluk classina bagli ve devamsizliktan kaldi.");
		}
	}
}

class Tamzamanli extends DevamDurumu{
	@Override
	public boolean Devam() {
		if(devamlizlik>10) {
			return false;
		}
		else {
			return true;
		}		
	}
	
	public void DevamsizliktanKalma() {
		if(Devam()) {
			System.out.println("Öðrenci Tamzamanli classina bagli ve devamlidir.");
		}
		else {
			System.out.println("Öðrenci Tamzamanli classina bagli ve devamsizliktan kaldi.");
		}
	}
}

class NormalOgrenci extends DevamDurumu{
	@Override
	public boolean Devam() {
		if(devamlizlik>8) {
			return false;
		}
		else {
			return true;
		}		
	}
	
	public void DevamsizliktanKalma() {
		if(Devam()) {
			System.out.println("Öðrenci NormalOgrenci classina bagli ve devamlidir.");
		}
		else {
			System.out.println("Öðrenci NormalOgrenci classina bagli ve devamsizliktan kaldi.");
		}
	}
}


abstract class EgitimSeviyesi{
	public abstract boolean mezuniyet(double AKTS_ortalama);
}

class Lisans extends EgitimSeviyesi{
	@Override
	public boolean mezuniyet(double AKTS_ortalama) {
		if(AKTS_ortalama>2) {
			return true;
		}
		else {
			return false;
		}
	}
}

class YLisans extends EgitimSeviyesi{
	@Override
	public boolean mezuniyet(double AKTS_ortalama) {
		if(AKTS_ortalama>2.5) {
			return true;
		}
		else {
			return false;
		}
	}
}

class Doktora extends EgitimSeviyesi{
	@Override
	public boolean mezuniyet(double AKTS_ortalama) {
		if(AKTS_ortalama>3) {
			return true;
		}
		else {
			return false;
		}
	}
}


class Ogrenci{
	int ogrNo;
	String AdSoyad;
	//...
	
	EgitimSeviyesi egitimSeviyesiRolu;
	DevamDurumu devamDurumuRolu;
}

