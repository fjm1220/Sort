package 插入排序;

import java.util.Arrays;

//希尔排序
//是直接插入排序的进阶版，先进行利用gap进行分组再对每个小组进行插入排序
//gap的一种计算方式：gap=array.length;gap=gap/2
public class shellSort {
    public static void sort(int[] array){
    int gap = array.length;
    while(gap > 1){
        sortInter(array,gap);
        gap = gap/2;
    }
    sortInter(array,1);
    }
    private static void sortInter(int[] array,int gap){
        for(int i = 1;i < array.length;i+=gap){
            int cur = array[i];
            int j = i-gap;
            for(;j >= 0;j-=gap){
                if(cur < array[j]){
                    array[j+gap] = array[j];
                }
                else{
                    //找到了合适的位置
                    break;
                }
            }
            array[j+gap] = cur;
        }
    }
    public static void main(String[] args){
        int[] array = {9,7,3,4,2,8,6,5};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
