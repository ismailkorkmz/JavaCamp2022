package arrayDemo;

public class Main {

	public static void main(String[] args) {
		String[] ogrenciler = new String[5];
		ogrenciler[0]="Engin";
		ogrenciler[1]="İsmail";
		ogrenciler[2]="Eda";
		ogrenciler[3]="Gizem";
		ogrenciler[4]="Elif";
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		for (String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
