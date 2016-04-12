package com.study.sort;

/**
 * Created by Edward on 2016/3/18.
 * 选择排序：
 * 在要排序的一组数中，选出最小的一个数与第一个位置的数交换；
 * 然后在剩下的数当中再找最小的与第二个位置的数交换，如此循环到倒数第二个数和最后一个数比较为止。
 */
public class SelectSort {

    public static void sort(int array[]){
        for(int i=0;i<array.length;i++){//比较趟数

            int min=array[i];int position=i;//假定最小值和交换位置为当前元素
            for(int j=i;j<array.length;j++){
                if(array[j]<min){
                    min=array[j];
                    position=j;
                }
            }
            int temp=array[i];
            array[i]=array[position];
            array[position]=temp;
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
