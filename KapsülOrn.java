package KapsülPro;
import java.util.Scanner;

public class KapsülOrn {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Ogrenci ogrenci = new Ogrenci();
		
		System.out.print("Öğrenci Adı: ");
		String ad = scan.nextLine();
		System.out.print("Öğrenci Soyadı: ");
		String soyad = scan.nextLine();
		
		System.out.print("Öğrenci Okul No: ");
		int okulNo = scan.nextInt();
		System.out.print("Öğrenci Doğum Yılı: ");
		int dYili = scan.nextInt();
		
		
		ogrenci.setAd(ad);
		ogrenci.setSoyad(soyad);
		ogrenci.setOkulNo(okulNo);
		ogrenci.setdYili(dYili);

	}

}
