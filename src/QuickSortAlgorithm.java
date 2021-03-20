public class QuickSortAlgorithm {

    /**分治法思想
     * 快速排序
     * O(logn)
     * */
    public static void quickSort(int[] r, int low, int high){
        if(low >= high){
            return;
        }

        int index = sortAndGetIndex(r, low, high);
        quickSort(r, index + 1, high);
        quickSort(r, low, index);
    }

    private static int sortAndGetIndex(int[] r, int low, int high){
        int p = r[low];

        //直到两个索引相碰撞
        while(low < high){

            //高位判断，直到比p小，跳出，停留在h索引
            while( low < high && r[high] > p){
                high--;
            }

            //比p小，放到左边数组
            r[low] = r[high];

            //
            while ( low < high && r[low] < p){
                low++;
            }

            //比p小，放到左边h数组位置
            r[high] = r[low];
        }


         r[low] = p;
        return low;

    }
}
