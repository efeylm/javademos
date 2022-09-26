package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
		String yeniMesaj = sehirVer(); //void bir methodu declare edemezsin
		System.out.println(yeniMesaj);
		int sayi= topla(5,7);
		System.out.println(sayi);
		
	}

	public static void ekle() { // void methodlar bir eylem gerçekleştirir
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void guncelle() {
		System.out.println("Güncellendi");
	}

	public static int topla(int sayi1, int sayi2) { // void olmayan methodlar bir değer "dönmelidir" return cümlesi
													// eklemezseniz hata verir.
		int toplam = sayi1 + sayi2;
		return toplam;
	}

	public static String sehirVer() {
		return "Ankara";
	}

}
