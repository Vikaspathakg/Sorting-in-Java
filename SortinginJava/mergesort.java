package SortinginJava;
//This is Count sort Algoritham
public class mergesort {
    static void displayArray(int[] a){
        int n = a.length;
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }

    static void swap(int[] a,int x,int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    static int findMax(int[] a){
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>mx){
                mx = a[i];
            }
        }
        return mx;
    }

    static void countSort(int[] a,int place){
        int n = a.length;
        int[] output = new int[n];
        int max = findMax(a);
        int[] count = new int[10];
        for(int i=0;i<a.length;i++){
            count[(a[i]/place)%10]++;
        }
        //Make prefix sum Array
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];

        }
        for(int i=n-1;i>=0;i--){
            int idx = count[(a[i]/place)%10]-1;
            output[idx] = a[i];
            count[(a[i]/place)%10]--;

        }
        //Copy all elements from output to a
        for(int i=0;i<n;i++){
            a[i] = output[i];
        }
    }

    static void radixSort(int []a){
        int max = findMax(a);
        for(int place=1;max/place>0;place*=10){
            countSort(a,place);
        }
    }


    public static void main(String[] args) {
        int[] a = {4,1,3,5,2};
       // int n = a.length-1;
        System.out.println("Array before sort");
        displayArray(a);

        System.out.println();
        //basicCountSort(a);
        radixSort(a);
        System.out.println("Array after sorting");
        displayArray(a);


    }
}

////This is Count sort Algoritham
//public class mergesort {
//    static void displayArray(int[] a){
//        int n = a.length;
//        for(int i=0;i<n;i++){
//            System.out.print(a[i]+" ");
//        }
//    }
//
//    static void swap(int[] a,int x,int y){
//        int temp = a[x];
//        a[x] = a[y];
//        a[y] = temp;
//    }
//
//    static int findMax(int[] a){
//        int mx = Integer.MIN_VALUE;
//        for(int i=0;i<a.length;i++){
//            if(a[i]>mx){
//                mx = a[i];
//            }
//        }
//        return mx;
//    }
//
//    static void basicCountSort(int[] a){
//        int max = findMax(a);
//        int[] count = new int[max+1];
//        for(int i=0;i<a.length;i++){
//            count[a[i]]++;
//        }
//        int k=0;
//        for(int i=0;i<count.length;i++){
//            for(int j=0;j<count[i];j++){
//                a[k++] = i;
//            }
//        }
//
//    }
//
//    static void countSort(int[] a){
//        int n = a.length;
//        int[] output = new int[n];
//        int max = findMax(a);
//        int[] count = new int[max+1];
//        for(int i=0;i<a.length;i++){
//            count[a[i]]++;
//        }
//        //Make prefix sum Array
//        for(int i=1;i<count.length;i++){
//            count[i]+=count[i-1];
//
//        }
//        for(int i=n-1;i>=0;i--){
//            int idx = count[a[i]]-1;
//            output[idx] = a[i];
//            count[a[i]]--;
//
//        }
//        //Copy all elements from output to a
//        for(int i=0;i<n;i++){
//            a[i] = output[i];
//        }
//    }
//
//
//    public static void main(String[] args) {
//        int[] a = {4,1,3,5,2};
//        // int n = a.length-1;
//        System.out.println("Array before sort");
//        displayArray(a);
//
//        System.out.println();
//        //basicCountSort(a);
//        countSort(a);
//        System.out.println("Array after sorting");
//        displayArray(a);
//
//
//    }
//}


//This is Quick sort Algoritham
//public class mergesort {
//    static void displayArray(int[] a){
//        int n = a.length;
//        for(int i=0;i<n;i++){
//            System.out.print(a[i]+" ");
//        }
//    }
//
//    static void swap(int[] a,int x,int y){
//        int temp = a[x];
//        a[x] = a[y];
//        a[y] = temp;
//    }
//
//    static int partition(int[] a,int st,int ed){
//        int pivot = a[st];
//        int count = 0;
//        for(int i=st+1;i<=ed;i++){
//            if(a[i]<=pivot)count++;
//        }
//        int pivotIdx = st + count;
//        swap(a,st,pivotIdx);
//        int i=st,j=ed;
//        while(i<pivotIdx && j>pivotIdx){
//            while(a[i]<=pivot)i++;
//            while(a[j]>=pivot)j--;
//            if(i<pivotIdx && j>pivotIdx) {
//                swap(a, i, j);
//                i++;
//                j--;
//            }
//        }
//        return pivotIdx;
//    }
//
//    static void quickShort(int[] a,int st,int ed){
//        if(st>=ed)return;
//        int pi = partition(a,st,ed);
//        quickShort(a,st,pi-1);
//        quickShort(a,pi+1,ed);
//    }
//
//
//
//
//    public static void main(String[] args) {
//        int[] a = {4,1,3,5,2};
//        // int n = a.length-1;
//        System.out.println("Array before sort");
//        displayArray(a);
//        //mergeShort(a,0,n-1);
//        System.out.println();
//        quickShort(a,0,a.length-1);
//
//        System.out.println("Array after sorting");
//        displayArray(a);
//
//
//    }
//}


//This is merge sort algoritham
//public class mergesort {
//    static void displayArray(int[] a){
//        int n = a.length;
//        for(int i=0;i<n;i++){
//            System.out.print(a[i]+" ");
//        }
//    }
//
//    static void merge(int[] a,int l,int mid,int r){
//        int n1 = mid-l+1;
//        int n2 = r-mid;
//        int[] left = new int[n1];
//        int[] right = new int[n2];
//        int i,j,k;
//        for(i=0;i<n1;i++)left[i] = a[l+i];
//        for(j=0;j<n2;j++)right[j] = a[mid+1+j];
//        i=0;
//        j=0;
//        k=l;
//        while(i<n1 && j<n2){
//            if(left[i]<right[j])
//                a[k++] = left[i++];
//            else
//                a[k++] = right[j++];
//
//        }
//        while(i<n1){
//            a[k++] = left[i++];
//        }
//        while(j<n2){
//            a[k++] = right[j++];
//
//        }
//    }
//
//    static void mergeShort(int[] a,int l,int r){
//        if(l>=r)return;
//        int mid = (l+r)/2;
//        mergeShort(a,l,mid);
//        mergeShort(a,mid+1,r);
//        merge(a,l,mid,r);
//
//    }
//
//
//    public static void main(String[] args) {
//        int[] a = {4,1,3,5,2};
//        int n = a.length;
//        System.out.println("Array before sort");
//        displayArray(a);
//        mergeShort(a,0,n-1);
//        System.out.println();
//
//        System.out.println("Array after sorting");
//        displayArray(a);
//
//
//    }
//}
