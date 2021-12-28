
public enum ParametreliEnum {
	Google("www.google.com.tr"), Gokhan("gokhanaltan.com"), ISTE("www.iste.edu.tr");
	
	private String url;
	ParametreliEnum(String url){
		this.url=url;
	}
	
	public String urlGoster() {
		return this.url;
	}
	
	//String url;
}
