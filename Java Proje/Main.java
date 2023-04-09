import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Islemler object = new Islemler();
		
		int ilkEkran, ikinciEkran;
		
		System.out.println("Hosgeldiniz");
		
		while(true) {
			
			System.out.println("\n\n1- Elit Uyeyi Sisteme Ekleme \n2- Genel Uyeyi Sisteme Ekleme \n3- Mail Gonderme \n4- Cikis");
			System.out.print("Lutfen Yapacaginiz Islemi Seciniz: ");
			anaSecim = input.nextInt();
			
			switch(ilkEkran) {
				case 1: {
					
					object.uyeEkle("ElitUye");
					
					System.out.println("\n\n Elit Uye Eklendi. ");
					break;
					
				}
				case 2: {
					
					object.uyeEkle("GenelUye");
					
					System.out.println("\n\n Genel Uye Eklendi. ");
					break;
					
				}
				case 3: {
					
					System.out.println("\n1- Elit Uyelere Mail Gonder \n2- Genel Uyelere Mail Gonder \n3- Tum Uyelere Mail Gonder");
					System.out.print("Lutfen Yapmak Istediginiz Islemi Seciniz: ");
					yanSecim = input.nextInt();
					
					switch(ikinciEkran) {
						case 1: {
							object.mailGonder("ElitUye");
							System.out.println("Mesaj Elit Uyelere Gonderildi.");
							break;
						}
						case 2: {
							object.mailGonder("GenelUye");
							System.out.println("Mesaj Genel Uyelere Gonderildi.");
							break;
						}
						case 3: {
							object.mailGonder("TumUye");
							System.out.println("Mesaj Tum Uyelere Gonderildi.");
							break;
						}
						default: {
							System.out.println("\n\n Hatali Islem. Lutfen Tekrar Deneyiniz! ");
							break;
						}
					}
					
				}
				case 4: {
					System.out.println("\n\n Cikis Yapiliyor ");
					System.exit(0);
					input.close();
					break;
				}
				default: {
					
					System.out.println("\n\n Hatali Secim. Lutfen Tekrar Deneyiniz! ");
					break;
					
				}
			}
			
		}
		
	}

}
