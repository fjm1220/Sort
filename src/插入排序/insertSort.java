package 插入排序;

import java.util.Arrays;

//直接插入排序
//两个区间：有序区间和无序区间，
//将无序区间的数与有序区间的数进行比较，
//并插入到有序区间的合适位置，有序区间仍然有序
public class insertSort {
    public static void sort(int[] array){
        //有序区间：[0,i)
        //无序区间：[i,array.length)
        for(int i = 1;i < array.length;i++){
            //用cur保存当前要插入的值，与无序区间进行比较
            int cur = array[i];
            int j = i-1;
            for(;j >= 0;j--){
                //该条件为<;而不是<=保证了稳定性
                if(cur < array[j])
                {
                    array[j+1] = array[j];
                }
                else{
                    //此时说明找到了合适的位置
                    break;
                }
            }
            array[j+1] = cur;
        }
    }
public static void main(String[] args){
        int[] array = {9,7,3,4,2,8,6,5};
        sort(array);
    System.out.println(Arrays.toString(array));
}
}

