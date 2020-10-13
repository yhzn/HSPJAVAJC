package Dome;

public class MSwitch {
    public static void main(String[] args){
        MFSwitch mfs=new MFSwitch();
        mfs.amethod();
    }
}

class MFSwitch {
    // 輸出 a=0 b=1 a=1 b=2
    public void amethod () {
        for(int a=0,b=0;a<2;b=++a,System.out.println("b="+b)){
            System.out.println("a="+a);
        }
    }
}