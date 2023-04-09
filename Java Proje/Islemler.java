import java.util.Scanner;

public class Islemler extends Methods {
	
	private ElitUye[] elitUye = new ElitUye[5];
	private GenelUye[] genelUye = new GenelUye[5];
	private int sayacElit = 0;
	private int sayacGenel = 0;
	
	private String eMail, ad, soyad;
	private int sifre;
	
	Scanner input = new Scanner(System.in);
	
	public void uyeEkle(String uyeTur) {
		
		if(uyeTur.equals("ElitUye")) {
			
			if(sayacElit <= 5) {
				System.out.print("Adinizi Giriniz: ");
				ad = input.nextLine();
				System.out.print("Soyadinizi Giriniz: ");
				soyad = input.nextLine();
				System.out.print("E-Mailinizi Giriniz: ");
				eMail = input.nextLine();
				System.out.print("Sifrenizi Giriniz: ");
				sifre = input.nextInt();
				input.nextLine();	
				
				ElitUye object = new ElitUye();
				
				object.setEMail(eMail);
				object.setAd(ad);
				object.setSoyad(soyad);
				object.setSifre(sifre);
				
				elitUye[sayacElit] = object;
			}
			else {
				System.out.println("....");
			}
			
			sayacElit++;
			
		}
		else {
			
			if(sayacGenel <= 5) {
				System.out.print("Adinizi Giriniz: ");
				ad = input.nextLine();
				System.out.print("Soyadinizi Giriniz: ");
				soyad = input.nextLine();
				System.out.print("E-Mailinizi Giriniz: ");
				eMail = input.nextLine();
				System.out.print("Sifrenizi Giriniz: ");
				sifre = input.nextInt();
				input.nextLine();
				
				GenelUye object = new GenelUye();
				
				object.setEMail(eMail);
				object.setAd(ad);
				object.setSoyad(soyad);
				object.setSifre(sifre);
				
				genelUye[sayacGenel] = object;
			}
			else {
				System.out.println("....");
			}
			
			sayacGenel++;
		}
		
	}
	
	public void mailGonder(String uyeTur) {
		
		String mesaj;
		
		System.out.print("E-Mail Mesajini Giriniz: ");
		mesaj = input.nextLine();
		
		if(uyeTur.equals("ElitUye")) {
			
			ElitUye object = new ElitUye();
			object.setMesaj(mesaj);
			
			for(int i = 0; i < elitUye.length; i++) {
				
				elitUye[i] = object;
				
			}
			
		}
		else if(uyeTur.equals("GenelUye")) {
			
			GenelUye object = new GenelUye();
			object.setMesaj(mesaj);
			
			for(int i = 0; i < genelUye.length; i++) {
				
				genelUye[i] = object;
				
			}
			
		}
		else {
			
			ElitUye object1 = new ElitUye();
			object1.setMesaj(mesaj);
			GenelUye object2 = new GenelUye();
			object2.setMesaj(mesaj);
			
			for(int i = 0; i < elitUye.length; i++) {
				
				elitUye[i] = object1;
				
			}
			for(int i = 0; i < genelUye.length; i++) {
				
				genelUye[i] = object2;
				
			}
				
		}
		
	}
	
}
