package mooc.damumoye.algorithm;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        final int [] array = new int[]{5, 7, 8, 3, 1, 6, 4, 9, 2};
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 希尔排序
     * @param array
     */
    public static void shellSort(int [] array){
        int arrayLength = array.length;
        int gap = arrayLength/2;//小组的人数
        int preIndex;//上一个小组内上一个数据的索引
        int tempt;//中间数据

        while (gap>0){
            //对小组中的数据进行插入排序
            for (int i = gap;i < arrayLength;i++){
                preIndex = i - gap;
                tempt = array[i];
                //数据交换
                //如果不加下面这段，直接进行数据交换，循环会少执行一次
                while (preIndex >=0 && array[i]<array[preIndex]){
                    array[preIndex + gap] = array[preIndex];
                    preIndex -= gap;
                }
                array[preIndex + gap] = tempt;
            }
            gap = gap/2;
        }
    }
}
