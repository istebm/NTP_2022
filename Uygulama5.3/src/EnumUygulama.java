
public class EnumUygulama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(IslemlerEnum.Carp.Hesapla(5, 12));
		//Nesne turetmeksizin yapisal olarak Hesaplama fonksiyonu 
		//ve diger fonksiyonlarin kullanilmasini saglar
		
		System.out.println(IslemlerEnum.Carp.GetA());
		
		//IslemlerEnum.GetA();
		//Static fonksiyon icin gecerli
		
		
		System.out.println(ParametreliEnum.Gokhan.urlGoster());
		System.out.println(ParametreliEnum.ISTE.urlGoster());
	}

}
