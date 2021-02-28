
public class Tablica {
	int n = 10;
	int min = 0;
	int max = 9;
	int[] d = new int[n];
	
	int[] tab(int[] k, int max, int min){		
		for (int i = 0; i < k.length; i++) {
			k[i] = (int)(Math.random() * (max - min) + 1);
		} // do for	
		
		return k;
	} // do metody tab()
	
//=================================================================================
	void wyswietlanie(int[] d) {
		for (int number:d) {
			System.out.print(number + " ");
		}
		System.out.println();
	} // do wyswietlania
//=================================================================================
}
