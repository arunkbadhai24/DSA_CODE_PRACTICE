package ImperativeVsDeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample2 {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,99,0,9,8,0);
        /*
         *   Imperative Approach
         */

        List<Integer> uniqueList = new ArrayList<>();

        for(Integer integer: integerList){
            if(!uniqueList.contains(integer)){
                uniqueList.add(integer);
            }
        }

        System.out.println("uniqueList : "+uniqueList);

        /**
         * declarative
         */

       List<Integer>  uniqueList1=integerList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("uniqueList1 : "+uniqueList1);
    }
}
