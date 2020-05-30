package mooc.damumoye.algorithm;

import java.util.Arrays;

public class InsertSort {

    public static void main(String[] args) {
        final int [] array = new int[]{5, 7, 8, 3, 1, 6, 4, 9, 2};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }



    /**
     * 插入排序
     * @param array
     */
    public static void insertSort(int [] array){
        int tempt;//数据交换的中间参数

        //所有参与的玩具
        for (int i = 0; i < array.length; i++) {
            //比较已有玩具
            for (int j = i - 1; j >= 0; j--) {
                //数据交换
                if(array[j] > array[j+1]){
                    tempt = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tempt;
                }
            }
        }
    }
}
