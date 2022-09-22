package arraysDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ogrenci1="Engin";
		String ogrenci2="Efe";
		String ogrenci3="Okan";
		String ogrenci4="Kerem";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4); //yorucu ve gereksiz
		
		System.out.println("-----------------------------------");
		
		String[] ogrenciler= new String[4];
		ogrenciler[0]="Efe";
		ogrenciler[1]="Engin";
		ogrenciler[2]="Ege";
		ogrenciler[3]="Özlem";
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		for (String ogrenci : ogrenciler) {//csharptaki foreach döngüsü javada bu şekilde kullanılır 
			System.out.println(ogrenci);
		}

	}

}
