import java.util.*;

public class BenchmarkingSortingAlgorithm {
    //Array with size of 1.000: Selection Sort time:0.006 seconds.  Array Sort time:0.002 seconds.
    //Array with size of 10.000: Selection Sort time:0.061 seconds. Array Sort time:0.005 seconds.
    //Array with size of 100.000: Selection Sort time:5.313 seconds. Array Sort time:0.072 seconds.
    int Size = 100000; 
    int[] Array1 = new int[Size]; 
    int[] Array2 = new int[Size];
    public BenchmarkingSortingAlgorithm() { 
        for (int i = 0; i < Array1.length; i++) {
            Array1[i] = (int)(Integer.MAX_VALUE * Math.random());
            Array2[i] = Array1[i];
        }

        long startTime1 = System.currentTimeMillis();
        selectionSort(Array1); 
        long runTime1 = System.currentTimeMillis() - startTime1; 

        long startTime2 = System.currentTimeMillis();
        Arrays.sort(Array2);
        long runTime2 = System.currentTimeMillis() - startTime2; 

        System.out.println("Selection Sort time:" + runTime1/1000.0 + " seconds"); 
        System.out.println("Array Sort time:" + runTime2/1000.0 + " seconds"); 
    }

    static void selectionSort(int[] A) {
        for (int lastPlace = A.length-1; lastPlace > 0; lastPlace--) {
            int maxLoc = 0;
            for (int j = 1; j <= lastPlace; j++) {
                if (A[j] > A[maxLoc]) {
                    maxLoc = j;
                }
            }
            int temp = A[maxLoc]; 
            A[maxLoc] = A[lastPlace];A[lastPlace] = temp;
        } 
    }
}
