
public class GenericUygulama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sifreler<Integer> a=new Sifreler<Integer>();
		a.deger=5;
		a.Cagir();
		
		Sifreler<String> a1=new Sifreler<String>();
		a1.deger="5";
		a1.Cagir();
		
		SifrelerKomplex<String, Integer> a2=new SifrelerKomplex();
		a2.deger="";
		a2.algoritma=5;
		
		SifrelerKomplex<Integer, Integer> a3=new SifrelerKomplex();
		a3.deger=45;
		a3.algoritma=5;
		
		KendiTipim<Integer> a4=new KendiTipim();
		TipinTipi<KendiTipim<Integer>> a5=new TipinTipi();
		
		TipinTipininTipi<TipinTipi<KendiTipim<Integer>>> a6=new TipinTipininTipi();
		
		

	}

}
