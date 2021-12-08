
public class Hayvan {
	public String Yasadigiyer="";
	public double kilo=0, boy=0;
	
	public int publicDegisken;
	protected int protectedDegisken;
	private int privateDegisken;
	
	
	Hayvan(){
		System.out.println("Hayvan Classinin parametresiz kurucusu tetiklendi");
	}
	Hayvan(double kilo, double boy, String yer){
		this.kilo=kilo;
		this.boy= boy;
		this.Yasadigiyer=yer;
		System.out.println("Hayvan Classinin parametreli kurucusu tetiklendi..");
	}
	
	public void Hayvan() {
		System.out.println("Hayvan:Hayvan ismindeki fonksiyon tetiklendi (Kurucu degil)");
	}
	//Kurucularin donus tipi ve void tanimi olamaz.
	//Dolayisiyle bu her ne kadar class adi ile ayni isme sahip olsa da
	//normal bir fonksiyondur
	
	public void Beslenme() {
		System.out.println("Hayvan.Beslenme(): Her hayvan yasamini surdurmek icin beslenmelidir.");
	}
	
	public static void Yasadigiyer() {
		System.out.println("Hayvan.Yasadigiyer : Her hayvan madden bulunur");
	}
	
	public void Solunum() {
		System.out.println("Hayvan.Solunum: Her hayvan solunum yapar.");
	}
	
	public void CeneYapisi() {
		System.out.println("Hayvan.CeneYapisi: Her hayvan agiz yapisina sahiptir.");
	}
	
	
	public void Goster() {
		System.out.println("Kilosu:"+this.kilo+" Boyu:"+this.boy+" Yasadigi yer:"+ this.Yasadigiyer);
		protectedDegisken=5;
		privateDegisken=55;
		publicDegisken=555;
	
	}	
	
}

class Etcil extends Hayvan{
	//Ustsinifta Varolan fonksiyonlara yeni ozellikler atamak icin
	//Overriding uygulanmalidir
	
	Etcil(){
		super(11,11,"ddd");
		System.out.println("Etcil sinifinin parametresiz kurucusu tetiklendi..");
		
	}
	
	Etcil(double boy, double kilo, String yer){
		this.boy=boy;
		this.kilo=kilo;
		this.Yasadigiyer=yer;
	}
	
	@Override
	public void Beslenme() {
		System.out.println("Etcil.Beskenme(): Etciller etle beslenir.");
	}
	
	//Override bir ust classta bulunan fonksiyonlara yeni ozellik atamayi saglar
	
	@Override
	public void CeneYapisi() {
		System.out.println("Etcil.CeneYapisi: Kesici dilseri daha gelismistir.");
	}
	
	/*
	@Override
	public static void Yasadigiyer() {
		System.out.println("Hayvan.Yasadigiyer : Her hayvan madden bulunur");
	}
	//Static tanimli fonksiyonlar turetildigi class da yalnizca bir defa uretildigi icin
	//Override edilemez
	*/
	
	public static void Yasadigiyer() {
		System.out.println("Hayvan.Yasadigiyer : Her hayvan madden bulunur");
	}
	//Her ne kadar bir ust class icerisindeki static
	//tanimli fonksiyon ile ayni isme sahip olsa da 
	//Yeni bir static fonksiyon olarak degerlendirilir
	
	
	public void EtcilGoster() {
		super.Goster();
		//Super anagtar kelimesi turetilen en ust class in yerini tutar
		publicDegisken=6;
		protectedDegisken=66;
		//privateDegisken=666;
		//super.privateDegiken=666;
		//Her ne kadar ust classtan turetilmis olsa da
		//Kalitilan class(Etcil) private bir yapiya erisemez
		
	}
	
}


class Otcul extends Hayvan{
	//Ustsinifta Varolan fonksiyonlara yeni ozellikler atamak icin
	//Overriding uygulanmalidir
	
	Otcul(){
		System.out.println("Otcul sinifinin parametresiz kurucusu tetiklendi..");
	}
	
	Otcul(double boy, double kilo, String yer){
		this.boy=boy;
		this.kilo=kilo;
		this.Yasadigiyer=yer;
	}
	
	@Override
	public void Beslenme() {
		System.out.println("Otcul.Beslenme(): Otcullar otla beslenir.");
	}
	
	//Override bir ust classta bulunan fonksiyonlara yeni ozellik atamayi saglar
	
	@Override
	public void CeneYapisi() {
		System.out.println("Otcul.CeneYapisi: Ogutucu dilseri daha gelismistir.");
	}
	
	/*
	@Override
	public static void Yasadigiyer() {
		System.out.println("Hayvan.Yasadigiyer : Her hayvan madden bulunur");
	}
	//Static tanimli fonksiyonlar turetildigi class da yalnizca bir defa uretildigi icin
	//Override edilemez
	*/
	
	public double KutleHesapla() {
		return 0;
	}
	


	public void OtculGoster() {
		Goster();
		//Super anahtar kelimesi turetilen en ust class in yerini tutar
	}
	
	
}


class Kuslar extends Etcil{
	Kuslar(){
		super(22,22,"kkk");
		System.out.println("Kuslar classinin kurucusu tetiklendi...");
	}
	
	@Override
	public void CeneYapisi() {
		System.out.println("Kuslar.CeneYapisi: Gaga mevcuttur.");
	}
	
	
	
	@Override
	public void Hayvan() {
		System.out.println("super.Hayvan ismindeki fonksiyon tetiklendi (Kurucu degil)");
	}
	
	public void EtcilKusGoster() {
		super.Goster();
		//Super anahtar kelimesi turetilen en ust class in yerini tutar
	}
	
	public void Goster() {
		System.out.println("Kilosu:"+this.kilo+" Boyu:"+this.boy+" Yasadigi yer:"+ this.Yasadigiyer);
		
	}
	
	
}


//class Deneme extends Kuslar, Etcil{
	
//}
