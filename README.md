Total time taken to complete the quiz : 12 hours ( Most of the questions were done in 6-7 hours but subtract in range took 4-5 hours though was not able to find solution for it in end :) )
Question1:
I have implemented Range interface in two ways. First wasy is directly using TreeSet to store range values and 2nd way is using inner class to store ranges. Have implemented all method succuessfully except subtract method.
Source Code - https://github.com/amolb16/redhat/tree/master/src/main/range
Test - https://github.com/amolb16/redhat/tree/master/src/test/range

Question 2 & 3:
Optmizied given code using StringBuilder class.\
Have used ArrayList collection because retrival is fastest ArrayList among all collections available in Java. 
Optimized function is not thread safe as its using StringBuilder. To make it thread safe we can use StringBuffer but there would be little performance degradation due to synchronization.
Unoptimized funciton is not thread safe because '+' internally uses StringBuilder class for string concatenation. To make that thread safe we can put it under synchrnized block.
Source code - https://github.com/amolb16/redhat/tree/master/src/main/string

Question 4:
To combine iterator have created new class IteratorCombiner which implements Iterator interface. next() and hasNext() methods in Iterator interface will help to iterate over passed iterator elements.
Source code : https://github.com/amolb16/redhat/tree/master/src/main/iterator
Test : https://github.com/amolb16/redhat/tree/master/src/test/iterator

Question 5:
In Conversion class base10to2 method returns 2's complement of given number. If value is less than -127 or greater than 127 it will show message as numbers not falling under this range does not fit into 8 bits.
base10to2 method will not calcualte 2's complement of positive number. it will just calculate 2's complement of negative number.
negBase2 method will calcualte 2's complement negative.
Source code : https://github.com/amolb16/redhat/tree/master/src/main/converter
Test: https://github.com/amolb16/redhat/tree/master/src/test/converter

Question 6:
Have created Clause Enum which will hold value Like, Equal etc. this would be used in SearchCriteria class. SearchCriteria class has three fields. field, value and clause. e.g. SearchCriteria object could have values state Equal Maharashtra.
SearchCustomer is interface which has searchCustomers which takes list of SearchCriteria, sortField on which results would be sorted, sortOrder in which results would be sorted and maxNumberOfRecords to avoid large result sets.
Source code: https://github.com/amolb16/redhat/tree/master/src/main/webservice