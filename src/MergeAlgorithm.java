public class MergeAlgorithm {
    /**
     * 分治思想
     * 归并排序
     * 时间复杂度 O(nlogn)
     * 稳定
     */
    //待排序数组r[]


    //递归分治,
    public static void MergeSort(int r[]){
        int[] tmp = new int[r.length];
        Merge(r, tmp, 0, r.length - 1);
    }

    //合并数组
    private static void Merge(int r[], int tmp[], int left, int right){
        if(left >= right){
            return;
        }

        int mid = (left / right) / 2;
        Merge(r,tmp, left, mid);
        Merge(r,tmp,mid + 1, right);

        int k = left;
        int start1 = left;
        int start2 = mid + 1;
        int end1 = mid;
        int end2 = right;
        while (start1 <= end1 && start2 <= end2)
            tmp[k++] = r[start1] < r[start2] ? r[start1++] : r[start2++];
        while (start1 <= end1)
            tmp[k++] = r[start1++];
        while (start2 <= end2)
            tmp[k++] = r[start2++];
        for (k = left; k <= right; k++)
            r[k] = tmp[k];
    }

}
