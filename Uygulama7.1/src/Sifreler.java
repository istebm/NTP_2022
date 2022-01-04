import java.lang.*;
public class Sifreler<T> {
	 public T deger;
	 //Generic tanimli deger degiskeni
	 //T tipi ne olarak tanimlanirsa o tipte elde edilir	 
	 String algoritma="";
 
	 public void Cagir() {
		 System.out.println(deger.getClass().getName());
	 }
	 
	 public void Olustur(T parametre) {
		 if(parametre.getClass().getName()=="java.lang.Integer") {
			 System.out.println("Integer ile alakalý þifreleme");
		 }
		 else if(parametre.getClass().getName()=="java.lang.String") {
			 System.out.println("String ile alakalý þifreleme");
		 }
	 }
 
}


class SifrelerKomplex<T, G> {
	 public T deger;
	 public G algoritma;
	 //Birden fazla tip tanimlama islemi

	 public void Cagir() {
		 System.out.println(deger.getClass().getName());
		 System.out.println(algoritma.getClass().getName());
	 }
	 
	 public void Olustur(T parametre) {
		 if(parametre.getClass().getName()=="java.lang.Integer") {
			 System.out.println("Integer ile alakalý þifreleme");
		 }
		 else if(parametre.getClass().getName()=="java.lang.String") {
			 System.out.println("String ile alakalý þifreleme");
		 }
	 }

}


class KendiTipim<M>{
	public M id;
	//Tip icin kullanilan isim yapilari icin standar yoktur
}

class TipinTipi<KendiTipim>{
	public KendiTipim degiskenTipi;
}

class TipinTipininTipi<TipinTipi>{
	public TipinTipi degiskenTipininTipi;
}


