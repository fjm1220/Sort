package 选择排序;
//直接选择排序
import java.util.Arrays;

//原理：打擂台的思想，每次从无序区间找最小的元素放到擂主位置，与擂主位置的元素进行交换
public class selectSort {
    public static void sort(int[] array){
        for(int i = 0;i < array.length;i++){
            for(int j = i+1;j < array.length;j++){
                if(array[j] < array[i]){
                    //交换
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {3,9,7,8,5,4,6};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
