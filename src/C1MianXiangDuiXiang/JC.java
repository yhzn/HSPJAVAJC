package C1MianXiangDuiXiang;

public class JC {
    public static void main(String[] args){
        JCPupil p1=new JCPupil();
        p1.printName();

        ChongZai cz=new ChongZai();
        System.out.println(cz.getMax(2,3.0));
        System.out.println(cz.getMax(2.0,3));
        System.out.println(cz.getMax(2.0,3,5f));
        System.out.println(cz.getMax(5f,9f));
        System.out.println(cz.getMax(5,9));

    }
}
class ChongZai{
    /*
        方法重载
        1.方法名相同
        2.方法的参数类型、个数、顺序至少有一项不同
        3.方法返回类型可以不同
        4.方法的修饰符可以不同
        5.只是返回的类型不一样，不能构成重载
    */
    public double getMax(int i,double j){
        return i>j?i:j;
    }
    public double getMax(double i,int j){
        return i>j?i:j;
    }
    public double getMax(double i,int j,float k){
        return i>j?i:j;
    }
    public float getMax(float i,float j){
        return i>j?i:j;
    }
    protected int getMax(int i,int j){
        return i>j?i:j;
    }

}
class JCStu{
    // 私有属性、方法不能被继承
    // 如果不希望子类继承某个属性或者方法，则将其声明为private(private 为隐式的 final)
    // 即方法用final修饰，则表示不可以被修改，不可以被替换
    final String sex="";
    private int age;
    // 一般情况下要赋初值，不然是空指针，正常情况不会有问题，但特殊情况下会有问题，程序不够健壮
    public String name;
    float fee;
    public void printName(){
        System.out.println("姓名："+this.name);
    }
    final public void sendMes(){

    }

}

class JCPupil extends JCStu{
    public void pay(float fee){
        this.fee=fee;
    }
}

class JCMiddleStu extends JCStu{
    public void pay(float fee){
        this.fee=fee*0.8f;
    }
}

class JCColStu extends JCStu{
    public void pay(float fee){
        this.fee=fee*0.1f;
    }
}