package range;

import java.util.Collections;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RangeImplem implements Range{

    private TreeSet<Integer> rangeValues = new TreeSet<>();

    public TreeSet<Integer> getRangeValues() {
        return rangeValues;
    }

    public Range newRange(int from,int to){
        for(int i = from ; i <= to; i++){
            this.rangeValues.add(i);
        }
        return this;
    }

    public boolean isIn(int value){
        return this.rangeValues.contains(value);
    }

    /**
     * Return the minimum value in range
     */
    public int min(){
        return this.rangeValues.first();
    }

    /**
     * Return the maximum value in range
     */
    public int max(){
        return this.rangeValues.last();
    }

    /**
     * Add range 'r' to this range, and return 'this'.
     * 'r' and this may denote disjoint ranges, for instance:
     *  r.newRange(1,5).add(r.newRange(8,10)) denotes a range
     * including 1,2,3,4,5,8,9,10
     */
    public Range add(Range r){
        this.rangeValues.addAll(r.getRangeValues());
        return this;
    }

//    public Range subtract(Range r){
//        while(r.getRangeValues().iterator().hasNext()){
//            int num = r.getRangeValues().iterator().next();
//            if(this.rangeValues.contains(num)){
//                this.rangeValues.remove(num);
//            }
//        }
//        return this;
//    }
}
