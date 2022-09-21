package dizilerleçalışmak;

public class Diziler {

	public static void main(String[] args) {
	   String ogrenci1 = "ahmet" ;
	   String ogrenci2 = "engin" ;
	   String ogrenci3 = "selin" ;
	   String ogrenci4 = "salih" ;
	
	   System.out.println(ogrenci1);
	   System.out.println(ogrenci2);
	   System.out.println(ogrenci3);
	   System.out.println(ogrenci4);
	
	System.out.println("-------------------------");
	
	String[] ogrenciler= new String[4] ;
	  ogrenciler[0]= "ahmet";
      ogrenciler[1]= "engin";
	  ogrenciler[2]= "selin";
	  ogrenciler[3]= "salih";
	
	 for(int i=0;i<ogrenciler.length;i++) {
		 System.out.println(ogrenciler [i]);
	 }
	
	System.out.println("----------------");
	 //üstteki ile aynı kullanımdadırlar
	 
	 for(String ogrenci:ogrenciler) {
	  System.out.println(ogrenci);
	}
	
	
	
	}

}
