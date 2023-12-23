package KapsülPro;

public class Ogrenci {

	private String ad ;
	private String soyad;
	private int okulNo;
	private int dYili;
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		if(ad.isEmpty()) {
			System.out.println("Lütfen Öğrenci Adını Giriniz: ");
		}
		else {
			this.ad = ad;
		}
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		if(soyad.isEmpty()) {
			System.out.println("Lütfen Öğrenci Soyadını Giriniz: ");
		}
		else {
			this.soyad = soyad;
		}
		
	}
	public int getOkulNo() {
		return okulNo;
	}
	public void setOkulNo(int okulNo) {
		if(okulNo > 1000) {
			this.okulNo = okulNo;
		
		}
		else {
			System.out.println("Okul Numarısını 1000 Üzeri Giriniz. ");
		}
	}
	public int getdYili() {
		return dYili;
	}
	public void setdYili(int dYili) {
		if(dYili > 1900 && dYili < 2020) {
			this.dYili = dYili;
		}
		else {
			System.out.println("Geçerli Bir Doğum Tarihi Giriniz!! ");
		}
	}
	
	
	
	
}
