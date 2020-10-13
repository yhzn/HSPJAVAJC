package C1MianXiangDuiXiang;

public class MXDX2 {
    public static void main(String[] args){
        Child ch1=new Child(13,"倩");
        Child ch2=new Child(12,"仟");
        System.out.println(Child.total);  // 共享total total存在于类中，不属于哪一个实例

        Stu stu1=new Stu(12,"倩",200);
        Stu stu2=new Stu(13,"仟",300);


    }
}

class Person{

}
class Child{
    int age;
    String name;
    static int total=0;
    static {
        // 静态区域块只被执行一次
        // 类被定义的时候 该静态区就会被执行
    }
    public Child(int age,String name){
        this.age=age;
        this.name=name;
        total++;
    }
}
class Stu {
    int age;
    String name;
    static int totalFee;
    public Stu(int age,String name,int fee){
        this.age=age;
        this.name=name;
        totalFee+=fee;
    }
    // 静态方法只能访问静态变量
    public static int getTotalFee(){
        return totalFee;
    }
}