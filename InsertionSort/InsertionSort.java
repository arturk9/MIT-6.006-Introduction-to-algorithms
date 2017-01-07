package InsertionSort;

public final class InsertionSort {

    private InsertionSort(){};

    public static int[] sort(int[] list){
        for(int j = 0; j < list.length; j++){
            int key =  list[j];
            int i = j - 1;
            while(i > -1 && list[i] > key){
                list[i+1] = list[i];
                i = --i;
            }
            list[i+1] = key;
        }
        return list;
    }

    public static int[] sortDescending(int[] list){
        for(int j = 0; j < list.length; j++){
            int key =  list[j];
            int i = j - 1;
            while(i > -1 && list[i] < key){
                list[i+1] = list[i];
                i = --i;
            }
            list[i+1] = key;
        }
        return list;
    }
}
