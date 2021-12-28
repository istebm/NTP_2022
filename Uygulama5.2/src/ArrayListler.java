import java.util.ArrayList;
import java.util.Collections;

public class ArrayListler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<>();
		a.add("deneme1"); a.add("deneme2"); a.add(2,"denemeX");
		//<> ifadeler generic tur olarak gecer
		ArrayList<Integer> b=new ArrayList<Integer>();
		ArrayList<Integer> c=new ArrayList<>(5);
		
		for (int i = 0; i < 5; i++) {
			b.add(i);	
			//sona deger ekleme
		}
		
		b.add(1,555);
		//Araya deger ekleme (1.indise)
		
		b.indexOf(3);
		//3 degerinin ilk olarak kacinci indiste oldugunu getirir
		b.lastIndexOf(5);
		//5 degerinin en son kacinci indiste oldugunu getirir
		
		
		System.out.println("Var mi:"+b.contains(1453));
		//1453 degeri arraylistte mevcut mu (boolean)
		
		if(b.contains(44))
			System.out.println("Liste icerisinde 44 degeri mevcut");
		
		
		
		
		System.out.println(b);
		System.out.println("--------------");
		b.remove(0);
		//belirli bir indisteki (0) degeri silme
		b.remove("555");
		//Integer bir deger string olarak silinemez
		System.out.println(b);
		
		System.out.println("------------------");
		a.remove(0);
		a.remove("deneme2");
		System.out.println(a);
		
		Collections.sort(b);
		//A->Z siralama
		
		Collections.sort(b, Collections.reverseOrder());
		//Z->A siralama
		
		
		for (int i = 0; i < b.size(); i++) {
			//b[indis] seklinde kullanimi mevcut degildir
			b.get(i);
			//arraylist degeri alma
		}
		
		b.get(5);
		
		for (Integer deger : b) {
			System.out.println(deger);
		}
		
		//b[indis]=yenideger;
		b.set(0, 56);
		//b arraylistinin 0.indiini 56 yapar
		
		b.clear();
		
	}
	
	

}
