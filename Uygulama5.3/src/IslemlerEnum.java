
public enum IslemlerEnum {
 Topla, Cikar, Carp, Bolme;
	
	int a=555;
	
	public double Hesapla(double a, double b) {
		double sonuc=0;
		switch (this) {
		case Topla:
			sonuc=a+b;
			break;
		case Cikar:
			sonuc=a-b;
			break;
		case Carp:
			sonuc=a*b;
			break;
		case Bolme:
			sonuc=a/b;
			break;
		default:
			System.out.println("Gecerli bir islem secilmedi");
			break;
		}
		
		return sonuc;
	}
	
	public double GetA() {
		return a;
	}
}
