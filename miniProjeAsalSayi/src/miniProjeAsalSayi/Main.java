package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number=2;
		Boolean asalMi=true;
		
		if (number==1) {
			asalMi=false;
			System.out.println("Sayı asal değil");
			return;//bitirir
		}
		if (number<1) {
			System.out.println("Geçersiz sayı");
			return;
		}
		
		for (int i = 2; i < number; i++) {
			if (number%i==0) {
				asalMi=false;
			}
		}
		
		if (asalMi==true) {
			System.out.println("Sayı asaldır");
		} else {
			System.out.println("Sayı asal değil");
		}
	}

}