package 冒泡排序;

import java.util.Arrays;

//借助相邻元素进行比较交换，每趟冒泡将无序区间中的最大元素冒到无序区间的最后
//经过size-1趟冒泡变为有序
public class bubbleSort {
    public static void sort(int[] array){
        //进行array.length-1趟冒泡
        for(int i = 0;i < array.length-1;i++){
            for(int j = 0;j < array.length-1-i;j++){
                if(array[j] > array[j+1]){
                    //交换
                    int temp = array[j];
                    array[j]  = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {3,5,2,6,1,8,7,9,0};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
