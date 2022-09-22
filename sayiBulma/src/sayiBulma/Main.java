package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int sayilar[]=new int[] {1,2,5,7,9,0};
		int aranacakSayi=5;
		boolean varMi=false;
		
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i]==aranacakSayi) {
				varMi=true;
			}
		}
		if (varMi==true) {
			System.out.println("Sayı mevcuttur");
		}
		else {
			System.out.println("Sayı mevcut değildir");
		}
	}

}
