package MergeSort;

import java.util.ArrayList;
import java.util.Arrays;

public final class MergeSort {

    private MergeSort(){}

    public static int[] sort(int[] A){
     int n = A.length;

        if(n == 1)
            return A;

        int mid = n/2;

        int[] Left = sort(Arrays.copyOfRange(A, 0, mid));

        int[] Right = sort(Arrays.copyOfRange(A, mid, n));

        return merge(Left, Right);
    }

    public static int[] merge(int[] L, int[] R){

        int i = 0;
        int j = 0;

        ArrayList<Integer> answer = new ArrayList<>();

        while((i < L.length) && (j < R.length)){
            if(L[i] < R[j]){
                answer.add(L[i]);
                i++;
            }
            else{
                answer.add(R[j]);
                j++;
            }
        }

        if(i < L.length){
            for(int k = i; k < L.length; k++){
                answer.add(L[k]);
            }
        }

        if(j < R.length){
            for(int k = j; k < R.length; k++){
                answer.add(R[k]);
            }
        }

        int[] answerArray = new int[answer.size()];

        for(int p = 0; p < answer.size(); p++){
            answerArray[p] = answer.get(p);
        }

        return answerArray;
    }
}
