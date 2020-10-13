package Dome;

/*
 编号为1、2、3...n 个人坐一圈，约定编号为k(1<=k<=n),从1开始报数，数到m的那个人出列，他的下一位从1开始报数，数到m的那个人又出列，直到所有人出列为止。
 使用循环链表
 */

public class HuanXingLianBiao {
    public static void main(String[] args){
        HXLBCycLink cl=new HXLBCycLink(6,2,2);
        cl.createLink();
        cl.play();
    }
}
class HXLBChild {
    int no;
    HXLBChild nextChild=null;
    public HXLBChild(int no){
        this.no=no;
    }
}

class HXLBCycLink{
    HXLBChild firstChild=null;
    HXLBChild temp=null;
    int len;
    int k;
    int m;
    public HXLBCycLink(int len,int k,int m){
        this.len=len;
        this.k=k;
        this.m=m;
    }
    public void createLink()
    {
        for(int i=1;i<=this.len;i++){
            HXLBChild ch = new HXLBChild(i);
            if(i==1){
                this.firstChild=ch;
                this.temp=ch;
            }else if(i==this.len){
                this.temp.nextChild=ch;
                ch.nextChild=this.firstChild;
            }else{
                this.temp.nextChild=ch;
                this.temp=ch;
            }
        }
    }
    public void play() {
        HXLBChild temp=this.firstChild;
        // 1.找到开始数的人
        for (int i=1;i<k;i++){
            temp=temp.nextChild;
        }
        while (this.len!=1){
            // 2.数m下
            for(int j=1;j<m;j++){
                temp=temp.nextChild;
            }

            // 找出目标前一个对象
            HXLBChild temp2=temp;
            while (temp2.nextChild!=temp){
                temp2=temp2.nextChild;
            }

            // 3.数到m的小孩推出圈(删除指向它的引用，即可被垃圾回收机制回收，她指向别人没有别人指向它就是垃圾：1->2->3,1->3把1指向3，2就会被删除)
            temp2.nextChild=temp.nextChild;
            // 让temp
            temp=temp.nextChild;
            this.len--;
        }
        System.out.println("最后输出："+temp.no);


    }
    // 显示环形列表
    public void showCyc(){
        HXLBChild temp=this.firstChild;
        do{
           System.out.println(temp.no);
           temp=temp.nextChild;
        }while (temp!=this.firstChild);

    }

}


