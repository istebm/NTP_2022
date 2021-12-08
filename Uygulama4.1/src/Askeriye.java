
public abstract class Askeriye {
	private double deger=0;

	//Getter fonksiyonu
	public double getDeger() {
		return this.deger;
	}
	
	//Setter fonksiyonu
	public void setDeger(double deger) {
		this.deger=deger;
	}
	
	public void Deneme() {
		System.out.println("Deneme fonksiyonu tetiklendi");
	}
	
	public abstract void Yetki() ;
	//Normal classtan farkli olarak abstract tanimli fonksiyon olmalýdýr
	//Abstract fonksiyon: erisim tipi+abstract+fonksiyonTipi+FonksiyonAdi+parametreler
	
	
	//finalize:Deconstructer
	//final: Degismeyen fonksiyon tanýmlamalari icin kullanilir
	//Final tanimli fonksiyonlar override edilemez.
	public final void EnUstKomuta(String durum) {
		if (durum=="Savas") {
			System.out.println("Orduyu Cumhurbaskaný idare eder.");
		}
		else {
			System.out.println("Orduyu Genel Kurmay Baskani idare eder.");
		}
	}
}


class Generaller extends Askeriye{
	@Override
	public void Yetki() {
		System.out.println("Askeriyede En ust yetki organidir.");
		
	}	
	
	@Override
	public void Deneme() {
		System.out.println("Deneme fonksiyonu override edildi");
	}
	
	public void YeniEklenenFonk() {
		
	}
	/*
	//Final fonksiyonlar override edilemez
	@Override
	public final void EnUstKomuta(String durum) {
		
	}
	*/
	
}

class UzmanCavus extends Askeriye{
	@Override
	public void Yetki() {
		System.out.println("Askerlerin sevk ve idaresi....");
	}

}


abstract class Subaylar extends Askeriye{
	@Override
	public void Yetki() {
		System.out.println("Birliklerin sevk ve idaresi....");
	}
	
	public abstract void Deneme();
	
}


