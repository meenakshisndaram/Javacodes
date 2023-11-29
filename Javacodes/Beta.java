package Javacodes;

public class Beta {
    public static void main(String[] args) {
        Alpha am1=new Alpha(4);
        Alpha am2=new Alpha(7);
        Alpha [] ar={am1,am2};
        getvalues(am1,am2);
        System.out.println(ar[0].val);
        System.out.println(ar[1].val);
    }
    public static Alpha[] getvalues(Alpha a1, Alpha a2 ){
        a1.val=3;
        Alpha [] fa={a2 , a1};
        return  fa;

    }
}
class Alpha{
    int val=0;

    public Alpha(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
