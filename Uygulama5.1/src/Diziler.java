import java.util.Arrays;
import java.util.Iterator;

public class Diziler {

	public static void main(String[] args) {
		
		int[] dizi1=new int[10];
		int[] dizi2= {5,10,8, 0, 12, 51};
		int[] dizi3;
		
		dizi3=new int[5];
		
		//dizinin eleman sayisi
		System.out.println( dizi2.length);
		
		for (int i = 0; i < dizi2.length; i++) {
			System.out.println((i+1)+".dizi elemaný:"+dizi2[i] );
		}
		
		for (int deger : dizi2) {
			System.out.println(deger);
		}
		System.out.println("---------------");
		
		System.out.println(Arrays.binarySearch(dizi2, 10));
		
		
		System.arraycopy(dizi2, 0, dizi3, 2, 5);
		//arraycopy(kopyalanacakdizi, hangiindistenbaslayacak, 
		// kopyalanacakDizi, kopyalanacakdizininKacinciElemanindanBaslanacak, KacElemanKopyalanacak)
		
		
		Arrays.sort(dizi2);
		//Dizinin tamaminda siralama yapar
		
		Arrays.sort(dizi2, 2,5);
		//Dizinin belirli bir bolumunu sort etme
		//2. ve 5. indis arasi
		
		Arrays.fill(dizi3, 100);
		//Dizi elemanlarýna varsayilan deger atar (100 atar)
		
		Arrays.fill(dizi3, 2,4, 200);
		//2 ile 4. elemanlari arasina varsayilan deger atamasi yapar
		
		Arrays.equals(dizi1, dizi2);
		//Dizilerin ayni olup olup olmadigini kontrol eder (boolean)
		if (Arrays.equals(dizi1, dizi2)) {
			System.out.println("Ýki dizi ayni");
		}
		else
			System.out.println("Dizi iceriklerinden enaz biri farkli");
		
		int[][] a=new int[5][10];
		//5x10 luk bir matris tanimlar
		int[][] a1= {{5,6,3}, {12,56,8}};
		//{} arasindaki elemanlar 1 satira gelir
		a1[1][2]=55;
		//a1 matrisine 1.satir 2.sutunu hucresine 55 degeri atar
		
		int[][][] b=new int[5][10][2];
		//5x10 luk bir matris tanimlar
		int[][][] b1= {{{5,6,3}, {12,56,8}}, {{15,16,13}, {112,156,18}}};
		//{} arasindaki elemanlar 1 satira gelir
		b1[1][2][0]=155;
		//b1 tensorune 1.satir 2.sutunu 0.uzay hucresine 155 degeri atar
		
		
		
		
		
		
		
		
	}

}
