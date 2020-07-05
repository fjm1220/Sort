package 归并排序;

import java.util.Arrays;

//分而治之
public class mergeSort {
    public static void MergeSort(int[] array){
        mergeSortInter(array,0,array.length);
    }
    private static void mergeSortInter(int[] array,int low,int high){
        //递归的出口条件
        if(high-low <= 1){
            //区间有0个或者一个元素，区间有序
            return;
        }
        int mid = (high+low)/2;
        //左闭右开区间，便于计算中间元素下标
        //[low,mid)
        mergeSortInter(array,low,mid);
        //[mid,high)
        mergeSortInter(array,mid,high);
        //合并上面两个有序区间
        merge(array,low,mid,high);
    }
    private static void merge(int[] array,int low,int mid,int high){
        int i = low;
        int j = mid;
        int k = 0;
        int length = high - low;
        int[] help = new int[length];
        while(i < mid && j < high){
            if(array[i] < array[j]){
                help[k++] = array[i++];
            }
            else{
                help[k++] = array[j++];
            }
        }
        while(i < mid){
            help[k++] = array[i++];
        }
        while(j < high){
            help[k++] = array[j++];
        }
        //将help中的元素再搬移到原数组array中
        for(int t = 0;t < help.length;t++){
            //注意不能直接写成array[t] = help[t];
            array[low+t] = help[t];
        }
    }

    public static void main(String[] args) {
        int[] array = {3,6,4,1,8,7,9};
        MergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
