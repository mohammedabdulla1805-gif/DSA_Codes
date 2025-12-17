//  Complete Practice code of Sorting from Basics to Advanced

import java.util.Arrays;
public class Sorting{
    public static void main(String args[]){
        int[] arr={1,9,2,8,3,7,4,6,5};

        System.out.println(Arrays.toString(Cycle_Sort(arr)));
    }

    static void swap(int[] arr,int i,int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
    }

// Bubble Sort
// Bringing the big element in to the last 
    static int[] Bubble_Sort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
              boolean swap=false;
            for(int j=1;j<n-i;j++){
                if(arr[j]<arr[j-1]){
                   swap(arr, j, j-1);
                    swap=true;
                }
            }
            if(!swap){
                break;
            }
        }
        return arr;
    } 

// Selection Sort
// select the min or max and arrange from the frond or back
static int[] Selection_Sort(int[] arr){
    int n=arr.length;
    int min;
    for(int i=0;i<n;i++){
          min=i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[min]) min=j;;
        }
       if(i!=min) swap(arr, i, min);
    }
return arr;
}

//    Insertion Sort
//    best for partially sorted array 
static int[] Insertion_Sort(int[] arr){
    int n=arr.length;
    for(int i=1;i<n;i++){
        for(int j=i;j>0;j--){
            if(arr[j]<arr[j-1])swap(arr, j-1, j);
            else break;
        }
    }
    return arr;
}

// Cycle Sort
// used for sorting the numbers from 1 to N
static int[] Cycle_Sort(int[] arr){
     int n=arr.length;
     for(int i=0;i<n;i++){
        while(arr[i]!=i+1)swap(arr, arr[i]-1,i);
    }
    return arr;
}
}