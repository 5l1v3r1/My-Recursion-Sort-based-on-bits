package DS;

public class Sort {
		
	public void Our_sort(Integer[] array, int p, int q, int digit) {
		int thisp=p;
		int thisq=q;
		
		while (p<=q){
			if (getBit(array[p], digit) == 1 && getBit(array[q], digit) == 0) {
				int tempVar = array[p];
				array[p] = array[q];
				array[q] = tempVar;
			} else if (getBit(array[p], digit) == 0 && getBit(array[q], digit) == 0) {
				p++;
			} else if (getBit(array[p], digit) == 1 && getBit(array[q], digit) == 1) {
				q--;
			} else if (getBit(array[p], digit) == 0 && getBit(array[q], digit) == 1) {
				q--; 
				p++;
			}			
		}
		
		if(digit > 1 && (p != thisp || q!=thisq))
		{
			int temp = digit;
			Our_sort(array,thisp,q,temp-1);
			Our_sort(array,p,thisq,digit-1);
		}
			
	}

	public int getBit(int n, int digit) {		
	    return (n >> digit-1) & 1;
	}
	


}
	
