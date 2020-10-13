package C1MianXiangDuiXiang;
/*
* 功能：抽象类必要性
*
* 抽象类-解决之道：
* 当父类的一些方法不能确定时，可以用 abstract关键字来修饰该方法（抽象方法）
* 用abstract来修饰该类（抽象类）
*
* 抽象类是比较重要的类
* 1.用 abstract 修饰一个类时，这个类叫抽象类
* 2.用 abstract 修饰一个方法时，这个方法叫抽象方法
* 3.抽象方法在编程中用的不是很多
*
* 抽象类-注意事项
* 1.不能被实例化
* 2.抽象类不一定要包含abstract方法，即抽象类可以没有抽象方法
* 3.一旦类中包含abstract方法，则这个类必须声明为abstract
* 4.抽象方法不能有主体 abstract public void cry() 不能有{}
*
*
**/
public class MXDX4 {
    public static void main(String[] args){

    }
}

//抽象类
abstract class CXAnimal{
    String name;
    int age;
    abstract public void cry();
    public void test(){

    }
}

//当一个类继承的父类是抽象类的话，需要把抽象类中的所有抽象方法全部实现
class CXCat extends CXAnimal{
    @Override
    public void cry() {

    }
}