package stringsDemo;

public class Main {

	public static void main(String[] args) {
		
		String mesaj="Bugün hava çok güzel.";
		System.out.println(mesaj);
		/*
		System.out.println("Eleman sayısı: "+mesaj.length());
		System.out.println("5.eleman: "+mesaj.charAt(4));//4. index beşinci elemandır. 	
		System.out.println(mesaj.concat(",yaşasın!"));//stringleri birleştirirken kullanılır
		System.out.println(mesaj.startsWith("A"));//A ile başlıyor mu? bool olarak döner
		System.out.println(mesaj.endsWith("."));
		
		char[] karakterler=new char[5];
		mesaj.getChars(0, 5, karakterler, 0);//nereden başladığı,kaç karakter aldığı,hangi diziye attığı,atmaya hangi indexten başladığı
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('B'));
		System.out.println(mesaj.lastIndexOf('ü'));
		*/
		System.out.println(mesaj.replace(' ','-'));//eski karakter,yerine konacak yeni karakter
		System.out.println(mesaj.substring(2,4));//2.indexten itibaren kes,4. indekse kadar (kaça kadar olduğunu vermek zorunda değilsin.)
		
		for (String kelime : mesaj.split(" ")) {//verilen karaktere göre parçalara böler.
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		System.out.println(mesaj.trim());//varsa baştaki ve sondaki boşlukları yok eder
	}

}