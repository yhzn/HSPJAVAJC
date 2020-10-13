import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *Java文件中只能有一个public类
 *
 * 公共类的类名必须和文件名一致
 *
 **/

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello Word!");


        // java 中，对chart进行运算的时候，直接当做ascii码对应的整数对待
        int test1='a'+'b';
        char test2='a'+'b';
        System.out.println(test1); // 195
        System.out.println(test2); // Ã

        // 精度：byte<short<int<long<double
        // 数据可以从高精度向低精度转换

//        double a=3;
//        int b=1.2;//不允许

        try{
            // 输入流 从键盘接收 System.in（代表键盘）
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);

            System.out.println("请输入第一个数");
            // 从控制台读取一行数据
            String a1=br.readLine();
            System.out.println("请输入第二个数");
            String a2=br.readLine();

            float num1=Float.parseFloat(a1);
            float num2=Float.parseFloat(a2);

            System.out.println(num1+num2);

        }catch (Exception e){
            e.printStackTrace();

        }


        // switch 中可使用的数据类型主要是：byte,short,int,chart,enum


    }
}
