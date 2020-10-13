package C2JiChu;
/*
* 位运算和移位运算数运算都是以补码方式进行
* 位运算和移位运算数运算速度最快，直接在内存中操作，不需要压栈
*
**/
public class D1WeiYunSuan {
    public static void main(String[] args){
        YunSuanfu();
        YiWeiYunSuan();

    }
    public static void YunSuanfu(){
        /*
        Java中有4个位运算（运算以补码的形式进行）
        1.按位与&：两位全为1，结果为1
        2.按位或|：两位有一个为1，结果为1
        3.按位异或^：两位一个为0，一个为1，结果为1，两位相同结果为0；
        4.按位取反~：0 -> 1，1 -> 0
        */
        System.out.println("~2 = "+(~2));
        System.out.println("2&3 = "+(2&3));
        System.out.println("2|3 = "+(2|3));
        System.out.println("~-5 = "+(~-5));
        System.out.println("-3^3 = "+(-3^3));
    }
    public static void YiWeiYunSuan(){
        int a=1>>2;  // 算数右移
        int b=-1>>2;
        int c=1<<2;  // 算数左移
        int d=-1<<2;
        int e=3>>>2; // 逻辑右移
        System.out.println("1>>2="+a);
        System.out.println("-1>>2="+b);
        System.out.println("1<<2="+c);
        System.out.println("-1<<2="+d);
        System.out.println("3>>>2="+e);
    }
}
