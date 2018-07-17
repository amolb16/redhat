package range;

import java.util.HashSet;
import java.util.Set;

public class RangeImplem1 implements Range1 {

    private class InnerRange {
        public InnerRange(int from, int to) {
            this.from = from;
            this.to = to;
        }
        final int from;
        final int to;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            InnerRange that = (InnerRange) o;

            if (from != that.from) return false;
            return to == that.to;

        }

        @Override
        public int hashCode() {
            int result = from;
            result = 31 * result + to;
            return result;
        }
    }

    private Set<InnerRange> ranges = new HashSet<>();

    @Override
    public Range1 newRange(int from, int to) {
        ranges.add(new InnerRange(from, to));
        return this;
    }

    @Override
    public boolean isIn(int value) {
        for (InnerRange r : ranges) {
            if(r.from <= value && value <=r.to){
                return true;
            }
        }
        return false;
    }

    @Override
    public int min() {
        int minValue = 0;
        for(InnerRange r : ranges) {
            if(minValue == 0 || r.from < minValue){
                minValue = r.from;
            }
        }
        return minValue;
    }

    @Override
    public int max() {
        int maxValue = 0;
        for(InnerRange r : ranges) {
            if(maxValue == 0 || r.to > maxValue){
                maxValue = r.to;
            }
        }
        return maxValue;
    }

    @Override
    public Range1 add(Range1 r) {
        return this;
    }

//    @Override
//    public Range1 subtract(Range1 r) {
//        RangeImplem1 ri= (RangeImplem1) r;
//        ranges.removeAll(ri.ranges);
//        return this;
//    }

}