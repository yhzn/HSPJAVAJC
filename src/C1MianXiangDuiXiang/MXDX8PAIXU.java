package C1MianXiangDuiXiang;

import java.util.Arrays;
import java.util.Calendar;

public class MXDX8PAIXU {
    public static void main(String[] args){
//        maoPao();
//        xuanZe();
//        insertSort();
        quickSort();
    }
    // 内排序法：冒泡排序、选择排序
    // 冒泡排序
    private static void maoPao(){
        int arr[]={1,6,0,-1,9};
        arr=setArr();
        Bubble bubble=new Bubble();
        // 测试排序时间
        Calendar cal=Calendar.getInstance();
        System.out.println(cal.getTime());
        bubble.sort(arr);
        cal=Calendar.getInstance();
        System.out.println(cal.getTime());
        System.out.println(Arrays.toString(arr));
    }
    private static int[] setArr(){
        int len=80000;
        int arr[]=new int[len];
        for (int i=0;i<len;i++){
            arr[i]=(int) (Math.random()*len);
        }
        return arr;
    }
    // 选择排序：选择排序法、堆排序法
    // 选择排序法
    private static void xuanZe(){
        int arr[]={1,6,0,-1,9};
        arr=setArr();
        Select select=new Select();
        // 测试排序时间
        Calendar cal=Calendar.getInstance();
        System.out.println(cal.getTime());
        select.sort(arr);
        cal=Calendar.getInstance();
        System.out.println(cal.getTime());
//        System.out.println(Arrays.toString(arr));
    }
    // 插入排序法
    private static void insertSort(){
        int arr[]={1,6,0,-1,9};
        arr=setArr();
        InsertSort inSort=new InsertSort();
        // 测试排序时间
        Calendar cal=Calendar.getInstance();
        System.out.println(cal.getTime());
        inSort.sort(arr);
        cal=Calendar.getInstance();
        System.out.println(cal.getTime());
//        System.out.println(Arrays.toString(arr));
    }
    // 快速排序法
    private static void quickSort(){
        int arr[]={1,6,0,-1,9};
//        int arr[]={6,5,7,3};
        arr=setArr();
        QuickSort QSort=new QuickSort();
        // 测试排序时间
        Calendar cal=Calendar.getInstance();
        System.out.println(cal.getTime());
        QSort.sort(0,arr.length-1,arr);
        cal=Calendar.getInstance();
        System.out.println(cal.getTime());
        System.out.println(Arrays.toString(arr));
    }

}

// 选择排序
class Select{
    public void sort(int arr[]){
        int temp;

        for (int i=0;i<arr.length-1;i++){
            // 假设第一个最小
            int min=arr[i];
            // 记录最小数的下标
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(min>arr[j]){
                    min=arr[j];
                    minIndex=j;
                }
            }
            if(min<arr[i]){
                // 与最小值交换
                temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
        }

    }
}

// 冒泡排序
class Bubble{
    public void sort(int arr[]){
        int temp;
        for (int i=0;i<arr.length-1;i++){ // 减 1 最后一趟不用比较
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
    }
}

// 插入排序
class InsertSort{
    public void sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int insetVal=arr[i];
            int index=i-1;
            while (index>=0&&insetVal<arr[index]){
                // 将arr[index]向后移动
                arr[index+1]=arr[index];
                // 让index向前移动
                index--;
            }
            // 将insertVal插入到适当位置
            arr[index+1]=insetVal;
        }

    }
}

// 快速排序法
// 比较消耗没存，占用cpu
class QuickSort{
    public void sort(int left,int right,int[] array){
        int l=left;
        int r=right;
        int pivot=array[(left+right)/2];
        int temp=0;
        while (l<r){
            while (array[l]<pivot) l++;
            while (array[r]>pivot) r--;
            if(l>=r) break;
            temp=array[l];
            array[l]=array[r];
            array[r]=temp;
            if(array[l]==pivot) --r;
            if(array[r]==pivot) ++l;
        }
        if(l==r){
            l++;
            r--;
        }
        if(left<r) sort(left,r,array);
        if(right>l) sort(l,right,array);
    }
}