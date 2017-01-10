package MaximumSubarray;


import java.util.Arrays;

public class MaximumSubarray {

    public static int[] findMaxCrossingSubarray(int[] A, int low, int mid, int high){
        int leftSum = 0;
        int rightSum = 0;
        int sum = 0;
        int maxLeft = 0;
        int maxRight = 0;


        for(int i = mid; i > low; i--){
            sum = sum + A[i];
            if(sum > leftSum){
                leftSum = sum;
                maxLeft = i;
            }
        }

        sum = 0;

        for(int j = mid +1; j < high; j++){
            sum = sum + A[j];
            if(sum > rightSum){
                rightSum = sum;
                maxRight = j;
            }
        }

        int[] result = new int[3];
        result[0] = maxLeft;
        result[1] = maxRight;
        result[2] = leftSum + rightSum;

        return result;
    }


    public static int[] findMaxSubarray(int[] A, int low, int high){
        int mid;
        int sumLeft = 0;
        int sumRight = 0;
        int sumCross = 0;
        int[] left;
        int[] right;
        int[] cross;
        int[] result = new int[3];

        if(high == low){
            result[0] = low;
            result[1] = high;
            result[2] = A[low];
            return result;
        }
        else{
            mid = (low+high)/2;
            left = findMaxSubarray(A, low, mid);
            right = findMaxSubarray(A, mid+1, high);
            cross = findMaxCrossingSubarray(A, low, mid, high);

            if((left[2] > right[2]) && (left[2] > cross[2])){
                result[0] = left[0];
                result[1] = left[1];
                int[] leftSub = Arrays.copyOfRange(A, low, high);
                for(int i : leftSub)
                    sumLeft+=i;
                result[2] = sumLeft;

                return result;
            }

            else if ((right[2] >= left[2]) && (right[2] >= cross[2])){
                result[0] = right[0];
                result[1] = right[1];
                int[] rightSub = Arrays.copyOfRange(A, low, high);
                for(int i : rightSub)
                    sumRight+=i;
                result[2] = sumRight;

                return result;
            }

            else{
                result[0] = cross[0];
                result[1] = cross[1];
                int[] crossSub = Arrays.copyOfRange(A, low, high);
                for(int i : crossSub)
                    sumCross+=i;
                result[2] = sumCross;

                return result;
            }
        }
    }

}
