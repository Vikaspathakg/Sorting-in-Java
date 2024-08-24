package SortinginJava;
import java.util.Scanner;

public class Bubblesort {
    /*Given an Array of names of the fruits;you are supposed to sort it in lexicographical order using the selection sort
        input:["papaya","lime","watermelon","apple","mango","kiwi"]
        output:["apple","kiwi","lime","mango","papaya","watermelon"]
     */

    static void sortFruits(String [] a){
        int n = a.length;
        for(int i=0;i<n-1;i++){
            int min_idx = i;
            for(int j=i+1;j<n;j++){
                if(a[j].compareTo(a[min_idx])<0){
                    min_idx = j;
                }
            }
            //Swap:a[i]->a[min_idx]
            String  t = a[i];
            a[i]= a[min_idx];
            a[min_idx] = t;

        }
    }

    public static void main(String[] args) {
        String [] a ={"papaya","lime","watermelon","apple","mango","kiwi"};
        sortFruits(a);
        for(String i:a){
            System.out.print(i +" ");
        }

    }
}

//public class Bubblesort {
//    //4. Given an integer Array arr,move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//    // Note that you must do this in-place without making a copy of the Array.
//    // Input:053023 -> output:532300
//
//    static void removeZeros(int[] a){
//        int n = a.length;
//        for(int i=0;i<n-1;i++){
//            for(int j=0;j<n-i-1;j++){
//                if(a[j]==0 && a[j+1]!=0){
//                    //Swap
//                    int t = a[j];
//                    a[j] = a[j+1];
//                    a[j+1] = t;
//                }
//            }
//        }
//
//    }
//
//
//    public static void main(String[] args) {
//        int[] a ={0,5,3,0,2,3};
//        removeZeros(a);
//        for(int i:a){
//            System.out.print(i +" ");
//        }
//
//    }
//}

//3.public class Bubblesort {
//    static void insertionSort(int[] a){
//        int n = a.length;
//        for(int i=1;i<n;i++){
//            int j=i;
//            while(j>0 && a[j]<a[j-1]){
//                //Swap->a[j],a[j-1]
//                int t = a[j];
//                a[j] = a[j-1];
//                a[j-1] = t;
//                j--;
//            }
//        }
//    }
//
//
//    public static void main(String[] args) {
//        int[] a ={5,3,2,1,4};
//        insertionSort(a);
//        for(int i:a){
//            System.out.print(i +" ");
//        }
//
//    }
//}


//2.public class Bubblesort {
//
//    static void selectionSort(int[] a){
//        int n = a.length;
//        for(int i=0;i<n-1;i++){
//            int min_idx = i;
//            for(int j=i+1;j<n;j++){
//                if(a[j]<a[min_idx]){
//                    min_idx = j;
//                }
//            }
//            int t = a[i];
//            a[i] = a[min_idx];
//            a[min_idx] = t;
//
//        }
//
//    }
//
//    public static void main(String[] args) {
//        int[] a ={5,3,2,1,4};
//        selectionSort(a);
//        for(int i:a){
//            System.out.print(i +" ");
//        }
//
//    }
//}


// 1.public class Bubblesort {
//static void bubbleSort(int[] a){
//    int n = a.length;
//    for(int i = 0; i<n;i++){
//        boolean flag = false;
//        for(int j =0;j<n-i-1;j++){
//            if(a[j]>a[j+1]){
//                int t = a[j];
//                a[j] = a[j+1];
//                a[j+1] = t;
//            }
//            if(flag = false){
//                return;
//            }
//
//        }
//    }
//}
//public static void main(String[] args) {
//    int[] a ={3,7,4,6,9};
//    bubbleSort(a);
//    for(int i:a){
//        System.out.print(i +" ");
//    }
//
//}
//}
