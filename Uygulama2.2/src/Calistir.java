import java.util.Iterator;

public class Calistir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			Uret a=new Uret(i);
		}
		System.out.println("------------");
		System.gc();
		
		System.out.println( Uret.b);
		for (int i = 10; i < 20; i++) {
			Uret a=new Uret(i);
		}
		
		System.out.println("------------");
		System.gc();
		
		
	}

}

class Uret{
	int i=0;
	//Kurucu: Constructer
	public static double b=10;
	public Uret(int i) {
		this.i=i;
		System.out.println("Uret isimli class in "+(i+1)+". nesnesi olusturuldu");
		this.b=i;
	}
	
	//Yikici : Deconstructure
	public void finalize() {
		System.out.println((i+1)+" nesne (object) silindi..."+this.b);
		
	}
}
