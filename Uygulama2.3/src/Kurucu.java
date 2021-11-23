
 class Kurucu {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kurucum nesne=new Kurucum();
		System.out.println("ad degeri:"+nesne.ad);
		System.out.println("a degeri:"+nesne.a);
		System.out.println("--------------------");
		
		
		Kurucum nesne1=new Kurucum(5);
		System.out.println("ad degeri:"+nesne1.ad);
		System.out.println("a degeri:"+nesne1.a);
		System.out.println("--------------------");
		
		Kurucum nesne2=new Kurucum("ÝSTEEEE");
		System.out.println("ad degeri:"+nesne2.ad);
		System.out.println("a degeri:"+nesne2.a);
		System.out.println("--------------------");
		
		
		Kurucum nesne3=new Kurucum(55, "XXXX");
		System.out.println("ad degeri:"+nesne3.ad);
		System.out.println("a degeri:"+nesne3.a);
		System.out.println("--------------------");
		
		Kurucum nesne4=new Kurucum("YYYY", 1453);
		System.out.println("ad degeri:"+nesne4.ad);
		System.out.println("a degeri:"+nesne4.a);
		System.out.println("--------------------");
	}
	


}
