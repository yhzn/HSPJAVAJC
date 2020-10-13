package C1MianXiangDuiXiang;

public class MXDX1 {
    public static void main(String[] args){
        ChengFaBiao(9);
        Cat cat=new Cat(2,"小白","白色");
    }
    public static void ChengFaBiao(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+" ");
            }
            System.out.println();
        }
    }

}

class Cat{
    int age;
    String name;
    String color;
    Cat(){} // 如果没有构造函数，编译器会创建一个这样的默认构造函数，如果有构造函数默认构造函数会被覆盖
    Cat(int age){
        this.age=age;
    }
    Cat(int age,String name,String color){
        this.age=age;
        this.name=name;
        this.color=color;
    }
}
