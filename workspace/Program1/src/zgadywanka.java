import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class zgadywanka {
	
	public static int a = 0;			/*Gorna granica losowania */
	public static int b = 100;		/*Dolna granica losowania */
	
	public static double losujLiczbe(int a, int b){	/*Metoda losujaca liczbe */
		int liczba = 0;
		
		liczba = (int) Math.floor((a + (Math.random() * (b - a)) + 1));
		
		if(liczba > 100) {
			System.out.println("Wiesz co to zakres?");
			liczba = 100;
		}
		else if(liczba < 0) {
			System.out.println("Wiesz co to zakres?");
			liczba = 0;
		}
		return liczba;
	}
	
	public static void zgaduj(){	/*Metoda sprawdzajaca czy wybrana liczba jest rowna liczbie uzytkownika */
		
		boolean ruchPetli = true;
		String odpowiedz;
		
		while(ruchPetli) {
		
			int liczba = (int) zgadywanka.losujLiczbe(a, b);

			System.out.println("Czy twoja liczba to: " + liczba + " ?");
			Scanner odczyt = new Scanner(System.in); 
		
			odpowiedz = odczyt.nextLine();
		
			if(odpowiedz.equals("mniej")) {
				b = liczba;
			}

			else if(odpowiedz.equals("wiecej")) {
				a = liczba;
			}

			else if(odpowiedz.equals("zgadles")) {
				System.out.println("To bylo zbyt proste... ;-)");
				ruchPetli = false;
				odczyt.close();
			}
			else {
				System.out.println("Podales zla odpowiedz");
			}
		}
	}
	
	public static void main(String args[]) throws IOException{
		
		System.out.println("Komputer sprobuje zgadnac Twoja liczbe z zakresu 0-100.");
		System.out.println("Dostepne komendy to mniej, wiecej, zgadles.");
				
		zgadywanka.zgaduj();
		
		System.out.println("Program zakonczy dzialanie.");
		
	}	
}
