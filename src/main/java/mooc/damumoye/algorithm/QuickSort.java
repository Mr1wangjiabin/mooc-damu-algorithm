package mooc.damumoye.algorithm;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        final int [] array = new int[]{5, 7, 8, 3, 1, 6, 4, 9, 2};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 快速排序
     * 使用递归的方式循环遍历整个数组
     * @param array
     * @param left
     * @param right
     */
    public static void quickSort(int [] array,int left, int right){
        //设置循环结束的条件
        if(left > right){
            return;
        }
        int i = left;//左侧编号
        int j = right;//右侧编号
        int base = array[left];//基准数字
        int tempt;//中间参数

        //核心算法
        while (i != j){
            //右侧编号查找数字
            while (j > i && array[j] >= base){
                j--;
            }

            //左侧编号查找数字
            while (i < j && array[i] <= base){
                i++;
            }

            //数字交换
            if(i < j){
                tempt = array[i];
                array[i] = array[j];
                array[j] = tempt;
            }
        }
        //基准数字和i位置数字的交换
        array[left] = array[i];
        array[i] = base;

        //i 位置为基准数字，不包含i
        //左侧数字二次分类
        quickSort(array,left,i-1);

        //右侧数字二次分类
        quickSort(array,i + 1,right);
    }

    public static void quickSort(int [] array){
        quickSort(array,0,array.length - 1);
    }
}
