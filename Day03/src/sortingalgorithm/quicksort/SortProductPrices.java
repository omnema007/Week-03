package sortingalgorithm.quicksort;

public class SortProductPrices {
    public static void quickSort(double arr[],int si,int ei){
        if(si >= ei){
            return;
        }

        int pIdx = partition(arr,si,ei);
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx+1, ei);

    }

    public static int partition(double arr[],int si,int ei){
        double pivot = arr[ei];
        int i = si-1;

        for(int j = si;j < ei;j++){
            if(arr[j] <= pivot){
                i++;
                //swap
                double temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        double temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }
}
