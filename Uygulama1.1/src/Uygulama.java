
public class Uygulama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hesapla1(50, 70, 90);
		System.out.println("Aradaki mesafe:"+Hesapla(50, 70, 90));
		System.out.println("Aradaki mesafe:"+Hesapla(50, 70, 90, false));
		System.out.println("Aradaki mesafe:"+Hesapla(50, 70, 90, 2,3));
		System.out.println("Aradaki mesafe:"+CosTeoremHesapla(5, 6, 30));
	
	}
	
	public static void Hesapla1(double hiz1, double hiz2, double sure) {
		System.out.println("Aradaki mesafe:"+ Math.abs((hiz1-hiz2)*(sure/60)));
	}
	
	public static double Hesapla(double hiz1, double hiz2, double sure) {
		return Math.abs((hiz1-hiz2)*(sure/60));	
	}
	public static double Hesapla(double hiz1, double hiz2, double sure, boolean yon) {
		//yon ayni true, farkli ise false
		if (yon==true) {
			return Math.abs((hiz1-hiz2)*(sure/60));	
		} else {
			return Math.abs((hiz1+hiz2)*(sure/60));	
		}	
		
	}
	
	public static double Hesapla(double hiz1, double hiz2, double sure, int aracyon1, int aracyon2) {
		//yon: 1 kuzey, 2, guney, 3 dogu, 4 bati
		if (aracyon1==aracyon2) {
			return Math.abs((hiz1-hiz2)*(sure/60));
		} else if((aracyon1==1 && aracyon2==2) || (aracyon1==3 && aracyon2==4)  || (aracyon2==1 && aracyon1==2) || (aracyon2==3 && aracyon1==4) ) {
			return Math.abs((hiz1+hiz2)*(sure/60));
		}
		else {
			return (Math.sqrt( Math.pow(hiz1*(sure/60), 2)+Math.pow(hiz2*(sure/60), 2))	);
		}
		
	}
	public static double CosTeoremHesapla(double a ,double b, double aci)
	{
		double sonuc=0;
		sonuc= Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)-(2*a*b)*((Math.cos(Math.toRadians(aci)))));
		return sonuc;
	}
	
	public static double fonksiyonhesapla(double x)
	{
		double sonuc=25*x*x+(Math.pow(x, 3)*(3/2))-(8*x)+15;
		return sonuc;
		
	}
	

}
