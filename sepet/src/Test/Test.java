package Test;

import java.util.Map;
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
		Sepet sepet = new Sepet();
		int secim = 0;
		sepet.sepetOlustur();
		System.out.println("vektörel market");

		while (true) {
			secim();
			System.out.print("lütfen seçiminizi yapın:");
            int secim1 = scan.nextInt();
            
            switch (secim1) {
                case 1:
                    gidaSecim();
                    String[] gidaUrunleri = {"çikolata", "süt", "ekmek", "peynir", "zeytin"};
                    secimVeEkle(sepet, gidaUrunleri);
                    break;
                case 2:
                    temizlikSecim();
                    String[] temizlikUrunleri = {"bulaşık deterjanı", "çamaşır suyu", "sıvı sabun", "tuvalet kağıdı", "yer temizleyici"};
                    secimVeEkle(sepet, temizlikUrunleri);
                    break;
                case 3:
                    elektronikSecim();
                    String[] elektronikUrunleri = {"kulaklık", "akıllı saat", "telefon", "televizyon", "laptop"};
                    secimVeEkle(sepet, elektronikUrunleri);
                    break;
                case 4:
                    // sepet görüntüle
                    sepet.sepetGoruntule();
                    break;
                case 5:
                    // çıkış
                    return;
                default:
                    System.out.println("hatalı seçim");
                    break;
            }
		}

	}

	public static void secim() {
		System.out.println("1-Gıda\n2-Temizlik\n3-Elektronik\n4-sepet görüntüle\n5-çıkış");
	}

	public static void elektronikSecim() {
		System.out.println("1-kulaklık\n2-akıllı saat\n3-telefon\n4-televizyon\n5-laptop");
	}

	public static void gidaSecim() {
		System.out.println("1- Çikolata\n2- Süt\n3- Ekmek\n4- Peynir\n5- Zeytin");
	}

	public static void temizlikSecim() {
		System.out
				.println("1- Bulaşık Deterjanı\n2- Çamaşır Suyu\n3- Sıvı Sabun\n4- Tuvalet Kağıdı\n5- Yer Temizleyici");
	}
	
	public static void secimVeEkle(Sepet sepet, String[] urunler) {
	    Scanner scan = new Scanner(System.in);
	    int secim1, adet;
	    
	    System.out.print("lütfen seçiminizi yapın:");
	    secim1 = scan.nextInt();
	    System.out.print("lütfen adet giriniz:");
	    adet = scan.nextInt();

	    if (secim1 > 0 && secim1 <= urunler.length) {
	        sepet.sepeteEkle(urunler[secim1 - 1], adet);
	    } else {
	        System.out.println("hatalı seçim");
	    }
	}
}
