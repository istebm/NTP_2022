//LOCAL CLASS: YEREL SINIFLAR
//Fonksiyon icerisinde uretilip fonksiyon islemnleri bittiginde RAM'den temizlenmesi icin
public class YerelSiniflar {
  static String regularIfade="[^0-9]";
  
  public static void TelefonDogrula(String tlfno) {
	  final int numaraUzunluk=10;
	  
	  int numDeger=0;
	  
	  //Local Class
	  class TelefonNumarasi{
		  String temizlenenNumara=null;
		  public TelefonNumarasi(String tlfno) {
			// TODO Auto-generated constructor stub
			  String temizlenenNumara= tlfno.replaceAll(regularIfade, "");
		
			  if (temizlenenNumara.length()==numaraUzunluk) {
				this.temizlenenNumara=temizlenenNumara;
			}
			  else {
				  this.temizlenenNumara=null;
			  }
		  }
		  
		  //Getter 
		  public String getTlfNo() {
			  return temizlenenNumara;
		  }
		  
		  public void numaraGoster() {
			  System.out.println("Telefon Numarasi:"+ temizlenenNumara);
		  }
	  }
	  
	  
	  TelefonNumarasi numaram=new TelefonNumarasi(tlfno);
	  numaram.numaraGoster();
	  
	  	if(numaram.getTlfNo()==null) {
	  		System.out.println("Hatalý veya eksik numara giriþi yaptýnýz. Lütfen düzeltiniz.");
	  	}
	  	else {
	  		System.out.println("Duzeltilen Numara:"+ numaram.getTlfNo());
	  	}
	  
	  
	  
  }
  
}
