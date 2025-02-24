package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OverLapIntervalProblem {

    public static void main(String[] args) {
        int[][] array = {
                {1, 3},
                {8, 10},
                {2, 6},
                {15, 18}
        };

        int[][] result=merge(array);
        Arrays.stream(result)
                .forEach(row -> Arrays.stream(row).forEach(value -> System.out.print(value + " ")));

    }

  public static  int [][] merge(int[][] intervals){
        if(intervals.length<=1)
            return  intervals;

        //Sort by ascending starting point
      Arrays.sort(intervals, Comparator.comparingInt(i->i[0]));

      List<int[]> result = new ArrayList<>();

      int [] newInterval =intervals[0];
      result.add(newInterval);


      for(int [] interval : intervals){

          if(interval[0] <=newInterval[1])

              newInterval[1] = Math.max(newInterval[1],interval[1]);

          else{

              newInterval = interval;
              result.add(newInterval);

          }

      }
        return result.toArray(new int[result.size()][]);
    }


}
