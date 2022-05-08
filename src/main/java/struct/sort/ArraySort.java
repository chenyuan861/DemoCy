package struct.sort;

/**
 * 类功能描述
 *
 * @author chenyuan
 * @Date 2020/4/7 21:00
 */
public class ArraySort {
   public static void swap(int a[],int i,int j){
        int tmp = a[i];
        a[i]=a[j];
        a[j]=tmp;
   }

    /**
     *  冒泡排序
     * @param a
     */
    public static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                }
            }

        }
    }
        /**
         * 选择排序, 特点：最后一个元素与最大一个元素交换顺序即可
         * 错误点在哪里#####################################################
         * ######################不能直接赋予值，原来值不见了，要交换 #############
          */
        public static void selectionSort(int[] a){
            for(int i=0;i<a.length;i++){
                int temp = 0;
                for(int j=0;j<a.length-i;j++){
                    if(temp <a[j]) {
                        temp = a[j];
                    }
                }
                a[a.length-1-i] =temp;
            }
        }

    /**
     * 选择排序,
     * 错误点在哪里#####################################################
     * ######################不能直接赋予值，原来值不见了，要交换 #############
     */
    public static void selectionSortModify(int[] a){
        for(int i=0;i<a.length;i++){
            int index = 0;
            for(int j=0;j<a.length-i;j++){
                if(a[index] <a[j]) {
                    index =j;
                }
            }
            swap(a,index,a.length-1-i);

        }
    }


/**  ################插入排序#############
 *  插入排序，不同
 *  1.循环是从1开始，代表第几个数
 *  2.j依次倒数进行冒泡排序插入，注意冒泡比较是相邻的两个元素进行比较
 */
        public static void insertSort(int[] a){
            for (int i = 1; i < a.length; i++) {
                for (int j = i-1 ; j >= 0; j--) {
                   //下面这里容易出问题，
                    if (a[j+1] > a[j]) {
                        swap(a, j+1, j);
                    }
                }
            }
        }
/**
 * 快速排序###############判断== 号给丢失了，碰到相同的数据还是要继续往后走的###########
  */
public static void quickSort(int[] a,int left,int right){
    if(left >=right)return;
    int i =left;
    int j = right;
    int temp =a[left];
    while(i != j){
        while(i<j&&temp <=a[j]){j--;};
        while(i<j && temp >=a[i]){i++;};
        if(i<j){
            swap(a,i,j);
        }
    }
    swap(a,left,j);
    quickSort(a,left,i-1);
    quickSort(a,i+1,right);
}

    /**
     * 堆排序
     *  1.无序数组构建一个堆
     *  2.依次中堆中取出最大元素放在最后一个叶子节点
     * @param args
     */
    public static void heapSort(int[] a){
     for(int i=a.length/2;i>=0;i--){
         heapAdjust(a,i,a.length-1);
     }
       for(int i=0;i<a.length;i++){
           swap(a,0,a.length-i-1);
           heapAdjust(a,0,a.length-i-2);
        }
    }

    public static void mergeSort(int[] a,int left,int right){
        if(left == right) return;
        int mid =left + (right-left)/2;
        mergeSort(a,left,mid);
        mergeSort(a,mid+1,right);
        mergeAdjust(a,left,mid,right);

    }

    /**
     * 归并排序算法：将两个有序的数组合并成一个有序的数组
     *
     * @param a
     * @param left     数组下标为left
     * @param mid      数组左边截止位置
     * @param right    第二个数组右标
     */

    public static void mergeAdjust(int[] a,int left,int mid,int right){
      if(left == right )return;
      int temp[]  = new int[right - left+1];
      int i = left,j =mid+1 ,k =right;
      int w= 0 ;
        while(i <j && j <=k){
                temp[w++] = a[i] <a[j] ?a[i++]:a[j++];
         }
         while(i<j){temp[w++] = a[i++];};
         while(j<=k){temp[w++] = a[j++];};

         for(int m=0;m<temp.length;m++){
             a[left + m] =temp[m];

         }
    }

    /**
     * #################定位了一下午，是什么问题呢？j=j*2?###############
     * @param a
     * @param s
     * @param m
     */
    public static void heapAdjust(int[] a,int s,int m){
        for(int j=2*s+1 ;j<=m;j=j*2+1){
            if(j<m && a[j]<a[j+1]){ j++ ;}
           if(a[s] >a[j])break;
           swap(a,s,j);
           s=j;
        }
    }


    public static void main(String[] args) {
//        int[] arr = {5, 1, 7, 3, 1, 6, 9, 4};
        int[] arr = {8,3,4,6,1,7,5,2,9};
       // bubbleSort(arr);
        //selectionSort(arr);
       // selectionSortModify(arr);
        //insertSort(arr);
       // quickSort(arr,0,arr.length-1);
       // heapSort(arr);
        mergeSort(arr,0,arr.length-1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
