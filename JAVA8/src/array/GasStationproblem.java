package array;

import java.util.Arrays;

public class GasStationproblem {

    public static void main(String[] args) {

        int gas[] = {1, 2, 3, 4, 5};
        int cost[] = {3, 4, 5, 1, 2};


        int totalGas = 0;
        int totalCost = 0;
        totalGas = Arrays.stream(gas).sum();
        totalCost = Arrays.stream(cost).sum();

        System.out.println(totalCost);
        System.out.println(totalGas);
        if (totalGas < totalCost) {
            System.out.println(-1);

        } else {


        }
    }
}
