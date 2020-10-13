package C1MianXiangDuiXiang;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
*  数组定义：数据类型 数组名[] = new 数据类型[长度]
*
**/
public class MXDX7SHUZU {
    public static void main(String[] args) throws Exception{
        new ShuZuDingYi();
        ShuZuDog dogs[]=new ShuZuDog[3];
        // 该对象数组new 后，产生5 ShuZuDog 数据类型的索引，指向值默认为 null
        // 改变索引指向 dogs[0]=new ShuZuDog();
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        for(int i=0;i<dogs.length;i++){
            dogs[i]=new ShuZuDog();
            System.out.println("请输入动物名称");
            // 读取名称
            String name=br.readLine();
            dogs[i].setName(name);
            System.out.println("请输入体重");
            String s_weight=br.readLine();
            float weight=Float.parseFloat(s_weight);
            dogs[i].setWeight(weight);

        }

        dogs[0].setName("青青");
        float allWeight=0;
        for(int i=0;i<dogs.length;i++){
            allWeight+=dogs[i].getWeight();
        }
        System.out.println("总体重："+allWeight+";平均体重："+allWeight/dogs.length);


        // 找出体重最大的
        // 先假设第一只体重最大
        float maxWeight=dogs[0].getWeight();
        int maxIndex=0;
        // 按顺序和后面比较
        for(int i=1;i<dogs.length;i++){
            if(maxWeight<dogs[i].getWeight()){
                maxWeight=dogs[i].getWeight();
                maxIndex=i;
            }
        }
        System.out.println("体重最大的为："+dogs[maxIndex].getName()+",重："+dogs[maxIndex].getWeight());


    }
}

class ShuZuDingYi{
    public ShuZuDingYi(){
        // 方式一
        int a[];
        float[] b; //与上一种声明方式等同
        a=new int[6];
        b=new float[10];

        // 方式二：初始化数组
        int c[]={2,5,6,8,9};
        System.out.println(a.length);
        System.out.println(b.toString());
        System.out.println(c.toString());

    }
}
/*
* 对象数组使用
*
*
*
* */
class ShuZuDog{
    private String name;
    private float weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}