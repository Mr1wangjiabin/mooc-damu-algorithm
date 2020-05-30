package mooc.damumoye.algorithm;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        final int [] array = new int[]{5, 7, 8, 3, 1, 6, 4, 9, 2};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }



    /**
     * 选择排序
     * @param array
     */
    public static void selectionSort(int [] array){
        int minIndex;//最小数的下标
        int tempt;//数据交换的中间变量

        //所有参与的游戏人数
        for (int i = 0; i < array.length; i++) {
            minIndex = i;//假设最小数的下标为i
            //最小数与其他数字做对比，找出真实最小数下标
            for (int j = i;j < array.length;j++){
                //交换下标
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            //完成真实数据交换
            if(minIndex != i){
                tempt = array[i];
                array[i] = array[minIndex];
                array[minIndex] = tempt;
            }
        }
    }
}
