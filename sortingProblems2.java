package SortinginJava;

public class sortingProblems2 {
    //Qus:1:Given an Array of Size N containing only 0s,1s and 2s;sort the Array in ascending order.
    static void displayArray(int[] a){
        int n = a.length;
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }

    static void swap(int[] a,int x,int y){
        int t = a[x];
        a[x] = a[y];
        a[y] = t;
    }

    static void sort012(int[] a){
        int lo=0,mid=0,hi=a.length-1;
        while(mid<=hi){
            if(a[mid]==0) {
                swap(a, mid, lo);
                lo++;
                mid++;
            } else if (a[mid]==1) {
                mid++;
                
            }else {
                swap(a,mid,hi);
                hi--;
            }
        }
    }




    public static void main(String[] args) {
        int[] a = {0,1,1,2,2,0,1,2};
        sort012(a);
        displayArray(a);

    }
}

//public class sortingProblems2 {
//    //Qus:2:Given an Array of positive and negative integers,segregate them in linear time and constant space.The output should print all negative numbers,followed by all positive numbers.
//    // input:{2,-3,7,6,-17,-2} ->output: {-3,-17,-2,2,6,7}
//
//    static void displayArray(int[] a){
//        int n = a.length;
//        for(int i=0;i<n;i++){
//            System.out.print(a[i]+" ");
//        }
//    }
//
//    static void Partition(int[] a){
//        int n = a.length;
//        int l=0,r=n-1;
//        while(l<r) {
//            while (a[l] < 0) l++;
//            while (a[r] > 0) r--;
//            if (l < r) {
//                int t = a[l];
//                a[l] = a[r];
//                a[r] = t;
//                l++;
//                r--;
//            }
//        }
//
//    }
//
//
//    public static void main(String[] args) {
//        int[] a = {2,-3,7,6,-17,-2};
//        Partition(a);
//        displayArray(a);
//
//    }
//}

//public class sortingProblems2 {
//    //Qus:1:Given an Array where all its elements are sorted in increasing order except two swapped elements,sort it in linear time.Assume there are no duplicates in the Array.
//
//    static void displayArray(int[] a){
//        int n = a.length;
//        for(int i=0;i<n;i++){
//            System.out.print(a[i]+" ");
//        }
//    }
//
//    static void sortArray(int[] a){
//        int n = a.length;
//        int x=-1,y=-1;
//        for(int i=1;i<n;i++) {
//            if (a[i - 1] > a[i]) {
//                if (x == -1) {
//                    x = i - 1;
//                    y = i;
//                } else {
//                    y = i;
//                }
//            }
//        }
//        //Swap a,x,y
//        int t = a[x];
//        a[x] = a[y];
//        a[y] = t;
//    }
//    public static void main(String[] args) {
//        int[] a = {10,5,6,7,8,9,3};
//        sortArray(a);
//        displayArray(a);
//
//    }
//}
