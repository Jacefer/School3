/* Jacob Nielsen
 * 5/2/2024
 */
package sorting;

public class SortingUtility {


    public static <T extends Comparable<T>> void gnomeSort(T[] data) {

        // TODO implement Gnome Sort here
    	
    	int i = 0;
	    while(i < data.length){
	        if (i == 0 || (int)data[i] >= (int)data[i-1]) {
	            i = i + 1;
	        }
	        else {
	            data[i] = data[i-1];
	            i = i - 1;
	        }
	    }
    }


    public static <T extends Comparable<T>> void cocktailShakerSort(T[] data) {
    	
        // TODO implement Cocktail Shaker Sort here
    	
    	boolean swapped = true;
    	int start = 0;
    	int end = data.length;
    	while(swapped == true) { 
    		swapped=false;
            for (int i = start;i < end-1;i++) { //each i in 0 to length(A) − 1 do:
                if ((int)data[i] > (int)data[i + 1]) { //then test whether the two elements are in the wrong order
                    swap(data, i , i + 1); // let the two elements change places
                    swapped = true;
                }
            }
            if (swapped==false) {
            	break;
            }
    	}
        	end--;
            swapped = false;
            for (int i = end-1; i >= start;i--) {
                if ((int)data[i] > (int)data[i + 1]){
                    swap(data, i, i + 1);
                    swapped = true;
            	}
            }
            start++;
        }
    


    public static <T extends Comparable<T>> void shellSort(T[] data) {

        // TODO implement Shell Sort here

    	int[] gaps = {701, 301, 132, 57, 23, 10, 4, 1};
    	int n = data.length;
    	T temp;
    	
    	
    	for(int gap = 0;gap<gaps.length;gap++) {
    		for(int i=gap;i<n;i++) {
    			temp = data[i];
    			int j;
    			for (j=i; (j >=gap) && ((int)data[j-gap] > (int)temp); j-= gap) {
    				data[j] = data[j-gap];
    			}
    			data[j]=temp;
    		}
    	}
    }

    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {
        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

    }
}
