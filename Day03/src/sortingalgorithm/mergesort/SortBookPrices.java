package sortingalgorithm.mergesort;

class SortBookPrices {
    public static void mergeSort(double arr[], int si,int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        merge(arr, si, mid, ei);
    }
    public static void merge(double arr[],int si,int mid,int ei){
        double temp[] = new double[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //for leftover elements of 1st sorted part
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        //for(leftover elements of 2nd sorted part)
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        //copy elements from temp arr to original array
        for( k=0, i = si;k < temp.length;k++,i++){
            arr[i] = temp[k];

        }

    }

}
