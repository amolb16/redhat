package range;

public class Test {
    public static void main(String args[]){
        RangeImplem1 r=new RangeImplem1();
        System.out.println(r.newRange(1,5).isIn(3) );
        System.out.println(r.newRange(1,5).isIn(6));
        System.out.println(r.newRange(1,5).add(r.newRange(8,10)).isIn(8));
//        System.out.println(r.newRange(1,5).subtract(r.newRange(3,5)).isIn(1));
    }
}
