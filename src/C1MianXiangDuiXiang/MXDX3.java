package C1MianXiangDuiXiang;
/*
* 多态
*
*
**/
public class MXDX3 {
    public static void main(String[] args){
           DTAnimal an=new DTCat();
           an.cry();
           an=new DTDog();
           an.cry();

           DTMaster master=new DTMaster();
           master.feed(new DTDog(),new DTBone());
           master.feed(new DTCat(),new DTFish());
    }
}
class DTMaster{
    public void feed(DTAnimal an,DTFood f){
         an.eat();
         f.showName();
    }
}

class DTAnimal{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void cry() {
        System.out.println("叫声");
    }
    public void eat() {

    }
}

class DTFood{
    String name;
    public void showName(){

    }
}

class DTFish extends DTFood{
    public void showName() {
        System.out.println("鱼");
    }
}

class DTBone extends DTFood{
    public void showName() {
        System.out.println("骨头");
    }
}

class DTDog extends DTAnimal{
    public void cry(){
        System.out.println("狗叫");
    }
    public void eat() {
        System.out.println("狗吃骨头");
    }
}

class DTCat extends DTAnimal{
    public void cry(){
        System.out.println("猫叫");
    }
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
