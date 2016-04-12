package com.study.sort;

/**
 * Created by Edward on 2016/3/18.
 * 冒泡排序：
 * 临近的数字两两进行比较,按照从小到大或者从大到小的顺序进行交换,
 这样一趟过去后,最大或最小的数字被交换到了最后一位,
 然后再从头开始进行两两比较交换,直到倒数第二位时结束,
 */
public class BubbleSort {

    public static void sort(int array[]){
        for(int i=0;i<array.length;i++){//比较趟数

            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }


        }
    }

    public static void main(String args[]){
        int array[]={5,4,3,2,1};
        sort(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
