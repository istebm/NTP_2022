
public class Kurucum {
	public int a=0;
	public String ad;
	
	
	public Kurucum() {
		this.a=-1;
		this.ad="ÝSTE";
	}
	Kurucum(int a) {
		this();
		//Parametreiz kurucu tetiklendi
		this.a=a;		
	}
	Kurucum(String ad){
		this(0);
		//int parametreli kurucu tetiklendi
		this.ad="ÝSTE-BM";		
	}
	
	Kurucum(String ad, int a){
		this(ad);
		//string parametreli kurucu tetiklendi
		this.a=a;		
	}
	
	Kurucum(int a, String ad){
		this(ad, a);	
		//int, sring parametreli kurucu tetiklendi
	}
	
	public void finalize() {
		System.out.println("Yikici tetklendi...");
	}
	
	
	
}
