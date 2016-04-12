package com.study.sort;

/**
 * Created by Edward on 2016/3/18.
 * 插入排序
 * 在要排序的一组数中，假设前面(n-1) [n>=2] 个数已经是排
 * 好顺序的，现在要把第n个数插到前面的有序数中，使得这n个数
 * 也是排好顺序的。如此反复循环，直到全部排好顺序。
 */
public class InsertSort {

    public static void sort(int array[]){
        for(int i=1;i<array.length;i++){//比较趟数

            int temp=array[i];
            int j=i-1;
            for(;j>=0&&temp<array[j];j--){
                array[j+1]=array[j];
            }
            array[j+1]=temp;
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
