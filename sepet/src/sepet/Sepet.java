package sepet;

import java.util.HashMap;
import java.util.Map;

public class Sepet {

	// ad,adet
	Map<String, Integer> sepet;

	public void sepetOlustur() {
		this.sepet = new HashMap<String, Integer>();
	}

	public void sepeteEkle(String key, int value) {
		// sepette var mı ?
		if (sepet.containsKey(key)) {
			int mevcutMiktar = sepet.get(key);
			sepet.put(key, mevcutMiktar + value);
		} else {
			sepet.put(key, value);
		}

	}

	public void sepettenCikart(String key) {
		if (sepet.containsKey(key)) {
			sepet.remove(key);
		} else {
			System.out.println("ürün bulunamadı");
		}
	}

	public void sepetGoruntule() {
		if (sepet.isEmpty()) {
			System.out.println("Sepetiniz boş!");
		} else {
			System.out.println("Sepetinizdeki ürünler:");
			int toplamTutar = 0;

			for (Map.Entry<String, Integer> entry : sepet.entrySet()) {
				String urunAdi = entry.getKey();
				int urunAdedi = entry.getValue();

				int birimFiyat = getBirimFiyat(urunAdi);
				int urunToplamFiyati = birimFiyat * urunAdedi;

				System.out.println(urunAdi + " - " + urunAdedi + " adet, Birim Fiyat: " + birimFiyat + " TL, Toplam: "
						+ urunToplamFiyati + " TL");

				toplamTutar += urunToplamFiyati;
			}

			System.out.println("Toplam Tutar: " + toplamTutar + " TL");
		}
	}

	private int getBirimFiyat(String urunAdi) {
		switch (urunAdi) {
		case "çikolata":
			return 10;
		case "süt":
			return 25;
		case "ekmek":
			return 10;
		case "peynir":
			return 200;
		case "zeytin":
			return 250;
		case "bulaşık deterjanı":
			return 20;
		case "çamaşır suyu":
			return 15;
		case "sıvı sabun":
			return 12;
		case "tuvalet kağıdı":
			return 45;
		case "yer temizleyici":
			return 22;
		case "kulaklık":
			return 100;
		case "akıllı saat":
			return 500;
		case "telefon":
			return 3000;
		case "televizyon":
			return 5000;
		case "laptop":
			return 7500;
		default:
			return 0;
		}
	}

}
