//import Rektorluk.RektorlukBirimi;


public class Uygulama_NestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rektorluk r1=new Rektorluk();
		System.out.println("Rektorluk.x="+ r1.x);
		System.out.println("----------");
	
		
		//RektorlukBirimi
		//Hatali kullanimlar
		//Rektorluk.Fakulteler n1=new Fakulteler();
		//Rektorluk.Fakulteler n1=new Rektorluk.Fakulteler();
		//Rektorluk.Fakulteler n1=new r1.Fakulteler();
		//r1.Fakulteler n1=new r1.Fakulteler();
		
		//Nested olarak tanimlanmis classlardan bir nesne turetmek icin
		//Ust classtan bir nesne uretilmis olmasi gerekir
		
		Rektorluk.Fakulteler fk=r1.new Fakulteler();
		fk.xGoster(99);
		System.out.println("-------------");
		
		Rektorluk.DaireBaskanliklari db=r1.new DaireBaskanliklari();
		db.xGoster(666);
		System.out.println("-------------");
		
		System.out.println(r1.x);
		System.out.println(fk.x);
		System.out.println(db.x);
		
		Rektorluk.RektorlukBirimi ll=new Rektorluk.RektorlukBirimi();
		//Static tanimli classlar icin ust classtan bir nesne turetilmeden de
		//Nesne olusturulabilir
		//ll.rektor
	}

}
