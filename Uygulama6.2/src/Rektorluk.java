import java.util.ArrayList;
//NESTED CLASS: IC ICE SINIFLAR
//Kullanilma sebepleri:
//Okunabilirligi artirmak
//Encapsulation saglamak
//Polimorfizm yonlendirmesi yapmak
//Iliskili siniflarin tek yerden kontrolunu saglamak

public class Rektorluk {
	public int x=11;
	public class Fakulteler{
		public int x=44;		
		public ArrayList<String> fakulteler=new ArrayList<String>();
		
		public void FakulteEkle(String yeni) {
			fakulteler.add(yeni);
		}
		
		public void FakulteSil(String yeni) {
			fakulteler.remove(yeni);
		}
		
		public void Goster() {
			for (String deger : fakulteler) {
				System.out.println(deger);
			}
		}
		
		public void xGoster(int x) {
			System.out.println("this (Fakulte) x:"+this.x);
			System.out.println("Parametre x:"+x);
			System.out.println("Rektorluk.Fakulteden x:"+Rektorluk.this.x);
		}
		
		class Deneme1{
			class Deneme2{
				
			}
		}
		
	}
	
	
	public class DaireBaskanliklari{
		public int x=55;		
		public ArrayList<String> daireler=new ArrayList<String>();
		
		public void BaskanlikEkle(String yeni) {
			daireler.add(yeni);
		}
		
		public void BaskanlikSil(String yeni) {
			daireler.remove(yeni);
		}
		
		public void Goster() {
			for (String deger : daireler) {
				System.out.println(deger);
			}
		}
		
		public void xGoster(int x) {
			System.out.println("this(Baskanlik) x:"+this.x);
			System.out.println("Parametre x:"+x);
			System.out.println("Rektorluk.Baskanliktan x:"+Rektorluk.this.x);
		}
		
		class Deneme1{
			class Deneme2{
				
			}
		}
		
	}
	
	
	public static class RektorlukBirimi{
		public String rektor;
		public int x=333;
		RektorlukBirimi(){
			this.rektor="Prof. Dr. Tolga Depçi";
		}
		public RektorlukBirimi(String rektor) {
			// TODO Auto-generated constructor stub
			this.rektor=rektor;
		}
		
		public String getRektor() {
			return rektor;
		}
		
		public void xGoster(int x) {
			System.out.println("this(Baskanlik) x:"+this.x);
			System.out.println("Parametre x:"+x);
			//System.out.println("Rektorluk.Baskanliktan x:"+Rektorluk.this.x);
			//Ust classtan bir nesne olusturulmadan kalitilabildigi icin erisemez
		}
		
	}
	
	
	
	
}
