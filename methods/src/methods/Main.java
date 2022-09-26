package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca(2);
	}

	public static void sayiBulmaca(int aranacakSayi) {
		int sayilar[] = new int[] { 1, 2, 5, 7, 9, 0 };
		//int aranacakSayi = 5;
		boolean varMi = false;

		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] == aranacakSayi) {
				varMi = true;
			}
		}
		String mesaj="";
		if (varMi == true) {
			mesaj="Sayı mevcuttur:"+ aranacakSayi;
			System.out.println(mesaj);
		} else {
			System.out.println("Sayı mevcut değildir:"+ aranacakSayi);
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
