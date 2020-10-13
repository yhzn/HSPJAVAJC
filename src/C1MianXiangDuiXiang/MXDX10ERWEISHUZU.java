package C1MianXiangDuiXiang;

public class MXDX10ERWEISHUZU {
    public static void main(String[] args){
        setERArr();
    }
    public static void setERArr(){
        int arr[][]=new int[5][6];
        arr[1][2]=1;
        arr[2][1]=2;
        arr[2][3]=3;
        for (int i=0;i<5;i++){
            for (int j=0;j<6;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
