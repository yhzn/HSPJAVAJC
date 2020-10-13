package Dome;

public class QiuYuShu {
    public static void main(String[] args){
        MonkeyEat t=new MonkeyEat(1,10);
        t.showTotal();
    }
}
// 1.猴子摘桃，当即吃了一半，又多吃了一个，第二天吃了一半,又多吃了一个，到第十天之剩下一个
class MonkeyEat {
    int day;
    int sday;
    public MonkeyEat (int day,int sday) {
        this.day=day;
        this.sday=sday;
    }
    private int calc(int day,int sday){
        if(day==sday){
            return 1;
        }
        return (calc(day+1,sday)+1)*2;
    }
    public void showTotal(){
        System.out.println(this.calc(this.day,this.sday));
    }
}