package C1MianXiangDuiXiang;

public class MXDX5 {
    public static void main(String[] args){
        JKComputer computer=new JKComputer();
        JKCamera camera=new JKCamera();
        JKPhone phone=new JKPhone();
        computer.useUsb(camera);
        computer.useUsb(phone);

    }
}

/*
* 接口-注意事项
* 1.接口不能被实例化
* 2.接口中所有的方法都不能有主体
* 3.一个类可实现多个接口
* 4.接口中可以有变量（但变量不能用private和protected修饰）
*   接口中变量本质上都是 static 的，不管是否加 static
*   在java开发中，经常把常用的变量定义在接口中，作为全局变量使用（访问形式：接口名.变量名）
* 5.一个接口不能继承其他的类，但可以继承别的接口
*
*
**/

// 接口
interface JKUsb{
     int a=1;
     void start();
     void stop();
}

/*
* 一个类实现一个接口，就要求该类把这个接口的所有方法通通实现
*
* */
class JKCamera implements JKUsb{
    public void start(){
        System.out.println("相机，开始工作了！");
    }

    public void stop() {
        System.out.println("相机，停止工作了！");
    }
}

class JKPhone implements JKUsb{
    public void start(){
        System.out.println("手机，开始工作了！");
    }

    public void stop() {
        System.out.println("手机，停止工作了！");
    }
}

class JKComputer{
    public void useUsb(JKUsb usb){
        usb.start();
        usb.stop();
    }
}