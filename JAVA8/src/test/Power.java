package test;

public class Power {

    public static void main(String[] args) {


        int n =65;

        while (n % 2 ==0){
            n = n / 2;
            System.out.println(n);
        }

        boolean ans =(n ==1) ? true : false;
        System.out.println(ans);
    }
}
