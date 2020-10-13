public class LiuChengKongZhi {
    public static void main(String[] args){
        // 打印金字塔
        PrintSmy();

    }
    private static void PrintSmy(){
        int lay=4;
        for(int i=1;i<=lay;i++){
            // 打印*
            for(int k=1;k<=lay-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            // 换行
            System.out.println();
        }


        for(int i=1;i<=lay;i++){
            // 打印*
            for(int k=1;k<=lay-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                if(i==1||i==lay){
                    System.out.print("*");
                }else{
                    if(j==1||j==i*2-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            // 换行
            System.out.println();
        }
    }
}
