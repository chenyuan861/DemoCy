package struct.sort;

public class SortArray {


    /**字节写的
     * 冒泡排序最大的往石头里面写，这样最大值减小，
     * 否则，最小的往上面浮上来，从最后的一个开始
     * @param a
     */
    public static void BubbleSort(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j =i;j<a.length-1;j++){
                if(a[j]>a[j+1]){  //错误原因
               int    temp = a[j];
                  a[j]=a[j+1];
                  a[j+1]=temp;
                }
            }
        }
    }

    public static void ModifyBubbleSort(int a[]){
       // for(int i=0;i<a.length;i++){
        for (int i=a.length-1;i>0;i--)
            for(int j =0;j<i;j++){
                if(a[j]>a[j+1]){
                    int    temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
    //    }

    }

    public static void SelectionSort(int arr[]){
        for (int i=0;i<arr.length;i++){
            int index =0;  //我擦，这里翻船了，为什么index写成了=i呢
            for(int j=0;j<arr.length-i;j++){
               if(arr[index]< arr[j]){
                    index =j;
                }

            }
            int temp = arr[index];
            arr[index] =arr[arr.length-i-1];
            arr[arr.length-i-1] =temp;

        }

    }

    public static void insertSort(int[] a){
        for(int i=0;i<a.length-1;i++){
            for(int j=i;j>=0;j--){
                       if( a[j]>a[j+1]){
                           int temp = a[j+1];
                            a[j+1] =a[j] ;
                           a[j]= temp;
                       }

                   }

        }
    }

    //{3,4,6,1,7,1,2,9}

    public static void quickSort(int[] a,int left,int right){
        if(left >=right ) return;
        int tmp = a[left];
        int i =left;
        int j =right;
        while( j != i){
            while(a[j]>=tmp &&j>i){j--;};
            while(a[i]<=tmp && j>i){i++;};
            if(i<j){
                int t = a[j];
                 a[j] =a[i];
                 a[i] = t;
            }
        }
         a[left]= a[i];
         a[i] =tmp;
         quickSort(a,0,i-1);
         quickSort(a,i+1,right);
    }

    /**
     *
     * @param args
     */
    public static void heapSort(int[]a){
   //1.对无序的队列进行建堆，主要使用的是筛选算法，然后再进行筛选
           for(int i=a.length/2;i>=0;i--){
               heapadjust(a,i,a.length-1);
           }

          for(int i=0;i<a.length;i++){
              int tmp =a[a.length-i-1]; a[a.length-i-1]=a[i];
              a[i] =tmp;
             heapadjust(a,0,a.length-i);
          }


    }

    public static void heapadjust(int[]a,int s,int m ){
        int tmp =a[s];
        for(int j=2*s+1;j<=m;j*=2){
            if(j<m && a[j]<a[j+1]) {j++;}
             if(a[s] >a[j]) break;
         int t=a[s];
          a[s] =a[j]; a[j]=t ;
           s=j;
        }
    }



    public static void main(String[] args) {
        int[] arry ={3,4,6,1,7,5,2,9};
       // BubbleSort(arry);
      //   ModifyBubbleSort(arry);
      //  SelectionSort(arry);
       // insertSort(arry);
       // quickSort(arry,0,arry.length-1);
        heapSort(arry);
      for(int i=0;i<arry.length;i++){
          System.out.print(arry[i]+" ");
      }
    }

}
