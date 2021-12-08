
public interface BasitInterface {
	public double a=5;
	public final int b=10;
	
	//Interface icerisine abstract tanimli fonksiyon olmak durumundadir!!!
	void Goruntule();
	public int DegerGetir();
	double DegerHesapla(int a, double b);
	
	//Static olarak abstract fonksiyonu tanimlanamaz
	//public static void Deneme();
	//****
	public static void Deneme2() {
		
	}
	
	//Default tanimli fonksiyonlar kullanilabilir
	
	//Kod blogu iceren fonksiyonlar tanimlanamaz
	/*
	public void Deneme3() {
		
	}
	*/
	//Final tanimli fonksiyon olmaz
	//final double Degerler();
	

}

interface BasitInterface2{
	int k=0;
	int Durum1();
	double Durum2(int a, double b);
}


class TestInterfaceClass implements BasitInterface{
	@Override
	public int DegerGetir() {
		return 0;
	}
	@Override
	public double DegerHesapla(int a, double b) {
		return 0;
	}
	@Override
	public void Goruntule() {
		
	}
	
	public void YeniFonksiyon() {
		
	}
	
}

class TestClass{
	
}

//Birden fazla class dogrudan bir classa kalitilamaz
//class Deneme extends TestInterfaceClass, TestClass{
//}

class TestCokluClass implements BasitInterface, BasitInterface2{
	@Override
	public int DegerGetir() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double DegerHesapla(int a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void Goruntule() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int Durum1() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double Durum2(int a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}



