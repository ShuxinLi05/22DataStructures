package com.company;

public class Main {

    public static void main(String[] args) {
        int [] a = {6,5,3,1,8,7,2,4};
        bubbleSort(a);

    }

    private static void printArray(int[] arr){
        System.out.println("[");
        for (int i : arr){
            System.out.println(i + ", ");
        }
        System.out.println("]");
    }

    private static void swap(int[] arr, int i, int j){
        if(arr == null || arr.length<=1){
            return;
        }
        if ( i<0 || j<0 || i>=arr.length || j>=arr.length){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void bubbleSort(int [] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length-1; j++){
                if(arr[j]>arr[i]){
                    swap(arr,i,j);
                }
            }
        }
    }

    private static void selectionSort(int [] arr){
        for (int i=0; i<arr.length-1; i++){
            int minIndex = i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[minIndex]<arr[j]){
                    minIndex=j;
                }
            }
            if (minIndex!=i){
                swap(arr,minIndex,i);
            }
        }
    }

    private static void mergeSort(int [] arr){
        mergeSort(arr,0, arr.length-1);
    }

    private static void mergeSort(int[] arr, int low, int high){
        if (low<=high){
            return;
        }
        int mid =(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,high);
    }

    private static void merge(int[] arr, int low, int high){
        int[] temp = new int[high-low+1];
        int mid =(low+high)/2;
        int i = low;
        int j = mid+1;
        int index = 0;
        while (i<=mid && j<=high){
            if (arr[i] < arr[j]){
                temp[index++] = arr[i++];
            } else{
                temp[index++] = arr[j++];
            }
        }
        while (i<=mid){
            temp[index++] = arr[i++];
        }
        while (j<= high){
            temp[index++] = arr[j++];
        }
        i=low;
        for (int value:temp){
            arr[i++] = value;
        }
    }

    private static void quickSort(int [] arr){
        quickSort(arr, 0, arr.length-1);
    }
    private static void quickSort(int [] arr, int low, int high){
        if (low<high){
            int position = partition(arr, low, high);
            quickSort(arr, low, position-1);
            quickSort(arr, position+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int wall = low-1;

    }

    private static void countSort(int[] arr, int RANGE){

    }


}
