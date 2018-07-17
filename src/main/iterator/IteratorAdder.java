package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorAdder {

    public class IteratorCombiner implements Iterator{

        Iterator<String> itr1;
        Iterator<String> itr2;
        public IteratorCombiner(Iterator<String> iterator1, Iterator<String> iterator2){
            this.itr1 = iterator1;
            this.itr2 = iterator2;
        }

        public boolean hasNext(){
            return itr1.hasNext() || itr2.hasNext();
        }

        public String next(){
            if (itr1.hasNext()){
                return itr1.next();
            }
            return itr2.next();
        }

    }

    public List<String> combine(Iterator<String> itr1, Iterator<String> itr2){
        List<String> combinedResult = new ArrayList<>();
        IteratorCombiner iteratorCombiner = new IteratorCombiner(itr1, itr2);
        while(iteratorCombiner.hasNext()){
            combinedResult.add(iteratorCombiner.next());
        }
        return combinedResult;
    }
}
