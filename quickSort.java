package 快排;

import java.util.Arrays;

//找一个基准值，将比基准值小的放在基准值的左边，比基准值大的放在基准值的右边
//递归
public class quickSort {
    public static void sort(int[] array){
        sortInter(array,0,array.length-1);
    }
    private static void sortInter(int[] array,int left,int right){
        if(left == right){
            return;
        }
        if(left > right){
            return;
        }
        int partIndex = partation(array,left,right);
        partation(array,left,partIndex-1);
        partation(array,partIndex+1,right);
    }
    private static int partation(int[] array,int left,int right){
        //选择最左边的为基准值，下面就要先从右边开始遍历
        int part = array[left];
        int i = left;
        int j = right;
        while(i < j){
            while(i < j && array[j] >= part ){
                j--;
            }
            while(i < j && array[i] <= part){
                i++;
            }
            swap(array,i,j);
        }
        swap(array,i,left);
        return i;
    }
    private static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void main(String[] args) {
        int[] array = {3,5,1,5,8,6,4,};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
