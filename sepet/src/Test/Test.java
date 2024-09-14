package Test;

import java.util.Scanner;
import sepet.Sepet;

public class Test {

	public static void main(String[] args) {
		/*
		 * 
		 * Bir alışveriş sepeti uygulaması geliştirmeniz gerekiyor. Sepetinize farklı
		 * türde ürünleri ekleyebilmelisiniz. Aynı zamanda, sepetinizdeki ürünleri
		 * listeleyip toplam fiyatı gösteren bir metodunuz olmalı. Generic sınıfları ve
		 * Collections Framework'ü kullanarak bu görevi gerçekleştirecek bir alışveriş
		 * sepeti sınıfı tasarlayın ve birkaç örnek ekleyerek uygulayın.
		 */

		Scanner scan = new Scanner(System.in);
		
		
		Sepet<String, Integer> sepet = new Sepet<>();
		sepet.sepetOlustur();

		System.out.println("Vektörel Market");

		while (true) {
			secim();
			System.out.print("Lütfen seçiminizi yapın: ");
			int secim1 = scan.nextInt();

			if (secim1 == 1) {
				gidaSecim();
				String[] gidaUrunleri = { "çikolata", "süt", "ekmek", "peynir", "zeytin" };
				secimVeEkle(sepet, gidaUrunleri);
			} else if (secim1 == 2) {
				temizlikSecim();
				String[] temizlikUrunleri = { "bulaşık deterjanı", "çamaşır suyu", "sıvı sabun", "tuvalet kağıdı",
						"yer temizleyici" };
				secimVeEkle(sepet, temizlikUrunleri);
			} else if (secim1 == 3) {
				elektronikSecim();
				String[] elektronikUrunleri = { "kulaklık", "akıllı saat", "telefon", "televizyon", "laptop" };
				secimVeEkle(sepet, elektronikUrunleri);
			} else if (secim1 == 4) {
				// Sepet görüntüle
				sepet.sepetGoruntule();
//                System.out.print("Fiş yazdır:?(e-h) ");
//                scan.nextLine(); //
				// String fis = scan.nextLine();
				// dosyaya yazmayı öğrendikten sonra güncelle
//                if (fis.equalsIgnoreCase("e")) {
//                    System.out.println("Fişiniz yazdırıldı.");
//                } else {
//                    System.out.println("Fiş yazdırılmadı.");
//                }
			} else if (secim1 == 5) {
				// Çıkış
				System.out.println("Çıkış yapılıyor...");
				break;
			} else {
				System.out.println("Hatalı seçim");
			}
		}
	}

	public static void secim() {
		System.out.println("1-Gıda\n2-Temizlik\n3-Elektronik\n4-Sepet Görüntüle\n5-Çıkış");
	}

	public static void elektronikSecim() {
		System.out.println("1-Kulaklık\n2-Akıllı Saat\n3-Telefon\n4-Televizyon\n5-Laptop");
	}

	public static void gidaSecim() {
		System.out.println("1-Çikolata\n2-Süt\n3-Ekmek\n4-Peynir\n5-Zeytin");
	}

	public static void temizlikSecim() {
		System.out.println("1-Bulaşık Deterjanı\n2-Çamaşır Suyu\n3-Sıvı Sabun\n4-Tuvalet Kağıdı\n5-Yer Temizleyici");
	}

	public static void secimVeEkle(Sepet<String, Integer> sepet, String[] urunler) {
		Scanner scan = new Scanner(System.in);
		int secim1, adet;

		System.out.print("Lütfen seçiminizi yapın: ");
		secim1 = scan.nextInt();
		System.out.print("Lütfen adet giriniz: ");
		adet = scan.nextInt();

		if (secim1 > 0 && secim1 <= urunler.length) {
			sepet.sepeteEkle(urunler[secim1 - 1], adet);
		} else {
			System.out.println("Hatalı seçim");
		}
	}
}
