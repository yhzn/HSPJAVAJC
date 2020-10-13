package Dome;
/*
* 说明多态的例子
*
* 将一个方法调用同这个方法所属的主体（也就是对象或类）关联起来叫做绑定
*
* 绑定分为前期绑定和后期绑定两种
* 前期绑定：在程序运行之前绑定，由编译器和链接程序实现，有叫做静态绑定。比如static方法和final方法，也包括private方法，因为他是隐式的final
*
* 后期绑定：在运行时根据对象类型进行绑定，由方法调用机制实现，因此由叫做 动态绑定 or 运行时绑定。除了前期绑定外的所有方法都属于后期绑定
*
* */
public class DTCarShop {
    private int money=0;
    public static void main(String[] args){
        DTCarShop shop=new DTCarShop();
        shop.sellCar(new DTBMW());
        shop.sellCar(new DTBenz());
        System.out.println("总收入 "+shop.getMoney());
    }
    public void sellCar(DTCar car){
        System.out.println("车型："+car.getName()+" 单价："+car.getPrice());
        money+=car.getPrice();
    }
    public void setMoney(int money) {

        this.money = money;
    }

    public int getMoney() {
        return money;
    }
}

interface DTCar{
    String getName();
    int getPrice();
}

// 宝马
class DTBMW implements DTCar{
    @Override
    public String getName() {
        return "BMW";
    }

    @Override
    public int getPrice() {
        return 300000;
    }
}
//奔驰
class DTBenz implements DTCar{
    @Override
    public String getName() {
        return "Benz";
    }

    @Override
    public int getPrice() {
        return 6000000;
    }
}
