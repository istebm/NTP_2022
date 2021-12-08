
public class AbstractUygula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UzmanCavus a=new UzmanCavus();
		Askeriye b=new Askeriye() {
			//Dogrudan nesne olusturulamadigi icin
			//Once abstract fonksiyon override edilir
			@Override
			public void Yetki() {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
