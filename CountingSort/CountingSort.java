package CountingSort;

public class CountingSort {

    private CountingSort(){}

    public static int[] sort(int[] A, int maxIntegerInArray){

        int[] B = new int[A.length];
        int[] C = new int[maxIntegerInArray+1];

        for(int j = 0; j < A.length; j++){
            C[A[j]]++;
        }

        for(int i = 1; i < maxIntegerInArray+1; i++){
            C[i] = C[i] + C[i-1];
        }

        for(int i = 0; i < maxIntegerInArray+1; i++){
            C[i] = C[i] - 1;
        }

        for(int j = A.length - 1; j >= 0; j--){
            B[C[A[j]]] = A[j];
            C[A[j]] = C[A[j]] - 1;
        }

        return B;
    }



}

