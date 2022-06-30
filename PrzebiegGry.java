import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PrzebiegGry {

	public static void main(String[] args) throws IOException {
		System.out.println("Witaj w QuizGame!");
		int linia = 0;
		int punkty = 0;
		for (int i=0; i<Plik.dlugoscPliku();i=i+3){
		System.out.println(Plik.czytanie(linia));
		linia++;
		String poprawnaOdpowiedz = Plik.czytanie(linia);
		linia++;
		if(sprawdzenie(Uzytkownik.wyborUzytkownika(), poprawnaOdpowiedz)) {
			System.out.println("Dobra odpowiedz! " + Plik.czytanie(linia));
			punkty++;
		}else {
			System.out.println("Niestety! "+ Plik.czytanie(linia));
		}
		linia++;
	}
		System.out.println("Koniec gry!");
		System.out.println("Liczba poprawawnych odpowiedzi to: "+punkty);
	}
	public static boolean sprawdzenie(String twojaOdpowiedz, String poprawnaOdpowiedz) {
		if(twojaOdpowiedz.equalsIgnoreCase(poprawnaOdpowiedz)||(poprawnaOdpowiedz.contains(twojaOdpowiedz))) {
			return true;
		}
		else {
			return false;
		}
	}
}
