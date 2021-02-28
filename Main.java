import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("---- Algorytmy i Struktty Danych ----");
//		System.out.println("1 - Sortowanie");
//		System.out.println("2 - Stos");

			System.out.println("1 - Sortowanie babelkowe podejscie 1");
			System.out.println("2 - Sortowanie babelkowe podejscie 2");
			System.out.println("3 - Sortowanie babelkowe podejscie 3");

			Tablica tablica = new Tablica();
			int[] md = new int[tablica.n];
			int[] md1 = new int[tablica.n];
			//md1 = md;
			tablica.tab(md, tablica.max, tablica.min);
			for (int i = 0; i < md.length; i++) {md1[i] = md[i];}
			
			System.out.println("Przed sortowaniem");
			System.out.print("Nie posortowana tablica md:     ");
			tablica.wyswietlanie(md);
			System.out.print("Nie posortowana tablica md1:    ");
			tablica.wyswietlanie(md1);

			int option;
			do {
				option = scanner.nextInt();
				switch (option) {
					case 1:				
						BubbleSort_wer1 babelki_1 = new BubbleSort_wer1();
						md1 = babelki_1.sortBubble(md1, tablica.n);	
						
						System.out.println("Po sortowaniu");
						System.out.print("Posortowana tablica md1:        ");
						tablica.wyswietlanie(md1);
						System.out.print("Nie posortowana tablica md:     ");
						tablica.wyswietlanie(md);
						
						break;
					case 2:
						// tu BubbleSort_wer2
						break;
					case 3:
						// tu BubbleSort_wer2
						break;
				}
			} while(option != 0);			
			System.out.println("koniec programu");

	}

}
