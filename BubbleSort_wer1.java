public class BubbleSort_wer1 {
long start = 0, stop = 0;

//================= sortowanie ===========================================
	int[] sortBubble(int[]tab, int n){		
		start = System.currentTimeMillis();
		for(int j = 0; j < (n-1); j++) {
			for(int i = 0; i < (n-1); i++) {
				if (tab[i] > tab[i+1]) {
					int tmp = tab[i];
					tab[i] = tab[i+1];
					tab[i+1] = tmp;
				}//do if
			} // do for z i 
		} // do for z j
		stop = System.currentTimeMillis();
		return tab;
	} // do metody sortBubble
	
}// do klasy