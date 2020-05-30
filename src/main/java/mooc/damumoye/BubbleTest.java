package mooc.damumoye;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleTest {

    public static void main(String[] args) {
        final int [] array = new int[]{5, 7, 8, 3, 1, 6, 4, 9, 2};
        bubbleTest(array);
        Arrays.stream(array).forEach(i-> System.out.println(i));//将数组转换为流并输出，输出后流便无法再被操作

    }

    /**
     * 冒泡排序
     * @param array
     */
    public static void bubbleTest(int [] array){
        int tempt;//交换条件的中间参数

        //1.包含所有的数据
        for(int i = array.length - 1;i > 0 ;i--){
            //2.控制交换的过程
            for (int j = 0; j < i; j++) {
                //设置交换的条件
                if(array[j] > array[j+1]){
                    tempt = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tempt;
                }
            }
        }
    }
}
