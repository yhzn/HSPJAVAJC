package C1MianXiangDuiXiang;

public class MXDX9CHAZAO {
    public static void main(String[] args){
        int arr[]={2,5,5,7,9,10};
        BinaryFind bf=new BinaryFind();
        bf.find(0,arr.length-1,5,arr);
    }
}
// 二分查找
class BinaryFind{
    public void find(int leftIndex,int rightIndex,int val,int arr[]){
        //首先找中间值
        int minIndex=(rightIndex+leftIndex)/2; // 除不尽自动取整
        int minVal=arr[minIndex];
        if(rightIndex>=leftIndex){
            if(minVal>val){
                // 则在数组的左边找
                find(leftIndex,minIndex-1,val,arr);
            }else if(minVal<val){
                // 则在数组的右边找
                find(minIndex+1,rightIndex,val,arr);
            }else{
                System.out.println("找到要查询数的下标："+minIndex);
            }
        }
    }
}
