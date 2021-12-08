
public class KalitimUygulama {

	public static void main(String[] args) {
		
		Hayvan a=new Hayvan();
		Hayvan b=new Hayvan(15, 65, "Yerde");
		b.Hayvan();
		//Bu fonksiyon kurucu degildir. 
		//Void olarak olusturulmus fonksiyondur
		//Kurucular nesne uzerinden tetiklenmez
		
		Etcil c=new Etcil();
		c.Goster();		
		c.EtcilGoster();
		System.out.println("-------------------");
		c.Goster();
		b.Goster();		
		//Her ne kadar miras alýnsa da degiskenler ortak olarak kullanilmaz. 
		// dolayýýyla her object kendi boxing yapisini icerir
		//Dolayisiyla her object icerisindeki degerler farklidir
				
		
		Otcul d=new Otcul();
		d.Goster();
		d.OtculGoster();
		d.publicDegisken=2;
		d.protectedDegisken=22;
		//Turetilen nesnelerde private yapilara erisilemez
		
		System.out.println("-------------------");
		Kuslar e=new Kuslar();
		a.Goster();
		c.EtcilGoster();
		d.OtculGoster();
		e.EtcilKusGoster();
		
		
		
		
	}

}
