package Urun;

public abstract class Urun {

	private String urun_adi;
	private String urun_kodu;
	private int urun_fiyat;

	public Urun(String urun_adi, String urun_kodu, int urun_fiyat) {
		super();
		this.urun_adi = urun_adi;
		this.urun_kodu = urun_kodu;
	}

	public int getUrun_fiyat() {
		return urun_fiyat;
	}

	public void setUrun_fiyat(int urun_fiyat) {
		this.urun_fiyat = urun_fiyat;
	}

	public String getUrun_adi() {
		return urun_adi;
	}

	public void setUrun_adi(String urun_adi) {
		this.urun_adi = urun_adi;
	}

	public String getUrun_kodu() {
		return urun_kodu;
	}

	public void setUrun_kodu(String urun_kodu) {
		this.urun_kodu = urun_kodu;
	}

}
